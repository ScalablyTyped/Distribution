package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Check extends StObject {
  
  var after: js.UndefOr[js.Function | String] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var evaluate: js.Function | String = js.native
  
  var id: String = js.native
  
  var matches: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[js.Any] = js.native
}
object Check {
  
  @scala.inline
  def apply(evaluate: js.Function | String, id: String): Check = {
    val __obj = js.Dynamic.literal(evaluate = evaluate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Check]
  }
  
  @scala.inline
  implicit class CheckMutableBuilder[Self <: Check] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: js.Function | String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setEvaluate(value: js.Function | String): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatches(value: String): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
