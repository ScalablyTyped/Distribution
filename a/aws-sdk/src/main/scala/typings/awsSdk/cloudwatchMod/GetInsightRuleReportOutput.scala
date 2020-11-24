package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightRuleReportOutput extends js.Object {
  
  /**
    * The sum of the values from all individual contributors that match the rule.
    */
  var AggregateValue: js.UndefOr[InsightRuleUnboundDouble] = js.native
  
  /**
    * Specifies whether this rule aggregates contributor data by COUNT or SUM.
    */
  var AggregationStatistic: js.UndefOr[InsightRuleAggregationStatistic] = js.native
  
  /**
    * An approximate count of the unique contributors found by this rule in this time period.
    */
  var ApproximateUniqueCount: js.UndefOr[InsightRuleUnboundLong] = js.native
  
  /**
    * An array of the unique contributors found by this rule in this time period. If the rule contains multiple keys, each combination of values for the keys counts as a unique contributor.
    */
  var Contributors: js.UndefOr[InsightRuleContributors] = js.native
  
  /**
    * An array of the strings used as the keys for this rule. The keys are the dimensions used to classify contributors. If the rule contains more than one key, then each unique combination of values for the keys is counted as a unique contributor.
    */
  var KeyLabels: js.UndefOr[InsightRuleContributorKeyLabels] = js.native
  
  /**
    * A time series of metric data points that matches the time period in the rule request.
    */
  var MetricDatapoints: js.UndefOr[InsightRuleMetricDatapoints] = js.native
}
object GetInsightRuleReportOutput {
  
  @scala.inline
  def apply(): GetInsightRuleReportOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightRuleReportOutput]
  }
  
  @scala.inline
  implicit class GetInsightRuleReportOutputOps[Self <: GetInsightRuleReportOutput] (val x: Self) extends AnyVal {
    
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
    def setAggregateValue(value: InsightRuleUnboundDouble): Self = this.set("AggregateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateValue: Self = this.set("AggregateValue", js.undefined)
    
    @scala.inline
    def setAggregationStatistic(value: InsightRuleAggregationStatistic): Self = this.set("AggregationStatistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationStatistic: Self = this.set("AggregationStatistic", js.undefined)
    
    @scala.inline
    def setApproximateUniqueCount(value: InsightRuleUnboundLong): Self = this.set("ApproximateUniqueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproximateUniqueCount: Self = this.set("ApproximateUniqueCount", js.undefined)
    
    @scala.inline
    def setContributorsVarargs(value: InsightRuleContributor*): Self = this.set("Contributors", js.Array(value :_*))
    
    @scala.inline
    def setContributors(value: InsightRuleContributors): Self = this.set("Contributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributors: Self = this.set("Contributors", js.undefined)
    
    @scala.inline
    def setKeyLabelsVarargs(value: InsightRuleContributorKeyLabel*): Self = this.set("KeyLabels", js.Array(value :_*))
    
    @scala.inline
    def setKeyLabels(value: InsightRuleContributorKeyLabels): Self = this.set("KeyLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyLabels: Self = this.set("KeyLabels", js.undefined)
    
    @scala.inline
    def setMetricDatapointsVarargs(value: InsightRuleMetricDatapoint*): Self = this.set("MetricDatapoints", js.Array(value :_*))
    
    @scala.inline
    def setMetricDatapoints(value: InsightRuleMetricDatapoints): Self = this.set("MetricDatapoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricDatapoints: Self = this.set("MetricDatapoints", js.undefined)
  }
}
