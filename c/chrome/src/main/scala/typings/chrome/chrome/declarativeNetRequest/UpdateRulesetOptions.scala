package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRulesetOptions extends StObject {
  
  /** The set of ids corresponding to a static Ruleset that should be disabled. */
  var disableRulesetIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The set of ids corresponding to a static Ruleset that should be enabled. */
  var enableRulesetIds: js.UndefOr[js.Array[String]] = js.undefined
}
object UpdateRulesetOptions {
  
  inline def apply(): UpdateRulesetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRulesetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRulesetOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableRulesetIds(value: js.Array[String]): Self = StObject.set(x, "disableRulesetIds", value.asInstanceOf[js.Any])
    
    inline def setDisableRulesetIdsUndefined: Self = StObject.set(x, "disableRulesetIds", js.undefined)
    
    inline def setDisableRulesetIdsVarargs(value: String*): Self = StObject.set(x, "disableRulesetIds", js.Array(value*))
    
    inline def setEnableRulesetIds(value: js.Array[String]): Self = StObject.set(x, "enableRulesetIds", value.asInstanceOf[js.Any])
    
    inline def setEnableRulesetIdsUndefined: Self = StObject.set(x, "enableRulesetIds", js.undefined)
    
    inline def setEnableRulesetIdsVarargs(value: String*): Self = StObject.set(x, "enableRulesetIds", js.Array(value*))
  }
}
