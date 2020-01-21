package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var arn: js.UndefOr[String] = js.native
  /**
    * The time when the resource was associated with the resource share.
    */
  var creationTime: js.UndefOr[DateTime] = js.native
  /**
    * The time when the association was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The ARN of the resource group. This value is returned only if the resource is a resource group.
    */
  var resourceGroupArn: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.native
  /**
    * The status of the resource.
    */
  var status: js.UndefOr[ResourceStatus] = js.native
  /**
    * A message about the status of the resource.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * The resource type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Resource {
  @scala.inline
  def apply(
    arn: String = null,
    creationTime: DateTime = null,
    lastUpdatedTime: DateTime = null,
    resourceGroupArn: String = null,
    resourceShareArn: String = null,
    status: ResourceStatus = null,
    statusMessage: String = null,
    `type`: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (resourceGroupArn != null) __obj.updateDynamic("resourceGroupArn")(resourceGroupArn.asInstanceOf[js.Any])
    if (resourceShareArn != null) __obj.updateDynamic("resourceShareArn")(resourceShareArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

