package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsVpcConfiguration extends js.Object {
  
  /**
    * Whether the task's elastic network interface receives a public IP address. The default value is DISABLED.
    */
  var assignPublicIp: js.UndefOr[AssignPublicIp] = js.native
  
  /**
    * The IDs of the security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used. There is a limit of 5 security groups that can be specified per AwsVpcConfiguration.  All specified security groups must be from the same VPC. 
    */
  var securityGroups: js.UndefOr[StringList] = js.native
  
  /**
    * The IDs of the subnets associated with the task or service. There is a limit of 16 subnets that can be specified per AwsVpcConfiguration.  All specified subnets must be from the same VPC. 
    */
  var subnets: StringList = js.native
}
object AwsVpcConfiguration {
  
  @scala.inline
  def apply(subnets: StringList): AwsVpcConfiguration = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsVpcConfiguration]
  }
  
  @scala.inline
  implicit class AwsVpcConfigurationOps[Self <: AwsVpcConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubnetsVarargs(value: String*): Self = this.set("subnets", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: StringList): Self = this.set("subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignPublicIp(value: AssignPublicIp): Self = this.set("assignPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignPublicIp: Self = this.set("assignPublicIp", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: StringList): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
  }
}
