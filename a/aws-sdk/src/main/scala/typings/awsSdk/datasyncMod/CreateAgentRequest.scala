package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAgentRequest extends js.Object {
  
  /**
    * Your agent activation key. You can get the activation key either by sending an HTTP GET request with redirects that enable you to get the agent IP address (port 80). Alternatively, you can get it from the AWS DataSync console. The redirect URL returned in the response provides you the activation key for your agent in the query string parameter activationKey. It might also include other activation-related parameters; however, these are merely defaults. The arguments you pass to this API call determine the actual configuration of your agent. For more information, see Activating an Agent in the AWS DataSync User Guide. 
    */
  var ActivationKey: typings.awsSdk.datasyncMod.ActivationKey = js.native
  
  /**
    * The name you configured for your agent. This value is a text reference that is used to identify the agent in the console.
    */
  var AgentName: js.UndefOr[TagValue] = js.native
  
  /**
    * The ARNs of the security groups used to protect your data transfer task subnets. See CreateAgentRequest$SubnetArns.
    */
  var SecurityGroupArns: js.UndefOr[PLSecurityGroupArnList] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of the subnets in which DataSync will create elastic network interfaces for each data transfer task. The agent that runs a task must be private. When you start a task that is associated with an agent created in a VPC, or one that has access to an IP address in a VPC, then the task is also private. In this case, DataSync creates four network interfaces for each task in your subnet. For a data transfer to work, the agent must be able to route to all these four network interfaces.
    */
  var SubnetArns: js.UndefOr[PLSubnetArnList] = js.native
  
  /**
    * The key-value pair that represents the tag that you want to associate with the agent. The value can be an empty string. This value helps you manage, filter, and search for your agents.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @.  
    */
  var Tags: js.UndefOr[InputTagList] = js.native
  
  /**
    * The ID of the VPC (virtual private cloud) endpoint that the agent has access to. This is the client-side VPC endpoint, also called a PrivateLink. If you don't have a PrivateLink VPC endpoint, see Creating a VPC Endpoint Service Configuration in the Amazon VPC User Guide. VPC endpoint ID looks like this: vpce-01234d5aff67890e1.
    */
  var VpcEndpointId: js.UndefOr[typings.awsSdk.datasyncMod.VpcEndpointId] = js.native
}
object CreateAgentRequest {
  
  @scala.inline
  def apply(ActivationKey: ActivationKey): CreateAgentRequest = {
    val __obj = js.Dynamic.literal(ActivationKey = ActivationKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentRequest]
  }
  
  @scala.inline
  implicit class CreateAgentRequestOps[Self <: CreateAgentRequest] (val x: Self) extends AnyVal {
    
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
    def setActivationKey(value: ActivationKey): Self = this.set("ActivationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentName(value: TagValue): Self = this.set("AgentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentName: Self = this.set("AgentName", js.undefined)
    
    @scala.inline
    def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = this.set("SecurityGroupArns", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupArns(value: PLSecurityGroupArnList): Self = this.set("SecurityGroupArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupArns: Self = this.set("SecurityGroupArns", js.undefined)
    
    @scala.inline
    def setSubnetArnsVarargs(value: Ec2SubnetArn*): Self = this.set("SubnetArns", js.Array(value :_*))
    
    @scala.inline
    def setSubnetArns(value: PLSubnetArnList): Self = this.set("SubnetArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetArns: Self = this.set("SubnetArns", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagListEntry*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: InputTagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVpcEndpointId(value: VpcEndpointId): Self = this.set("VpcEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcEndpointId: Self = this.set("VpcEndpointId", js.undefined)
  }
}
