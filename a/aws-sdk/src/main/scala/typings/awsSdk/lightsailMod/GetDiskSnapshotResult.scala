package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDiskSnapshotResult extends js.Object {
  
  /**
    * An object containing information about the disk snapshot.
    */
  var diskSnapshot: js.UndefOr[DiskSnapshot] = js.native
}
object GetDiskSnapshotResult {
  
  @scala.inline
  def apply(): GetDiskSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiskSnapshotResult]
  }
  
  @scala.inline
  implicit class GetDiskSnapshotResultOps[Self <: GetDiskSnapshotResult] (val x: Self) extends AnyVal {
    
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
    def setDiskSnapshot(value: DiskSnapshot): Self = this.set("diskSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSnapshot: Self = this.set("diskSnapshot", js.undefined)
  }
}
