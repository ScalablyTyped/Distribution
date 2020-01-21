package typings.axeCore.mod

import typings.axeCore.AnonApplication
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  var axeVersion: js.UndefOr[String] = js.undefined
  var branding: js.UndefOr[AnonApplication] = js.undefined
  var checks: js.UndefOr[js.Array[Check]] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var reporter: js.UndefOr[ReporterVersion] = js.undefined
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
}

object Spec {
  @scala.inline
  def apply(
    axeVersion: String = null,
    branding: AnonApplication = null,
    checks: js.Array[Check] = null,
    locale: Locale = null,
    reporter: ReporterVersion = null,
    rules: js.Array[Rule] = null
  ): Spec = {
    val __obj = js.Dynamic.literal()
    if (axeVersion != null) __obj.updateDynamic("axeVersion")(axeVersion.asInstanceOf[js.Any])
    if (branding != null) __obj.updateDynamic("branding")(branding.asInstanceOf[js.Any])
    if (checks != null) __obj.updateDynamic("checks")(checks.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spec]
  }
}

