package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableFastSnapshotRestoreErrorItem extends StObject {
  
  /**
    * The errors.
    */
  var FastSnapshotRestoreStateErrors: js.UndefOr[DisableFastSnapshotRestoreStateErrorSet] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
}
object DisableFastSnapshotRestoreErrorItem {
  
  @scala.inline
  def apply(): DisableFastSnapshotRestoreErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFastSnapshotRestoreErrorItem]
  }
  
  @scala.inline
  implicit class DisableFastSnapshotRestoreErrorItemMutableBuilder[Self <: DisableFastSnapshotRestoreErrorItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFastSnapshotRestoreStateErrors(value: DisableFastSnapshotRestoreStateErrorSet): Self = StObject.set(x, "FastSnapshotRestoreStateErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastSnapshotRestoreStateErrorsUndefined: Self = StObject.set(x, "FastSnapshotRestoreStateErrors", js.undefined)
    
    @scala.inline
    def setFastSnapshotRestoreStateErrorsVarargs(value: DisableFastSnapshotRestoreStateErrorItem*): Self = StObject.set(x, "FastSnapshotRestoreStateErrors", js.Array(value :_*))
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
  }
}
