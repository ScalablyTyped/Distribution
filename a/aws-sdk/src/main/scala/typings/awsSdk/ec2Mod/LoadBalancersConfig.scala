package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancersConfig extends js.Object {
  
  /**
    * The Classic Load Balancers.
    */
  var ClassicLoadBalancersConfig: js.UndefOr[typings.awsSdk.ec2Mod.ClassicLoadBalancersConfig] = js.native
  
  /**
    * The target groups.
    */
  var TargetGroupsConfig: js.UndefOr[typings.awsSdk.ec2Mod.TargetGroupsConfig] = js.native
}
object LoadBalancersConfig {
  
  @scala.inline
  def apply(): LoadBalancersConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancersConfig]
  }
  
  @scala.inline
  implicit class LoadBalancersConfigOps[Self <: LoadBalancersConfig] (val x: Self) extends AnyVal {
    
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
    def setClassicLoadBalancersConfig(value: ClassicLoadBalancersConfig): Self = this.set("ClassicLoadBalancersConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassicLoadBalancersConfig: Self = this.set("ClassicLoadBalancersConfig", js.undefined)
    
    @scala.inline
    def setTargetGroupsConfig(value: TargetGroupsConfig): Self = this.set("TargetGroupsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetGroupsConfig: Self = this.set("TargetGroupsConfig", js.undefined)
  }
}
