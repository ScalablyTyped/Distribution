package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableFastSnapshotRestoresResult extends StObject {
  
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
  implicit class EnableFastSnapshotRestoresResultMutableBuilder[Self <: EnableFastSnapshotRestoresResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccessful(value: EnableFastSnapshotRestoreSuccessSet): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulUndefined: Self = StObject.set(x, "Successful", js.undefined)
    
    @scala.inline
    def setSuccessfulVarargs(value: EnableFastSnapshotRestoreSuccessItem*): Self = StObject.set(x, "Successful", js.Array(value :_*))
    
    @scala.inline
    def setUnsuccessful(value: EnableFastSnapshotRestoreErrorSet): Self = StObject.set(x, "Unsuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsuccessfulUndefined: Self = StObject.set(x, "Unsuccessful", js.undefined)
    
    @scala.inline
    def setUnsuccessfulVarargs(value: EnableFastSnapshotRestoreErrorItem*): Self = StObject.set(x, "Unsuccessful", js.Array(value :_*))
  }
}
