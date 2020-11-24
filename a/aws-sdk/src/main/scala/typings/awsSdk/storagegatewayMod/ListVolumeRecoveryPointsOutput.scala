package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVolumeRecoveryPointsOutput extends js.Object {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * An array of VolumeRecoveryPointInfo objects.
    */
  var VolumeRecoveryPointInfos: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeRecoveryPointInfos] = js.native
}
object ListVolumeRecoveryPointsOutput {
  
  @scala.inline
  def apply(): ListVolumeRecoveryPointsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVolumeRecoveryPointsOutput]
  }
  
  @scala.inline
  implicit class ListVolumeRecoveryPointsOutputOps[Self <: ListVolumeRecoveryPointsOutput] (val x: Self) extends AnyVal {
    
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
    def setVolumeRecoveryPointInfosVarargs(value: VolumeRecoveryPointInfo*): Self = this.set("VolumeRecoveryPointInfos", js.Array(value :_*))
    
    @scala.inline
    def setVolumeRecoveryPointInfos(value: VolumeRecoveryPointInfos): Self = this.set("VolumeRecoveryPointInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeRecoveryPointInfos: Self = this.set("VolumeRecoveryPointInfos", js.undefined)
  }
}
