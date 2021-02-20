package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAnomalyDetectorInput extends StObject {
  
  /**
    * The metric dimensions associated with the anomaly detection model to delete.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.cloudwatchMod.Dimensions] = js.native
  
  /**
    * The metric name associated with the anomaly detection model to delete.
    */
  var MetricName: typings.awsSdk.cloudwatchMod.MetricName = js.native
  
  /**
    * The namespace associated with the anomaly detection model to delete.
    */
  var Namespace: typings.awsSdk.cloudwatchMod.Namespace = js.native
  
  /**
    * The statistic associated with the anomaly detection model to delete.
    */
  var Stat: AnomalyDetectorMetricStat = js.native
}
object DeleteAnomalyDetectorInput {
  
  @scala.inline
  def apply(MetricName: MetricName, Namespace: Namespace, Stat: AnomalyDetectorMetricStat): DeleteAnomalyDetectorInput = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Stat = Stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnomalyDetectorInput]
  }
  
  @scala.inline
  implicit class DeleteAnomalyDetectorInputMutableBuilder[Self <: DeleteAnomalyDetectorInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value :_*))
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat(value: AnomalyDetectorMetricStat): Self = StObject.set(x, "Stat", value.asInstanceOf[js.Any])
  }
}
