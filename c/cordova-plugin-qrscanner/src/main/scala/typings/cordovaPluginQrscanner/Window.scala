package typings.cordovaPluginQrscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var QRScanner: typings.cordovaPluginQrscanner.QRScanner = js.native
}

object Window {
  @scala.inline
  def apply(QRScanner: QRScanner): Window = {
    val __obj = js.Dynamic.literal(QRScanner = QRScanner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQRScanner(value: QRScanner): Self = this.set("QRScanner", value.asInstanceOf[js.Any])
  }
  
}

