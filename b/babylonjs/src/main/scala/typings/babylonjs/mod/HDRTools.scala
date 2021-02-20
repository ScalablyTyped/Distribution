package typings.babylonjs.mod

import typings.babylonjs.hdrMod.HDRInfo
import typings.babylonjs.panoramaToCubemapMod.CubeMapInfo
import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "HDRTools")
@js.native
class HDRTools ()
  extends typings.babylonjs.legacyMod.HDRTools
/* static members */
object HDRTools {
  
  @JSImport("babylonjs", "HDRTools")
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
  @JSImport("babylonjs", "HDRTools.GetCubeMapTextureData")
  @js.native
  def GetCubeMapTextureData(buffer: ArrayBuffer, size: Double): CubeMapInfo = js.native
  
  @JSImport("babylonjs", "HDRTools.Ldexp")
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
  @JSImport("babylonjs", "HDRTools.RGBE_ReadHeader")
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
  @JSImport("babylonjs", "HDRTools.RGBE_ReadPixels")
  @js.native
  def RGBE_ReadPixels(uint8array: Uint8Array, hdrInfo: HDRInfo): Float32Array = js.native
  
  @JSImport("babylonjs", "HDRTools.RGBE_ReadPixels_NOT_RLE")
  @js.native
  def RGBE_ReadPixels_NOT_RLE: js.Any = js.native
  @scala.inline
  def RGBE_ReadPixels_NOT_RLE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RGBE_ReadPixels_NOT_RLE")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "HDRTools.RGBE_ReadPixels_RLE")
  @js.native
  def RGBE_ReadPixels_RLE: js.Any = js.native
  @scala.inline
  def RGBE_ReadPixels_RLE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RGBE_ReadPixels_RLE")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "HDRTools.Rgbe2float")
  @js.native
  def Rgbe2float: js.Any = js.native
  @scala.inline
  def Rgbe2float_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rgbe2float")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "HDRTools.readStringLine")
  @js.native
  def readStringLine: js.Any = js.native
  @scala.inline
  def readStringLine_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readStringLine")(x.asInstanceOf[js.Any])
}
