package typings
package barcodeLib.barcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeOptions extends js.Object {
  var data: java.lang.String | scala.Double
  var height: scala.Double
  var width: scala.Double
}

object BarcodeOptions {
  @scala.inline
  def apply(data: java.lang.String | scala.Double, height: scala.Double, width: scala.Double): BarcodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[BarcodeOptions]
  }
}

