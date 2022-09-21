package typings.tslintXANLscI2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesOverloads extends StObject {
  
  var properties: Overloads
  
  var `type`: String
}
object PropertiesOverloads {
  
  inline def apply(properties: Overloads, `type`: String): PropertiesOverloads = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesOverloads]
  }
  
  extension [Self <: PropertiesOverloads](x: Self) {
    
    inline def setProperties(value: Overloads): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
