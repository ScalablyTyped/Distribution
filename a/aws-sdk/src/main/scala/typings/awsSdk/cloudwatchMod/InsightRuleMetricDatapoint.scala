package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightRuleMetricDatapoint extends js.Object {
  
  /**
    * The average value from all contributors during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Average: js.UndefOr[InsightRuleUnboundDouble] = js.native
  
  /**
    * The maximum value provided by one contributor during this timestamp. Each timestamp is evaluated separately, so the identity of the max contributor could be different for each timestamp. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var MaxContributorValue: js.UndefOr[InsightRuleUnboundDouble] = js.native
  
  /**
    * The maximum value from a single occurence from a single contributor during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Maximum: js.UndefOr[InsightRuleUnboundDouble] = js.native
  
  /**
    * The minimum value from a single contributor during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Minimum: js.UndefOr[InsightRuleUnboundDouble] = js.native
  
  /**
    * The number of occurrences that matched the rule during this data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var SampleCount: js.UndefOr[InsightRuleUnboundDouble] = js.native
  
  /**
    * The sum of the values from all contributors during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Sum: js.UndefOr[InsightRuleUnboundDouble] = js.native
  
  /**
    * The timestamp of the data point.
    */
  var Timestamp: typings.awsSdk.cloudwatchMod.Timestamp = js.native
  
  /**
    * The number of unique contributors who published data during this timestamp. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var UniqueContributors: js.UndefOr[InsightRuleUnboundDouble] = js.native
}
object InsightRuleMetricDatapoint {
  
  @scala.inline
  def apply(Timestamp: Timestamp): InsightRuleMetricDatapoint = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightRuleMetricDatapoint]
  }
  
  @scala.inline
  implicit class InsightRuleMetricDatapointOps[Self <: InsightRuleMetricDatapoint] (val x: Self) extends AnyVal {
    
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
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverage(value: InsightRuleUnboundDouble): Self = this.set("Average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverage: Self = this.set("Average", js.undefined)
    
    @scala.inline
    def setMaxContributorValue(value: InsightRuleUnboundDouble): Self = this.set("MaxContributorValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxContributorValue: Self = this.set("MaxContributorValue", js.undefined)
    
    @scala.inline
    def setMaximum(value: InsightRuleUnboundDouble): Self = this.set("Maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("Maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: InsightRuleUnboundDouble): Self = this.set("Minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("Minimum", js.undefined)
    
    @scala.inline
    def setSampleCount(value: InsightRuleUnboundDouble): Self = this.set("SampleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleCount: Self = this.set("SampleCount", js.undefined)
    
    @scala.inline
    def setSum(value: InsightRuleUnboundDouble): Self = this.set("Sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSum: Self = this.set("Sum", js.undefined)
    
    @scala.inline
    def setUniqueContributors(value: InsightRuleUnboundDouble): Self = this.set("UniqueContributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueContributors: Self = this.set("UniqueContributors", js.undefined)
  }
}
