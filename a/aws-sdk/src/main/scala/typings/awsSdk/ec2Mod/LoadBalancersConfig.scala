package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancersConfig extends StObject {
  
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
  implicit class LoadBalancersConfigMutableBuilder[Self <: LoadBalancersConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassicLoadBalancersConfig(value: ClassicLoadBalancersConfig): Self = StObject.set(x, "ClassicLoadBalancersConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassicLoadBalancersConfigUndefined: Self = StObject.set(x, "ClassicLoadBalancersConfig", js.undefined)
    
    @scala.inline
    def setTargetGroupsConfig(value: TargetGroupsConfig): Self = StObject.set(x, "TargetGroupsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupsConfigUndefined: Self = StObject.set(x, "TargetGroupsConfig", js.undefined)
  }
}
