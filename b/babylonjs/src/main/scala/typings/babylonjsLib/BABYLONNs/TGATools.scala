package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Based on jsTGALoader - Javascript loader for TGA file
     * By Vincent Thibault
     * @see http://blog.robrowser.com/javascript-tga-loader.html
     */
@JSGlobal("BABYLON.TGATools")
@js.native
class TGATools () extends js.Object

/**
     * Based on jsTGALoader - Javascript loader for TGA file
     * By Vincent Thibault
     * @see http://blog.robrowser.com/javascript-tga-loader.html
     */
@JSGlobal("BABYLON.TGATools")
@js.native
object TGATools extends js.Object {
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
  /**
           * Gets the header of a TGA file
           * @param data defines the TGA data
           * @returns the header
           */
  def GetTGAHeader(data: stdLib.Uint8Array): js.Any = js.native
  /**
           * Uploads TGA content to a Babylon Texture
           * @hidden
           */
  def UploadContent(texture: babylonjsLib.BABYLONNs.InternalTexture, data: stdLib.Uint8Array): scala.Unit = js.native
  /** @hidden */
  def _getImageData16bits(
    header: js.Any,
    palettes: stdLib.Uint8Array,
    pixel_data: stdLib.Uint8Array,
    y_start: scala.Double,
    y_step: scala.Double,
    y_end: scala.Double,
    x_start: scala.Double,
    x_step: scala.Double,
    x_end: scala.Double
  ): stdLib.Uint8Array = js.native
  /** @hidden */
  def _getImageData24bits(
    header: js.Any,
    palettes: stdLib.Uint8Array,
    pixel_data: stdLib.Uint8Array,
    y_start: scala.Double,
    y_step: scala.Double,
    y_end: scala.Double,
    x_start: scala.Double,
    x_step: scala.Double,
    x_end: scala.Double
  ): stdLib.Uint8Array = js.native
  /** @hidden */
  def _getImageData32bits(
    header: js.Any,
    palettes: stdLib.Uint8Array,
    pixel_data: stdLib.Uint8Array,
    y_start: scala.Double,
    y_step: scala.Double,
    y_end: scala.Double,
    x_start: scala.Double,
    x_step: scala.Double,
    x_end: scala.Double
  ): stdLib.Uint8Array = js.native
  /** @hidden */
  def _getImageData8bits(
    header: js.Any,
    palettes: stdLib.Uint8Array,
    pixel_data: stdLib.Uint8Array,
    y_start: scala.Double,
    y_step: scala.Double,
    y_end: scala.Double,
    x_start: scala.Double,
    x_step: scala.Double,
    x_end: scala.Double
  ): stdLib.Uint8Array = js.native
  /** @hidden */
  def _getImageDataGrey16bits(
    header: js.Any,
    palettes: stdLib.Uint8Array,
    pixel_data: stdLib.Uint8Array,
    y_start: scala.Double,
    y_step: scala.Double,
    y_end: scala.Double,
    x_start: scala.Double,
    x_step: scala.Double,
    x_end: scala.Double
  ): stdLib.Uint8Array = js.native
  /** @hidden */
  def _getImageDataGrey8bits(
    header: js.Any,
    palettes: stdLib.Uint8Array,
    pixel_data: stdLib.Uint8Array,
    y_start: scala.Double,
    y_step: scala.Double,
    y_end: scala.Double,
    x_start: scala.Double,
    x_step: scala.Double,
    x_end: scala.Double
  ): stdLib.Uint8Array = js.native
}

