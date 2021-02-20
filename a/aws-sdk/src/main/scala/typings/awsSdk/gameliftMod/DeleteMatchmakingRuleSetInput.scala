package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMatchmakingRuleSetInput extends StObject {
  
  /**
    * A unique identifier for a matchmaking rule set to be deleted. (Note: The rule set name is different from the optional "name" field in the rule set body.) You can use either the rule set name or ARN value.
    */
  var Name: MatchmakingRuleSetName = js.native
}
object DeleteMatchmakingRuleSetInput {
  
  @scala.inline
  def apply(Name: MatchmakingRuleSetName): DeleteMatchmakingRuleSetInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMatchmakingRuleSetInput]
  }
  
  @scala.inline
  implicit class DeleteMatchmakingRuleSetInputMutableBuilder[Self <: DeleteMatchmakingRuleSetInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: MatchmakingRuleSetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
