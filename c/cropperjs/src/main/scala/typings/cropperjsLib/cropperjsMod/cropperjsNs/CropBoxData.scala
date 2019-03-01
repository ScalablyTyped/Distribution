package typings
package cropperjsLib.cropperjsMod.cropperjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropBoxData extends js.Object {
  /**
    * the height of the crop box
    */
  var height: scala.Double
  /**
    * the offset left of the crop box
    */
  var left: scala.Double
  /**
    * the offset top of the crop box
    */
  var top: scala.Double
  /**
    * the width of the crop box
    */
  var width: scala.Double
}

object CropBoxData {
  @scala.inline
  def apply(height: scala.Double, left: scala.Double, top: scala.Double, width: scala.Double): CropBoxData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[CropBoxData]
  }
}

