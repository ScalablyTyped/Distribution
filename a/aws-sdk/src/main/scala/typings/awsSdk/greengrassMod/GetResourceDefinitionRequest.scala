package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceDefinitionRequest extends StObject {
  
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: string
}
object GetResourceDefinitionRequest {
  
  inline def apply(ResourceDefinitionId: string): GetResourceDefinitionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceDefinitionRequest]
  }
  
  extension [Self <: GetResourceDefinitionRequest](x: Self) {
    
    inline def setResourceDefinitionId(value: string): Self = StObject.set(x, "ResourceDefinitionId", value.asInstanceOf[js.Any])
  }
}
