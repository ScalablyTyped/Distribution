package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchedRuleInfo extends StObject {
  
  var rule: MatchedRule
  
  /** The tabId of the tab from which the request originated if the tab is still active. Else -1. */
  var tabId: Double
  
  /** The time the rule was matched.
    * Timestamps will correspond to the Javascript convention for times, i.e. number of milliseconds since the epoch.
    */
  var timeStamp: Double
}
object MatchedRuleInfo {
  
  inline def apply(rule: MatchedRule, tabId: Double, timeStamp: Double): MatchedRuleInfo = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedRuleInfo]
  }
  
  extension [Self <: MatchedRuleInfo](x: Self) {
    
    inline def setRule(value: MatchedRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
