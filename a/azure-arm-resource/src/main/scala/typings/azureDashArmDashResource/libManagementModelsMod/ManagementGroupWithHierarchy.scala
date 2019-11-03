package typings.azureDashArmDashResource.libManagementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementGroupWithHierarchy extends js.Object {
  var children: js.UndefOr[js.Array[ManagementGroupRecursiveChildInfo]] = js.undefined
  var details: js.UndefOr[ManagementGroupDetailsProperties] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val name: js.UndefOr[String] = js.undefined
  var tenantId: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
}

object ManagementGroupWithHierarchy {
  @scala.inline
  def apply(
    children: js.Array[ManagementGroupRecursiveChildInfo] = null,
    details: ManagementGroupDetailsProperties = null,
    displayName: String = null,
    id: String = null,
    name: String = null,
    tenantId: String = null,
    `type`: String = null
  ): ManagementGroupWithHierarchy = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (details != null) __obj.updateDynamic("details")(details)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ManagementGroupWithHierarchy]
  }
}

