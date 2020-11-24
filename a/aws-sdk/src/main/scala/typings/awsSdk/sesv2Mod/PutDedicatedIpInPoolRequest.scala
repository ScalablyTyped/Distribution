package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDedicatedIpInPoolRequest extends js.Object {
  
  /**
    * The name of the IP pool that you want to add the dedicated IP address to. You have to specify an IP pool that already exists.
    */
  var DestinationPoolName: PoolName = js.native
  
  /**
    * The IP address that you want to move to the dedicated IP pool. The value you specify has to be a dedicated IP address that's associated with your AWS account.
    */
  var Ip: typings.awsSdk.sesv2Mod.Ip = js.native
}
object PutDedicatedIpInPoolRequest {
  
  @scala.inline
  def apply(DestinationPoolName: PoolName, Ip: Ip): PutDedicatedIpInPoolRequest = {
    val __obj = js.Dynamic.literal(DestinationPoolName = DestinationPoolName.asInstanceOf[js.Any], Ip = Ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDedicatedIpInPoolRequest]
  }
  
  @scala.inline
  implicit class PutDedicatedIpInPoolRequestOps[Self <: PutDedicatedIpInPoolRequest] (val x: Self) extends AnyVal {
    
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
    def setDestinationPoolName(value: PoolName): Self = this.set("DestinationPoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: Ip): Self = this.set("Ip", value.asInstanceOf[js.Any])
  }
}
