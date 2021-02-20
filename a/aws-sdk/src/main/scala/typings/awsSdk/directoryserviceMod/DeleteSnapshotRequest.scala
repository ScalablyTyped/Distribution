package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSnapshotRequest extends StObject {
  
  /**
    * The identifier of the directory snapshot to be deleted.
    */
  var SnapshotId: typings.awsSdk.directoryserviceMod.SnapshotId = js.native
}
object DeleteSnapshotRequest {
  
  @scala.inline
  def apply(SnapshotId: SnapshotId): DeleteSnapshotRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotRequest]
  }
  
  @scala.inline
  implicit class DeleteSnapshotRequestMutableBuilder[Self <: DeleteSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
