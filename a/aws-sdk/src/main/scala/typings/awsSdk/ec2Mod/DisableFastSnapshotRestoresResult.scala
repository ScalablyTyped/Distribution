package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableFastSnapshotRestoresResult extends StObject {
  
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
  implicit class DisableFastSnapshotRestoresResultMutableBuilder[Self <: DisableFastSnapshotRestoresResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccessful(value: DisableFastSnapshotRestoreSuccessSet): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulUndefined: Self = StObject.set(x, "Successful", js.undefined)
    
    @scala.inline
    def setSuccessfulVarargs(value: DisableFastSnapshotRestoreSuccessItem*): Self = StObject.set(x, "Successful", js.Array(value :_*))
    
    @scala.inline
    def setUnsuccessful(value: DisableFastSnapshotRestoreErrorSet): Self = StObject.set(x, "Unsuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsuccessfulUndefined: Self = StObject.set(x, "Unsuccessful", js.undefined)
    
    @scala.inline
    def setUnsuccessfulVarargs(value: DisableFastSnapshotRestoreErrorItem*): Self = StObject.set(x, "Unsuccessful", js.Array(value :_*))
  }
}
