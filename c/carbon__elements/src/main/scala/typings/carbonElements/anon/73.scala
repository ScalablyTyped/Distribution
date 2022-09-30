package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-accent-hover-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `73` extends StObject {
  
  var name: `layer-accent-hover-01`
  
  var `type`: color
}
object `73` {
  
  inline def apply(): `73` = {
    val __obj = js.Dynamic.literal(name = "layer-accent-hover-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`73`]
  }
  
  extension [Self <: `73`](x: Self) {
    
    inline def setName(value: `layer-accent-hover-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
