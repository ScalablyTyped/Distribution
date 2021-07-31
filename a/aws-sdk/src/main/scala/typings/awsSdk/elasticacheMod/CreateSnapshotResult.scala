package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotResult extends StObject {
  
  var Snapshot: js.UndefOr[typings.awsSdk.elasticacheMod.Snapshot] = js.undefined
}
object CreateSnapshotResult {
  
  @scala.inline
  def apply(): CreateSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotResult]
  }
  
  @scala.inline
  implicit class CreateSnapshotResultMutableBuilder[Self <: CreateSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshot(value: Snapshot): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}
