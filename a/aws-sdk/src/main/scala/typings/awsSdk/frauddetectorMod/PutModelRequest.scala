package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutModelRequest extends js.Object {
  /**
    * The model description. 
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The label schema.
    */
  var labelSchema: LabelSchema = js.native
  /**
    * The model ID.
    */
  var modelId: identifier = js.native
  /**
    * The model type. 
    */
  var modelType: ModelTypeEnum = js.native
  /**
    * The model input variables.
    */
  var modelVariables: ModelVariablesList = js.native
  /**
    * The training data source location in Amazon S3. 
    */
  var trainingDataSource: TrainingDataSource = js.native
}

object PutModelRequest {
  @scala.inline
  def apply(
    labelSchema: LabelSchema,
    modelId: identifier,
    modelType: ModelTypeEnum,
    modelVariables: ModelVariablesList,
    trainingDataSource: TrainingDataSource,
    description: description = null
  ): PutModelRequest = {
    val __obj = js.Dynamic.literal(labelSchema = labelSchema.asInstanceOf[js.Any], modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], modelVariables = modelVariables.asInstanceOf[js.Any], trainingDataSource = trainingDataSource.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutModelRequest]
  }
}

