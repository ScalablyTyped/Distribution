package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachDiskRequest extends js.Object {
  /**
    * The unique name of the disk you want to detach from your instance (e.g., my-disk).
    */
  var diskName: ResourceName = js.native
}

object DetachDiskRequest {
  @scala.inline
  def apply(diskName: ResourceName): DetachDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachDiskRequest]
  }
}

