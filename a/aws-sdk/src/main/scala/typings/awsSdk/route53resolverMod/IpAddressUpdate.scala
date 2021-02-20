package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpAddressUpdate extends StObject {
  
  /**
    * The new IP address.
    */
  var Ip: js.UndefOr[typings.awsSdk.route53resolverMod.Ip] = js.native
  
  /**
    *  Only when removing an IP address from a Resolver endpoint: The ID of the IP address that you want to remove. To get this ID, use GetResolverEndpoint.
    */
  var IpId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The ID of the subnet that includes the IP address that you want to update. To get this ID, use GetResolverEndpoint.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.route53resolverMod.SubnetId] = js.native
}
object IpAddressUpdate {
  
  @scala.inline
  def apply(): IpAddressUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpAddressUpdate]
  }
  
  @scala.inline
  implicit class IpAddressUpdateMutableBuilder[Self <: IpAddressUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpId(value: ResourceId): Self = StObject.set(x, "IpId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpIdUndefined: Self = StObject.set(x, "IpId", js.undefined)
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "Ip", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
