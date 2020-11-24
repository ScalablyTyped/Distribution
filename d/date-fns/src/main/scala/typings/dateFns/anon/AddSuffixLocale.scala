package typings.dateFns.anon

import typings.dateFns.dateFnsStrings.ceil
import typings.dateFns.dateFnsStrings.day
import typings.dateFns.dateFnsStrings.floor
import typings.dateFns.dateFnsStrings.hour
import typings.dateFns.dateFnsStrings.minute
import typings.dateFns.dateFnsStrings.month
import typings.dateFns.dateFnsStrings.round
import typings.dateFns.dateFnsStrings.second
import typings.dateFns.dateFnsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSuffixLocale extends js.Object {
  
  var addSuffix: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[typings.dateFns.Locale] = js.native
  
  var roundingMethod: js.UndefOr[floor | ceil | round] = js.native
  
  var unit: js.UndefOr[second | minute | hour | day | month | year] = js.native
}
object AddSuffixLocale {
  
  @scala.inline
  def apply(): AddSuffixLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSuffixLocale]
  }
  
  @scala.inline
  implicit class AddSuffixLocaleOps[Self <: AddSuffixLocale] (val x: Self) extends AnyVal {
    
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
    def setAddSuffix(value: Boolean): Self = this.set("addSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddSuffix: Self = this.set("addSuffix", js.undefined)
    
    @scala.inline
    def setLocale(value: typings.dateFns.Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setRoundingMethod(value: floor | ceil | round): Self = this.set("roundingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundingMethod: Self = this.set("roundingMethod", js.undefined)
    
    @scala.inline
    def setUnit(value: second | minute | hour | day | month | year): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
