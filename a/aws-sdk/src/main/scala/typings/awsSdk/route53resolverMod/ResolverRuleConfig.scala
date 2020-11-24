package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverRuleConfig extends js.Object {
  
  /**
    * The new name for the Resolver rule. The name that you specify appears in the Resolver dashboard in the Route 53 console. 
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.native
  
  /**
    * The ID of the new outbound Resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify in TargetIps.
    */
  var ResolverEndpointId: js.UndefOr[ResourceId] = js.native
  
  /**
    * For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS queries to.
    */
  var TargetIps: js.UndefOr[TargetList] = js.native
}
object ResolverRuleConfig {
  
  @scala.inline
  def apply(): ResolverRuleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverRuleConfig]
  }
  
  @scala.inline
  implicit class ResolverRuleConfigOps[Self <: ResolverRuleConfig] (val x: Self) extends AnyVal {
    
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
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setResolverEndpointId(value: ResourceId): Self = this.set("ResolverEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverEndpointId: Self = this.set("ResolverEndpointId", js.undefined)
    
    @scala.inline
    def setTargetIpsVarargs(value: TargetAddress*): Self = this.set("TargetIps", js.Array(value :_*))
    
    @scala.inline
    def setTargetIps(value: TargetList): Self = this.set("TargetIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetIps: Self = this.set("TargetIps", js.undefined)
  }
}
