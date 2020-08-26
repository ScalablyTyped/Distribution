package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDiskRequest extends js.Object {
  /**
    * The unique name of the disk you want to delete (e.g., my-disk).
    */
  var diskName: ResourceName = js.native
  /**
    * A Boolean value to indicate whether to delete the enabled add-ons for the disk.
    */
  var forceDeleteAddOns: js.UndefOr[Boolean] = js.native
}

object DeleteDiskRequest {
  @scala.inline
  def apply(diskName: ResourceName): DeleteDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDiskRequest]
  }
  @scala.inline
  implicit class DeleteDiskRequestOps[Self <: DeleteDiskRequest] (val x: Self) extends AnyVal {
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
    def setDiskName(value: ResourceName): Self = this.set("diskName", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceDeleteAddOns(value: Boolean): Self = this.set("forceDeleteAddOns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceDeleteAddOns: Self = this.set("forceDeleteAddOns", js.undefined)
  }
  
}

