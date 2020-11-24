package typings.carbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderOptions extends js.Object {
  
  var complement: js.UndefOr[js.Object] = js.native
  
  var convertTo: js.UndefOr[String | js.Object] = js.native
  
  var currencyRates: js.UndefOr[CurrencyRates] = js.native
  
  var currencySource: js.UndefOr[String] = js.native
  
  var currencyTarget: js.UndefOr[String] = js.native
  
  var enum: js.UndefOr[Enums] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var translations: js.UndefOr[Translations] = js.native
  
  var variableStr: js.UndefOr[String] = js.native
}
object RenderOptions {
  
  @scala.inline
  def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  
  @scala.inline
  implicit class RenderOptionsOps[Self <: RenderOptions] (val x: Self) extends AnyVal {
    
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
    def setComplement(value: js.Object): Self = this.set("complement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplement: Self = this.set("complement", js.undefined)
    
    @scala.inline
    def setConvertTo(value: String | js.Object): Self = this.set("convertTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertTo: Self = this.set("convertTo", js.undefined)
    
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
    def setEnum(value: Enums): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setTranslations(value: Translations): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    
    @scala.inline
    def setVariableStr(value: String): Self = this.set("variableStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableStr: Self = this.set("variableStr", js.undefined)
  }
}
