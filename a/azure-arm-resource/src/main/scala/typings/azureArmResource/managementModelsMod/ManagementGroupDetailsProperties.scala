package typings.azureArmResource.managementModelsMod

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
    version: js.UndefOr[Double] = js.undefined
  ): ManagementGroupDetailsProperties = {
    val __obj = js.Dynamic.literal()
    if (managementGroupType != null) __obj.updateDynamic("managementGroupType")(managementGroupType.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (updatedBy != null) __obj.updateDynamic("updatedBy")(updatedBy.asInstanceOf[js.Any])
    if (updatedTime != null) __obj.updateDynamic("updatedTime")(updatedTime.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementGroupDetailsProperties]
  }
}

