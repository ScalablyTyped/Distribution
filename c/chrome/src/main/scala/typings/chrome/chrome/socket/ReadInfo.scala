package typings.chrome.chrome.socket

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadInfo extends js.Object {
  var data: ArrayBuffer = js.native
  var resultCode: Double = js.native
}

object ReadInfo {
  @scala.inline
  def apply(data: ArrayBuffer, resultCode: Double): ReadInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadInfo]
  }
  @scala.inline
  implicit class ReadInfoOps[Self <: ReadInfo] (val x: Self) extends AnyVal {
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
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultCode(value: Double): Self = this.set("resultCode", value.asInstanceOf[js.Any])
  }
  
}

