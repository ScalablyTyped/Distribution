package typings.browserSync.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeartbeatTimeout extends js.Object {
  var heartbeatTimeout: js.UndefOr[Double] = js.native
}

object HeartbeatTimeout {
  @scala.inline
  def apply(): HeartbeatTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeartbeatTimeout]
  }
  @scala.inline
  implicit class HeartbeatTimeoutOps[Self <: HeartbeatTimeout] (val x: Self) extends AnyVal {
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
    def setHeartbeatTimeout(value: Double): Self = this.set("heartbeatTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeartbeatTimeout: Self = this.set("heartbeatTimeout", js.undefined)
  }
  
}

