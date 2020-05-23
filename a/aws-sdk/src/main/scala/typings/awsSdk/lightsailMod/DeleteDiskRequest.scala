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
  def apply(diskName: ResourceName, forceDeleteAddOns: js.UndefOr[Boolean] = js.undefined): DeleteDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any])
    if (!js.isUndefined(forceDeleteAddOns)) __obj.updateDynamic("forceDeleteAddOns")(forceDeleteAddOns.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDiskRequest]
  }
}

