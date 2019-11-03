package typings.azureDashArmDashResource.libManagementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementGroup extends js.Object {
  var details: js.UndefOr[ManagementGroupDetailsProperties] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val name: js.UndefOr[String] = js.undefined
  var tenantId: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
}

object ManagementGroup {
  @scala.inline
  def apply(
    details: ManagementGroupDetailsProperties = null,
    displayName: String = null,
    id: String = null,
    name: String = null,
    tenantId: String = null,
    `type`: String = null
  ): ManagementGroup = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ManagementGroup]
  }
}

