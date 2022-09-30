package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`border-subtle-selected`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `156` extends StObject {
  
  var name: `border-subtle-selected`
  
  var `type`: color
}
object `156` {
  
  inline def apply(): `156` = {
    val __obj = js.Dynamic.literal(name = "border-subtle-selected")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`156`]
  }
  
  extension [Self <: `156`](x: Self) {
    
    inline def setName(value: `border-subtle-selected`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
