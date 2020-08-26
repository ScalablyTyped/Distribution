package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchmakingRuleSet extends js.Object {
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
  implicit class MatchmakingRuleSetOps[Self <: MatchmakingRuleSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRuleSetBody(value: RuleSetBody): Self = this.set("RuleSetBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setRuleSetArn(value: MatchmakingRuleSetArn): Self = this.set("RuleSetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleSetArn: Self = this.set("RuleSetArn", js.undefined)
    @scala.inline
    def setRuleSetName(value: MatchmakingIdStringModel): Self = this.set("RuleSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleSetName: Self = this.set("RuleSetName", js.undefined)
  }
  
}

