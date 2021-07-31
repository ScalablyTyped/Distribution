package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieObject extends StObject {
  
  /**
    * The specific cookies to forward to your distribution's origin.
    */
  var cookiesAllowList: js.UndefOr[StringList] = js.undefined
  
  /**
    * Specifies which cookies to forward to the distribution's origin for a cache behavior: all, none, or allow-list to forward only the cookies specified in the cookiesAllowList parameter.
    */
  var option: js.UndefOr[ForwardValues] = js.undefined
}
object CookieObject {
  
  @scala.inline
  def apply(): CookieObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieObject]
  }
  
  @scala.inline
  implicit class CookieObjectMutableBuilder[Self <: CookieObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookiesAllowList(value: StringList): Self = StObject.set(x, "cookiesAllowList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookiesAllowListUndefined: Self = StObject.set(x, "cookiesAllowList", js.undefined)
    
    @scala.inline
    def setCookiesAllowListVarargs(value: String*): Self = StObject.set(x, "cookiesAllowList", js.Array(value :_*))
    
    @scala.inline
    def setOption(value: ForwardValues): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
  }
}
