package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotsResult extends StObject {
  
  /**
    * List of snapshots.
    */
  var Snapshots: js.UndefOr[SnapshotSet] = js.undefined
}
object CreateSnapshotsResult {
  
  @scala.inline
  def apply(): CreateSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotsResult]
  }
  
  @scala.inline
  implicit class CreateSnapshotsResultMutableBuilder[Self <: CreateSnapshotsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshots(value: SnapshotSet): Self = StObject.set(x, "Snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsUndefined: Self = StObject.set(x, "Snapshots", js.undefined)
    
    @scala.inline
    def setSnapshotsVarargs(value: SnapshotInfo*): Self = StObject.set(x, "Snapshots", js.Array(value :_*))
  }
}
