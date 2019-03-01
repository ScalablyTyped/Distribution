package typings
package babelDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookedRaw extends js.Object {
  var cooked: js.UndefOr[java.lang.String] = js.undefined
  var raw: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CookedRaw {
  @scala.inline
  def apply(cooked: java.lang.String = null, raw: java.lang.String = null): Anon_CookedRaw = {
    val __obj = js.Dynamic.literal()
    if (cooked != null) __obj.updateDynamic("cooked")(cooked)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[Anon_CookedRaw]
  }
}

