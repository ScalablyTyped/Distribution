package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableFastSnapshotRestoresResult extends js.Object {
  
  /**
    * Information about the snapshots for which fast snapshot restores were successfully enabled.
    */
  var Successful: js.UndefOr[EnableFastSnapshotRestoreSuccessSet] = js.native
  
  /**
    * Information about the snapshots for which fast snapshot restores could not be enabled.
    */
  var Unsuccessful: js.UndefOr[EnableFastSnapshotRestoreErrorSet] = js.native
}
object EnableFastSnapshotRestoresResult {
  
  @scala.inline
  def apply(): EnableFastSnapshotRestoresResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableFastSnapshotRestoresResult]
  }
  
  @scala.inline
  implicit class EnableFastSnapshotRestoresResultOps[Self <: EnableFastSnapshotRestoresResult] (val x: Self) extends AnyVal {
    
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
    def setSuccessfulVarargs(value: EnableFastSnapshotRestoreSuccessItem*): Self = this.set("Successful", js.Array(value :_*))
    
    @scala.inline
    def setSuccessful(value: EnableFastSnapshotRestoreSuccessSet): Self = this.set("Successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessful: Self = this.set("Successful", js.undefined)
    
    @scala.inline
    def setUnsuccessfulVarargs(value: EnableFastSnapshotRestoreErrorItem*): Self = this.set("Unsuccessful", js.Array(value :_*))
    
    @scala.inline
    def setUnsuccessful(value: EnableFastSnapshotRestoreErrorSet): Self = this.set("Unsuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsuccessful: Self = this.set("Unsuccessful", js.undefined)
  }
}
