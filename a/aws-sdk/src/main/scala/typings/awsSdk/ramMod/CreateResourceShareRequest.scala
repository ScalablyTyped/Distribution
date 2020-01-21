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
  def apply(
    name: String,
    allowExternalPrincipals: js.UndefOr[scala.Boolean] = js.undefined,
    clientToken: String = null,
    permissionArns: PermissionArnList = null,
    principals: PrincipalArnOrIdList = null,
    resourceArns: ResourceArnList = null,
    tags: TagList = null
  ): CreateResourceShareRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExternalPrincipals)) __obj.updateDynamic("allowExternalPrincipals")(allowExternalPrincipals.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (permissionArns != null) __obj.updateDynamic("permissionArns")(permissionArns.asInstanceOf[js.Any])
    if (principals != null) __obj.updateDynamic("principals")(principals.asInstanceOf[js.Any])
    if (resourceArns != null) __obj.updateDynamic("resourceArns")(resourceArns.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceShareRequest]
  }
}

