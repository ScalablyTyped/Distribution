package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAnomalyDetectorInput extends StObject {
  
  /**
    * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges to exclude when training and updating the model. You can specify as many as 10 time ranges. The configuration can also include the time zone to use for the metric.
    */
  var Configuration: js.UndefOr[AnomalyDetectorConfiguration] = js.native
  
  /**
    * The metric dimensions to create the anomaly detection model for.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.cloudwatchMod.Dimensions] = js.native
  
  /**
    * The name of the metric to create the anomaly detection model for.
    */
  var MetricName: typings.awsSdk.cloudwatchMod.MetricName = js.native
  
  /**
    * The namespace of the metric to create the anomaly detection model for.
    */
  var Namespace: typings.awsSdk.cloudwatchMod.Namespace = js.native
  
  /**
    * The statistic to use for the metric and the anomaly detection model.
    */
  var Stat: AnomalyDetectorMetricStat = js.native
}
object PutAnomalyDetectorInput {
  
  @scala.inline
  def apply(MetricName: MetricName, Namespace: Namespace, Stat: AnomalyDetectorMetricStat): PutAnomalyDetectorInput = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Stat = Stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAnomalyDetectorInput]
  }
  
  @scala.inline
  implicit class PutAnomalyDetectorInputMutableBuilder[Self <: PutAnomalyDetectorInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: AnomalyDetectorConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
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
