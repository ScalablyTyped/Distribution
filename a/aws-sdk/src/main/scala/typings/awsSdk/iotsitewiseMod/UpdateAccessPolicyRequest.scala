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
    accessPolicyResource: Resource
  ): UpdateAccessPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicyId = accessPolicyId.asInstanceOf[js.Any], accessPolicyIdentity = accessPolicyIdentity.asInstanceOf[js.Any], accessPolicyPermission = accessPolicyPermission.asInstanceOf[js.Any], accessPolicyResource = accessPolicyResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccessPolicyRequest]
  }
  @scala.inline
  implicit class UpdateAccessPolicyRequestOps[Self <: UpdateAccessPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessPolicyId(value: ID): Self = this.set("accessPolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessPolicyIdentity(value: Identity): Self = this.set("accessPolicyIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessPolicyPermission(value: Permission): Self = this.set("accessPolicyPermission", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessPolicyResource(value: Resource): Self = this.set("accessPolicyResource", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
  }
  
}

