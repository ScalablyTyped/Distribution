package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.hdrMod.HDRInfo
import typings.babylonjs.panoramaToCubemapMod.CubeMapInfo
import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highDynamicRangeIndexMod {
  
  @JSImport("babylonjs/Misc/HighDynamicRange/index", "CubeMapToSphericalPolynomialTools")
  @js.native
  class CubeMapToSphericalPolynomialTools ()
    extends typings.babylonjs.cubemapToSphericalPolynomialMod.CubeMapToSphericalPolynomialTools
  /* static members */
  object CubeMapToSphericalPolynomialTools {
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "CubeMapToSphericalPolynomialTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts a texture to the according Spherical Polynomial data.
      * This extracts the first 3 orders only as they are the only one used in the lighting.
      *
      * @param texture The texture to extract the information from.
      * @return The Spherical Polynomial data.
      */
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "CubeMapToSphericalPolynomialTools.ConvertCubeMapTextureToSphericalPolynomial")
    @js.native
    def ConvertCubeMapTextureToSphericalPolynomial(texture: BaseTexture): Nullable[SphericalPolynomial] = js.native
    
    /**
      * Converts a cubemap to the according Spherical Polynomial data.
      * This extracts the first 3 orders only as they are the only one used in the lighting.
      *
      * @param cubeInfo The Cube map to extract the information from.
      * @return The Spherical Polynomial data.
      */
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "CubeMapToSphericalPolynomialTools.ConvertCubeMapToSphericalPolynomial")
    @js.native
    def ConvertCubeMapToSphericalPolynomial(cubeInfo: CubeMapInfo): SphericalPolynomial = js.native
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "CubeMapToSphericalPolynomialTools.FileFaces")
    @js.native
    def FileFaces: js.Any = js.native
    @scala.inline
    def FileFaces_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FileFaces")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools")
  @js.native
  class HDRTools ()
    extends typings.babylonjs.hdrMod.HDRTools
  /* static members */
  object HDRTools {
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the cubemap information (each faces texture data) extracted from an RGBE texture.
      * This RGBE texture needs to store the information as a panorama.
      *
      * More information on this format are available here:
      * https://en.wikipedia.org/wiki/RGBE_image_format
      *
      * @param buffer The binary file stored in an array buffer.
      * @param size The expected size of the extracted cubemap.
      * @return The Cube Map information.
      */
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools.GetCubeMapTextureData")
    @js.native
    def GetCubeMapTextureData(buffer: ArrayBuffer, size: Double): CubeMapInfo = js.native
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools.Ldexp")
    @js.native
    def Ldexp: js.Any = js.native
    @scala.inline
    def Ldexp_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ldexp")(x.asInstanceOf[js.Any])
    
    /**
      * Reads header information from an RGBE texture stored in a native array.
      * More information on this format are available here:
      * https://en.wikipedia.org/wiki/RGBE_image_format
      *
      * @param uint8array The binary file stored in  native array.
      * @return The header information.
      */
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools.RGBE_ReadHeader")
    @js.native
    def RGBE_ReadHeader(uint8array: Uint8Array): HDRInfo = js.native
    
    /**
      * Returns the pixels data extracted from an RGBE texture.
      * This pixels will be stored left to right up to down in the R G B order in one array.
      *
      * More information on this format are available here:
      * https://en.wikipedia.org/wiki/RGBE_image_format
      *
      * @param uint8array The binary file stored in an array buffer.
      * @param hdrInfo The header information of the file.
      * @return The pixels data in RGB right to left up to down order.
      */
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools.RGBE_ReadPixels")
    @js.native
    def RGBE_ReadPixels(uint8array: Uint8Array, hdrInfo: HDRInfo): Float32Array = js.native
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools.RGBE_ReadPixels_NOT_RLE")
    @js.native
    def RGBE_ReadPixels_NOT_RLE: js.Any = js.native
    @scala.inline
    def RGBE_ReadPixels_NOT_RLE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RGBE_ReadPixels_NOT_RLE")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools.RGBE_ReadPixels_RLE")
    @js.native
    def RGBE_ReadPixels_RLE: js.Any = js.native
    @scala.inline
    def RGBE_ReadPixels_RLE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RGBE_ReadPixels_RLE")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools.Rgbe2float")
    @js.native
    def Rgbe2float: js.Any = js.native
    @scala.inline
    def Rgbe2float_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rgbe2float")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools.readStringLine")
    @js.native
    def readStringLine: js.Any = js.native
    @scala.inline
    def readStringLine_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readStringLine")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools")
  @js.native
  class PanoramaToCubeMapTools ()
    extends typings.babylonjs.panoramaToCubemapMod.PanoramaToCubeMapTools
  /* static members */
  object PanoramaToCubeMapTools {
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.CalcProjectionSpherical")
    @js.native
    def CalcProjectionSpherical: js.Any = js.native
    @scala.inline
    def CalcProjectionSpherical_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CalcProjectionSpherical")(x.asInstanceOf[js.Any])
    
    /**
      * Converts a panorma stored in RGB right to left up to down format into a cubemap (6 faces).
      *
      * @param float32Array The source data.
      * @param inputWidth The width of the input panorama.
      * @param inputHeight The height of the input panorama.
      * @param size The willing size of the generated cubemap (each faces will be size * size pixels)
      * @return The cubemap data
      */
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.ConvertPanoramaToCubemap")
    @js.native
    def ConvertPanoramaToCubemap(float32Array: Float32Array, inputWidth: Double, inputHeight: Double, size: Double): CubeMapInfo = js.native
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.CreateCubemapTexture")
    @js.native
    def CreateCubemapTexture: js.Any = js.native
    @scala.inline
    def CreateCubemapTexture_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCubemapTexture")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.FACE_BACK")
    @js.native
    def FACE_BACK: js.Any = js.native
    @scala.inline
    def FACE_BACK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_BACK")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.FACE_DOWN")
    @js.native
    def FACE_DOWN: js.Any = js.native
    @scala.inline
    def FACE_DOWN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_DOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.FACE_FRONT")
    @js.native
    def FACE_FRONT: js.Any = js.native
    @scala.inline
    def FACE_FRONT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_FRONT")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.FACE_LEFT")
    @js.native
    def FACE_LEFT: js.Any = js.native
    @scala.inline
    def FACE_LEFT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.FACE_RIGHT")
    @js.native
    def FACE_RIGHT: js.Any = js.native
    @scala.inline
    def FACE_RIGHT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.FACE_UP")
    @js.native
    def FACE_UP: js.Any = js.native
    @scala.inline
    def FACE_UP_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_UP")(x.asInstanceOf[js.Any])
  }
}
