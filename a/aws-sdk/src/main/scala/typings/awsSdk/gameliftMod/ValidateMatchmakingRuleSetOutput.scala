package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateMatchmakingRuleSetOutput extends StObject {
  
  /**
    * A response indicating whether the rule set is valid.
    */
  var Valid: js.UndefOr[BooleanModel] = js.native
}
object ValidateMatchmakingRuleSetOutput {
  
  @scala.inline
  def apply(): ValidateMatchmakingRuleSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateMatchmakingRuleSetOutput]
  }
  
  @scala.inline
  implicit class ValidateMatchmakingRuleSetOutputMutableBuilder[Self <: ValidateMatchmakingRuleSetOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValid(value: BooleanModel): Self = StObject.set(x, "Valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "Valid", js.undefined)
  }
}
