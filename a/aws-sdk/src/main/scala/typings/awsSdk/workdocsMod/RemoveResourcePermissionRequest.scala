package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveResourcePermissionRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The principal ID of the resource.
    */
  var PrincipalId: IdType = js.native
  /**
    * The principal type of the resource.
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.workdocsMod.PrincipalType] = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
}

object RemoveResourcePermissionRequest {
  @scala.inline
  def apply(PrincipalId: IdType, ResourceId: ResourceIdType): RemoveResourcePermissionRequest = {
    val __obj = js.Dynamic.literal(PrincipalId = PrincipalId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveResourcePermissionRequest]
  }
  @scala.inline
  implicit class RemoveResourcePermissionRequestOps[Self <: RemoveResourcePermissionRequest] (val x: Self) extends AnyVal {
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
    def setPrincipalId(value: IdType): Self = this.set("PrincipalId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: ResourceIdType): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    @scala.inline
    def setPrincipalType(value: PrincipalType): Self = this.set("PrincipalType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipalType: Self = this.set("PrincipalType", js.undefined)
  }
  
}

