package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModelVersionResult extends StObject {
  
  /**
    * The model version ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.undefined
  
  /**
    * The event details.
    */
  var externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.undefined
  
  /**
    * The model ID.
    */
  var modelId: js.UndefOr[modelIdentifier] = js.undefined
  
  /**
    * The model type.
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.undefined
  
  /**
    * The model version number.
    */
  var modelVersionNumber: js.UndefOr[floatVersionString] = js.undefined
  
  /**
    * The model version status. Possible values are:    TRAINING_IN_PROGRESS     TRAINING_COMPLETE     ACTIVATE_REQUESTED     ACTIVATE_IN_PROGRESS     ACTIVE     INACTIVATE_REQUESTED     INACTIVATE_IN_PROGRESS     INACTIVE     ERROR   
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The training data schema.
    */
  var trainingDataSchema: js.UndefOr[TrainingDataSchema] = js.undefined
  
  /**
    * The training data source.
    */
  var trainingDataSource: js.UndefOr[TrainingDataSourceEnum] = js.undefined
}
object GetModelVersionResult {
  
  @scala.inline
  def apply(): GetModelVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetModelVersionResult]
  }
  
  @scala.inline
  implicit class GetModelVersionResultMutableBuilder[Self <: GetModelVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setExternalEventsDetail(value: ExternalEventsDetail): Self = StObject.set(x, "externalEventsDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalEventsDetailUndefined: Self = StObject.set(x, "externalEventsDetail", js.undefined)
    
    @scala.inline
    def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
    
    @scala.inline
    def setModelVersionNumber(value: floatVersionString): Self = StObject.set(x, "modelVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionNumberUndefined: Self = StObject.set(x, "modelVersionNumber", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTrainingDataSchema(value: TrainingDataSchema): Self = StObject.set(x, "trainingDataSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingDataSchemaUndefined: Self = StObject.set(x, "trainingDataSchema", js.undefined)
    
    @scala.inline
    def setTrainingDataSource(value: TrainingDataSourceEnum): Self = StObject.set(x, "trainingDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingDataSourceUndefined: Self = StObject.set(x, "trainingDataSource", js.undefined)
  }
}
