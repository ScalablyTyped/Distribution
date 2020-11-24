package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableFastSnapshotRestoreErrorItem extends js.Object {
  
  /**
    * The errors.
    */
  var FastSnapshotRestoreStateErrors: js.UndefOr[EnableFastSnapshotRestoreStateErrorSet] = js.native
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
}
object EnableFastSnapshotRestoreErrorItem {
  
  @scala.inline
  def apply(): EnableFastSnapshotRestoreErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableFastSnapshotRestoreErrorItem]
  }
  
  @scala.inline
  implicit class EnableFastSnapshotRestoreErrorItemOps[Self <: EnableFastSnapshotRestoreErrorItem] (val x: Self) extends AnyVal {
    
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
    def setFastSnapshotRestoreStateErrorsVarargs(value: EnableFastSnapshotRestoreStateErrorItem*): Self = this.set("FastSnapshotRestoreStateErrors", js.Array(value :_*))
    
    @scala.inline
    def setFastSnapshotRestoreStateErrors(value: EnableFastSnapshotRestoreStateErrorSet): Self = this.set("FastSnapshotRestoreStateErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastSnapshotRestoreStateErrors: Self = this.set("FastSnapshotRestoreStateErrors", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: String): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
  }
}
