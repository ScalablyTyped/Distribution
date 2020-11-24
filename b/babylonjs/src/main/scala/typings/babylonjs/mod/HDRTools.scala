package typings.babylonjs.mod

import typings.babylonjs.hdrMod.HDRInfo
import typings.babylonjs.panoramaToCubemapMod.CubeMapInfo
import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "HDRTools")
@js.native
class HDRTools ()
  extends typings.babylonjs.legacyMod.HDRTools
/* static members */
@JSImport("babylonjs", "HDRTools")
@js.native
object HDRTools extends js.Object {
  
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
  
  var Ldexp: js.Any = js.native
  
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
  
  var RGBE_ReadPixels_NOT_RLE: js.Any = js.native
  
  var RGBE_ReadPixels_RLE: js.Any = js.native
  
  var Rgbe2float: js.Any = js.native
  
  var readStringLine: js.Any = js.native
}
