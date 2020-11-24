package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricDataQuery extends js.Object {
  
  /**
    * The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the Id of the other metrics to refer to those metrics, and can also use the Id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the Amazon CloudWatch User Guide. Within each MetricDataQuery object, you must specify either Expression or MetricStat but not both.
    */
  var Expression: js.UndefOr[MetricExpression] = js.native
  
  /**
    * A short name used to tie this object to the results in the response. This name must be unique within a single call to GetMetricData. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
    */
  var Id: MetricId = js.native
  
  /**
    * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard widget, the label is shown. If Label is omitted, CloudWatch generates a default.
    */
  var Label: js.UndefOr[MetricLabel] = js.native
  
  /**
    * The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data. Within one MetricDataQuery object, you must specify either Expression or MetricStat but not both.
    */
  var MetricStat: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricStat] = js.native
  
  /**
    * The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution metrics are those metrics stored by a PutMetricData operation that includes a StorageResolution of 1 second.
    */
  var Period: js.UndefOr[typings.awsSdk.cloudwatchMod.Period] = js.native
  
  /**
    * When used in GetMetricData, this option indicates whether to return the timestamps and raw data values of this metric. If you are performing this call just to do math expressions and do not also need the raw data returned, you can specify False. If you omit this, the default of True is used. When used in PutMetricAlarm, specify True for the one expression result to use as the alarm. For all other metrics and expressions in the same PutMetricAlarm operation, specify ReturnData as False.
    */
  var ReturnData: js.UndefOr[typings.awsSdk.cloudwatchMod.ReturnData] = js.native
}
object MetricDataQuery {
  
  @scala.inline
  def apply(Id: MetricId): MetricDataQuery = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDataQuery]
  }
  
  @scala.inline
  implicit class MetricDataQueryOps[Self <: MetricDataQuery] (val x: Self) extends AnyVal {
    
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
    def setId(value: MetricId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: MetricExpression): Self = this.set("Expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpression: Self = this.set("Expression", js.undefined)
    
    @scala.inline
    def setLabel(value: MetricLabel): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
    
    @scala.inline
    def setMetricStat(value: MetricStat): Self = this.set("MetricStat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricStat: Self = this.set("MetricStat", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("Period", js.undefined)
    
    @scala.inline
    def setReturnData(value: ReturnData): Self = this.set("ReturnData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnData: Self = this.set("ReturnData", js.undefined)
  }
}
