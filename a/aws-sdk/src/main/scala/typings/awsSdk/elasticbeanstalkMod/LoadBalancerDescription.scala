package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerDescription extends StObject {
  
  /**
    * The domain name of the LoadBalancer.
    */
  var Domain: js.UndefOr[String] = js.native
  
  /**
    * A list of Listeners used by the LoadBalancer.
    */
  var Listeners: js.UndefOr[LoadBalancerListenersDescription] = js.native
  
  /**
    * The name of the LoadBalancer.
    */
  var LoadBalancerName: js.UndefOr[String] = js.native
}
object LoadBalancerDescription {
  
  @scala.inline
  def apply(): LoadBalancerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerDescription]
  }
  
  @scala.inline
  implicit class LoadBalancerDescriptionMutableBuilder[Self <: LoadBalancerDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    @scala.inline
    def setListeners(value: LoadBalancerListenersDescription): Self = StObject.set(x, "Listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersUndefined: Self = StObject.set(x, "Listeners", js.undefined)
    
    @scala.inline
    def setListenersVarargs(value: Listener*): Self = StObject.set(x, "Listeners", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerName(value: String): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerNameUndefined: Self = StObject.set(x, "LoadBalancerName", js.undefined)
  }
}
