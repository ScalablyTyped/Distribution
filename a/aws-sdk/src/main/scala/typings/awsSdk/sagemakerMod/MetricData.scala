package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricData extends StObject {
  
  /**
    * The name of the metric.
    */
  var MetricName: js.UndefOr[typings.awsSdk.sagemakerMod.MetricName] = js.native
  
  /**
    * The date and time that the algorithm emitted the metric.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.sagemakerMod.Timestamp] = js.native
  
  /**
    * The value of the metric.
    */
  var Value: js.UndefOr[Float] = js.native
}
object MetricData {
  
  @scala.inline
  def apply(): MetricData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricData]
  }
  
  @scala.inline
  implicit class MetricDataMutableBuilder[Self <: MetricData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    @scala.inline
    def setValue(value: Float): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
