package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteInstanceSnapshotRequest extends js.Object {
  
  /**
    * The name of the snapshot to delete.
    */
  var instanceSnapshotName: ResourceName = js.native
}
object DeleteInstanceSnapshotRequest {
  
  @scala.inline
  def apply(instanceSnapshotName: ResourceName): DeleteInstanceSnapshotRequest = {
    val __obj = js.Dynamic.literal(instanceSnapshotName = instanceSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceSnapshotRequest]
  }
  
  @scala.inline
  implicit class DeleteInstanceSnapshotRequestOps[Self <: DeleteInstanceSnapshotRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceSnapshotName(value: ResourceName): Self = this.set("instanceSnapshotName", value.asInstanceOf[js.Any])
  }
}
