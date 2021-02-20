package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpAddressRequest extends StObject {
  
  /**
    * The IP address that you want to use for DNS queries.
    */
  var Ip: js.UndefOr[typings.awsSdk.route53resolverMod.Ip] = js.native
  
  /**
    * The ID of the subnet that contains the IP address. 
    */
  var SubnetId: typings.awsSdk.route53resolverMod.SubnetId = js.native
}
object IpAddressRequest {
  
  @scala.inline
  def apply(SubnetId: SubnetId): IpAddressRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpAddressRequest]
  }
  
  @scala.inline
  implicit class IpAddressRequestMutableBuilder[Self <: IpAddressRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "Ip", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
  }
}
