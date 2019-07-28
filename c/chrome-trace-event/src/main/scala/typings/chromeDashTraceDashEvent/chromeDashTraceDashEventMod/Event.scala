package typings.chromeDashTraceDashEvent.chromeDashTraceDashEventMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event
  extends /* otherData */ StringDictionary[js.Any] {
  /** event phase */
  var ph: js.UndefOr[String] = js.undefined
  var pid: Double
  var tid: Double
  var ts: Double
}

object Event {
  @scala.inline
  def apply(
    pid: Double,
    tid: Double,
    ts: Double,
    StringDictionary: /* otherData */ StringDictionary[js.Any] = null,
    ph: String = null
  ): Event = {
    val __obj = js.Dynamic.literal(pid = pid, tid = tid, ts = ts)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ph != null) __obj.updateDynamic("ph")(ph)
    __obj.asInstanceOf[Event]
  }
}

