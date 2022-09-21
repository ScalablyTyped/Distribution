package typings.vegaLite8ozrbXDH.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: String
  
  var role: String
  
  var title: Align | Anchor | Angle | Aria | Baseline | Color
  
  var `type`: String
}
object Name {
  
  inline def apply(
    name: String,
    role: String,
    title: Align | Anchor | Angle | Aria | Baseline | Color,
    `type`: String
  ): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Align | Anchor | Angle | Aria | Baseline | Color): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
