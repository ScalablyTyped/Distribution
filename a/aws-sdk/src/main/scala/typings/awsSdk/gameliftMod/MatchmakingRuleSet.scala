package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchmakingRuleSet extends StObject {
  
  /**
    * The time stamp indicating when this data object was created. The format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift matchmaking rule set resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift rule set ARN, the resource ID matches the RuleSetName value.
    */
  var RuleSetArn: js.UndefOr[MatchmakingRuleSetArn] = js.native
  
  /**
    * A collection of matchmaking rules, formatted as a JSON string. Comments are not allowed in JSON, but most elements support a description field.
    */
  var RuleSetBody: typings.awsSdk.gameliftMod.RuleSetBody = js.native
  
  /**
    * A unique identifier for a matchmaking rule set
    */
  var RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.native
}
object MatchmakingRuleSet {
  
  @scala.inline
  def apply(RuleSetBody: RuleSetBody): MatchmakingRuleSet = {
    val __obj = js.Dynamic.literal(RuleSetBody = RuleSetBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchmakingRuleSet]
  }
  
  @scala.inline
  implicit class MatchmakingRuleSetMutableBuilder[Self <: MatchmakingRuleSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setRuleSetArn(value: MatchmakingRuleSetArn): Self = StObject.set(x, "RuleSetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetArnUndefined: Self = StObject.set(x, "RuleSetArn", js.undefined)
    
    @scala.inline
    def setRuleSetBody(value: RuleSetBody): Self = StObject.set(x, "RuleSetBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetName(value: MatchmakingIdStringModel): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetNameUndefined: Self = StObject.set(x, "RuleSetName", js.undefined)
  }
}
