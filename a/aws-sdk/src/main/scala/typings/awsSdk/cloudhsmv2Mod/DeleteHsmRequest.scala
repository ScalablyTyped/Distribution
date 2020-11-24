package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHsmRequest extends js.Object {
  
  /**
    * The identifier (ID) of the cluster that contains the HSM that you are deleting.
    */
  var ClusterId: typings.awsSdk.cloudhsmv2Mod.ClusterId = js.native
  
  /**
    * The identifier (ID) of the elastic network interface (ENI) of the HSM that you are deleting.
    */
  var EniId: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.EniId] = js.native
  
  /**
    * The IP address of the elastic network interface (ENI) of the HSM that you are deleting.
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  
  /**
    * The identifier (ID) of the HSM that you are deleting.
    */
  var HsmId: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.HsmId] = js.native
}
object DeleteHsmRequest {
  
  @scala.inline
  def apply(ClusterId: ClusterId): DeleteHsmRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmRequest]
  }
  
  @scala.inline
  implicit class DeleteHsmRequestOps[Self <: DeleteHsmRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEniId(value: EniId): Self = this.set("EniId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEniId: Self = this.set("EniId", js.undefined)
    
    @scala.inline
    def setEniIp(value: IpAddress): Self = this.set("EniIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEniIp: Self = this.set("EniIp", js.undefined)
    
    @scala.inline
    def setHsmId(value: HsmId): Self = this.set("HsmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmId: Self = this.set("HsmId", js.undefined)
  }
}
