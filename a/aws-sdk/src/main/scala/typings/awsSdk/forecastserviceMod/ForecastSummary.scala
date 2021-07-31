package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForecastSummary extends StObject {
  
  /**
    * When the forecast creation task was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group that provided the data used to train the predictor.
    */
  var DatasetGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the forecast.
    */
  var ForecastArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the forecast.
    */
  var ForecastName: js.UndefOr[Name] = js.undefined
  
  /**
    * Initially, the same as CreationTime (status is CREATE_PENDING). Updated when inference (creating the forecast) starts (status changed to CREATE_IN_PROGRESS), and when inference is complete (status changed to ACTIVE) or fails (status changed to CREATE_FAILED).
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The ARN of the predictor used to generate the forecast.
    */
  var PredictorArn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the forecast. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     The Status of the forecast must be ACTIVE before you can query or export the forecast. 
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.undefined
}
object ForecastSummary {
  
  @scala.inline
  def apply(): ForecastSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForecastSummary]
  }
  
  @scala.inline
  implicit class ForecastSummaryMutableBuilder[Self <: ForecastSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDatasetGroupArn(value: String): Self = StObject.set(x, "DatasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetGroupArnUndefined: Self = StObject.set(x, "DatasetGroupArn", js.undefined)
    
    @scala.inline
    def setForecastArn(value: Arn): Self = StObject.set(x, "ForecastArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastArnUndefined: Self = StObject.set(x, "ForecastArn", js.undefined)
    
    @scala.inline
    def setForecastName(value: Name): Self = StObject.set(x, "ForecastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastNameUndefined: Self = StObject.set(x, "ForecastName", js.undefined)
    
    @scala.inline
    def setLastModificationTime(value: Timestamp): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    @scala.inline
    def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setPredictorArn(value: String): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictorArnUndefined: Self = StObject.set(x, "PredictorArn", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
