package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsEc2NetworkInterfaceViolation extends StObject {
  
  /**
    * List of security groups that violate the rules specified in the master security group of the AWS Firewall Manager policy.
    */
  var ViolatingSecurityGroups: js.UndefOr[ResourceIdList] = js.native
  
  /**
    * The resource ID of the network interface.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.fmsMod.ViolationTarget] = js.native
}
object AwsEc2NetworkInterfaceViolation {
  
  @scala.inline
  def apply(): AwsEc2NetworkInterfaceViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkInterfaceViolation]
  }
  
  @scala.inline
  implicit class AwsEc2NetworkInterfaceViolationMutableBuilder[Self <: AwsEc2NetworkInterfaceViolation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViolatingSecurityGroups(value: ResourceIdList): Self = StObject.set(x, "ViolatingSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolatingSecurityGroupsUndefined: Self = StObject.set(x, "ViolatingSecurityGroups", js.undefined)
    
    @scala.inline
    def setViolatingSecurityGroupsVarargs(value: ResourceId*): Self = StObject.set(x, "ViolatingSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
  }
}
