package typings.barcode.barcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeOptions extends js.Object {
  var data: String | Double
  var height: Double
  var width: Double
}

object BarcodeOptions {
  @scala.inline
  def apply(data: String | Double, height: Double, width: Double): BarcodeOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BarcodeOptions]
  }
}

