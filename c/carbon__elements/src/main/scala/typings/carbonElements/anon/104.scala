package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`text-secondary`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104` extends StObject {
  
  var name: `text-secondary`
  
  var `type`: color
}
object `104` {
  
  inline def apply(): `104` = {
    val __obj = js.Dynamic.literal(name = "text-secondary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`104`]
  }
  
  extension [Self <: `104`](x: Self) {
    
    inline def setName(value: `text-secondary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
