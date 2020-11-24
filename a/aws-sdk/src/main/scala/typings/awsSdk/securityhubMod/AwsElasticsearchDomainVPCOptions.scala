package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElasticsearchDomainVPCOptions extends js.Object {
  
  /**
    * The list of Availability Zones associated with the VPC subnets.
    */
  var AvailabilityZones: js.UndefOr[NonEmptyStringList] = js.native
  
  /**
    * The list of security group IDs associated with the VPC endpoints for the domain.
    */
  var SecurityGroupIds: js.UndefOr[NonEmptyStringList] = js.native
  
  /**
    * A list of subnet IDs associated with the VPC endpoints for the domain.
    */
  var SubnetIds: js.UndefOr[NonEmptyStringList] = js.native
  
  /**
    * ID for the VPC.
    */
  var VPCId: js.UndefOr[NonEmptyString] = js.native
}
object AwsElasticsearchDomainVPCOptions {
  
  @scala.inline
  def apply(): AwsElasticsearchDomainVPCOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainVPCOptions]
  }
  
  @scala.inline
  implicit class AwsElasticsearchDomainVPCOptionsOps[Self <: AwsElasticsearchDomainVPCOptions] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZonesVarargs(value: NonEmptyString*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: NonEmptyStringList): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: NonEmptyString*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: NonEmptyStringList): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: NonEmptyString*): Self = this.set("SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: NonEmptyStringList): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    
    @scala.inline
    def setVPCId(value: NonEmptyString): Self = this.set("VPCId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVPCId: Self = this.set("VPCId", js.undefined)
  }
}
