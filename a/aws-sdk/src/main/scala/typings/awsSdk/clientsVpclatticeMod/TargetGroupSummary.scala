package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetGroupSummary extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the target group.
    */
  var arn: js.UndefOr[TargetGroupArn] = js.undefined
  
  /**
    * The date and time that the target group was created, specified in ISO-8601 format.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the target group.
    */
  var id: js.UndefOr[TargetGroupId] = js.undefined
  
  /**
    * The type of IP address used for the target group. The possible values are ipv4 and ipv6. This is an optional parameter. If not specified, the IP address type defaults to ipv4.
    */
  var ipAddressType: js.UndefOr[IpAddressType] = js.undefined
  
  /**
    * The date and time that the target group was last updated, specified in ISO-8601 format.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the target group.
    */
  var name: js.UndefOr[TargetGroupName] = js.undefined
  
  /**
    * The port of the target group.
    */
  var port: js.UndefOr[Port] = js.undefined
  
  /**
    * The protocol of the target group.
    */
  var protocol: js.UndefOr[TargetGroupProtocol] = js.undefined
  
  /**
    * The list of Amazon Resource Names (ARNs) of the service.
    */
  var serviceArns: js.UndefOr[ServiceArnList] = js.undefined
  
  /**
    * The status.
    */
  var status: js.UndefOr[TargetGroupStatus] = js.undefined
  
  /**
    * The target group type.
    */
  var `type`: js.UndefOr[TargetGroupType] = js.undefined
  
  /**
    * The ID of the VPC of the target group.
    */
  var vpcIdentifier: js.UndefOr[VpcId] = js.undefined
}
object TargetGroupSummary {
  
  inline def apply(): TargetGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetGroupSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TargetGroupArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setId(value: TargetGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "ipAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "ipAddressType", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setName(value: TargetGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPort(value: Port): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: TargetGroupProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setServiceArns(value: ServiceArnList): Self = StObject.set(x, "serviceArns", value.asInstanceOf[js.Any])
    
    inline def setServiceArnsUndefined: Self = StObject.set(x, "serviceArns", js.undefined)
    
    inline def setServiceArnsVarargs(value: ServiceArn*): Self = StObject.set(x, "serviceArns", js.Array(value*))
    
    inline def setStatus(value: TargetGroupStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: TargetGroupType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVpcIdentifier(value: VpcId): Self = StObject.set(x, "vpcIdentifier", value.asInstanceOf[js.Any])
    
    inline def setVpcIdentifierUndefined: Self = StObject.set(x, "vpcIdentifier", js.undefined)
  }
}
