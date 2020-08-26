package typings.bunyanConfig.mod

import typings.bunyan.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends js.Object {
  var closeOnExit: js.UndefOr[Boolean] = js.native
  var count: js.UndefOr[Double] = js.native
  var level: js.UndefOr[LogLevel] = js.native
  var path: js.UndefOr[String] = js.native
  var period: js.UndefOr[String] = js.native
  var stream: js.UndefOr[String | StreamConfiguration] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Stream {
  @scala.inline
  def apply(): Stream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stream]
  }
  @scala.inline
  implicit class StreamOps[Self <: Stream] (val x: Self) extends AnyVal {
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
    def setCloseOnExit(value: Boolean): Self = this.set("closeOnExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnExit: Self = this.set("closeOnExit", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setLevel(value: LogLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPeriod(value: String): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setStream(value: String | StreamConfiguration): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

