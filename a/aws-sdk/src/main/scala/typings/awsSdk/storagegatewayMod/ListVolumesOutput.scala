package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVolumesOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
  
  /**
    * Use the marker in your next request to continue pagination of iSCSI volumes. If there are no more volumes to list, this field does not appear in the response body.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.undefined
  
  /**
    * An array of VolumeInfo objects, where each object describes an iSCSI volume. If no volumes are defined for the gateway, then VolumeInfos is an empty array "[]".
    */
  var VolumeInfos: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeInfos] = js.undefined
}
object ListVolumesOutput {
  
  inline def apply(): ListVolumesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVolumesOutput]
  }
  
  extension [Self <: ListVolumesOutput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setVolumeInfos(value: VolumeInfos): Self = StObject.set(x, "VolumeInfos", value.asInstanceOf[js.Any])
    
    inline def setVolumeInfosUndefined: Self = StObject.set(x, "VolumeInfos", js.undefined)
    
    inline def setVolumeInfosVarargs(value: VolumeInfo*): Self = StObject.set(x, "VolumeInfos", js.Array(value*))
  }
}
