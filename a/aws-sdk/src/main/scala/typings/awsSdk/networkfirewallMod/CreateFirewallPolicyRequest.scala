package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFirewallPolicyRequest extends js.Object {
  
  /**
    * A description of the firewall policy.
    */
  var Description: js.UndefOr[typings.awsSdk.networkfirewallMod.Description] = js.native
  
  /**
    * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the request.  If set to TRUE, Network Firewall checks whether the request can run successfully, but doesn't actually make the requested changes. The call returns the value that the request would return if you ran it with dry run set to FALSE, but doesn't make additions or changes to your resources. This option allows you to make sure that you have the required permissions to run the request and that your request parameters are valid.  If set to FALSE, Network Firewall makes the requested changes to your resources. 
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The rule groups and policy actions to use in the firewall policy.
    */
  var FirewallPolicy: typings.awsSdk.networkfirewallMod.FirewallPolicy = js.native
  
  /**
    * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
    */
  var FirewallPolicyName: ResourceName = js.native
  
  /**
    * The key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateFirewallPolicyRequest {
  
  @scala.inline
  def apply(FirewallPolicy: FirewallPolicy, FirewallPolicyName: ResourceName): CreateFirewallPolicyRequest = {
    val __obj = js.Dynamic.literal(FirewallPolicy = FirewallPolicy.asInstanceOf[js.Any], FirewallPolicyName = FirewallPolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFirewallPolicyRequest]
  }
  
  @scala.inline
  implicit class CreateFirewallPolicyRequestOps[Self <: CreateFirewallPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setFirewallPolicy(value: FirewallPolicy): Self = this.set("FirewallPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyName(value: ResourceName): Self = this.set("FirewallPolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
