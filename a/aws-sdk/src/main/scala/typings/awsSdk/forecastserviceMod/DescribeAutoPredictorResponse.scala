package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutoPredictorResponse extends StObject {
  
  /**
    * The timestamp of the CreateAutoPredictor request.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The data configuration for your dataset group and any additional datasets.
    */
  var DataConfig: js.UndefOr[typings.awsSdk.forecastserviceMod.DataConfig] = js.undefined
  
  /**
    * An array of the ARNs of the dataset import jobs used to import training data for the predictor.
    */
  var DatasetImportJobArns: js.UndefOr[ArnList] = js.undefined
  
  var EncryptionConfig: js.UndefOr[typings.awsSdk.forecastserviceMod.EncryptionConfig] = js.undefined
  
  /**
    * The estimated time remaining in minutes for the predictor training job to complete.
    */
  var EstimatedTimeRemainingInMinutes: js.UndefOr[Long] = js.undefined
  
  /**
    * Provides the status and ARN of the Predictor Explainability.
    */
  var ExplainabilityInfo: js.UndefOr[typings.awsSdk.forecastserviceMod.ExplainabilityInfo] = js.undefined
  
  /**
    * An array of dimension (field) names that specify the attributes used to group your time series.
    */
  var ForecastDimensions: js.UndefOr[typings.awsSdk.forecastserviceMod.ForecastDimensions] = js.undefined
  
  /**
    * The frequency of predictions in a forecast. Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year and "5min" indicates every five minutes.
    */
  var ForecastFrequency: js.UndefOr[Frequency] = js.undefined
  
  /**
    * The number of time-steps that the model predicts. The forecast horizon is also called the prediction length.
    */
  var ForecastHorizon: js.UndefOr[Integer] = js.undefined
  
  /**
    * The forecast types used during predictor training. Default value is ["0.1","0.5","0.9"].
    */
  var ForecastTypes: js.UndefOr[typings.awsSdk.forecastserviceMod.ForecastTypes] = js.undefined
  
  /**
    * The last time the resource was modified. The timestamp depends on the status of the job:    CREATE_PENDING - The CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    CREATE_STOPPING - The current timestamp.    CREATE_STOPPED - When the job stopped.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * In the event of an error, a message detailing the cause of the error.
    */
  var Message: js.UndefOr[typings.awsSdk.forecastserviceMod.Message] = js.undefined
  
  /**
    * A object with the Amazon Resource Name (ARN) and status of the monitor resource.
    */
  var MonitorInfo: js.UndefOr[typings.awsSdk.forecastserviceMod.MonitorInfo] = js.undefined
  
  /**
    * The accuracy metric used to optimize the predictor.
    */
  var OptimizationMetric: js.UndefOr[typings.awsSdk.forecastserviceMod.OptimizationMetric] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the predictor
    */
  var PredictorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the predictor.
    */
  var PredictorName: js.UndefOr[Name] = js.undefined
  
  /**
    * The ARN and state of the reference predictor. This parameter is only valid for retrained or upgraded predictors.
    */
  var ReferencePredictorSummary: js.UndefOr[typings.awsSdk.forecastserviceMod.ReferencePredictorSummary] = js.undefined
  
  /**
    * The status of the predictor. States include:     ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     CREATE_STOPPING, CREATE_STOPPED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.undefined
  
  /**
    * The time boundary Forecast uses when aggregating data.
    */
  var TimeAlignmentBoundary: js.UndefOr[typings.awsSdk.forecastserviceMod.TimeAlignmentBoundary] = js.undefined
}
object DescribeAutoPredictorResponse {
  
