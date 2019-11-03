package typings.azureDashArmDashResource.libManagementModelsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementGroupDetailsProperties extends js.Object {
  var managementGroupType: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[ParentGroupInfo] = js.undefined
  var updatedBy: js.UndefOr[String] = js.undefined
  var updatedTime: js.UndefOr[Date] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object ManagementGroupDetailsProperties {
  @scala.inline
  def apply(
    managementGroupType: String = null,
    parent: ParentGroupInfo = null,
    updatedBy: String = null,
    updatedTime: Date = null,
    version: Int | Double = null
  ): ManagementGroupDetailsProperties = {
    val __obj = js.Dynamic.literal()
    if (managementGroupType != null) __obj.updateDynamic("managementGroupType")(managementGroupType)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (updatedBy != null) __obj.updateDynamic("updatedBy")(updatedBy)
    if (updatedTime != null) __obj.updateDynamic("updatedTime")(updatedTime)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementGroupDetailsProperties]
  }
}

