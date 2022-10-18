package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cypress spec.
  */
trait Spec extends StObject {
  
  // "cypress/integration/config_passing_spec.js" or "__all" if clicked all specs button
  var absolute: String
  
  var name: String
  
  // "config_passing_spec.js"
  var relative: String
  
  // "/Users/janelane/app/cypress/integration/config_passing_spec.js"
  var specFilter: js.UndefOr[String] = js.undefined
  
  // optional spec filter used by the user
  var specType: js.UndefOr[CypressSpecType] = js.undefined
}
object Spec {
  
  inline def apply(absolute: String, name: String, relative: String): Spec = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spec]
  }
  
  extension [Self <: Spec](x: Self) {
    
    inline def setAbsolute(value: String): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setSpecFilter(value: String): Self = StObject.set(x, "specFilter", value.asInstanceOf[js.Any])
    
    inline def setSpecFilterUndefined: Self = StObject.set(x, "specFilter", js.undefined)
    
    inline def setSpecType(value: CypressSpecType): Self = StObject.set(x, "specType", value.asInstanceOf[js.Any])
    
    inline def setSpecTypeUndefined: Self = StObject.set(x, "specType", js.undefined)
  }
}
