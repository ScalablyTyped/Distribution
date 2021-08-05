package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerDescription extends StObject {
  
  /**
    * The domain name of the LoadBalancer.
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * A list of Listeners used by the LoadBalancer.
    */
  var Listeners: js.UndefOr[LoadBalancerListenersDescription] = js.undefined
  
  /**
    * The name of the LoadBalancer.
    */
  var LoadBalancerName: js.UndefOr[String] = js.undefined
}
object LoadBalancerDescription {
  
  inline def apply(): LoadBalancerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerDescription]
  }
  
  extension [Self <: LoadBalancerDescription](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setListeners(value: LoadBalancerListenersDescription): Self = StObject.set(x, "Listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "Listeners", js.undefined)
    
    inline def setListenersVarargs(value: Listener*): Self = StObject.set(x, "Listeners", js.Array(value :_*))
    
    inline def setLoadBalancerName(value: String): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerNameUndefined: Self = StObject.set(x, "LoadBalancerName", js.undefined)
  }
}
