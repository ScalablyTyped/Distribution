package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityUserAssignedIdentitiesValue extends js.Object {
  /**
    * The client id of user assigned identity.
    */
  val clientId: js.UndefOr[String] = js.undefined
  /**
    * The principal id of user assigned identity.
    */
  val principalId: js.UndefOr[String] = js.undefined
}

object IdentityUserAssignedIdentitiesValue {
  @scala.inline
  def apply(clientId: String = null, principalId: String = null): IdentityUserAssignedIdentitiesValue = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (principalId != null) __obj.updateDynamic("principalId")(principalId)
    __obj.asInstanceOf[IdentityUserAssignedIdentitiesValue]
  }
}

