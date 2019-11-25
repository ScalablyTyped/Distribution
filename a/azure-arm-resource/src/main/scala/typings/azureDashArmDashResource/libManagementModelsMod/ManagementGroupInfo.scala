package typings.azureDashArmDashResource.libManagementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementGroupInfo extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val name: js.UndefOr[String] = js.undefined
  var tenantId: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
}

object ManagementGroupInfo {
  @scala.inline
  def apply(
    displayName: String = null,
    id: String = null,
    name: String = null,
    tenantId: String = null,
    `type`: String = null
  ): ManagementGroupInfo = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementGroupInfo]
  }
}

