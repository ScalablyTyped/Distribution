package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsEc2NetworkInterfaceViolation extends js.Object {
  
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
  implicit class AwsEc2NetworkInterfaceViolationOps[Self <: AwsEc2NetworkInterfaceViolation] (val x: Self) extends AnyVal {
    
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
    def setViolatingSecurityGroupsVarargs(value: ResourceId*): Self = this.set("ViolatingSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setViolatingSecurityGroups(value: ResourceIdList): Self = this.set("ViolatingSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolatingSecurityGroups: Self = this.set("ViolatingSecurityGroups", js.undefined)
    
    @scala.inline
    def setViolationTarget(value: ViolationTarget): Self = this.set("ViolationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolationTarget: Self = this.set("ViolationTarget", js.undefined)
  }
}
