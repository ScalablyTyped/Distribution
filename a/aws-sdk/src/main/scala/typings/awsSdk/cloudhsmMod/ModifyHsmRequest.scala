package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyHsmRequest extends StObject {
  
  /**
    * The new IP address for the elastic network interface (ENI) attached to the HSM. If the HSM is moved to a different subnet, and an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the new subnet.
    */
  var EniIp: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The new external ID.
    */
  var ExternalId: js.UndefOr[typings.awsSdk.cloudhsmMod.ExternalId] = js.undefined
  
  /**
    * The ARN of the HSM to modify.
    */
  var HsmArn: typings.awsSdk.cloudhsmMod.HsmArn
  
  /**
    * The new IAM role ARN.
    */
  var IamRoleArn: js.UndefOr[typings.awsSdk.cloudhsmMod.IamRoleArn] = js.undefined
  
  /**
    * The new identifier of the subnet that the HSM is in. The new subnet must be in the same Availability Zone as the current subnet.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.cloudhsmMod.SubnetId] = js.undefined
  
  /**
    * The new IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring server.
    */
  var SyslogIp: js.UndefOr[IpAddress] = js.undefined
}
object ModifyHsmRequest {
  
  inline def apply(HsmArn: HsmArn): ModifyHsmRequest = {
    val __obj = js.Dynamic.literal(HsmArn = HsmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHsmRequest]
  }
  
  extension [Self <: ModifyHsmRequest](x: Self) {
    
    inline def setEniIp(value: IpAddress): Self = StObject.set(x, "EniIp", value.asInstanceOf[js.Any])
    
    inline def setEniIpUndefined: Self = StObject.set(x, "EniIp", js.undefined)
    
    inline def setExternalId(value: ExternalId): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
    
    inline def setHsmArn(value: HsmArn): Self = StObject.set(x, "HsmArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArn(value: IamRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setSyslogIp(value: IpAddress): Self = StObject.set(x, "SyslogIp", value.asInstanceOf[js.Any])
    
    inline def setSyslogIpUndefined: Self = StObject.set(x, "SyslogIp", js.undefined)
  }
}
