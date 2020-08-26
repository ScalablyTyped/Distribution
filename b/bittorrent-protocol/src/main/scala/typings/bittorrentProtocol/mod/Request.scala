package typings.bittorrentProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var length: Double = js.native
  var offset: Double = js.native
  var piece: Double = js.native
  def callback(): Unit = js.native
}

object Request {
  @scala.inline
  def apply(callback: () => Unit, length: Double, offset: Double, piece: Double): Request = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], piece = piece.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setPiece(value: Double): Self = this.set("piece", value.asInstanceOf[js.Any])
  }
  
}

