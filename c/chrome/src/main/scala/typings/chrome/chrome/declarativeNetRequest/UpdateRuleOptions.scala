package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRuleOptions extends StObject {
  
  /** Rules to add. */
  var addRules: js.UndefOr[js.Array[Rule]] = js.undefined
  
  /**
    * IDs of the rules to remove.
    * Any invalid IDs will be ignored.
    */
  var removeRuleIds: js.UndefOr[js.Array[Double]] = js.undefined
}
object UpdateRuleOptions {
  
  inline def apply(): UpdateRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRuleOptions]
  }
  
  extension [Self <: UpdateRuleOptions](x: Self) {
    
    inline def setAddRules(value: js.Array[Rule]): Self = StObject.set(x, "addRules", value.asInstanceOf[js.Any])
    
    inline def setAddRulesUndefined: Self = StObject.set(x, "addRules", js.undefined)
    
    inline def setAddRulesVarargs(value: Rule*): Self = StObject.set(x, "addRules", js.Array(value*))
    
    inline def setRemoveRuleIds(value: js.Array[Double]): Self = StObject.set(x, "removeRuleIds", value.asInstanceOf[js.Any])
    
    inline def setRemoveRuleIdsUndefined: Self = StObject.set(x, "removeRuleIds", js.undefined)
    
    inline def setRemoveRuleIdsVarargs(value: Double*): Self = StObject.set(x, "removeRuleIds", js.Array(value*))
  }
}
