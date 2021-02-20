package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVolumesOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * Use the marker in your next request to continue pagination of iSCSI volumes. If there are no more volumes to list, this field does not appear in the response body.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
  
  /**
    * An array of VolumeInfo objects, where each object describes an iSCSI volume. If no volumes are defined for the gateway, then VolumeInfos is an empty array "[]".
    */
  var VolumeInfos: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeInfos] = js.native
}
object ListVolumesOutput {
  
  @scala.inline
  def apply(): ListVolumesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVolumesOutput]
  }
  
  @scala.inline
  implicit class ListVolumesOutputMutableBuilder[Self <: ListVolumesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setVolumeInfos(value: VolumeInfos): Self = StObject.set(x, "VolumeInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeInfosUndefined: Self = StObject.set(x, "VolumeInfos", js.undefined)
    
    @scala.inline
    def setVolumeInfosVarargs(value: VolumeInfo*): Self = StObject.set(x, "VolumeInfos", js.Array(value :_*))
  }
}
