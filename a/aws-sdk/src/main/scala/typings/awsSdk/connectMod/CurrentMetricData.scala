package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentMetricData extends StObject {
  
  /**
    * Information about the metric.
    */
  var Metric: js.UndefOr[CurrentMetric] = js.undefined
  
  /**
    * The value of the metric.
    */
  var Value: js.UndefOr[typings.awsSdk.connectMod.Value] = js.undefined
}
object CurrentMetricData {
  
  @scala.inline
  def apply(): CurrentMetricData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentMetricData]
  }
  
  @scala.inline
  implicit class CurrentMetricDataMutableBuilder[Self <: CurrentMetricData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetric(value: CurrentMetric): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
