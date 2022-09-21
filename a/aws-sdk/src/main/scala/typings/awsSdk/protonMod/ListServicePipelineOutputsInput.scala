package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServicePipelineOutputsInput extends StObject {
  
  /**
    * A token that indicates the location of the next output in the array of outputs, after the list of outputs that was previously requested.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
  
  /**
    * The name of the service whose pipeline's outputs you want.
    */
  var serviceName: ResourceName
}
object ListServicePipelineOutputsInput {
  
  inline def apply(serviceName: ResourceName): ListServicePipelineOutputsInput = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServicePipelineOutputsInput]
  }
  
  extension [Self <: ListServicePipelineOutputsInput](x: Self) {
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
