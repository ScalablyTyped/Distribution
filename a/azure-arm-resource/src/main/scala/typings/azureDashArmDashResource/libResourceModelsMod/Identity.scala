package typings.azureDashArmDashResource.libResourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  /**
    * The principal ID of resource identity.
    */
  val principalId: js.UndefOr[String] = js.undefined
  /**
    * The tenant ID of resource.
    */
  val tenantId: js.UndefOr[String] = js.undefined
  /**
    * The identity type. Possible values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
    * UserAssigned', 'None'
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The list of user identities associated with the resource. The user identity dictionary key
    * references will be ARM resource ids in the form:
    * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
    */
  var userAssignedIdentities: js.UndefOr[StringDictionary[IdentityUserAssignedIdentitiesValue]] = js.undefined
}

object Identity {
  @scala.inline
  def apply(
    principalId: String = null,
    tenantId: String = null,
    `type`: String = null,
    userAssignedIdentities: StringDictionary[IdentityUserAssignedIdentitiesValue] = null
  ): Identity = {
    val __obj = js.Dynamic.literal()
    if (principalId != null) __obj.updateDynamic("principalId")(principalId)
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (userAssignedIdentities != null) __obj.updateDynamic("userAssignedIdentities")(userAssignedIdentities)
    __obj.asInstanceOf[Identity]
  }
}

