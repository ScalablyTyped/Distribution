package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieObject extends js.Object {
  
  /**
    * The specific cookies to forward to your distribution's origin.
    */
  var cookiesAllowList: js.UndefOr[StringList] = js.native
  
  /**
    * Specifies which cookies to forward to the distribution's origin for a cache behavior: all, none, or allow-list to forward only the cookies specified in the cookiesAllowList parameter.
    */
  var option: js.UndefOr[ForwardValues] = js.native
}
object CookieObject {
  
  @scala.inline
  def apply(): CookieObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieObject]
  }
  
  @scala.inline
  implicit class CookieObjectOps[Self <: CookieObject] (val x: Self) extends AnyVal {
    
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
    def setCookiesAllowListVarargs(value: String*): Self = this.set("cookiesAllowList", js.Array(value :_*))
    
    @scala.inline
    def setCookiesAllowList(value: StringList): Self = this.set("cookiesAllowList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookiesAllowList: Self = this.set("cookiesAllowList", js.undefined)
    
    @scala.inline
    def setOption(value: ForwardValues): Self = this.set("option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOption: Self = this.set("option", js.undefined)
  }
}
