package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`background-active`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var name: `background-active`
  
  var `type`: color
}
object Type {
  
  inline def apply(): Type = {
    val __obj = js.Dynamic.literal(name = "background-active")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setName(value: `background-active`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
