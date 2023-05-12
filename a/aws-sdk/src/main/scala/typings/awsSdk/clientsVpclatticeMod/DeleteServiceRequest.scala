package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service.
    */
  var serviceIdentifier: ServiceIdentifier
}
object DeleteServiceRequest {
  
  inline def apply(serviceIdentifier: ServiceIdentifier): DeleteServiceRequest = {
    val __obj = js.Dynamic.literal(serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceRequest] (val x: Self) extends AnyVal {
    
    inline def setServiceIdentifier(value: ServiceIdentifier): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
  }
}
