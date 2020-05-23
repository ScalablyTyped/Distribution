package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAccessPolicyRequest extends js.Object {
  /**
    * The ID of the access policy.
    */
  var accessPolicyId: ID = js.native
  /**
    * The identity for this access policy. Choose either a user or a group but not both.
    */
  var accessPolicyIdentity: Identity = js.native
  /**
    * The permission level for this access policy. Note that a project ADMINISTRATOR is also known as a project owner.
    */
  var accessPolicyPermission: Permission = js.native
  /**
    * The AWS IoT SiteWise Monitor resource for this access policy. Choose either portal or project but not both.
    */
  var accessPolicyResource: Resource = js.native
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
}

object UpdateAccessPolicyRequest {
  @scala.inline
  def apply(
    accessPolicyId: ID,
    accessPolicyIdentity: Identity,
    accessPolicyPermission: Permission,
    accessPolicyResource: Resource,
    clientToken: ClientToken = null
  ): UpdateAccessPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicyId = accessPolicyId.asInstanceOf[js.Any], accessPolicyIdentity = accessPolicyIdentity.asInstanceOf[js.Any], accessPolicyPermission = accessPolicyPermission.asInstanceOf[js.Any], accessPolicyResource = accessPolicyResource.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccessPolicyRequest]
  }
}

