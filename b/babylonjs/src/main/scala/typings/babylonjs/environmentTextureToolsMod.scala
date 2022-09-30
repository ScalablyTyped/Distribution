package typings.babylonjs

import typings.babylonjs.babylonjsInts.`1`
import typings.babylonjs.babylonjsInts.`2`
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentTextureToolsMod {
  
  @JSImport("babylonjs/Misc/environmentTextureTools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CreateEnvTextureAsync(texture: BaseTexture): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateEnvTextureAsync")(texture.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def CreateEnvTextureAsync(texture: BaseTexture, options: CreateEnvTextureOptions): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateEnvTextureAsync")(texture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def CreateImageDataArrayBufferViews(data: js.typedarray.ArrayBufferView, info: EnvironmentTextureInfo): js.Array[js.Array[js.typedarray.ArrayBufferView]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateImageDataArrayBufferViews")(data.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.typedarray.ArrayBufferView]]]
  
  object EnvironmentTextureTools {
    
    @JSImport("babylonjs/Misc/environmentTextureTools", "EnvironmentTextureTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an environment texture from a loaded cube texture.
      * @param texture defines the cube texture to convert in env file
      * @param options options for the conversion process
      * @param options.imageType the mime type for the encoded images, with support for "image/png" (default) and "image/webp"
      * @param options.imageQuality the image quality of encoded WebP images.
      * @returns a promise containing the environment data if successful.
      */
    @JSImport("babylonjs/Misc/environmentTextureTools", "EnvironmentTextureTools.CreateEnvTextureAsync")
    @js.native
    def CreateEnvTextureAsync: js.Function2[
        /* texture */ BaseTexture, 
        /* options */ js.UndefOr[CreateEnvTextureOptions], 
        js.Promise[js.typedarray.ArrayBuffer]
      ] = js.native
    /**
      * Creates an environment texture from a loaded cube texture.
      * @param texture defines the cube texture to convert in env file
      * @param options options for the conversion process
      * @param options.imageType the mime type for the encoded images, with support for "image/png" (default) and "image/webp"
      * @param options.imageQuality the image quality of encoded WebP images.
      * @returns a promise containing the environment data if successful.
      */
    inline def CreateEnvTextureAsync(texture: BaseTexture): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateEnvTextureAsync")(texture.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
    inline def CreateEnvTextureAsync(texture: BaseTexture, options: CreateEnvTextureOptions): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateEnvTextureAsync")(texture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
    inline def CreateEnvTextureAsync_=(
      x: js.Function2[
          /* texture */ BaseTexture, 
          /* options */ js.UndefOr[CreateEnvTextureOptions], 
          js.Promise[js.typedarray.ArrayBuffer]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateEnvTextureAsync")(x.asInstanceOf[js.Any])
    
    /**
      * Creates the ArrayBufferViews used for initializing environment texture image data.
      * @param data the image data
      * @param info parameters that determine what views will be created for accessing the underlying buffer
      * @returns the views described by info providing access to the underlying buffer
      */
    @JSImport("babylonjs/Misc/environmentTextureTools", "EnvironmentTextureTools.CreateImageDataArrayBufferViews")
    @js.native
    def CreateImageDataArrayBufferViews: js.Function2[
        /* data */ js.typedarray.ArrayBufferView, 
        /* info */ EnvironmentTextureInfo, 
        js.Array[js.Array[js.typedarray.ArrayBufferView]]
      ] = js.native
    /**
      * Creates the ArrayBufferViews used for initializing environment texture image data.
      * @param data the image data
      * @param info parameters that determine what views will be created for accessing the underlying buffer
      * @returns the views described by info providing access to the underlying buffer
      */
    inline def CreateImageDataArrayBufferViews(data: js.typedarray.ArrayBufferView, info: EnvironmentTextureInfo): js.Array[js.Array[js.typedarray.ArrayBufferView]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateImageDataArrayBufferViews")(data.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.typedarray.ArrayBufferView]]]
    inline def CreateImageDataArrayBufferViews_=(
      x: js.Function2[
          /* data */ js.typedarray.ArrayBufferView, 
          /* info */ EnvironmentTextureInfo, 
          js.Array[js.Array[js.typedarray.ArrayBufferView]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateImageDataArrayBufferViews")(x.asInstanceOf[js.Any])
    
    /**
      * Gets the environment info from an env file.
      * @param data The array buffer containing the .env bytes.
      * @returns the environment file info (the json header) if successfully parsed, normalized to the latest supported version.
      */
    @JSImport("babylonjs/Misc/environmentTextureTools", "EnvironmentTextureTools.GetEnvInfo")
    @js.native
    def GetEnvInfo: js.Function1[/* data */ js.typedarray.ArrayBufferView, Nullable[EnvironmentTextureInfoV2]] = js.native
    /**
      * Gets the environment info from an env file.
      * @param data The array buffer containing the .env bytes.
      * @returns the environment file info (the json header) if successfully parsed, normalized to the latest supported version.
      */
    inline def GetEnvInfo(data: js.typedarray.ArrayBufferView): Nullable[EnvironmentTextureInfoV2] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEnvInfo")(data.asInstanceOf[js.Any]).asInstanceOf[Nullable[EnvironmentTextureInfoV2]]
    inline def GetEnvInfo_=(x: js.Function1[/* data */ js.typedarray.ArrayBufferView, Nullable[EnvironmentTextureInfoV2]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetEnvInfo")(x.asInstanceOf[js.Any])
    
    /**
      * Uploads the texture info contained in the env file to the GPU.
      * @param texture defines the internal texture to upload to
      * @param data defines the data to load
      * @param info defines the texture info retrieved through the GetEnvInfo method
      * @returns a promise
      */
    @JSImport("babylonjs/Misc/environmentTextureTools", "EnvironmentTextureTools.UploadEnvLevelsAsync")
    @js.native
    def UploadEnvLevelsAsync: js.Function3[
        /* texture */ InternalTexture, 
        /* data */ js.typedarray.ArrayBufferView, 
        /* info */ EnvironmentTextureInfo, 
        js.Promise[Unit]
      ] = js.native
    /**
      * Uploads the texture info contained in the env file to the GPU.
      * @param texture defines the internal texture to upload to
      * @param data defines the data to load
      * @param info defines the texture info retrieved through the GetEnvInfo method
      * @returns a promise
      */
    inline def UploadEnvLevelsAsync(texture: InternalTexture, data: js.typedarray.ArrayBufferView, info: EnvironmentTextureInfo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadEnvLevelsAsync")(texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def UploadEnvLevelsAsync_=(
      x: js.Function3[
          /* texture */ InternalTexture, 
          /* data */ js.typedarray.ArrayBufferView, 
          /* info */ EnvironmentTextureInfo, 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UploadEnvLevelsAsync")(x.asInstanceOf[js.Any])
    
    /**
      * Uploads spherical polynomials information to the texture.
      * @param texture defines the texture we are trying to upload the information to
      * @param info defines the environment texture info retrieved through the GetEnvInfo method
      */
    @JSImport("babylonjs/Misc/environmentTextureTools", "EnvironmentTextureTools.UploadEnvSpherical")
    @js.native
    def UploadEnvSpherical: js.Function2[/* texture */ InternalTexture, /* info */ EnvironmentTextureInfo, Unit] = js.native
    /**
      * Uploads spherical polynomials information to the texture.
      * @param texture defines the texture we are trying to upload the information to
      * @param info defines the environment texture info retrieved through the GetEnvInfo method
      */
    inline def UploadEnvSpherical(texture: InternalTexture, info: EnvironmentTextureInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadEnvSpherical")(texture.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def UploadEnvSpherical_=(x: js.Function2[/* texture */ InternalTexture, /* info */ EnvironmentTextureInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UploadEnvSpherical")(x.asInstanceOf[js.Any])
    
    /**
      * Uploads the levels of image data to the GPU.
      * @param texture defines the internal texture to upload to
      * @param imageData defines the array buffer views of image data [mipmap][face]
      * @param imageType the mime type of the image data
      * @returns a promise
      */
    @JSImport("babylonjs/Misc/environmentTextureTools", "EnvironmentTextureTools.UploadLevelsAsync")
    @js.native
    def UploadLevelsAsync: js.Function3[
        /* texture */ InternalTexture, 
        /* imageData */ js.Array[js.Array[js.typedarray.ArrayBufferView]], 
        /* imageType */ js.UndefOr[String], 
        js.Promise[Unit]
      ] = js.native
    /**
      * Uploads the levels of image data to the GPU.
      * @param texture defines the internal texture to upload to
      * @param imageData defines the array buffer views of image data [mipmap][face]
      * @param imageType the mime type of the image data
      * @returns a promise
      */
    inline def UploadLevelsAsync(texture: InternalTexture, imageData: js.Array[js.Array[js.typedarray.ArrayBufferView]]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadLevelsAsync")(texture.asInstanceOf[js.Any], imageData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def UploadLevelsAsync(
      texture: InternalTexture,
      imageData: js.Array[js.Array[js.typedarray.ArrayBufferView]],
      imageType: String
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadLevelsAsync")(texture.asInstanceOf[js.Any], imageData.asInstanceOf[js.Any], imageType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def UploadLevelsAsync_=(
      x: js.Function3[
          /* texture */ InternalTexture, 
          /* imageData */ js.Array[js.Array[js.typedarray.ArrayBufferView]], 
          /* imageType */ js.UndefOr[String], 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UploadLevelsAsync")(x.asInstanceOf[js.Any])
  }
  
  inline def GetEnvInfo(data: js.typedarray.ArrayBufferView): Nullable[EnvironmentTextureInfoV2] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEnvInfo")(data.asInstanceOf[js.Any]).asInstanceOf[Nullable[EnvironmentTextureInfoV2]]
  
  inline def UpdateRGBDAsync(
    internalTexture: InternalTexture,
    data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
    sphericalPolynomial: Nullable[SphericalPolynomial],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("_UpdateRGBDAsync")(internalTexture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], sphericalPolynomial.asInstanceOf[js.Any], lodScale.asInstanceOf[js.Any], lodOffset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InternalTexture]]
  
  inline def UploadEnvLevelsAsync(texture: InternalTexture, data: js.typedarray.ArrayBufferView, info: EnvironmentTextureInfo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadEnvLevelsAsync")(texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def UploadEnvSpherical(texture: InternalTexture, info: EnvironmentTextureInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadEnvSpherical")(texture.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def UploadLevelsAsync(texture: InternalTexture, imageData: js.Array[js.Array[js.typedarray.ArrayBufferView]]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadLevelsAsync")(texture.asInstanceOf[js.Any], imageData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def UploadLevelsAsync(
    texture: InternalTexture,
    imageData: js.Array[js.Array[js.typedarray.ArrayBufferView]],
    imageType: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadLevelsAsync")(texture.asInstanceOf[js.Any], imageData.asInstanceOf[js.Any], imageType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def normalizeEnvInfo(info: EnvironmentTextureInfo): EnvironmentTextureInfoV2 = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEnvInfo")(info.asInstanceOf[js.Any]).asInstanceOf[EnvironmentTextureInfoV2]
  
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
  
  trait CreateEnvTextureOptions extends StObject {
    
    /**
      * the image quality of encoded WebP images.
      */
    var imageQuality: js.UndefOr[Double] = js.undefined
    
    /**
      * The mime type of encoded images.
      */
    var imageType: js.UndefOr[String] = js.undefined
  }
  object CreateEnvTextureOptions {
    
    inline def apply(): CreateEnvTextureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEnvTextureOptions]
    }
    
    extension [Self <: CreateEnvTextureOptions](x: Self) {
      
      inline def setImageQuality(value: Double): Self = StObject.set(x, "imageQuality", value.asInstanceOf[js.Any])
      
      inline def setImageQualityUndefined: Self = StObject.set(x, "imageQuality", js.undefined)
      
      inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
      
      inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babylonjs.environmentTextureToolsMod.EnvironmentTextureInfoV1
    - typings.babylonjs.environmentTextureToolsMod.EnvironmentTextureInfoV2
  */
  trait EnvironmentTextureInfo extends StObject
  object EnvironmentTextureInfo {
    
    inline def EnvironmentTextureInfoV1(irradiance: Any, specular: Any, width: Double): typings.babylonjs.environmentTextureToolsMod.EnvironmentTextureInfoV1 = {
      val __obj = js.Dynamic.literal(irradiance = irradiance.asInstanceOf[js.Any], specular = specular.asInstanceOf[js.Any], version = 1, width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.babylonjs.environmentTextureToolsMod.EnvironmentTextureInfoV1]
    }
    
    inline def EnvironmentTextureInfoV2(imageType: String, irradiance: Any, specular: Any, width: Double): typings.babylonjs.environmentTextureToolsMod.EnvironmentTextureInfoV2 = {
      val __obj = js.Dynamic.literal(imageType = imageType.asInstanceOf[js.Any], irradiance = irradiance.asInstanceOf[js.Any], specular = specular.asInstanceOf[js.Any], version = 2, width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.babylonjs.environmentTextureToolsMod.EnvironmentTextureInfoV2]
    }
  }
  
  /**
    * v1 of EnvironmentTextureInfo
    */
  trait EnvironmentTextureInfoV1
    extends StObject
       with EnvironmentTextureInfo {
    
    /**
      * Irradiance information stored in the file.
      */
    var irradiance: Any
    
    /**
      * Specular information stored in the file.
      */
    var specular: Any
    
    /**
      * Version of the environment map
      */
    var version: `1`
    
    /**
      * Width of image
      */
    var width: Double
  }
  object EnvironmentTextureInfoV1 {
    
    inline def apply(irradiance: Any, specular: Any, width: Double): EnvironmentTextureInfoV1 = {
      val __obj = js.Dynamic.literal(irradiance = irradiance.asInstanceOf[js.Any], specular = specular.asInstanceOf[js.Any], version = 1, width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentTextureInfoV1]
    }
    
    extension [Self <: EnvironmentTextureInfoV1](x: Self) {
      
      inline def setIrradiance(value: Any): Self = StObject.set(x, "irradiance", value.asInstanceOf[js.Any])
      
      inline def setSpecular(value: Any): Self = StObject.set(x, "specular", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: `1`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * v2 of EnvironmentTextureInfo
    */
  trait EnvironmentTextureInfoV2
    extends StObject
       with EnvironmentTextureInfo {
    
    /**
      * The mime type used to encode the image data.
      */
    var imageType: String
    
    /**
      * Irradiance information stored in the file.
      */
    var irradiance: Any
    
    /**
      * Specular information stored in the file.
      */
    var specular: Any
    
    /**
      * Version of the environment map
      */
    var version: `2`
    
    /**
      * Width of image
      */
    var width: Double
  }
  object EnvironmentTextureInfoV2 {
    
    inline def apply(imageType: String, irradiance: Any, specular: Any, width: Double): EnvironmentTextureInfoV2 = {
      val __obj = js.Dynamic.literal(imageType = imageType.asInstanceOf[js.Any], irradiance = irradiance.asInstanceOf[js.Any], specular = specular.asInstanceOf[js.Any], version = 2, width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentTextureInfoV2]
    }
    
    extension [Self <: EnvironmentTextureInfoV2](x: Self) {
      
      inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
      
      inline def setIrradiance(value: Any): Self = StObject.set(x, "irradiance", value.asInstanceOf[js.Any])
      
      inline def setSpecular(value: Any): Self = StObject.set(x, "specular", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: `2`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
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
      
      inline def setMipmapsVarargs(value: BufferImageData*): Self = StObject.set(x, "mipmaps", js.Array(value*))
      
      inline def setSpecularDataPosition(value: Double): Self = StObject.set(x, "specularDataPosition", value.asInstanceOf[js.Any])
      
      inline def setSpecularDataPositionUndefined: Self = StObject.set(x, "specularDataPosition", js.undefined)
    }
  }
}
