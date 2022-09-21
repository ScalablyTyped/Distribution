package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookies extends StObject {
  
  /**
    * The filter to use to identify the subset of cookies to inspect in a web request.  You must specify exactly one setting: either All, IncludedCookies, or ExcludedCookies. Example JSON: "MatchPattern": { "IncludedCookies": {"KeyToInclude1", "KeyToInclude2", "KeyToInclude3"} } 
    */
  var MatchPattern: CookieMatchPattern
  
  /**
    * The parts of the cookies to inspect with the rule inspection criteria. If you specify All, WAF inspects both keys and values. 
    */
  var MatchScope: MapMatchScope
  
  /**
    * What WAF should do if the cookies of the request are larger than WAF can inspect. WAF does not support inspecting the entire contents of request cookies when they exceed 8 KB (8192 bytes) or 200 total cookies. The underlying host service forwards a maximum of 200 cookies and at most 8 KB of cookie contents to WAF.  The options for oversize handling are the following:    CONTINUE - Inspect the cookies normally, according to the rule inspection criteria.     MATCH - Treat the web request as matching the rule statement. WAF applies the rule action to the request.    NO_MATCH - Treat the web request as not matching the rule statement.  
    */
  var OversizeHandling: typings.awsSdk.wafv2Mod.OversizeHandling
}
object Cookies {
  
  inline def apply(MatchPattern: CookieMatchPattern, MatchScope: MapMatchScope, OversizeHandling: OversizeHandling): Cookies = {
    val __obj = js.Dynamic.literal(MatchPattern = MatchPattern.asInstanceOf[js.Any], MatchScope = MatchScope.asInstanceOf[js.Any], OversizeHandling = OversizeHandling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookies]
  }
  
  extension [Self <: Cookies](x: Self) {
    
    inline def setMatchPattern(value: CookieMatchPattern): Self = StObject.set(x, "MatchPattern", value.asInstanceOf[js.Any])
    
    inline def setMatchScope(value: MapMatchScope): Self = StObject.set(x, "MatchScope", value.asInstanceOf[js.Any])
    
    inline def setOversizeHandling(value: OversizeHandling): Self = StObject.set(x, "OversizeHandling", value.asInstanceOf[js.Any])
  }
}
