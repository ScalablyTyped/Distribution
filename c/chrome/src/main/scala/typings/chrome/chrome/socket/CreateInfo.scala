package typings.chrome.chrome.socket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInfo extends js.Object {
  var socketId: Double = js.native
}

object CreateInfo {
  @scala.inline
  def apply(socketId: Double): CreateInfo = {
    val __obj = js.Dynamic.literal(socketId = socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInfo]
  }
  @scala.inline
  implicit class CreateInfoOps[Self <: CreateInfo] (val x: Self) extends AnyVal {
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
    def setSocketId(value: Double): Self = this.set("socketId", value.asInstanceOf[js.Any])
  }
  
}

