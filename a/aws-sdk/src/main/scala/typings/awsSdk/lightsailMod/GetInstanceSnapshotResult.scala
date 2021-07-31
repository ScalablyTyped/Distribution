package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceSnapshotResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about the results of your get instance snapshot request.
    */
  var instanceSnapshot: js.UndefOr[InstanceSnapshot] = js.undefined
}
object GetInstanceSnapshotResult {
  
  @scala.inline
  def apply(): GetInstanceSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceSnapshotResult]
  }
  
  @scala.inline
  implicit class GetInstanceSnapshotResultMutableBuilder[Self <: GetInstanceSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceSnapshot(value: InstanceSnapshot): Self = StObject.set(x, "instanceSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceSnapshotUndefined: Self = StObject.set(x, "instanceSnapshot", js.undefined)
  }
}
