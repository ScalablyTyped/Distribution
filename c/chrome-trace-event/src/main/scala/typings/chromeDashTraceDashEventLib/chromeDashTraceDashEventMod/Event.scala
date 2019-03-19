package typings
package chromeDashTraceDashEventLib.chromeDashTraceDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event
  extends /* otherData */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** event phase */
  var ph: js.UndefOr[java.lang.String] = js.undefined
  var pid: scala.Double
  var tid: scala.Double
  var ts: scala.Double
}

object Event {
  @scala.inline
  def apply(
    pid: scala.Double,
    tid: scala.Double,
    ts: scala.Double,
    StringDictionary: /* otherData */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ph: java.lang.String = null
  ): Event = {
    val __obj = js.Dynamic.literal(pid = pid, tid = tid, ts = ts)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ph != null) __obj.updateDynamic("ph")(ph)
    __obj.asInstanceOf[Event]
  }
}

