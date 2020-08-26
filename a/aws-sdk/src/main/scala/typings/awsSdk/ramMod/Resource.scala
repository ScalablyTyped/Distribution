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
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreationTime(value: DateTime): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: DateTime): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
    @scala.inline
    def setResourceGroupArn(value: String): Self = this.set("resourceGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceGroupArn: Self = this.set("resourceGroupArn", js.undefined)
    @scala.inline
    def setResourceShareArn(value: String): Self = this.set("resourceShareArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceShareArn: Self = this.set("resourceShareArn", js.undefined)
    @scala.inline
    def setStatus(value: ResourceStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

