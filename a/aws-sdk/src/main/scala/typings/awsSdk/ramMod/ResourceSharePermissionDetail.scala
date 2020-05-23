package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceSharePermissionDetail extends js.Object {
  /**
    * The ARN of the permission.
    */
  var arn: js.UndefOr[String] = js.native
  /**
    * The date and time when the permission was created.
    */
  var creationTime: js.UndefOr[DateTime] = js.native
  /**
    * The identifier for the version of the permission that is set as the default version.
    */
  var defaultVersion: js.UndefOr[Boolean] = js.native
  /**
    * The date and time when the permission was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The name of the permission.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The permission's effect and actions in JSON format. The effect indicates whether the actions are allowed or denied. The actions list the API actions to which the principal is granted or denied access.
    */
  var permission: js.UndefOr[String] = js.native
  /**
    * The resource type to which the permission applies.
    */
  var resourceType: js.UndefOr[String] = js.native
  /**
    * The identifier for the version of the permission.
    */
  var version: js.UndefOr[String] = js.native
}

object ResourceSharePermissionDetail {
  @scala.inline
  def apply(
    arn: String = null,
    creationTime: DateTime = null,
    defaultVersion: js.UndefOr[Boolean] = js.undefined,
    lastUpdatedTime: DateTime = null,
    name: String = null,
    permission: String = null,
    resourceType: String = null,
    version: String = null
  ): ResourceSharePermissionDetail = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVersion)) __obj.updateDynamic("defaultVersion")(defaultVersion.get.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceSharePermissionDetail]
  }
}

