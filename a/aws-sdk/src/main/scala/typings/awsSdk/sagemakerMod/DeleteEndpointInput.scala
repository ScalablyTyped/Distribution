package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointInput extends StObject {
  
  /**
    * The name of the endpoint that you want to delete.
    */
  var EndpointName: typings.awsSdk.sagemakerMod.EndpointName
}
object DeleteEndpointInput {
  
  inline def apply(EndpointName: EndpointName): DeleteEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointInput]
  }
  
  extension [Self <: DeleteEndpointInput](x: Self) {
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
  }
}
