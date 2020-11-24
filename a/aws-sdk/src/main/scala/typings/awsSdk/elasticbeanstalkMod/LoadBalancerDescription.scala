package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerDescription extends js.Object {
  
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
  implicit class LoadBalancerDescriptionOps[Self <: LoadBalancerDescription] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    
    @scala.inline
    def setListenersVarargs(value: Listener*): Self = this.set("Listeners", js.Array(value :_*))
    
    @scala.inline
    def setListeners(value: LoadBalancerListenersDescription): Self = this.set("Listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListeners: Self = this.set("Listeners", js.undefined)
    
    @scala.inline
    def setLoadBalancerName(value: String): Self = this.set("LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerName: Self = this.set("LoadBalancerName", js.undefined)
  }
}
