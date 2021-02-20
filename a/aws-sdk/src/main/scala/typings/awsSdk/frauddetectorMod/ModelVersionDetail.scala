package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelVersionDetail extends StObject {
  
  /**
    * The model version ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  
  /**
    * The timestamp when the model was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  
  /**
    * The event details.
    */
  var externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.native
  
  /**
    * The timestamp when the model was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  
  /**
    * The model ID.
    */
  var modelId: js.UndefOr[modelIdentifier] = js.native
  
  /**
    * The model type.
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.native
  
  /**
    * The model version number.
    */
  var modelVersionNumber: js.UndefOr[floatVersionString] = js.native
  
  /**
    * The status of the model version.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The training data schema.
    */
  var trainingDataSchema: js.UndefOr[TrainingDataSchema] = js.native
  
  /**
    * The model version training data source.
    */
  var trainingDataSource: js.UndefOr[TrainingDataSourceEnum] = js.native
  
  /**
    * The training results.
    */
  var trainingResult: js.UndefOr[TrainingResult] = js.native
}
object ModelVersionDetail {
  
  @scala.inline
  def apply(): ModelVersionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelVersionDetail]
  }
  
  @scala.inline
  implicit class ModelVersionDetailMutableBuilder[Self <: ModelVersionDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    @scala.inline
    def setExternalEventsDetail(value: ExternalEventsDetail): Self = StObject.set(x, "externalEventsDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalEventsDetailUndefined: Self = StObject.set(x, "externalEventsDetail", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
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
    
    @scala.inline
    def setTrainingResult(value: TrainingResult): Self = StObject.set(x, "trainingResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingResultUndefined: Self = StObject.set(x, "trainingResult", js.undefined)
  }
}
