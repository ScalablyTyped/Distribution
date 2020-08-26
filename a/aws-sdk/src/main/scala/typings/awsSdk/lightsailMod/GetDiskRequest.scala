package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiskRequest extends js.Object {
  /**
    * The name of the disk (e.g., my-disk).
    */
  var diskName: ResourceName = js.native
}

object GetDiskRequest {
  @scala.inline
  def apply(diskName: ResourceName): GetDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiskRequest]
  }
  @scala.inline
  implicit class GetDiskRequestOps[Self <: GetDiskRequest] (val x: Self) extends AnyVal {
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
  }
  
}

