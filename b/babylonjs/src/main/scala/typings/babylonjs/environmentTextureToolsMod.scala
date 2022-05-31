package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentTextureToolsMod {
  
  @JSImport("babylonjs/Misc/environmentTextureTools", "EnvironmentTextureTools")
  @js.native
  class EnvironmentTextureTools () extends StObject
  /* static members */
  object EnvironmentTextureTools {
    
    @JSImport("babylonjs/Misc/environmentTextureTools", "EnvironmentTextureTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an environment texture from a loaded cube texture.
      * @param texture defines the cube texture to convert in env file
      * @return a promise containing the environment data if succesfull.
      */
    inline def CreateEnvTextureAsync(texture: BaseTexture): js.Promise[ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateEnvTextureAsync")(texture.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ArrayBuffer]]
    
    /**
      * Creates the ArrayBufferViews used for initializing environment texture image data.
      * @param data the image data
      * @param info parameters that determine what views will be created for accessing the underlying buffer
      * @return the views described by info providing access to the underlying buffer
      */
    inline def CreateImageDataArrayBufferViews(data: ArrayBufferView, info: EnvironmentTextureInfo): js.Array[js.Array[ArrayBufferView]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateImageDataArrayBufferViews")(data.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[ArrayBufferView]]]
    
    /**
      * Gets the environment info from an env file.
      * @param data The array buffer containing the .env bytes.
      * @returns the environment file info (the json header) if successfully parsed.
      */
    inline def GetEnvInfo(data: ArrayBufferView): Nullable[EnvironmentTextureInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEnvInfo")(data.asInstanceOf[js.Any]).asInstanceOf[Nullable[EnvironmentTextureInfo]]
    
    /**
      * Uploads the texture info contained in the env file to the GPU.
      * @param texture defines the internal texture to upload to
      * @param data defines the data to load
      * @param info defines the texture info retrieved through the GetEnvInfo method
      * @returns a promise
      */
    inline def UploadEnvLevelsAsync(texture: InternalTexture, data: ArrayBufferView, info: EnvironmentTextureInfo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadEnvLevelsAsync")(texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Uploads spherical polynomials information to the texture.
      * @param texture defines the texture we are trying to upload the information to
      * @param info defines the environment texture info retrieved through the GetEnvInfo method
      */
    inline def UploadEnvSpherical(texture: InternalTexture, info: EnvironmentTextureInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadEnvSpherical")(texture.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Uploads the levels of image data to the GPU.
      * @param texture defines the internal texture to upload to
      * @param imageData defines the array buffer views of image data [mipmap][face]
      * @returns a promise
      */
    inline def UploadLevelsAsync(texture: InternalTexture, imageData: js.Array[js.Array[ArrayBufferView]]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadLevelsAsync")(texture.asInstanceOf[js.Any], imageData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Creates a JSON representation of the spherical data.
      * @param texture defines the texture containing the polynomials
      * @return the JSON representation of the spherical info
      */
    @JSImport("babylonjs/Misc/environmentTextureTools", "EnvironmentTextureTools._CreateEnvTextureIrradiance")
    @js.native
    def _CreateEnvTextureIrradiance: js.Any = js.native
    inline def _CreateEnvTextureIrradiance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateEnvTextureIrradiance")(x.asInstanceOf[js.Any])
    
    /**
      * Magic number identifying the env file.
      */
    @JSImport("babylonjs/Misc/environmentTextureTools", "EnvironmentTextureTools._MagicBytes")
    @js.native
    def _MagicBytes: js.Any = js.native
    inline def _MagicBytes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MagicBytes")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/environmentTextureTools", "EnvironmentTextureTools._OnImageReadyAsync")
    @js.native
    def _OnImageReadyAsync: js.Any = js.native
    inline def _OnImageReadyAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OnImageReadyAsync")(x.asInstanceOf[js.Any])
    
    /** @hidden */
    inline def _UpdateRGBDAsync(
      internalTexture: InternalTexture,
      data: js.Array[js.Array[ArrayBufferView]],
      sphericalPolynomial: Nullable[SphericalPolynomial],
      lodScale: Double,
      lodOffset: Double
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("_UpdateRGBDAsync")(internalTexture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], sphericalPolynomial.asInstanceOf[js.Any], lodScale.asInstanceOf[js.Any], lodOffset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * Defines One Image in the file. It requires only the position in the file
    * as well as the length.
    */
  trait BufferImageData extends StObject {
    
    /**
      * Length of the image data.
      */
    var length: Double
    
    /**
      * Position of the data from the null terminator delimiting the end of the JSON.
      */
    var position: Double
  }
  object BufferImageData {
    
    inline def apply(length: Double, position: Double): BufferImageData = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferImageData]
    }
    
    extension [Self <: BufferImageData](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnvironmentTextureInfo extends StObject {
    
    /**
      * Irradiance information stored in the file.
      */
    var irradiance: js.Any
    
    /**
      * Specular information stored in the file.
      */
    var specular: js.Any
    
    /**
      * Version of the environment map
      */
    var version: Double
    
    /**
      * Width of image
      */
    var width: Double
  }
  object EnvironmentTextureInfo {
    
    inline def apply(irradiance: js.Any, specular: js.Any, version: Double, width: Double): EnvironmentTextureInfo = {
      val __obj = js.Dynamic.literal(irradiance = irradiance.asInstanceOf[js.Any], specular = specular.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentTextureInfo]
    }
    
    extension [Self <: EnvironmentTextureInfo](x: Self) {
      
      inline def setIrradiance(value: js.Any): Self = StObject.set(x, "irradiance", value.asInstanceOf[js.Any])
      
      inline def setSpecular(value: js.Any): Self = StObject.set(x, "specular", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnvironmentTextureSpecularInfoV1 extends StObject {
    
    /**
      * Defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness.
      */
    var lodGenerationScale: Double
    
    /**
      * This contains all the images data needed to reconstruct the cubemap.
      */
    var mipmaps: js.Array[BufferImageData]
    
    /**
      * Defines where the specular Payload is located. It is a runtime value only not stored in the file.
      */
    var specularDataPosition: js.UndefOr[Double] = js.undefined
  }
  object EnvironmentTextureSpecularInfoV1 {
    
    inline def apply(lodGenerationScale: Double, mipmaps: js.Array[BufferImageData]): EnvironmentTextureSpecularInfoV1 = {
      val __obj = js.Dynamic.literal(lodGenerationScale = lodGenerationScale.asInstanceOf[js.Any], mipmaps = mipmaps.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentTextureSpecularInfoV1]
    }
    
    extension [Self <: EnvironmentTextureSpecularInfoV1](x: Self) {
      
      inline def setLodGenerationScale(value: Double): Self = StObject.set(x, "lodGenerationScale", value.asInstanceOf[js.Any])
      
      inline def setMipmaps(value: js.Array[BufferImageData]): Self = StObject.set(x, "mipmaps", value.asInstanceOf[js.Any])
      
      inline def setMipmapsVarargs(value: BufferImageData*): Self = StObject.set(x, "mipmaps", js.Array(value :_*))
      
      inline def setSpecularDataPosition(value: Double): Self = StObject.set(x, "specularDataPosition", value.asInstanceOf[js.Any])
      
      inline def setSpecularDataPositionUndefined: Self = StObject.set(x, "specularDataPosition", js.undefined)
    }
  }
}
