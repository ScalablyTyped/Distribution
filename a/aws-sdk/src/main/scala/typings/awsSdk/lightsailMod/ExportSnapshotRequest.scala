package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSnapshotRequest extends js.Object {
  
  /**
    * The name of the instance or disk snapshot to be exported to Amazon EC2.
    */
  var sourceSnapshotName: ResourceName = js.native
}
object ExportSnapshotRequest {
  
  @scala.inline
  def apply(sourceSnapshotName: ResourceName): ExportSnapshotRequest = {
    val __obj = js.Dynamic.literal(sourceSnapshotName = sourceSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSnapshotRequest]
  }
  
  @scala.inline
  implicit class ExportSnapshotRequestOps[Self <: ExportSnapshotRequest] (val x: Self) extends AnyVal {
    
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
    def setSourceSnapshotName(value: ResourceName): Self = this.set("sourceSnapshotName", value.asInstanceOf[js.Any])
  }
}
