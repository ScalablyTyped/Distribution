package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This groups tools to convert HDR texture to native colors array.
  */
@JSImport("babylonjs", "HDRTools")
@js.native
class HDRTools ()
  extends babylonjsLib.BABYLONNs.HDRTools

/**
  * This groups tools to convert HDR texture to native colors array.
  */
@JSImport("babylonjs", "HDRTools")
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
  def GetCubeMapTextureData(buffer: stdLib.ArrayBuffer, size: scala.Double): babylonjsLib.BABYLONNs.CubeMapInfo = js.native
  /**
    * Reads header information from an RGBE texture stored in a native array.
    * More information on this format are available here:
    * https://en.wikipedia.org/wiki/RGBE_image_format
    *
    * @param uint8array The binary file stored in  native array.
    * @return The header information.
    */
  def RGBE_ReadHeader(uint8array: stdLib.Uint8Array): babylonjsLib.BABYLONNs.HDRInfo = js.native
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
  def RGBE_ReadPixels(uint8array: stdLib.Uint8Array, hdrInfo: babylonjsLib.BABYLONNs.HDRInfo): stdLib.Float32Array = js.native
}

