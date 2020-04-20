package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelVersion extends js.Object {
  /**
    * The parent model ID.
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
}

object ModelVersion {
  @scala.inline
  def apply(modelId: identifier, modelType: ModelTypeEnum, modelVersionNumber: nonEmptyString): ModelVersion = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], modelVersionNumber = modelVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelVersion]
  }
}

