package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceInventory extends js.Object {
  /**
    * Platform of the resource.
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * Platform version of the resource in the inventory.
    */
  var PlatformVersion: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.native
  /**
    * ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
  /**
    * ID of the account that owns the resource.
    */
  var ResourceOwningAccountId: js.UndefOr[String] = js.native
  /**
    * Type of resource.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.native
}

object ResourceInventory {
  @scala.inline
  def apply(): ResourceInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInventory]
  }
  @scala.inline
  implicit class ResourceInventoryOps[Self <: ResourceInventory] (val x: Self) extends AnyVal {
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
    def setPlatform(value: String): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    @scala.inline
    def setPlatformVersion(value: String): Self = this.set("PlatformVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformVersion: Self = this.set("PlatformVersion", js.undefined)
    @scala.inline
    def setResourceArn(value: String): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    @scala.inline
    def setResourceId(value: String): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    @scala.inline
    def setResourceOwningAccountId(value: String): Self = this.set("ResourceOwningAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceOwningAccountId: Self = this.set("ResourceOwningAccountId", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
  
}

