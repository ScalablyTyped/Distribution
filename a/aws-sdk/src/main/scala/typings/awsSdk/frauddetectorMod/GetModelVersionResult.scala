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
    * The details of the external events data used for training the model version. This will be populated if the trainingDataSource is EXTERNAL_EVENTS 
    */
  var externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.undefined
  
  /**
    * The details of the ingested events data used for training the model version. This will be populated if the trainingDataSource is INGESTED_EVENTS.
    */
  var ingestedEventsDetail: js.UndefOr[IngestedEventsDetail] = js.undefined
  
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
  
  inline def apply(): GetModelVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetModelVersionResult]
  }
  
  extension [Self <: GetModelVersionResult](x: Self) {
    
    inline def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setExternalEventsDetail(value: ExternalEventsDetail): Self = StObject.set(x, "externalEventsDetail", value.asInstanceOf[js.Any])
    
    inline def setExternalEventsDetailUndefined: Self = StObject.set(x, "externalEventsDetail", js.undefined)
    
    inline def setIngestedEventsDetail(value: IngestedEventsDetail): Self = StObject.set(x, "ingestedEventsDetail", value.asInstanceOf[js.Any])
    
    inline def setIngestedEventsDetailUndefined: Self = StObject.set(x, "ingestedEventsDetail", js.undefined)
    
    inline def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    inline def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    inline def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
    
    inline def setModelVersionNumber(value: floatVersionString): Self = StObject.set(x, "modelVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setModelVersionNumberUndefined: Self = StObject.set(x, "modelVersionNumber", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTrainingDataSchema(value: TrainingDataSchema): Self = StObject.set(x, "trainingDataSchema", value.asInstanceOf[js.Any])
    
    inline def setTrainingDataSchemaUndefined: Self = StObject.set(x, "trainingDataSchema", js.undefined)
    
    inline def setTrainingDataSource(value: TrainingDataSourceEnum): Self = StObject.set(x, "trainingDataSource", value.asInstanceOf[js.Any])
    
    inline def setTrainingDataSourceUndefined: Self = StObject.set(x, "trainingDataSource", js.undefined)
  }
}
