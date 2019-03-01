package typings
package cordovaDashPluginDashQrscannerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var QRScanner: QRScanner
}

object Window {
  @scala.inline
  def apply(QRScanner: QRScanner): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("QRScanner")(QRScanner)
    __obj.asInstanceOf[Window]
  }
}

