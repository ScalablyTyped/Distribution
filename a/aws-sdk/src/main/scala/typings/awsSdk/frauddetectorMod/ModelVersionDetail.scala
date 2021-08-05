package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelVersionDetail extends StObject {
  
  /**
    * The model version ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.undefined
  
  /**
    * The timestamp when the model was created.
    */
  var createdTime: js.UndefOr[time] = js.undefined
  
  /**
    * The event details.
    */
  var externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.undefined
  
  /**
    * The timestamp when the model was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.undefined
  
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
    * The status of the model version.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The training data schema.
    */
  var trainingDataSchema: js.UndefOr[TrainingDataSchema] = js.undefined
  
  /**
    * The model version training data source.
    */
  var trainingDataSource: js.UndefOr[TrainingDataSourceEnum] = js.undefined
  
  /**
    * The training results.
    */
  var trainingResult: js.UndefOr[TrainingResult] = js.undefined
}
object ModelVersionDetail {
  
  inline def apply(): ModelVersionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelVersionDetail]
  }
  
  extension [Self <: ModelVersionDetail](x: Self) {
    
    inline def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setExternalEventsDetail(value: ExternalEventsDetail): Self = StObject.set(x, "externalEventsDetail", value.asInstanceOf[js.Any])
    
    inline def setExternalEventsDetailUndefined: Self = StObject.set(x, "externalEventsDetail", js.undefined)
    
    inline def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
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
    
    inline def setTrainingResult(value: TrainingResult): Self = StObject.set(x, "trainingResult", value.asInstanceOf[js.Any])
    
    inline def setTrainingResultUndefined: Self = StObject.set(x, "trainingResult", js.undefined)
  }
}
