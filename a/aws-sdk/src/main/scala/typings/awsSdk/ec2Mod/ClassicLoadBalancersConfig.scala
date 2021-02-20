package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassicLoadBalancersConfig extends StObject {
  
  /**
    * One or more Classic Load Balancers.
    */
  var ClassicLoadBalancers: js.UndefOr[typings.awsSdk.ec2Mod.ClassicLoadBalancers] = js.native
}
object ClassicLoadBalancersConfig {
  
  @scala.inline
  def apply(): ClassicLoadBalancersConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassicLoadBalancersConfig]
  }
  
  @scala.inline
  implicit class ClassicLoadBalancersConfigMutableBuilder[Self <: ClassicLoadBalancersConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassicLoadBalancers(value: ClassicLoadBalancers): Self = StObject.set(x, "ClassicLoadBalancers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassicLoadBalancersUndefined: Self = StObject.set(x, "ClassicLoadBalancers", js.undefined)
    
    @scala.inline
    def setClassicLoadBalancersVarargs(value: ClassicLoadBalancer*): Self = StObject.set(x, "ClassicLoadBalancers", js.Array(value :_*))
  }
}
