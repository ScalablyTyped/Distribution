package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOperationRequest extends js.Object {
  /**
    * The ID of the operation that you want to get more information about.
    */
  var OperationId: ResourceId = js.native
}

object GetOperationRequest {
  @scala.inline
  def apply(OperationId: ResourceId): GetOperationRequest = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationRequest]
  }
}

