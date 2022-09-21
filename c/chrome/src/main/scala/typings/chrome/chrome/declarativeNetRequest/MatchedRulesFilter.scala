package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchedRulesFilter extends StObject {
  
  /** If specified, only matches rules after the given timestamp. */
  var minTimeStamp: js.UndefOr[Double] = js.undefined
  
  /** If specified, only matches rules for the given tab.
    * Matches rules not associated with any active tab if set to -1.
    */
  var tabId: js.UndefOr[Double] = js.undefined
}
object MatchedRulesFilter {
  
  inline def apply(): MatchedRulesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchedRulesFilter]
  }
  
  extension [Self <: MatchedRulesFilter](x: Self) {
    
    inline def setMinTimeStamp(value: Double): Self = StObject.set(x, "minTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setMinTimeStampUndefined: Self = StObject.set(x, "minTimeStamp", js.undefined)
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
  }
}
