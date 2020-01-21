package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelVersionDetail extends js.Object {
  /**
    * The timestamp when the model was created.
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
    * The timestamp when the model was last updated.
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
    * The model variables.
    */
  var modelVariables: js.UndefOr[ModelVariablesList] = js.native
  /**
    * The model version.
    */
  var modelVersionNumber: js.UndefOr[nonEmptyString] = js.native
  /**
    * The model status.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The model training data source.
    */
  var trainingDataSource: js.UndefOr[TrainingDataSource] = js.native
  /**
    * The model training metrics.
    */
  var trainingMetrics: js.UndefOr[MetricsMap] = js.native
  /**
    * The model validation metrics.
    */
  var validationMetrics: js.UndefOr[MetricsMap] = js.native
}

object ModelVersionDetail {
  @scala.inline
  def apply(
    createdTime: time = null,
    description: description = null,
    labelSchema: LabelSchema = null,
    lastUpdatedTime: time = null,
    modelId: identifier = null,
    modelType: ModelTypeEnum = null,
    modelVariables: ModelVariablesList = null,
    modelVersionNumber: nonEmptyString = null,
    status: String = null,
    trainingDataSource: TrainingDataSource = null,
    trainingMetrics: MetricsMap = null,
    validationMetrics: MetricsMap = null
  ): ModelVersionDetail = {
    val __obj = js.Dynamic.literal()
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (labelSchema != null) __obj.updateDynamic("labelSchema")(labelSchema.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (modelId != null) __obj.updateDynamic("modelId")(modelId.asInstanceOf[js.Any])
    if (modelType != null) __obj.updateDynamic("modelType")(modelType.asInstanceOf[js.Any])
    if (modelVariables != null) __obj.updateDynamic("modelVariables")(modelVariables.asInstanceOf[js.Any])
    if (modelVersionNumber != null) __obj.updateDynamic("modelVersionNumber")(modelVersionNumber.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trainingDataSource != null) __obj.updateDynamic("trainingDataSource")(trainingDataSource.asInstanceOf[js.Any])
    if (trainingMetrics != null) __obj.updateDynamic("trainingMetrics")(trainingMetrics.asInstanceOf[js.Any])
    if (validationMetrics != null) __obj.updateDynamic("validationMetrics")(validationMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelVersionDetail]
  }
}

