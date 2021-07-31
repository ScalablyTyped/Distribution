package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMatchmakingRuleSetOutput extends StObject {
  
  /**
    * The newly created matchmaking rule set.
    */
  var RuleSet: MatchmakingRuleSet
}
object CreateMatchmakingRuleSetOutput {
  
  @scala.inline
  def apply(RuleSet: MatchmakingRuleSet): CreateMatchmakingRuleSetOutput = {
    val __obj = js.Dynamic.literal(RuleSet = RuleSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMatchmakingRuleSetOutput]
  }
  
  @scala.inline
  implicit class CreateMatchmakingRuleSetOutputMutableBuilder[Self <: CreateMatchmakingRuleSetOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleSet(value: MatchmakingRuleSet): Self = StObject.set(x, "RuleSet", value.asInstanceOf[js.Any])
  }
}
