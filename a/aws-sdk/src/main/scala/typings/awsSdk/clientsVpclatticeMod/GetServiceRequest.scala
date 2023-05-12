package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service.
    */
  var serviceIdentifier: ServiceIdentifier
}
object GetServiceRequest {
  
  inline def apply(serviceIdentifier: ServiceIdentifier): GetServiceRequest = {
    val __obj = js.Dynamic.literal(serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceRequest] (val x: Self) extends AnyVal {
    
    inline def setServiceIdentifier(value: ServiceIdentifier): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
  }
}
