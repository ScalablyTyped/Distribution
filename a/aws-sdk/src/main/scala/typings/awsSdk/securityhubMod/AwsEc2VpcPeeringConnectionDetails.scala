package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2VpcPeeringConnectionDetails extends StObject {
  
  /**
    * Information about the accepter VPC. 
    */
  var AccepterVpcInfo: js.UndefOr[AwsEc2VpcPeeringConnectionVpcInfoDetails] = js.undefined
  
  /**
    * The time at which an unaccepted VPC peering connection will expire. 
    */
  var ExpirationTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the requester VPC. 
    */
  var RequesterVpcInfo: js.UndefOr[AwsEc2VpcPeeringConnectionVpcInfoDetails] = js.undefined
  
  /**
    * The status of the VPC peering connection. 
    */
  var Status: js.UndefOr[AwsEc2VpcPeeringConnectionStatusDetails] = js.undefined
  
  /**
    * The ID of the VPC peering connection. 
    */
  var VpcPeeringConnectionId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2VpcPeeringConnectionDetails {
  
  inline def apply(): AwsEc2VpcPeeringConnectionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VpcPeeringConnectionDetails]
  }
  
  extension [Self <: AwsEc2VpcPeeringConnectionDetails](x: Self) {
    
    inline def setAccepterVpcInfo(value: AwsEc2VpcPeeringConnectionVpcInfoDetails): Self = StObject.set(x, "AccepterVpcInfo", value.asInstanceOf[js.Any])
    
    inline def setAccepterVpcInfoUndefined: Self = StObject.set(x, "AccepterVpcInfo", js.undefined)
    
    inline def setExpirationTime(value: NonEmptyString): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    inline def setRequesterVpcInfo(value: AwsEc2VpcPeeringConnectionVpcInfoDetails): Self = StObject.set(x, "RequesterVpcInfo", value.asInstanceOf[js.Any])
    
    inline def setRequesterVpcInfoUndefined: Self = StObject.set(x, "RequesterVpcInfo", js.undefined)
    
    inline def setStatus(value: AwsEc2VpcPeeringConnectionStatusDetails): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVpcPeeringConnectionId(value: NonEmptyString): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
