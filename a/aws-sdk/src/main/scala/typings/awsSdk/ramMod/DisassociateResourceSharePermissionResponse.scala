package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateResourceSharePermissionResponse extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * Indicates whether the request succeeded.
    */
  var returnValue: js.UndefOr[Boolean] = js.native
}

object DisassociateResourceSharePermissionResponse {
  @scala.inline
  def apply(clientToken: String = null, returnValue: js.UndefOr[Boolean] = js.undefined): DisassociateResourceSharePermissionResponse = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (!js.isUndefined(returnValue)) __obj.updateDynamic("returnValue")(returnValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateResourceSharePermissionResponse]
  }
}

