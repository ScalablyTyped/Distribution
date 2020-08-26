package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceShareRequest extends js.Object {
  /**
    * Indicates whether principals outside your AWS organization can be associated with a resource share.
    */
  var allowExternalPrincipals: js.UndefOr[Boolean] = js.native
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The name of the resource share.
    */
  var name: String = js.native
  /**
    * The ARNs of the permissions to associate with the resource share. If you do not specify an ARN for the permission, AWS RAM automatically attaches the default version of the permission for each resource type.
    */
  var permissionArns: js.UndefOr[PermissionArnList] = js.native
  /**
    * The principals to associate with the resource share. The possible values are IDs of AWS accounts, the ARN of an OU or organization from AWS Organizations.
    */
  var principals: js.UndefOr[PrincipalArnOrIdList] = js.native
  /**
    * The Amazon Resource Names (ARN) of the resources to associate with the resource share.
    */
  var resourceArns: js.UndefOr[ResourceArnList] = js.native
  /**
    * One or more tags.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateResourceShareRequest {
  @scala.inline
  def apply(name: String): CreateResourceShareRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceShareRequest]
  }
  @scala.inline
  implicit class CreateResourceShareRequestOps[Self <: CreateResourceShareRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowExternalPrincipals(value: Boolean): Self = this.set("allowExternalPrincipals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowExternalPrincipals: Self = this.set("allowExternalPrincipals", js.undefined)
    @scala.inline
    def setClientToken(value: String): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    @scala.inline
    def setPermissionArnsVarargs(value: String*): Self = this.set("permissionArns", js.Array(value :_*))
    @scala.inline
    def setPermissionArns(value: PermissionArnList): Self = this.set("permissionArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionArns: Self = this.set("permissionArns", js.undefined)
    @scala.inline
    def setPrincipalsVarargs(value: String*): Self = this.set("principals", js.Array(value :_*))
    @scala.inline
    def setPrincipals(value: PrincipalArnOrIdList): Self = this.set("principals", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipals: Self = this.set("principals", js.undefined)
    @scala.inline
    def setResourceArnsVarargs(value: String*): Self = this.set("resourceArns", js.Array(value :_*))
    @scala.inline
    def setResourceArns(value: ResourceArnList): Self = this.set("resourceArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArns: Self = this.set("resourceArns", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

