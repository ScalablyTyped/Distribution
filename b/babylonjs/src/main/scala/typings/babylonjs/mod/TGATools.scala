package typings.babylonjs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "TGATools")
@js.native
class TGATools ()
  extends typings.babylonjs.legacyMod.TGATools
/* static members */
@JSImport("babylonjs", "TGATools")
@js.native
object TGATools extends js.Object {
  
  /**
    * Gets the header of a TGA file
    * @param data defines the TGA data
    * @returns the header
    */
  def GetTGAHeader(data: Uint8Array): js.Any = js.native
  
  /**
    * Uploads TGA content to a Babylon Texture
    * @hidden
    */
  def UploadContent(texture: typings.babylonjs.internalTextureMod.InternalTexture, data: Uint8Array): Unit = js.native
  
  var _ORIGIN_BL: js.Any = js.native
  
  var _ORIGIN_BR: js.Any = js.native
  
  var _ORIGIN_MASK: js.Any = js.native
  
  var _ORIGIN_SHIFT: js.Any = js.native
  
  var _ORIGIN_UL: js.Any = js.native
  
  var _ORIGIN_UR: js.Any = js.native
  
  var _TYPE_GREY: js.Any = js.native
  
  var _TYPE_INDEXED: js.Any = js.native
  
  var _TYPE_RGB: js.Any = js.native
  
  var _TYPE_RLE_GREY: js.Any = js.native
  
  var _TYPE_RLE_INDEXED: js.Any = js.native
  
  var _TYPE_RLE_RGB: js.Any = js.native
  
  /** @hidden */
  def _getImageData16bits(
    header: js.Any,
    palettes: Uint8Array,
    pixel_data: Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): Uint8Array = js.native
  
  /** @hidden */
  def _getImageData24bits(
    header: js.Any,
    palettes: Uint8Array,
    pixel_data: Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): Uint8Array = js.native
  
  /** @hidden */
  def _getImageData32bits(
    header: js.Any,
    palettes: Uint8Array,
    pixel_data: Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): Uint8Array = js.native
  
  /** @hidden */
  def _getImageData8bits(
    header: js.Any,
    palettes: Uint8Array,
    pixel_data: Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): Uint8Array = js.native
  
  /** @hidden */
  def _getImageDataGrey16bits(
    header: js.Any,
    palettes: Uint8Array,
    pixel_data: Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): Uint8Array = js.native
  
  /** @hidden */
  def _getImageDataGrey8bits(
    header: js.Any,
    palettes: Uint8Array,
    pixel_data: Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): Uint8Array = js.native
}
