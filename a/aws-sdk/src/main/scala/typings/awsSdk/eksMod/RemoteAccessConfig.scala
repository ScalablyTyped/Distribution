package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteAccessConfig extends StObject {
  
  /**
    * The Amazon EC2 SSH key that provides access for SSH communication with the worker nodes in the managed node group. For more information, see Amazon EC2 Key Pairs in the Amazon Elastic Compute Cloud User Guide for Linux Instances.
    */
  var ec2SshKey: js.UndefOr[String] = js.native
  
  /**
    * The security groups that are allowed SSH access (port 22) to the worker nodes. If you specify an Amazon EC2 SSH key but do not specify a source security group when you create a managed node group, then port 22 on the worker nodes is opened to the internet (0.0.0.0/0). For more information, see Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.
    */
  var sourceSecurityGroups: js.UndefOr[StringList] = js.native
}
object RemoteAccessConfig {
  
  @scala.inline
  def apply(): RemoteAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteAccessConfig]
  }
  
  @scala.inline
  implicit class RemoteAccessConfigMutableBuilder[Self <: RemoteAccessConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEc2SshKey(value: String): Self = StObject.set(x, "ec2SshKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2SshKeyUndefined: Self = StObject.set(x, "ec2SshKey", js.undefined)
    
    @scala.inline
    def setSourceSecurityGroups(value: StringList): Self = StObject.set(x, "sourceSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSecurityGroupsUndefined: Self = StObject.set(x, "sourceSecurityGroups", js.undefined)
    
    @scala.inline
    def setSourceSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "sourceSecurityGroups", js.Array(value :_*))
  }
}
