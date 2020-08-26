package typings.chromeTraceEvent.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event
  extends /* otherData */ StringDictionary[js.Any] {
  /** event phase */
  var ph: js.UndefOr[String] = js.native
  var pid: Double = js.native
  var tid: Double = js.native
  var ts: Double = js.native
}

object Event {
  @scala.inline
  def apply(pid: Double, tid: Double, ts: Double): Event = {
    val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setTid(value: Double): Self = this.set("tid", value.asInstanceOf[js.Any])
    @scala.inline
    def setTs(value: Double): Self = this.set("ts", value.asInstanceOf[js.Any])
    @scala.inline
    def setPh(value: String): Self = this.set("ph", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePh: Self = this.set("ph", js.undefined)
  }
  
}

