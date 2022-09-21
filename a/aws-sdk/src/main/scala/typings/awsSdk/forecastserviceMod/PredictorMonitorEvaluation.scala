package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictorMonitorEvaluation extends StObject {
  
  /**
    * The status of the monitor evaluation. The state can be SUCCESS or FAILURE.
    */
  var EvaluationState: js.UndefOr[typings.awsSdk.forecastserviceMod.EvaluationState] = js.undefined
  
  /**
    * The timestamp that indicates when the monitor evaluation was started. 
    */
  var EvaluationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about any errors that may have occurred during the monitor evaluation.
    */
  var Message: js.UndefOr[typings.awsSdk.forecastserviceMod.Message] = js.undefined
  
  /**
    * A list of metrics Forecast calculated when monitoring a predictor. You can compare the value for each metric in the list to the metric's value in the Baseline to see how your predictor's performance is changing.
    */
  var MetricResults: js.UndefOr[typings.awsSdk.forecastserviceMod.MetricResults] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the monitor resource.
    */
  var MonitorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The source of the data the monitor resource used during the evaluation.
    */
  var MonitorDataSource: js.UndefOr[typings.awsSdk.forecastserviceMod.MonitorDataSource] = js.undefined
  
  /**
    * The number of items considered during the evaluation.
    */
  var NumItemsEvaluated: js.UndefOr[Long] = js.undefined
  
  /**
    * Provides details about a predictor event, such as a retraining.
    */
  var PredictorEvent: js.UndefOr[typings.awsSdk.forecastserviceMod.PredictorEvent] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource to monitor.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The timestamp that indicates the end of the window that is used for monitor evaluation.
    */
  var WindowEndDatetime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp that indicates the start of the window that is used for monitor evaluation.
    */
  var WindowStartDatetime: js.UndefOr[js.Date] = js.undefined
}
object PredictorMonitorEvaluation {
  
  inline def apply(): PredictorMonitorEvaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictorMonitorEvaluation]
  }
  
  extension [Self <: PredictorMonitorEvaluation](x: Self) {
    
    inline def setEvaluationState(value: EvaluationState): Self = StObject.set(x, "EvaluationState", value.asInstanceOf[js.Any])
    
    inline def setEvaluationStateUndefined: Self = StObject.set(x, "EvaluationState", js.undefined)
    
    inline def setEvaluationTime(value: js.Date): Self = StObject.set(x, "EvaluationTime", value.asInstanceOf[js.Any])
    
    inline def setEvaluationTimeUndefined: Self = StObject.set(x, "EvaluationTime", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setMetricResults(value: MetricResults): Self = StObject.set(x, "MetricResults", value.asInstanceOf[js.Any])
    
    inline def setMetricResultsUndefined: Self = StObject.set(x, "MetricResults", js.undefined)
    
    inline def setMetricResultsVarargs(value: MetricResult*): Self = StObject.set(x, "MetricResults", js.Array(value*))
    
    inline def setMonitorArn(value: Arn): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    inline def setMonitorArnUndefined: Self = StObject.set(x, "MonitorArn", js.undefined)
    
    inline def setMonitorDataSource(value: MonitorDataSource): Self = StObject.set(x, "MonitorDataSource", value.asInstanceOf[js.Any])
    
    inline def setMonitorDataSourceUndefined: Self = StObject.set(x, "MonitorDataSource", js.undefined)
    
    inline def setNumItemsEvaluated(value: Long): Self = StObject.set(x, "NumItemsEvaluated", value.asInstanceOf[js.Any])
    
    inline def setNumItemsEvaluatedUndefined: Self = StObject.set(x, "NumItemsEvaluated", js.undefined)
    
    inline def setPredictorEvent(value: PredictorEvent): Self = StObject.set(x, "PredictorEvent", value.asInstanceOf[js.Any])
    
    inline def setPredictorEventUndefined: Self = StObject.set(x, "PredictorEvent", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setWindowEndDatetime(value: js.Date): Self = StObject.set(x, "WindowEndDatetime", value.asInstanceOf[js.Any])
    
    inline def setWindowEndDatetimeUndefined: Self = StObject.set(x, "WindowEndDatetime", js.undefined)
    
    inline def setWindowStartDatetime(value: js.Date): Self = StObject.set(x, "WindowStartDatetime", value.asInstanceOf[js.Any])
    
    inline def setWindowStartDatetimeUndefined: Self = StObject.set(x, "WindowStartDatetime", js.undefined)
  }
}
