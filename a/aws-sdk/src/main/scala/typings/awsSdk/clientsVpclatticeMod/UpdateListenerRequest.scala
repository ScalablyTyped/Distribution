package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateListenerRequest extends StObject {
  
  /**
    * The action for the default rule.
    */
  var defaultAction: RuleAction
  
  /**
    * The ID or Amazon Resource Name (ARN) of the listener.
    */
  var listenerIdentifier: ListenerIdentifier
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service.
    */
  var serviceIdentifier: ServiceIdentifier
}
object UpdateListenerRequest {
  
  inline def apply(
    defaultAction: RuleAction,
    listenerIdentifier: ListenerIdentifier,
    serviceIdentifier: ServiceIdentifier
  ): UpdateListenerRequest = {
    val __obj = js.Dynamic.literal(defaultAction = defaultAction.asInstanceOf[js.Any], listenerIdentifier = listenerIdentifier.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateListenerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateListenerRequest] (val x: Self) extends AnyVal {
    
    inline def setDefaultAction(value: RuleAction): Self = StObject.set(x, "defaultAction", value.asInstanceOf[js.Any])
    
    inline def setListenerIdentifier(value: ListenerIdentifier): Self = StObject.set(x, "listenerIdentifier", value.asInstanceOf[js.Any])
    
    inline def setServiceIdentifier(value: ServiceIdentifier): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
  }
}
