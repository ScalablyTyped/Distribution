package typings.bemDashCn.bemDashCnMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var classMap: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  var el: js.UndefOr[String] = js.undefined
  var mod: js.UndefOr[String] = js.undefined
  var modValue: js.UndefOr[String] = js.undefined
  var ns: js.UndefOr[String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    classMap: StringDictionary[String] = null,
    el: String = null,
    mod: String = null,
    modValue: String = null,
    ns: String = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (classMap != null) __obj.updateDynamic("classMap")(classMap)
    if (el != null) __obj.updateDynamic("el")(el)
    if (mod != null) __obj.updateDynamic("mod")(mod)
    if (modValue != null) __obj.updateDynamic("modValue")(modValue)
    if (ns != null) __obj.updateDynamic("ns")(ns)
    __obj.asInstanceOf[Settings]
  }
}

