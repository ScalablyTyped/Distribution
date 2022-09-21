package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVolumeResponse extends StObject {
  
  /**
    * The lifecycle state of the volume being deleted. If the DeleteVolume operation is successful, this value is DELETING.
    */
  var Lifecycle: js.UndefOr[VolumeLifecycle] = js.undefined
  
  /**
    * Returned after a DeleteVolume request, showing the status of the delete request.
    */
  var OntapResponse: js.UndefOr[DeleteVolumeOntapResponse] = js.undefined
  
  /**
    * The ID of the volume that's being deleted.
    */
  var VolumeId: js.UndefOr[typings.awsSdk.fsxMod.VolumeId] = js.undefined
}
object DeleteVolumeResponse {
  
  inline def apply(): DeleteVolumeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVolumeResponse]
  }
  
  extension [Self <: DeleteVolumeResponse](x: Self) {
    
    inline def setLifecycle(value: VolumeLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setOntapResponse(value: DeleteVolumeOntapResponse): Self = StObject.set(x, "OntapResponse", value.asInstanceOf[js.Any])
    
    inline def setOntapResponseUndefined: Self = StObject.set(x, "OntapResponse", js.undefined)
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
