package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependencyToInstall extends StObject {
  
  var dependency: CypressComponentDependency
  
  var detectedVersion: String | Null
  
  var satisfied: Boolean
}
object DependencyToInstall {
  
  inline def apply(dependency: CypressComponentDependency, satisfied: Boolean): DependencyToInstall = {
    val __obj = js.Dynamic.literal(dependency = dependency.asInstanceOf[js.Any], satisfied = satisfied.asInstanceOf[js.Any], detectedVersion = null)
    __obj.asInstanceOf[DependencyToInstall]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DependencyToInstall] (val x: Self) extends AnyVal {
    
    inline def setDependency(value: CypressComponentDependency): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDetectedVersion(value: String): Self = StObject.set(x, "detectedVersion", value.asInstanceOf[js.Any])
    
    inline def setDetectedVersionNull: Self = StObject.set(x, "detectedVersion", null)
    
    inline def setSatisfied(value: Boolean): Self = StObject.set(x, "satisfied", value.asInstanceOf[js.Any])
  }
}
