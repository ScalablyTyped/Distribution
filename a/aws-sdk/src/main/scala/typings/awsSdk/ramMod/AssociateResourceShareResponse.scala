package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateResourceShareResponse extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * Information about the associations.
    */
  var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.native
}

object AssociateResourceShareResponse {
  @scala.inline
  def apply(clientToken: String = null, resourceShareAssociations: ResourceShareAssociationList = null): AssociateResourceShareResponse = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (resourceShareAssociations != null) __obj.updateDynamic("resourceShareAssociations")(resourceShareAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResourceShareResponse]
  }
}

