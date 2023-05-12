package typings.babylonjs

import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.mathsSphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.miscHighDynamicRangeHdrMod.HDRInfo
import typings.babylonjs.miscHighDynamicRangePanoramaToCubemapMod.CubeMapInfo
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscHighDynamicRangeIndexMod {
  
  @JSImport("babylonjs/Misc/HighDynamicRange/index", "CubeMapToSphericalPolynomialTools")
  @js.native
  open class CubeMapToSphericalPolynomialTools ()
    extends typings.babylonjs.miscHighDynamicRangeCubemapToSphericalPolynomialMod.CubeMapToSphericalPolynomialTools
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
      * @returns The Spherical Polynomial data.
      */
    inline def ConvertCubeMapTextureToSphericalPolynomial(texture: BaseTexture): Nullable[js.Promise[SphericalPolynomial]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ConvertCubeMapTextureToSphericalPolynomial")(texture.asInstanceOf[js.Any]).asInstanceOf[Nullable[js.Promise[SphericalPolynomial]]]
    
    /**
      * Converts a cubemap to the according Spherical Polynomial data.
      * This extracts the first 3 orders only as they are the only one used in the lighting.
      *
      * @param cubeInfo The Cube map to extract the information from.
      * @returns The Spherical Polynomial data.
      */
    inline def ConvertCubeMapToSphericalPolynomial(cubeInfo: CubeMapInfo): SphericalPolynomial = ^.asInstanceOf[js.Dynamic].applyDynamic("ConvertCubeMapToSphericalPolynomial")(cubeInfo.asInstanceOf[js.Any]).asInstanceOf[SphericalPolynomial]
    
    /** @internal */
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "CubeMapToSphericalPolynomialTools.MAX_HDRI_VALUE")
    @js.native
    def MAX_HDRI_VALUE: Double = js.native
    inline def MAX_HDRI_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_HDRI_VALUE")(x.asInstanceOf[js.Any])
    
    /** @internal */
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "CubeMapToSphericalPolynomialTools.PRESERVE_CLAMPED_COLORS")
    @js.native
    def PRESERVE_CLAMPED_COLORS: Boolean = js.native
    inline def PRESERVE_CLAMPED_COLORS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESERVE_CLAMPED_COLORS")(x.asInstanceOf[js.Any])
    
    /**
      * Compute the area on the unit sphere of the rectangle defined by (x,y) and the origin
      * See https://www.rorydriscoll.com/2012/01/15/cubemap-texel-solid-angle/
      * @param x
      * @param y
      */
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "CubeMapToSphericalPolynomialTools._AreaElement")
    @js.native
    def _AreaElement: Any = js.native
    inline def _AreaElement_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AreaElement")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "CubeMapToSphericalPolynomialTools._FileFaces")
    @js.native
    def _FileFaces: Any = js.native
    inline def _FileFaces_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FileFaces")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools")
  @js.native
  open class HDRTools ()
    extends typings.babylonjs.miscHighDynamicRangeHdrMod.HDRTools
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
      * @returns The Cube Map information.
      */
    inline def GetCubeMapTextureData(buffer: js.typedarray.ArrayBuffer, size: Double): CubeMapInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCubeMapTextureData")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[CubeMapInfo]
    inline def GetCubeMapTextureData(buffer: js.typedarray.ArrayBuffer, size: Double, supersample: Boolean): CubeMapInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCubeMapTextureData")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], supersample.asInstanceOf[js.Any])).asInstanceOf[CubeMapInfo]
    
    /**
      * Reads header information from an RGBE texture stored in a native array.
      * More information on this format are available here:
      * https://en.wikipedia.org/wiki/RGBE_image_format
      *
      * @param uint8array The binary file stored in  native array.
      * @returns The header information.
      */
    inline def RGBE_ReadHeader(uint8array: js.typedarray.Uint8Array): HDRInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("RGBE_ReadHeader")(uint8array.asInstanceOf[js.Any]).asInstanceOf[HDRInfo]
    
    /**
      * Returns the pixels data extracted from an RGBE texture.
      * This pixels will be stored left to right up to down in the R G B order in one array.
      *
      * More information on this format are available here:
      * https://en.wikipedia.org/wiki/RGBE_image_format
      *
      * @param uint8array The binary file stored in an array buffer.
      * @param hdrInfo The header information of the file.
      * @returns The pixels data in RGB right to left up to down order.
      */
    inline def RGBE_ReadPixels(uint8array: js.typedarray.Uint8Array, hdrInfo: HDRInfo): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBE_ReadPixels")(uint8array.asInstanceOf[js.Any], hdrInfo.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools._Ldexp")
    @js.native
    def _Ldexp: Any = js.native
    inline def _Ldexp_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Ldexp")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools._RGBEReadPixelsNOTRLE")
    @js.native
    def _RGBEReadPixelsNOTRLE: Any = js.native
    inline def _RGBEReadPixelsNOTRLE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RGBEReadPixelsNOTRLE")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools._RGBEReadPixelsRLE")
    @js.native
    def _RGBEReadPixelsRLE: Any = js.native
    inline def _RGBEReadPixelsRLE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RGBEReadPixelsRLE")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools._ReadStringLine")
    @js.native
    def _ReadStringLine: Any = js.native
    inline def _ReadStringLine_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ReadStringLine")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "HDRTools._Rgbe2float")
    @js.native
    def _Rgbe2float: Any = js.native
    inline def _Rgbe2float_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Rgbe2float")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools")
  @js.native
  open class PanoramaToCubeMapTools ()
    extends typings.babylonjs.miscHighDynamicRangePanoramaToCubemapMod.PanoramaToCubeMapTools
  /* static members */
  object PanoramaToCubeMapTools {
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.CalcProjectionSpherical")
    @js.native
    def CalcProjectionSpherical: Any = js.native
    inline def CalcProjectionSpherical_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CalcProjectionSpherical")(x.asInstanceOf[js.Any])
    
    /**
      * Converts a panorama stored in RGB right to left up to down format into a cubemap (6 faces).
      *
      * @param float32Array The source data.
      * @param inputWidth The width of the input panorama.
      * @param inputHeight The height of the input panorama.
      * @param size The willing size of the generated cubemap (each faces will be size * size pixels)
      * @returns The cubemap data
      */
    inline def ConvertPanoramaToCubemap(float32Array: js.typedarray.Float32Array, inputWidth: Double, inputHeight: Double, size: Double): CubeMapInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("ConvertPanoramaToCubemap")(float32Array.asInstanceOf[js.Any], inputWidth.asInstanceOf[js.Any], inputHeight.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[CubeMapInfo]
    inline def ConvertPanoramaToCubemap(
      float32Array: js.typedarray.Float32Array,
      inputWidth: Double,
      inputHeight: Double,
      size: Double,
      supersample: Boolean
    ): CubeMapInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("ConvertPanoramaToCubemap")(float32Array.asInstanceOf[js.Any], inputWidth.asInstanceOf[js.Any], inputHeight.asInstanceOf[js.Any], size.asInstanceOf[js.Any], supersample.asInstanceOf[js.Any])).asInstanceOf[CubeMapInfo]
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.CreateCubemapTexture")
    @js.native
    def CreateCubemapTexture: Any = js.native
    inline def CreateCubemapTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCubemapTexture")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.FACE_BACK")
    @js.native
    def FACE_BACK: Any = js.native
    inline def FACE_BACK_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_BACK")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.FACE_DOWN")
    @js.native
    def FACE_DOWN: Any = js.native
    inline def FACE_DOWN_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_DOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.FACE_FRONT")
    @js.native
    def FACE_FRONT: Any = js.native
    inline def FACE_FRONT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_FRONT")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.FACE_LEFT")
    @js.native
    def FACE_LEFT: Any = js.native
    inline def FACE_LEFT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.FACE_RIGHT")
    @js.native
    def FACE_RIGHT: Any = js.native
    inline def FACE_RIGHT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/index", "PanoramaToCubeMapTools.FACE_UP")
    @js.native
    def FACE_UP: Any = js.native
    inline def FACE_UP_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_UP")(x.asInstanceOf[js.Any])
  }
}
