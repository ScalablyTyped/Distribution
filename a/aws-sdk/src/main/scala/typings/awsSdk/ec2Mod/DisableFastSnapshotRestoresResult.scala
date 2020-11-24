package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableFastSnapshotRestoresResult extends js.Object {
  
  /**
    * Information about the snapshots for which fast snapshot restores were successfully disabled.
    */
  var Successful: js.UndefOr[DisableFastSnapshotRestoreSuccessSet] = js.native
  
  /**
    * Information about the snapshots for which fast snapshot restores could not be disabled.
    */
  var Unsuccessful: js.UndefOr[DisableFastSnapshotRestoreErrorSet] = js.native
}
object DisableFastSnapshotRestoresResult {
  
  @scala.inline
  def apply(): DisableFastSnapshotRestoresResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFastSnapshotRestoresResult]
  }
  
  @scala.inline
  implicit class DisableFastSnapshotRestoresResultOps[Self <: DisableFastSnapshotRestoresResult] (val x: Self) extends AnyVal {
    
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
    def setSuccessfulVarargs(value: DisableFastSnapshotRestoreSuccessItem*): Self = this.set("Successful", js.Array(value :_*))
    
    @scala.inline
    def setSuccessful(value: DisableFastSnapshotRestoreSuccessSet): Self = this.set("Successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessful: Self = this.set("Successful", js.undefined)
    
    @scala.inline
    def setUnsuccessfulVarargs(value: DisableFastSnapshotRestoreErrorItem*): Self = this.set("Unsuccessful", js.Array(value :_*))
    
    @scala.inline
    def setUnsuccessful(value: DisableFastSnapshotRestoreErrorSet): Self = this.set("Unsuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsuccessful: Self = this.set("Unsuccessful", js.undefined)
  }
}
