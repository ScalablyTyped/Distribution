package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`icon-secondary`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `120` extends StObject {
  
  var name: `icon-secondary`
  
  var `type`: color
}
object `120` {
  
  inline def apply(): `120` = {
    val __obj = js.Dynamic.literal(name = "icon-secondary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`120`]
  }
  
  extension [Self <: `120`](x: Self) {
    
    inline def setName(value: `icon-secondary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
