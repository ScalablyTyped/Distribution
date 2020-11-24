package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDiskSnapshotRequest extends js.Object {
  
  /**
    * The name of the disk snapshot (e.g., my-disk-snapshot).
    */
  var diskSnapshotName: ResourceName = js.native
}
object GetDiskSnapshotRequest {
  
  @scala.inline
  def apply(diskSnapshotName: ResourceName): GetDiskSnapshotRequest = {
    val __obj = js.Dynamic.literal(diskSnapshotName = diskSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiskSnapshotRequest]
  }
  
  @scala.inline
  implicit class GetDiskSnapshotRequestOps[Self <: GetDiskSnapshotRequest] (val x: Self) extends AnyVal {
    
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
    def setDiskSnapshotName(value: ResourceName): Self = this.set("diskSnapshotName", value.asInstanceOf[js.Any])
  }
}
