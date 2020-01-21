package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateModelVersionResult extends js.Object {
  /**
    * The model ID. 
    */
  var modelId: js.UndefOr[identifier] = js.native
  /**
    * The model type.
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.native
  /**
    * The version of the model. 
    */
  var modelVersionNumber: js.UndefOr[nonEmptyString] = js.native
  /**
    * The model version status. 
    */
  var status: js.UndefOr[String] = js.native
}

object CreateModelVersionResult {
  @scala.inline
  def apply(
    modelId: identifier = null,
    modelType: ModelTypeEnum = null,
    modelVersionNumber: nonEmptyString = null,
    status: String = null
  ): CreateModelVersionResult = {
    val __obj = js.Dynamic.literal()
    if (modelId != null) __obj.updateDynamic("modelId")(modelId.asInstanceOf[js.Any])
    if (modelType != null) __obj.updateDynamic("modelType")(modelType.asInstanceOf[js.Any])
    if (modelVersionNumber != null) __obj.updateDynamic("modelVersionNumber")(modelVersionNumber.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelVersionResult]
  }
}

