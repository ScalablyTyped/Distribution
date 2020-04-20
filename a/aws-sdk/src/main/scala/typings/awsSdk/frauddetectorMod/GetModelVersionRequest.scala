package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetModelVersionRequest extends js.Object {
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
}

object GetModelVersionRequest {
  @scala.inline
  def apply(modelId: identifier, modelType: ModelTypeEnum, modelVersionNumber: nonEmptyString): GetModelVersionRequest = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], modelVersionNumber = modelVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelVersionRequest]
  }
}

