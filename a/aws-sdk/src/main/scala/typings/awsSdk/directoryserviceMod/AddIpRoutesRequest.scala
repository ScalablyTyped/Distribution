package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddIpRoutesRequest extends StObject {
  
  /**
    * Identifier (ID) of the directory to which to add the address block.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * IP address blocks, using CIDR format, of the traffic to route. This is often the IP address block of the DNS server used for your on-premises domain.
    */
  var IpRoutes: typings.awsSdk.directoryserviceMod.IpRoutes
  
  /**
    * If set to true, updates the inbound and outbound rules of the security group that has the description: "AWS created security group for directory ID directory controllers." Following are the new rules:  Inbound:   Type: Custom UDP Rule, Protocol: UDP, Range: 88, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 123, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 138, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 389, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 464, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 445, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 88, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 135, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 445, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 464, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 636, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 1024-65535, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 3268-33269, Source: 0.0.0.0/0   Type: DNS (UDP), Protocol: UDP, Range: 53, Source: 0.0.0.0/0   Type: DNS (TCP), Protocol: TCP, Range: 53, Source: 0.0.0.0/0   Type: LDAP, Protocol: TCP, Range: 389, Source: 0.0.0.0/0   Type: All ICMP, Protocol: All, Range: N/A, Source: 0.0.0.0/0    Outbound:   Type: All traffic, Protocol: All, Range: All, Destination: 0.0.0.0/0   These security rules impact an internal network interface that is not exposed publicly.
    */
  var UpdateSecurityGroupForDirectoryControllers: js.UndefOr[typings.awsSdk.directoryserviceMod.UpdateSecurityGroupForDirectoryControllers] = js.undefined
}
object AddIpRoutesRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, IpRoutes: IpRoutes): AddIpRoutesRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], IpRoutes = IpRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIpRoutesRequest]
  }
  
  @scala.inline
  implicit class AddIpRoutesRequestMutableBuilder[Self <: AddIpRoutesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpRoutes(value: IpRoutes): Self = StObject.set(x, "IpRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpRoutesVarargs(value: IpRoute*): Self = StObject.set(x, "IpRoutes", js.Array(value :_*))
    
    @scala.inline
    def setUpdateSecurityGroupForDirectoryControllers(value: UpdateSecurityGroupForDirectoryControllers): Self = StObject.set(x, "UpdateSecurityGroupForDirectoryControllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSecurityGroupForDirectoryControllersUndefined: Self = StObject.set(x, "UpdateSecurityGroupForDirectoryControllers", js.undefined)
  }
}
