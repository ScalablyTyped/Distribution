package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelExplainabilityJobInput extends StObject {
  
  var EndpointInput: typings.awsSdk.sagemakerMod.EndpointInput
}
object ModelExplainabilityJobInput {
  
  inline def apply(EndpointInput: EndpointInput): ModelExplainabilityJobInput = {
    val __obj = js.Dynamic.literal(EndpointInput = EndpointInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelExplainabilityJobInput]
  }
  
  extension [Self <: ModelExplainabilityJobInput](x: Self) {
    
    inline def setEndpointInput(value: EndpointInput): Self = StObject.set(x, "EndpointInput", value.asInstanceOf[js.Any])
  }
}
