package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieMatchPattern extends StObject {
  
  /**
    * Inspect all cookies. 
    */
  var All: js.UndefOr[typings.awsSdk.clientsWafv2Mod.All] = js.undefined
  
  /**
    * Inspect only the cookies whose keys don't match any of the strings specified here. 
    */
  var ExcludedCookies: js.UndefOr[CookieNames] = js.undefined
  
  /**
    * Inspect only the cookies that have a key that matches one of the strings specified here. 
    */
  var IncludedCookies: js.UndefOr[CookieNames] = js.undefined
}
object CookieMatchPattern {
  
  inline def apply(): CookieMatchPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieMatchPattern]
  }
  
  extension [Self <: CookieMatchPattern](x: Self) {
    
    inline def setAll(value: All): Self = StObject.set(x, "All", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "All", js.undefined)
    
    inline def setExcludedCookies(value: CookieNames): Self = StObject.set(x, "ExcludedCookies", value.asInstanceOf[js.Any])
    
    inline def setExcludedCookiesUndefined: Self = StObject.set(x, "ExcludedCookies", js.undefined)
    
    inline def setExcludedCookiesVarargs(value: SingleCookieName*): Self = StObject.set(x, "ExcludedCookies", js.Array(value*))
    
    inline def setIncludedCookies(value: CookieNames): Self = StObject.set(x, "IncludedCookies", value.asInstanceOf[js.Any])
    
    inline def setIncludedCookiesUndefined: Self = StObject.set(x, "IncludedCookies", js.undefined)
    
    inline def setIncludedCookiesVarargs(value: SingleCookieName*): Self = StObject.set(x, "IncludedCookies", js.Array(value*))
  }
}
