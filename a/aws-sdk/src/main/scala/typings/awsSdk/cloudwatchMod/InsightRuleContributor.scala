package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class InsightRuleContributorOps[Self <: InsightRuleContributor] (val x: Self) extends AnyVal {
    
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
    def setApproximateAggregateValue(value: InsightRuleUnboundDouble): Self = this.set("ApproximateAggregateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatapointsVarargs(value: InsightRuleContributorDatapoint*): Self = this.set("Datapoints", js.Array(value :_*))
    
    @scala.inline
    def setDatapoints(value: InsightRuleContributorDatapoints): Self = this.set("Datapoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: InsightRuleContributorKey*): Self = this.set("Keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: InsightRuleContributorKeys): Self = this.set("Keys", value.asInstanceOf[js.Any])
  }
}
