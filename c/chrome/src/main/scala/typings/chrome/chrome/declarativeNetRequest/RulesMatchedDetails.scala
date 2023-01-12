package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesMatchedDetails extends StObject {
  
  /** Rules matching the given filter. */
  var rulesMatchedInfo: js.Array[MatchedRuleInfo]
}
object RulesMatchedDetails {
  
  inline def apply(rulesMatchedInfo: js.Array[MatchedRuleInfo]): RulesMatchedDetails = {
    val __obj = js.Dynamic.literal(rulesMatchedInfo = rulesMatchedInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesMatchedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RulesMatchedDetails] (val x: Self) extends AnyVal {
    
    inline def setRulesMatchedInfo(value: js.Array[MatchedRuleInfo]): Self = StObject.set(x, "rulesMatchedInfo", value.asInstanceOf[js.Any])
    
    inline def setRulesMatchedInfoVarargs(value: MatchedRuleInfo*): Self = StObject.set(x, "rulesMatchedInfo", js.Array(value*))
  }
}
