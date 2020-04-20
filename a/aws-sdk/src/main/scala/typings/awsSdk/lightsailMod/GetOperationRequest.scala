package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOperationRequest extends js.Object {
  /**
    * A GUID used to identify the operation.
    */
  var operationId: NonEmptyString = js.native
}

object GetOperationRequest {
  @scala.inline
  def apply(operationId: NonEmptyString): GetOperationRequest = {
    val __obj = js.Dynamic.literal(operationId = operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationRequest]
  }
}

