package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dependency extends StObject {
  
  /**
    * The list of dependencies.
    */
  var dependsOn: js.UndefOr[js.Array[BasicDependency]] = js.undefined
  
  /**
    * The ID of the dependency.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The dependency resource name.
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The dependency resource type.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}
object Dependency {
  
  inline def apply(): Dependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dependency]
  }
  
  extension [Self <: Dependency](x: Self) {
    
    inline def setDependsOn(value: js.Array[BasicDependency]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    inline def setDependsOnVarargs(value: BasicDependency*): Self = StObject.set(x, "dependsOn", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
