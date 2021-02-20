package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSnapshotResult extends StObject {
  
  /**
    * The identifier of the directory snapshot that was deleted.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.directoryserviceMod.SnapshotId] = js.native
}
object DeleteSnapshotResult {
  
  @scala.inline
  def apply(): DeleteSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSnapshotResult]
  }
  
  @scala.inline
  implicit class DeleteSnapshotResultMutableBuilder[Self <: DeleteSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
  }
}
