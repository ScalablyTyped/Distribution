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
  
  @scala.inline
  def apply(): Dependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dependency]
  }
  
  @scala.inline
  implicit class DependencyMutableBuilder[Self <: Dependency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependsOn(value: js.Array[BasicDependency]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    @scala.inline
    def setDependsOnVarargs(value: BasicDependency*): Self = StObject.set(x, "dependsOn", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
