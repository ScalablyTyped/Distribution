package typings.clientSessions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodeResult extends js.Object {
  var content: js.Any = js.native
  var createdAt: Double = js.native
  var duration: Double = js.native
}

object DecodeResult {
  @scala.inline
  def apply(content: js.Any, createdAt: Double, duration: Double): DecodeResult = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeResult]
  }
  @scala.inline
  implicit class DecodeResultOps[Self <: DecodeResult] (val x: Self) extends AnyVal {
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
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedAt(value: Double): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
  }
  
}

