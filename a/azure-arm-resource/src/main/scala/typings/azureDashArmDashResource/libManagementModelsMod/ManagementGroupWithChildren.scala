package typings.azureDashArmDashResource.libManagementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementGroupWithChildren extends js.Object {
  var children: js.UndefOr[js.Array[ManagementGroupChildInfo]] = js.undefined
  var details: js.UndefOr[ManagementGroupDetailsProperties] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val name: js.UndefOr[String] = js.undefined
  var tenantId: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
}

object ManagementGroupWithChildren {
  @scala.inline
  def apply(
    children: js.Array[ManagementGroupChildInfo] = null,
    details: ManagementGroupDetailsProperties = null,
    displayName: String = null,
    id: String = null,
    name: String = null,
    tenantId: String = null,
    `type`: String = null
  ): ManagementGroupWithChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementGroupWithChildren]
  }
}

