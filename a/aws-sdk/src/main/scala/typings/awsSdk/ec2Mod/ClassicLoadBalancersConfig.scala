package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassicLoadBalancersConfig extends StObject {
  
  /**
    * One or more Classic Load Balancers.
    */
  var ClassicLoadBalancers: js.UndefOr[typings.awsSdk.ec2Mod.ClassicLoadBalancers] = js.undefined
}
object ClassicLoadBalancersConfig {
  
  inline def apply(): ClassicLoadBalancersConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassicLoadBalancersConfig]
  }
  
  extension [Self <: ClassicLoadBalancersConfig](x: Self) {
    
    inline def setClassicLoadBalancers(value: ClassicLoadBalancers): Self = StObject.set(x, "ClassicLoadBalancers", value.asInstanceOf[js.Any])
    
    inline def setClassicLoadBalancersUndefined: Self = StObject.set(x, "ClassicLoadBalancers", js.undefined)
    
    inline def setClassicLoadBalancersVarargs(value: ClassicLoadBalancer*): Self = StObject.set(x, "ClassicLoadBalancers", js.Array(value*))
  }
}
