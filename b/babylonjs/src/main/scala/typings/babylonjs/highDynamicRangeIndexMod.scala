package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.hdrMod.HDRInfo
import typings.babylonjs.panoramaToCubemapMod.CubeMapInfo
import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/HighDynamicRange/index", JSImport.Namespace)
@js.native
object highDynamicRangeIndexMod extends js.Object {
  @js.native
  class CubeMapToSphericalPolynomialTools ()
    extends typings.babylonjs.cubemapToSphericalPolynomialMod.CubeMapToSphericalPolynomialTools
  
  @js.native
  class HDRTools ()
    extends typings.babylonjs.hdrMod.HDRTools
  
  @js.native
  class PanoramaToCubeMapTools ()
    extends typings.babylonjs.panoramaToCubemapMod.PanoramaToCubeMapTools
  
  /* static members */
  @js.native
  object CubeMapToSphericalPolynomialTools extends js.Object {
    var FileFaces: js.Any = js.native
    /**
      * Converts a texture to the according Spherical Polynomial data.
      * This extracts the first 3 orders only as they are the only one used in the lighting.
      *
      * @param texture The texture to extract the information from.
      * @return The Spherical Polynomial data.
      */
    def ConvertCubeMapTextureToSphericalPolynomial(texture: BaseTexture): Nullable[SphericalPolynomial] = js.native
    /**
      * Converts a cubemap to the according Spherical Polynomial data.
      * This extracts the first 3 orders only as they are the only one used in the lighting.
      *
      * @param cubeInfo The Cube map to extract the information from.
      * @return The Spherical Polynomial data.
      */
    def ConvertCubeMapToSphericalPolynomial(cubeInfo: CubeMapInfo): SphericalPolynomial = js.native
  }
  
  /* static members */
  @js.native
  object HDRTools extends js.Object {
    var Ldexp: js.Any = js.native
    var RGBE_ReadPixels_RLE: js.Any = js.native
    var Rgbe2float: js.Any = js.native
    var readStringLine: js.Any = js.native
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
    def GetCubeMapTextureData(buffer: ArrayBuffer, size: Double): CubeMapInfo = js.native
    /**
      * Reads header information from an RGBE texture stored in a native array.
      * More information on this format are available here:
      * https://en.wikipedia.org/wiki/RGBE_image_format
      *
      * @param uint8array The binary file stored in  native array.
      * @return The header information.
      */
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
    def RGBE_ReadPixels(uint8array: Uint8Array, hdrInfo: HDRInfo): Float32Array = js.native
  }
  
  /* static members */
  @js.native
  object PanoramaToCubeMapTools extends js.Object {
    var CalcProjectionSpherical: js.Any = js.native
    var CreateCubemapTexture: js.Any = js.native
    var FACE_BACK: js.Any = js.native
    var FACE_DOWN: js.Any = js.native
    var FACE_FRONT: js.Any = js.native
    var FACE_LEFT: js.Any = js.native
    var FACE_RIGHT: js.Any = js.native
    var FACE_UP: js.Any = js.native
    /**
      * Converts a panorma stored in RGB right to left up to down format into a cubemap (6 faces).
      *
      * @param float32Array The source data.
      * @param inputWidth The width of the input panorama.
      * @param inputHeight The height of the input panorama.
      * @param size The willing size of the generated cubemap (each faces will be size * size pixels)
      * @return The cubemap data
      */
    def ConvertPanoramaToCubemap(float32Array: Float32Array, inputWidth: Double, inputHeight: Double, size: Double): CubeMapInfo = js.native
  }
  
}

