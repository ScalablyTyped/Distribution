package typings.azureArmResource.policyModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  /**
    * The principal ID of the resource identity.
    */
  val principalId: js.UndefOr[String] = js.undefined
  /**
    * The tenant ID of the resource identity.
    */
  val tenantId: js.UndefOr[String] = js.undefined
  /**
    * The identity type. Possible values include: 'SystemAssigned', 'None'
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Identity {
  @scala.inline
  def apply(principalId: String = null, tenantId: String = null, `type`: String = null): Identity = {
    val __obj = js.Dynamic.literal()
    if (principalId != null) __obj.updateDynamic("principalId")(principalId.asInstanceOf[js.Any])
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
}

