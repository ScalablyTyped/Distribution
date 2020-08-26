package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMatchmakingRuleSetsOutput extends js.Object {
  /**
    * A token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A collection of requested matchmaking rule set objects. 
    */
  var RuleSets: MatchmakingRuleSetList = js.native
}

object DescribeMatchmakingRuleSetsOutput {
  @scala.inline
  def apply(RuleSets: MatchmakingRuleSetList): DescribeMatchmakingRuleSetsOutput = {
    val __obj = js.Dynamic.literal(RuleSets = RuleSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMatchmakingRuleSetsOutput]
  }
  @scala.inline
  implicit class DescribeMatchmakingRuleSetsOutputOps[Self <: DescribeMatchmakingRuleSetsOutput] (val x: Self) extends AnyVal {
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
    def setRuleSetsVarargs(value: MatchmakingRuleSet*): Self = this.set("RuleSets", js.Array(value :_*))
    @scala.inline
    def setRuleSets(value: MatchmakingRuleSetList): Self = this.set("RuleSets", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

