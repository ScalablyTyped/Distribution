package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `57` extends StObject {
  
  var name: `layer-02`
  
  var `type`: color
}
object `57` {
  
  inline def apply(): `57` = {
    val __obj = js.Dynamic.literal(name = "layer-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`57`]
  }
  
  extension [Self <: `57`](x: Self) {
    
    inline def setName(value: `layer-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
