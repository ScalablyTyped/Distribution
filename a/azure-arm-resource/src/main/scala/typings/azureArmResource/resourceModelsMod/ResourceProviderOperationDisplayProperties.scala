package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceProviderOperationDisplayProperties extends StObject {
  
  /**
    * Operation description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Resource provider operation.
    */
  var operation: js.UndefOr[String] = js.undefined
  
  /**
    * Operation provider.
    */
  var provider: js.UndefOr[String] = js.undefined
  
  /**
    * Operation description.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * Operation resource.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ResourceProviderOperationDisplayProperties {
  
  inline def apply(): ResourceProviderOperationDisplayProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceProviderOperationDisplayProperties]
  }
  
  extension [Self <: ResourceProviderOperationDisplayProperties](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
