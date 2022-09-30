package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.background
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: background
  
  var `type`: color
}
object Name {
  
  inline def apply(): Name = {
    val __obj = js.Dynamic.literal(name = "background")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: background): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
