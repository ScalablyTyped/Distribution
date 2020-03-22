package typings.carbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var complement: js.UndefOr[js.Object] = js.undefined
  var convertTo: js.UndefOr[String | js.Object] = js.undefined
  var currencyRates: js.UndefOr[CurrencyRates] = js.undefined
  var currencySource: js.UndefOr[String] = js.undefined
  var currencyTarget: js.UndefOr[String] = js.undefined
  var enum: js.UndefOr[Enums] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var translations: js.UndefOr[Translations] = js.undefined
  var variableStr: js.UndefOr[String] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    complement: js.Object = null,
    convertTo: String | js.Object = null,
    currencyRates: CurrencyRates = null,
    currencySource: String = null,
    currencyTarget: String = null,
    enum: Enums = null,
    lang: String = null,
    translations: Translations = null,
    variableStr: String = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    if (complement != null) __obj.updateDynamic("complement")(complement.asInstanceOf[js.Any])
    if (convertTo != null) __obj.updateDynamic("convertTo")(convertTo.asInstanceOf[js.Any])
    if (currencyRates != null) __obj.updateDynamic("currencyRates")(currencyRates.asInstanceOf[js.Any])
    if (currencySource != null) __obj.updateDynamic("currencySource")(currencySource.asInstanceOf[js.Any])
    if (currencyTarget != null) __obj.updateDynamic("currencyTarget")(currencyTarget.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (variableStr != null) __obj.updateDynamic("variableStr")(variableStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}

