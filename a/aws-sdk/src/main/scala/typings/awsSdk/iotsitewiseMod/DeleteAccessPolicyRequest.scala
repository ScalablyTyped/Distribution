package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAccessPolicyRequest extends js.Object {
  /**
    * The ID of the access policy to be deleted.
    */
  var accessPolicyId: ID = js.native
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
}

object DeleteAccessPolicyRequest {
  @scala.inline
  def apply(accessPolicyId: ID, clientToken: ClientToken = null): DeleteAccessPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicyId = accessPolicyId.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessPolicyRequest]
  }
}

