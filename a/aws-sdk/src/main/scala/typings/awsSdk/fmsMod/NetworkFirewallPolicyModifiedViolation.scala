package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkFirewallPolicyModifiedViolation extends js.Object {
  
  /**
    * The policy that's currently in use in the individual account. 
    */
  var CurrentPolicyDescription: js.UndefOr[NetworkFirewallPolicyDescription] = js.native
  
  /**
    * The policy that should be in use in the individual account in order to be compliant. 
    */
  var ExpectedPolicyDescription: js.UndefOr[NetworkFirewallPolicyDescription] = js.native
  
  /**
    * The ID of the AWS Network Firewall or VPC resource that's in violation.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.fmsMod.ViolationTarget] = js.native
}
object NetworkFirewallPolicyModifiedViolation {
  
  @scala.inline
  def apply(): NetworkFirewallPolicyModifiedViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallPolicyModifiedViolation]
  }
  
  @scala.inline
  implicit class NetworkFirewallPolicyModifiedViolationOps[Self <: NetworkFirewallPolicyModifiedViolation] (val x: Self) extends AnyVal {
    
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
    def setCurrentPolicyDescription(value: NetworkFirewallPolicyDescription): Self = this.set("CurrentPolicyDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPolicyDescription: Self = this.set("CurrentPolicyDescription", js.undefined)
    
    @scala.inline
    def setExpectedPolicyDescription(value: NetworkFirewallPolicyDescription): Self = this.set("ExpectedPolicyDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedPolicyDescription: Self = this.set("ExpectedPolicyDescription", js.undefined)
    
    @scala.inline
    def setViolationTarget(value: ViolationTarget): Self = this.set("ViolationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolationTarget: Self = this.set("ViolationTarget", js.undefined)
  }
}
