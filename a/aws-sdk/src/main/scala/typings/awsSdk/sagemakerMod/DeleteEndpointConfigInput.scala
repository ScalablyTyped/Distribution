package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointConfigInput extends StObject {
  
  /**
    * The name of the endpoint configuration that you want to delete.
    */
  var EndpointConfigName: typings.awsSdk.sagemakerMod.EndpointConfigName
}
object DeleteEndpointConfigInput {
  
  inline def apply(EndpointConfigName: EndpointConfigName): DeleteEndpointConfigInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointConfigInput]
  }
  
  extension [Self <: DeleteEndpointConfigInput](x: Self) {
    
    inline def setEndpointConfigName(value: EndpointConfigName): Self = StObject.set(x, "EndpointConfigName", value.asInstanceOf[js.Any])
  }
}
