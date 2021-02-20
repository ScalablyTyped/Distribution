package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateModelVersionRequest extends StObject {
  
  /**
    * Details for the external events data used for model version training. Required if trainingDataSource is EXTERNAL_EVENTS.
    */
  var externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.native
  
  /**
    * The model ID. 
    */
  var modelId: modelIdentifier = js.native
  
  /**
    * The model type.
    */
  var modelType: ModelTypeEnum = js.native
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.native
  
  /**
    * The training data schema.
    */
  var trainingDataSchema: TrainingDataSchema = js.native
  
  /**
    * The training data source location in Amazon S3. 
    */
  var trainingDataSource: TrainingDataSourceEnum = js.native
}
object CreateModelVersionRequest {
  
  @scala.inline
  def apply(
    modelId: modelIdentifier,
    modelType: ModelTypeEnum,
    trainingDataSchema: TrainingDataSchema,
    trainingDataSource: TrainingDataSourceEnum
  ): CreateModelVersionRequest = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], trainingDataSchema = trainingDataSchema.asInstanceOf[js.Any], trainingDataSource = trainingDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelVersionRequest]
  }
  
  @scala.inline
  implicit class CreateModelVersionRequestMutableBuilder[Self <: CreateModelVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalEventsDetail(value: ExternalEventsDetail): Self = StObject.set(x, "externalEventsDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalEventsDetailUndefined: Self = StObject.set(x, "externalEventsDetail", js.undefined)
    
    @scala.inline
    def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTrainingDataSchema(value: TrainingDataSchema): Self = StObject.set(x, "trainingDataSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingDataSource(value: TrainingDataSourceEnum): Self = StObject.set(x, "trainingDataSource", value.asInstanceOf[js.Any])
  }
}
