package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficRoute extends js.Object {
  
  /**
    *  The Amazon Resource Name (ARN) of one listener. The listener identifies the route between a target group and a load balancer. This is an array of strings with a maximum size of one. 
    */
  var listenerArns: js.UndefOr[ListenerArnList] = js.native
}
object TrafficRoute {
  
  @scala.inline
  def apply(): TrafficRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficRoute]
  }
  
  @scala.inline
  implicit class TrafficRouteOps[Self <: TrafficRoute] (val x: Self) extends AnyVal {
    
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
    def setListenerArnsVarargs(value: ListenerArn*): Self = this.set("listenerArns", js.Array(value :_*))
    
    @scala.inline
    def setListenerArns(value: ListenerArnList): Self = this.set("listenerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListenerArns: Self = this.set("listenerArns", js.undefined)
  }
}
