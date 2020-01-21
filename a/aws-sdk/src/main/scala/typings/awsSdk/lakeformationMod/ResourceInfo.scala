package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceInfo extends js.Object {
  /**
    * The date and time the resource was last modified.
    */
  var LastModified: js.UndefOr[LastModifiedTimestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[ResourceArnString] = js.native
  /**
    * The IAM role that registered a resource.
    */
  var RoleArn: js.UndefOr[IAMRoleArn] = js.native
}

object ResourceInfo {
  @scala.inline
  def apply(
    LastModified: LastModifiedTimestamp = null,
    ResourceArn: ResourceArnString = null,
    RoleArn: IAMRoleArn = null
  ): ResourceInfo = {
    val __obj = js.Dynamic.literal()
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceInfo]
  }
}

