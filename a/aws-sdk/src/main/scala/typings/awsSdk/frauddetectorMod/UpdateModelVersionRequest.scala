package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateModelVersionRequest extends js.Object {
  /**
    * The model description.
    */
  var description: typings.awsSdk.frauddetectorMod.description = js.native
  /**
    * The model ID.
    */
  var modelId: identifier = js.native
  /**
    * The model type.
    */
  var modelType: ModelTypeEnum = js.native
  /**
    * The model version.
    */
  var modelVersionNumber: nonEmptyString = js.native
  /**
    * The new model status.
    */
  var status: ModelVersionStatus = js.native
}

object UpdateModelVersionRequest {
  @scala.inline
  def apply(
    description: description,
    modelId: identifier,
    modelType: ModelTypeEnum,
    modelVersionNumber: nonEmptyString,
    status: ModelVersionStatus
  ): UpdateModelVersionRequest = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], modelVersionNumber = modelVersionNumber.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelVersionRequest]
  }
}

