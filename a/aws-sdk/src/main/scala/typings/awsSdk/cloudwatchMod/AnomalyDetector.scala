package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyDetector extends StObject {
  
  /**
    * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges to exclude from use for training the model, and the time zone to use for the metric.
    */
  var Configuration: js.UndefOr[AnomalyDetectorConfiguration] = js.undefined
  
  /**
    * The metric dimensions associated with the anomaly detection model.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.cloudwatchMod.Dimensions] = js.undefined
  
  /**
    * The CloudWatch metric math expression for this anomaly detector.
    */
  var MetricMathAnomalyDetector: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricMathAnomalyDetector] = js.undefined
  
  /**
    * The name of the metric associated with the anomaly detection model.
    */
  var MetricName: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricName] = js.undefined
  
  /**
    * The namespace of the metric associated with the anomaly detection model.
    */
  var Namespace: js.UndefOr[typings.awsSdk.cloudwatchMod.Namespace] = js.undefined
  
  /**
    * The CloudWatch metric and statistic for this anomaly detector.
    */
  var SingleMetricAnomalyDetector: js.UndefOr[typings.awsSdk.cloudwatchMod.SingleMetricAnomalyDetector] = js.undefined
  
  /**
    * The statistic associated with the anomaly detection model.
    */
  var Stat: js.UndefOr[AnomalyDetectorMetricStat] = js.undefined
  
  /**
    * The current status of the anomaly detector's training. The possible values are TRAINED | PENDING_TRAINING | TRAINED_INSUFFICIENT_DATA 
    */
  var StateValue: js.UndefOr[AnomalyDetectorStateValue] = js.undefined
}
object AnomalyDetector {
  
  inline def apply(): AnomalyDetector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalyDetector]
  }
  
  extension [Self <: AnomalyDetector](x: Self) {
    
    inline def setConfiguration(value: AnomalyDetectorConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setMetricMathAnomalyDetector(value: MetricMathAnomalyDetector): Self = StObject.set(x, "MetricMathAnomalyDetector", value.asInstanceOf[js.Any])
    
    inline def setMetricMathAnomalyDetectorUndefined: Self = StObject.set(x, "MetricMathAnomalyDetector", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setSingleMetricAnomalyDetector(value: SingleMetricAnomalyDetector): Self = StObject.set(x, "SingleMetricAnomalyDetector", value.asInstanceOf[js.Any])
    
    inline def setSingleMetricAnomalyDetectorUndefined: Self = StObject.set(x, "SingleMetricAnomalyDetector", js.undefined)
    
    inline def setStat(value: AnomalyDetectorMetricStat): Self = StObject.set(x, "Stat", value.asInstanceOf[js.Any])
    
    inline def setStatUndefined: Self = StObject.set(x, "Stat", js.undefined)
    
    inline def setStateValue(value: AnomalyDetectorStateValue): Self = StObject.set(x, "StateValue", value.asInstanceOf[js.Any])
    
    inline def setStateValueUndefined: Self = StObject.set(x, "StateValue", js.undefined)
  }
}
