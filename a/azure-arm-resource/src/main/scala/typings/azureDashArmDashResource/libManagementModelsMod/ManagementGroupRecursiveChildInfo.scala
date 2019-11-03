package typings.azureDashArmDashResource.libManagementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementGroupRecursiveChildInfo extends js.Object {
  var childId: js.UndefOr[String] = js.undefined
  var childType: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[js.Array[ManagementGroupRecursiveChildInfo]] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var tenantId: js.UndefOr[String] = js.undefined
}

object ManagementGroupRecursiveChildInfo {
  @scala.inline
  def apply(
    childId: String = null,
    childType: String = null,
    children: js.Array[ManagementGroupRecursiveChildInfo] = null,
    displayName: String = null,
    tenantId: String = null
  ): ManagementGroupRecursiveChildInfo = {
    val __obj = js.Dynamic.literal()
    if (childId != null) __obj.updateDynamic("childId")(childId)
    if (childType != null) __obj.updateDynamic("childType")(childType)
    if (children != null) __obj.updateDynamic("children")(children)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId)
    __obj.asInstanceOf[ManagementGroupRecursiveChildInfo]
  }
}

