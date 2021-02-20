package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetViolationDetailsRequest extends StObject {
  
  /**
    * The AWS account ID that you want the details for.
    */
  var MemberAccount: AWSAccountId = js.native
  
  /**
    * The ID of the AWS Firewall Manager policy that you want the details for. This currently only supports security group content audit policies.
    */
  var PolicyId: typings.awsSdk.fmsMod.PolicyId = js.native
  
  /**
    * The ID of the resource that has violations.
    */
  var ResourceId: typings.awsSdk.fmsMod.ResourceId = js.native
  
  /**
    * The resource type. This is in the format shown in the AWS Resource Types Reference. Supported resource types are: AWS::EC2::Instance, AWS::EC2::NetworkInterface, AWS::EC2::SecurityGroup, AWS::NetworkFirewall::FirewallPolicy, and AWS::EC2::Subnet. 
    */
  var ResourceType: typings.awsSdk.fmsMod.ResourceType = js.native
}
object GetViolationDetailsRequest {
  
  @scala.inline
  def apply(
    MemberAccount: AWSAccountId,
    PolicyId: PolicyId,
    ResourceId: ResourceId,
    ResourceType: ResourceType
  ): GetViolationDetailsRequest = {
    val __obj = js.Dynamic.literal(MemberAccount = MemberAccount.asInstanceOf[js.Any], PolicyId = PolicyId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetViolationDetailsRequest]
  }
  
  @scala.inline
  implicit class GetViolationDetailsRequestMutableBuilder[Self <: GetViolationDetailsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberAccount(value: AWSAccountId): Self = StObject.set(x, "MemberAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
