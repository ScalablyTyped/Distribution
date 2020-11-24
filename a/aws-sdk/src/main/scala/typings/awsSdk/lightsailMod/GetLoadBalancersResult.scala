package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoadBalancersResult extends js.Object {
  
  /**
    * An array of LoadBalancer objects describing your load balancers.
    */
  var loadBalancers: js.UndefOr[LoadBalancerList] = js.native
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetLoadBalancers request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GetLoadBalancersResult {
  
  @scala.inline
  def apply(): GetLoadBalancersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoadBalancersResult]
  }
  
  @scala.inline
  implicit class GetLoadBalancersResultOps[Self <: GetLoadBalancersResult] (val x: Self) extends AnyVal {
    
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
    def setLoadBalancersVarargs(value: LoadBalancer*): Self = this.set("loadBalancers", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancers(value: LoadBalancerList): Self = this.set("loadBalancers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancers: Self = this.set("loadBalancers", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
