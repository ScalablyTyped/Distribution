package typings.carbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var currencyRates: js.UndefOr[CurrencyRates] = js.native
  var currencySource: js.UndefOr[String] = js.native
  var currencyTarget: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var tempPath: js.UndefOr[String] = js.native
  var templatePath: js.UndefOr[String] = js.native
  var translations: js.UndefOr[Translations] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrencyRates(value: CurrencyRates): Self = this.set("currencyRates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyRates: Self = this.set("currencyRates", js.undefined)
    @scala.inline
    def setCurrencySource(value: String): Self = this.set("currencySource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencySource: Self = this.set("currencySource", js.undefined)
    @scala.inline
    def setCurrencyTarget(value: String): Self = this.set("currencyTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyTarget: Self = this.set("currencyTarget", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setTempPath(value: String): Self = this.set("tempPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTempPath: Self = this.set("tempPath", js.undefined)
    @scala.inline
    def setTemplatePath(value: String): Self = this.set("templatePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplatePath: Self = this.set("templatePath", js.undefined)
    @scala.inline
    def setTranslations(value: Translations): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

