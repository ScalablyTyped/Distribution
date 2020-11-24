package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSnapshotCopyGrantMessage extends js.Object {
  
  /**
    * The name of the snapshot copy grant to delete.
    */
  var SnapshotCopyGrantName: String = js.native
}
object DeleteSnapshotCopyGrantMessage {
  
  @scala.inline
  def apply(SnapshotCopyGrantName: String): DeleteSnapshotCopyGrantMessage = {
    val __obj = js.Dynamic.literal(SnapshotCopyGrantName = SnapshotCopyGrantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotCopyGrantMessage]
  }
  
  @scala.inline
  implicit class DeleteSnapshotCopyGrantMessageOps[Self <: DeleteSnapshotCopyGrantMessage] (val x: Self) extends AnyVal {
    
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
    def setSnapshotCopyGrantName(value: String): Self = this.set("SnapshotCopyGrantName", value.asInstanceOf[js.Any])
  }
}
