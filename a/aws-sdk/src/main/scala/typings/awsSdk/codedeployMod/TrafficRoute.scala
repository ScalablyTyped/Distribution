package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficRoute extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of one listener. The listener identifies the route between a target group and a load balancer. This is an array of strings with a maximum size of one. 
    */
  var listenerArns: js.UndefOr[ListenerArnList] = js.undefined
}
object TrafficRoute {
  
  inline def apply(): TrafficRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficRoute]
  }
  
  extension [Self <: TrafficRoute](x: Self) {
    
    inline def setListenerArns(value: ListenerArnList): Self = StObject.set(x, "listenerArns", value.asInstanceOf[js.Any])
    
    inline def setListenerArnsUndefined: Self = StObject.set(x, "listenerArns", js.undefined)
    
    inline def setListenerArnsVarargs(value: ListenerArn*): Self = StObject.set(x, "listenerArns", js.Array(value*))
  }
}
