package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElasticsearchDomainVPCOptions extends StObject {
  
  /**
    * The list of Availability Zones associated with the VPC subnets.
    */
  var AvailabilityZones: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The list of security group IDs associated with the VPC endpoints for the domain.
    */
  var SecurityGroupIds: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * A list of subnet IDs associated with the VPC endpoints for the domain.
    */
  var SubnetIds: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * ID for the VPC.
    */
  var VPCId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElasticsearchDomainVPCOptions {
  
  @scala.inline
  def apply(): AwsElasticsearchDomainVPCOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainVPCOptions]
  }
  
  @scala.inline
  implicit class AwsElasticsearchDomainVPCOptionsMutableBuilder[Self <: AwsElasticsearchDomainVPCOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: NonEmptyStringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: NonEmptyString*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: NonEmptyStringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: NonEmptyStringList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setVPCId(value: NonEmptyString): Self = StObject.set(x, "VPCId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCIdUndefined: Self = StObject.set(x, "VPCId", js.undefined)
  }
}
