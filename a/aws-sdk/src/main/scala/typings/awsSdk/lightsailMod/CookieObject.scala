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
  
  inline def apply(): CookieObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieObject]
  }
  
  extension [Self <: CookieObject](x: Self) {
    
    inline def setCookiesAllowList(value: StringList): Self = StObject.set(x, "cookiesAllowList", value.asInstanceOf[js.Any])
    
    inline def setCookiesAllowListUndefined: Self = StObject.set(x, "cookiesAllowList", js.undefined)
    
    inline def setCookiesAllowListVarargs(value: String*): Self = StObject.set(x, "cookiesAllowList", js.Array(value*))
    
    inline def setOption(value: ForwardValues): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
  }
}
