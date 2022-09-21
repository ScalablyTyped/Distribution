package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchedRuleInfoDebug extends StObject {
  
  /** Details about the request for which the rule was matched. */
  var request: RequestDetails
  
  var rule: MatchedRule
}
object MatchedRuleInfoDebug {
  
  inline def apply(request: RequestDetails, rule: MatchedRule): MatchedRuleInfoDebug = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedRuleInfoDebug]
  }
  
  extension [Self <: MatchedRuleInfoDebug](x: Self) {
    
    inline def setRequest(value: RequestDetails): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRule(value: MatchedRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
