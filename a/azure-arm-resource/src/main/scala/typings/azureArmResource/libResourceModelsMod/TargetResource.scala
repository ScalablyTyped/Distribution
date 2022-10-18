package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetResource extends StObject {
  
  /**
    * The ID of the resource.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the resource.
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the resource.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}
object TargetResource {
  
  inline def apply(): TargetResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetResource]
  }
  
  extension [Self <: TargetResource](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
