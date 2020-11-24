package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMetricStatisticsOutput extends js.Object {
  
  /**
    * The data points for the specified metric.
    */
  var Datapoints: js.UndefOr[typings.awsSdk.cloudwatchMod.Datapoints] = js.native
  
  /**
    * A label for the specified metric.
    */
  var Label: js.UndefOr[MetricLabel] = js.native
}
object GetMetricStatisticsOutput {
  
  @scala.inline
  def apply(): GetMetricStatisticsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricStatisticsOutput]
  }
  
  @scala.inline
  implicit class GetMetricStatisticsOutputOps[Self <: GetMetricStatisticsOutput] (val x: Self) extends AnyVal {
    
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
    def setDatapointsVarargs(value: Datapoint*): Self = this.set("Datapoints", js.Array(value :_*))
    
    @scala.inline
    def setDatapoints(value: Datapoints): Self = this.set("Datapoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatapoints: Self = this.set("Datapoints", js.undefined)
    
    @scala.inline
    def setLabel(value: MetricLabel): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
  }
}
