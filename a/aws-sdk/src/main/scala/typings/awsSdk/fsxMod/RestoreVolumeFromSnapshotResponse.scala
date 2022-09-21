package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreVolumeFromSnapshotResponse extends StObject {
  
  /**
    * The lifecycle state of the volume being restored.
    */
  var Lifecycle: js.UndefOr[VolumeLifecycle] = js.undefined
  
  /**
    * The ID of the volume that you restored.
    */
  var VolumeId: js.UndefOr[typings.awsSdk.fsxMod.VolumeId] = js.undefined
}
object RestoreVolumeFromSnapshotResponse {
  
  inline def apply(): RestoreVolumeFromSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreVolumeFromSnapshotResponse]
  }
  
  extension [Self <: RestoreVolumeFromSnapshotResponse](x: Self) {
    
    inline def setLifecycle(value: VolumeLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
