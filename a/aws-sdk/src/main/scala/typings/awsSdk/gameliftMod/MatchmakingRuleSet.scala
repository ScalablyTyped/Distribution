package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchmakingRuleSet extends StObject {
  
  /**
    * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a GameLift matchmaking rule set resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::matchmakingruleset/&lt;ruleset name&gt;. In a GameLift rule set ARN, the resource ID matches the RuleSetName value.
    */
  var RuleSetArn: js.UndefOr[MatchmakingRuleSetArn] = js.undefined
  
  /**
    * A collection of matchmaking rules, formatted as a JSON string. Comments are not allowed in JSON, but most elements support a description field.
    */
  var RuleSetBody: typings.awsSdk.gameliftMod.RuleSetBody
  
  /**
    * A unique identifier for the matchmaking rule set
    */
  var RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined
}
object MatchmakingRuleSet {
  
  inline def apply(RuleSetBody: RuleSetBody): MatchmakingRuleSet = {
    val __obj = js.Dynamic.literal(RuleSetBody = RuleSetBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchmakingRuleSet]
  }
  
  extension [Self <: MatchmakingRuleSet](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setRuleSetArn(value: MatchmakingRuleSetArn): Self = StObject.set(x, "RuleSetArn", value.asInstanceOf[js.Any])
    
    inline def setRuleSetArnUndefined: Self = StObject.set(x, "RuleSetArn", js.undefined)
    
    inline def setRuleSetBody(value: RuleSetBody): Self = StObject.set(x, "RuleSetBody", value.asInstanceOf[js.Any])
    
    inline def setRuleSetName(value: MatchmakingIdStringModel): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
    
    inline def setRuleSetNameUndefined: Self = StObject.set(x, "RuleSetName", js.undefined)
  }
}
