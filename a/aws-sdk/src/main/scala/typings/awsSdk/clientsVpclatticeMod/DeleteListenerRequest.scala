package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteListenerRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the listener.
    */
  var listenerIdentifier: ListenerIdentifier
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service.
    */
  var serviceIdentifier: ServiceIdentifier
}
object DeleteListenerRequest {
  
  inline def apply(listenerIdentifier: ListenerIdentifier, serviceIdentifier: ServiceIdentifier): DeleteListenerRequest = {
    val __obj = js.Dynamic.literal(listenerIdentifier = listenerIdentifier.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteListenerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteListenerRequest] (val x: Self) extends AnyVal {
    
    inline def setListenerIdentifier(value: ListenerIdentifier): Self = StObject.set(x, "listenerIdentifier", value.asInstanceOf[js.Any])
    
    inline def setServiceIdentifier(value: ServiceIdentifier): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
  }
}
