package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddLayerVersionPermissionRequest extends js.Object {
  /**
    * The API action that grants access to the layer. For example, lambda:GetLayerVersion.
    */
  var Action: LayerPermissionAllowedAction = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.lambdaMod.LayerName = js.native
  /**
    * With the principal set to *, grant permission to all accounts in the specified organization.
    */
  var OrganizationId: js.UndefOr[typings.awsSdk.lambdaMod.OrganizationId] = js.native
  /**
    * An account ID, or * to grant permission to all AWS accounts.
    */
  var Principal: LayerPermissionAllowedPrincipal = js.native
  /**
    * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * An identifier that distinguishes the policy from others on the same layer version.
    */
  var StatementId: typings.awsSdk.lambdaMod.StatementId = js.native
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber = js.native
}

object AddLayerVersionPermissionRequest {
  @scala.inline
  def apply(
    Action: LayerPermissionAllowedAction,
    LayerName: LayerName,
    Principal: LayerPermissionAllowedPrincipal,
    StatementId: StatementId,
    VersionNumber: LayerVersionNumber
  ): AddLayerVersionPermissionRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddLayerVersionPermissionRequest]
  }
  @scala.inline
  implicit class AddLayerVersionPermissionRequestOps[Self <: AddLayerVersionPermissionRequest] (val x: Self) extends AnyVal {
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
    def setAction(value: LayerPermissionAllowedAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayerName(value: LayerName): Self = this.set("LayerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrincipal(value: LayerPermissionAllowedPrincipal): Self = this.set("Principal", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatementId(value: StatementId): Self = this.set("StatementId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionNumber(value: LayerVersionNumber): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationId: Self = this.set("OrganizationId", js.undefined)
    @scala.inline
    def setRevisionId(value: String): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("RevisionId", js.undefined)
  }
  
}

