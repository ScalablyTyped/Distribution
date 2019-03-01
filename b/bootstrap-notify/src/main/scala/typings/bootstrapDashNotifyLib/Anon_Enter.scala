package typings
package bootstrapDashNotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enter extends js.Object {
  var enter: js.UndefOr[java.lang.String] = js.undefined
  var exit: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Enter {
  @scala.inline
  def apply(enter: java.lang.String = null, exit: java.lang.String = null): Anon_Enter = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (exit != null) __obj.updateDynamic("exit")(exit)
    __obj.asInstanceOf[Anon_Enter]
  }
}

