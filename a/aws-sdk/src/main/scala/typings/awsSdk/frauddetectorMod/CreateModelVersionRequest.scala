package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateModelVersionRequest extends js.Object {
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
  implicit class CreateModelVersionRequestOps[Self <: CreateModelVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setModelId(value: modelIdentifier): Self = this.set("modelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = this.set("modelType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrainingDataSchema(value: TrainingDataSchema): Self = this.set("trainingDataSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrainingDataSource(value: TrainingDataSourceEnum): Self = this.set("trainingDataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalEventsDetail(value: ExternalEventsDetail): Self = this.set("externalEventsDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalEventsDetail: Self = this.set("externalEventsDetail", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: tagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

