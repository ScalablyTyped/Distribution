package typings.awsSdk.s3outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEndpointRequest extends js.Object {
  
  /**
    * The ID of the AWS Outpost. 
    */
  var OutpostId: typings.awsSdk.s3outpostsMod.OutpostId = js.native
  
  /**
    * The ID of the security group to use with the endpoint.
    */
  var SecurityGroupId: typings.awsSdk.s3outpostsMod.SecurityGroupId = js.native
  
  /**
    * The ID of the subnet in the selected VPC.
    */
  var SubnetId: typings.awsSdk.s3outpostsMod.SubnetId = js.native
}
object CreateEndpointRequest {
  
  @scala.inline
  def apply(OutpostId: OutpostId, SecurityGroupId: SecurityGroupId, SubnetId: SubnetId): CreateEndpointRequest = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any], SecurityGroupId = SecurityGroupId.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointRequest]
  }
  
  @scala.inline
  implicit class CreateEndpointRequestOps[Self <: CreateEndpointRequest] (val x: Self) extends AnyVal {
    
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
    def setOutpostId(value: OutpostId): Self = this.set("OutpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupId(value: SecurityGroupId): Self = this.set("SecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
  }
}
