package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightRuleContributor extends js.Object {
  /**
    * An approximation of the aggregate value that comes from this contributor.
    */
  var ApproximateAggregateValue: InsightRuleUnboundDouble = js.native
  /**
    * An array of the data points where this contributor is present. Only the data points when this contributor appeared are included in the array.
    */
  var Datapoints: InsightRuleContributorDatapoints = js.native
  /**
    * One of the log entry field keywords that is used to define contributors for this rule.
    */
  var Keys: InsightRuleContributorKeys = js.native
}

object InsightRuleContributor {
  @scala.inline
  def apply(
    ApproximateAggregateValue: InsightRuleUnboundDouble,
    Datapoints: InsightRuleContributorDatapoints,
    Keys: InsightRuleContributorKeys
  ): InsightRuleContributor = {
    val __obj = js.Dynamic.literal(ApproximateAggregateValue = ApproximateAggregateValue.asInstanceOf[js.Any], Datapoints = Datapoints.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightRuleContributor]
  }
}

