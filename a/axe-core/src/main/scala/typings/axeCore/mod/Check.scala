package typings.axeCore.mod

import typings.axeCore.anon.Impact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Check extends StObject {
  
  var after: js.UndefOr[js.Function | String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var evaluate: js.UndefOr[js.Function | String] = js.undefined
  
  var id: String
  
  var matches: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[Impact] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
}
object Check {
  
  inline def apply(id: String): Check = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Check]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Check] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: js.Function | String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEvaluate(value: js.Function | String): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
    
    inline def setEvaluateUndefined: Self = StObject.set(x, "evaluate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: String): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMetadata(value: Impact): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
