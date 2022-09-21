package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomRoutingListenerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the listener to delete.
    */
  var ListenerArn: GenericString
}
object DeleteCustomRoutingListenerRequest {
  
  inline def apply(ListenerArn: GenericString): DeleteCustomRoutingListenerRequest = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomRoutingListenerRequest]
  }
  
  extension [Self <: DeleteCustomRoutingListenerRequest](x: Self) {
    
    inline def setListenerArn(value: GenericString): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
  }
}
