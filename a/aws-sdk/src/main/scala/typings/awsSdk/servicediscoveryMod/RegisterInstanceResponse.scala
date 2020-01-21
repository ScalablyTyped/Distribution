package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterInstanceResponse extends js.Object {
  /**
    * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
    */
  var OperationId: js.UndefOr[typings.awsSdk.servicediscoveryMod.OperationId] = js.native
}

object RegisterInstanceResponse {
  @scala.inline
  def apply(OperationId: OperationId = null): RegisterInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterInstanceResponse]
  }
}

