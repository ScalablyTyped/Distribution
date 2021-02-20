package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredictorSummary extends StObject {
  
  /**
    * When the model training task was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group that contains the data used to train the predictor.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.native
  
  /**
    * Initially, the same as CreationTime (status is CREATE_PENDING). Updated when training starts (status changed to CREATE_IN_PROGRESS), and when training is complete (status changed to ACTIVE) or fails (status changed to CREATE_FAILED).
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
  
  /**
    * The ARN of the predictor.
    */
  var PredictorArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the predictor.
    */
  var PredictorName: js.UndefOr[Name] = js.native
  
  /**
    * The status of the predictor. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     UPDATE_PENDING, UPDATE_IN_PROGRESS, UPDATE_FAILED     The Status of the predictor must be ACTIVE before you can use the predictor to create a forecast. 
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.native
}
object PredictorSummary {
  
  @scala.inline
  def apply(): PredictorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictorSummary]
  }
  
  @scala.inline
  implicit class PredictorSummaryMutableBuilder[Self <: PredictorSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "DatasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetGroupArnUndefined: Self = StObject.set(x, "DatasetGroupArn", js.undefined)
    
    @scala.inline
    def setLastModificationTime(value: Timestamp): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    @scala.inline
    def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setPredictorArn(value: Arn): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictorArnUndefined: Self = StObject.set(x, "PredictorArn", js.undefined)
    
    @scala.inline
    def setPredictorName(value: Name): Self = StObject.set(x, "PredictorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictorNameUndefined: Self = StObject.set(x, "PredictorName", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
