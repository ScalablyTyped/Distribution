package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVolumesOutput extends js.Object {
  
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
  implicit class ListVolumesOutputOps[Self <: ListVolumesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setVolumeInfosVarargs(value: VolumeInfo*): Self = this.set("VolumeInfos", js.Array(value :_*))
    
    @scala.inline
    def setVolumeInfos(value: VolumeInfos): Self = this.set("VolumeInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeInfos: Self = this.set("VolumeInfos", js.undefined)
  }
}
