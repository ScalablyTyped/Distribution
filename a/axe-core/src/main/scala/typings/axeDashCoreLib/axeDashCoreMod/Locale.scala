package typings
package axeDashCoreLib.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var checks: js.UndefOr[CheckLocale] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var rules: js.UndefOr[RuleLocale] = js.undefined
}

object Locale {
  @scala.inline
  def apply(checks: CheckLocale = null, lang: java.lang.String = null, rules: RuleLocale = null): Locale = {
    val __obj = js.Dynamic.literal()
    if (checks != null) __obj.updateDynamic("checks")(checks)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[Locale]
  }
}

