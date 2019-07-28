package typings.axeDashCore.axeDashCoreMod

import typings.axeDashCore.Anon_Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  var branding: js.UndefOr[Anon_Application] = js.undefined
  var checks: js.UndefOr[js.Array[Check]] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var reporter: js.UndefOr[ReporterVersion] = js.undefined
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
}

object Spec {
  @scala.inline
  def apply(
    branding: Anon_Application = null,
    checks: js.Array[Check] = null,
    locale: Locale = null,
    reporter: ReporterVersion = null,
    rules: js.Array[Rule] = null
  ): Spec = {
    val __obj = js.Dynamic.literal()
    if (branding != null) __obj.updateDynamic("branding")(branding)
    if (checks != null) __obj.updateDynamic("checks")(checks)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[Spec]
  }
}

