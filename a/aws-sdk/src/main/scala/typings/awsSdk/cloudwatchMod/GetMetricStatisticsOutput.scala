package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetricStatisticsOutput extends StObject {
  
  /**
    * The data points for the specified metric.
    */
  var Datapoints: js.UndefOr[typings.awsSdk.cloudwatchMod.Datapoints] = js.undefined
  
  /**
    * A label for the specified metric.
    */
  var Label: js.UndefOr[MetricLabel] = js.undefined
}
object GetMetricStatisticsOutput {
  
  @scala.inline
  def apply(): GetMetricStatisticsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricStatisticsOutput]
  }
  
  @scala.inline
  implicit class GetMetricStatisticsOutputMutableBuilder[Self <: GetMetricStatisticsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatapoints(value: Datapoints): Self = StObject.set(x, "Datapoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatapointsUndefined: Self = StObject.set(x, "Datapoints", js.undefined)
    
    @scala.inline
    def setDatapointsVarargs(value: Datapoint*): Self = StObject.set(x, "Datapoints", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: MetricLabel): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
  }
}
