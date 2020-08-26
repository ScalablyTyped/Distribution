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
  def apply(): ResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInfo]
  }
  @scala.inline
  implicit class ResourceInfoOps[Self <: ResourceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLastModified(value: LastModifiedTimestamp): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setResourceArn(value: ResourceArnString): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    @scala.inline
    def setRoleArn(value: IAMRoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
  }
  
}

