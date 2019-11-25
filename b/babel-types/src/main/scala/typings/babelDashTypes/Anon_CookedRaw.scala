package typings.babelDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookedRaw extends js.Object {
  var cooked: js.UndefOr[String] = js.undefined
  var raw: js.UndefOr[String] = js.undefined
}

object Anon_CookedRaw {
  @scala.inline
  def apply(cooked: String = null, raw: String = null): Anon_CookedRaw = {
    val __obj = js.Dynamic.literal()
    if (cooked != null) __obj.updateDynamic("cooked")(cooked.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CookedRaw]
  }
}

