package typings.azureDashArmDashResource.libManagementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementGroupChildInfo extends js.Object {
  var childId: js.UndefOr[String] = js.undefined
  var childType: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var tenantId: js.UndefOr[String] = js.undefined
}

object ManagementGroupChildInfo {
  @scala.inline
  def apply(
    childId: String = null,
    childType: String = null,
    displayName: String = null,
    tenantId: String = null
  ): ManagementGroupChildInfo = {
    val __obj = js.Dynamic.literal()
    if (childId != null) __obj.updateDynamic("childId")(childId.asInstanceOf[js.Any])
    if (childType != null) __obj.updateDynamic("childType")(childType.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementGroupChildInfo]
  }
}

