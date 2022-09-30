package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-accent-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `71` extends StObject {
  
  var name: `layer-accent-01`
  
  var `type`: color
}
object `71` {
  
  inline def apply(): `71` = {
    val __obj = js.Dynamic.literal(name = "layer-accent-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`71`]
  }
  
  extension [Self <: `71`](x: Self) {
    
    inline def setName(value: `layer-accent-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