  inline def apply(): DescribeAutoPredictorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAutoPredictorResponse]
  }
  
  extension [Self <: DescribeAutoPredictorResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDataConfig(value: DataConfig): Self = StObject.set(x, "DataConfig", value.asInstanceOf[js.Any])
    
    inline def setDataConfigUndefined: Self = StObject.set(x, "DataConfig", js.undefined)
    
    inline def setDatasetImportJobArns(value: ArnList): Self = StObject.set(x, "DatasetImportJobArns", value.asInstanceOf[js.Any])
    
    inline def setDatasetImportJobArnsUndefined: Self = StObject.set(x, "DatasetImportJobArns", js.undefined)
    
    inline def setDatasetImportJobArnsVarargs(value: Arn*): Self = StObject.set(x, "DatasetImportJobArns", js.Array(value*))
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "EncryptionConfig", js.undefined)
    
    inline def setEstimatedTimeRemainingInMinutes(value: Long): Self = StObject.set(x, "EstimatedTimeRemainingInMinutes", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTimeRemainingInMinutesUndefined: Self = StObject.set(x, "EstimatedTimeRemainingInMinutes", js.undefined)
    
    inline def setExplainabilityInfo(value: ExplainabilityInfo): Self = StObject.set(x, "ExplainabilityInfo", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityInfoUndefined: Self = StObject.set(x, "ExplainabilityInfo", js.undefined)
    
    inline def setForecastDimensions(value: ForecastDimensions): Self = StObject.set(x, "ForecastDimensions", value.asInstanceOf[js.Any])
    
    inline def setForecastDimensionsUndefined: Self = StObject.set(x, "ForecastDimensions", js.undefined)
    
    inline def setForecastDimensionsVarargs(value: Name*): Self = StObject.set(x, "ForecastDimensions", js.Array(value*))
    
    inline def setForecastFrequency(value: Frequency): Self = StObject.set(x, "ForecastFrequency", value.asInstanceOf[js.Any])
    
    inline def setForecastFrequencyUndefined: Self = StObject.set(x, "ForecastFrequency", js.undefined)
    
    inline def setForecastHorizon(value: Integer): Self = StObject.set(x, "ForecastHorizon", value.asInstanceOf[js.Any])
    
    inline def setForecastHorizonUndefined: Self = StObject.set(x, "ForecastHorizon", js.undefined)
    
    inline def setForecastTypes(value: ForecastTypes): Self = StObject.set(x, "ForecastTypes", value.asInstanceOf[js.Any])
    
    inline def setForecastTypesUndefined: Self = StObject.set(x, "ForecastTypes", js.undefined)
    
    inline def setForecastTypesVarargs(value: ForecastType*): Self = StObject.set(x, "ForecastTypes", js.Array(value*))
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setMonitorInfo(value: MonitorInfo): Self = StObject.set(x, "MonitorInfo", value.asInstanceOf[js.Any])
    
    inline def setMonitorInfoUndefined: Self = StObject.set(x, "MonitorInfo", js.undefined)
    
    inline def setOptimizationMetric(value: OptimizationMetric): Self = StObject.set(x, "OptimizationMetric", value.asInstanceOf[js.Any])
    
    inline def setOptimizationMetricUndefined: Self = StObject.set(x, "OptimizationMetric", js.undefined)
    
    inline def setPredictorArn(value: Arn): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
    
    inline def setPredictorArnUndefined: Self = StObject.set(x, "PredictorArn", js.undefined)
    
    inline def setPredictorName(value: Name): Self = StObject.set(x, "PredictorName", value.asInstanceOf[js.Any])
    
    inline def setPredictorNameUndefined: Self = StObject.set(x, "PredictorName", js.undefined)
    
    inline def setReferencePredictorSummary(value: ReferencePredictorSummary): Self = StObject.set(x, "ReferencePredictorSummary", value.asInstanceOf[js.Any])
    
    inline def setReferencePredictorSummaryUndefined: Self = StObject.set(x, "ReferencePredictorSummary", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTimeAlignmentBoundary(value: TimeAlignmentBoundary): Self = StObject.set(x, "TimeAlignmentBoundary", value.asInstanceOf[js.Any])
    
    inline def setTimeAlignmentBoundaryUndefined: Self = StObject.set(x, "TimeAlignmentBoundary", js.undefined)
  }
}
