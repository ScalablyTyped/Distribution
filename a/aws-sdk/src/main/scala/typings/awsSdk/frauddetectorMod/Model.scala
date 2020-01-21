package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /**
    * Timestamp of when the model was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The model description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The model label schema.
    */
  var labelSchema: js.UndefOr[LabelSchema] = js.native
  /**
    * Timestamp of last time the model was updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The model ID.
    */
  var modelId: js.UndefOr[identifier] = js.native
  /**
    * The model type.
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.native
  /**
    * The model input variables.
    */
  var modelVariables: js.UndefOr[ModelVariablesList] = js.native
  /**
    * The model training data source in Amazon S3.
    */
  var trainingDataSource: js.UndefOr[TrainingDataSource] = js.native
}

object Model {
  @scala.inline
  def apply(
    createdTime: time = null,
    description: description = null,
    labelSchema: LabelSchema = null,
    lastUpdatedTime: time = null,
    modelId: identifier = null,
    modelType: ModelTypeEnum = null,
    modelVariables: ModelVariablesList = null,
    trainingDataSource: TrainingDataSource = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (labelSchema != null) __obj.updateDynamic("labelSchema")(labelSchema.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (modelId != null) __obj.updateDynamic("modelId")(modelId.asInstanceOf[js.Any])
    if (modelType != null) __obj.updateDynamic("modelType")(modelType.asInstanceOf[js.Any])
    if (modelVariables != null) __obj.updateDynamic("modelVariables")(modelVariables.asInstanceOf[js.Any])
    if (trainingDataSource != null) __obj.updateDynamic("trainingDataSource")(trainingDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

