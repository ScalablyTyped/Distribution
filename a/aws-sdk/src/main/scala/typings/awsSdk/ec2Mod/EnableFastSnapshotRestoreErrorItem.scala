package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableFastSnapshotRestoreErrorItem extends StObject {
  
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
  implicit class EnableFastSnapshotRestoreErrorItemMutableBuilder[Self <: EnableFastSnapshotRestoreErrorItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFastSnapshotRestoreStateErrors(value: EnableFastSnapshotRestoreStateErrorSet): Self = StObject.set(x, "FastSnapshotRestoreStateErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastSnapshotRestoreStateErrorsUndefined: Self = StObject.set(x, "FastSnapshotRestoreStateErrors", js.undefined)
    
    @scala.inline
    def setFastSnapshotRestoreStateErrorsVarargs(value: EnableFastSnapshotRestoreStateErrorItem*): Self = StObject.set(x, "FastSnapshotRestoreStateErrors", js.Array(value :_*))
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
  }
}
