package typings
package cassandraDashDriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Activity extends js.Object {
  var activity: js.Any
  var elapsed: js.Any
  var id: js.Any
  var source: js.Any
  var thread: js.Any
}

object Anon_Activity {
  @scala.inline
  def apply(activity: js.Any, elapsed: js.Any, id: js.Any, source: js.Any, thread: js.Any): Anon_Activity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activity")(activity)
    __obj.updateDynamic("elapsed")(elapsed)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("thread")(thread)
    __obj.asInstanceOf[Anon_Activity]
  }
}

