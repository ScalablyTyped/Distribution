package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Check extends StObject {
  
  var after: js.UndefOr[js.Function | String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var evaluate: js.Function | String
  
  var id: String
  
  var matches: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[js.Any] = js.undefined
}
object Check {
  
  inline def apply(evaluate: js.Function | String, id: String): Check = {
    val __obj = js.Dynamic.literal(evaluate = evaluate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Check]
  }
  
  extension [Self <: Check](x: Self) {
    
    inline def setAfter(value: js.Function | String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEvaluate(value: js.Function | String): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: String): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
