package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatedGateway extends js.Object {
  /**
    * The ID of the associated gateway.
    */
  var id: js.UndefOr[GatewayIdentifier] = js.native
  /**
    * The ID of the AWS account that owns the associated virtual private gateway or transit gateway.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The Region where the associated gateway is located.
    */
  var region: js.UndefOr[Region] = js.native
  /**
    * The type of associated gateway.
    */
  var `type`: js.UndefOr[GatewayType] = js.native
}

object AssociatedGateway {
  @scala.inline
  def apply(
    id: GatewayIdentifier = null,
    ownerAccount: OwnerAccount = null,
    region: Region = null,
    `type`: GatewayType = null
  ): AssociatedGateway = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ownerAccount != null) __obj.updateDynamic("ownerAccount")(ownerAccount.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatedGateway]
  }
}

