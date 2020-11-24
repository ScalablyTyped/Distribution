package typings.baseui.anon

import typings.dateFns.anon.DateTime
import typings.dateFns.anon.Day
import typings.dateFns.anon.FirstWeekContainsDateWeekStartsOn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<date-fns.Locale> */
@js.native
trait PartialLocale extends js.Object {
  
  var code: js.UndefOr[String] = js.native
  
  var formatDistance: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var formatLong: js.UndefOr[DateTime] = js.native
  
  var formatRelative: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var localize: js.UndefOr[Day] = js.native
  
  var `match`: js.UndefOr[Day] = js.native
  
  var options: js.UndefOr[FirstWeekContainsDateWeekStartsOn] = js.native
}
object PartialLocale {
  
  @scala.inline
  def apply(): PartialLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLocale]
  }
  
  @scala.inline
  implicit class PartialLocaleOps[Self <: PartialLocale] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setFormatDistance(value: /* repeated */ js.Any => _): Self = this.set("formatDistance", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatDistance: Self = this.set("formatDistance", js.undefined)
    
    @scala.inline
    def setFormatLong(value: DateTime): Self = this.set("formatLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatLong: Self = this.set("formatLong", js.undefined)
    
    @scala.inline
    def setFormatRelative(value: /* repeated */ js.Any => _): Self = this.set("formatRelative", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatRelative: Self = this.set("formatRelative", js.undefined)
    
    @scala.inline
    def setLocalize(value: Day): Self = this.set("localize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalize: Self = this.set("localize", js.undefined)
    
    @scala.inline
    def setMatch(value: Day): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setOptions(value: FirstWeekContainsDateWeekStartsOn): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
