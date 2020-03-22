package typings.carbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var currencyRates: js.UndefOr[CurrencyRates] = js.undefined
  var currencySource: js.UndefOr[String] = js.undefined
  var currencyTarget: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var tempPath: js.UndefOr[String] = js.undefined
  var templatePath: js.UndefOr[String] = js.undefined
  var translations: js.UndefOr[Translations] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    currencyRates: CurrencyRates = null,
    currencySource: String = null,
    currencyTarget: String = null,
    lang: String = null,
    tempPath: String = null,
    templatePath: String = null,
    translations: Translations = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (currencyRates != null) __obj.updateDynamic("currencyRates")(currencyRates.asInstanceOf[js.Any])
    if (currencySource != null) __obj.updateDynamic("currencySource")(currencySource.asInstanceOf[js.Any])
    if (currencyTarget != null) __obj.updateDynamic("currencyTarget")(currencyTarget.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (tempPath != null) __obj.updateDynamic("tempPath")(tempPath.asInstanceOf[js.Any])
    if (templatePath != null) __obj.updateDynamic("templatePath")(templatePath.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

