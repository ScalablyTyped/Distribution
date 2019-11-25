package typings.bootstrapDashNotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enter extends js.Object {
  var enter: js.UndefOr[String] = js.undefined
  var exit: js.UndefOr[String] = js.undefined
}

object Anon_Enter {
  @scala.inline
  def apply(enter: String = null, exit: String = null): Anon_Enter = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Enter]
  }
}

