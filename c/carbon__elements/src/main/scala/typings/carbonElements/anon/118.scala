package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`link-inverse-hover`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `118` extends StObject {
  
  var name: `link-inverse-hover`
  
  var `type`: color
}
object `118` {
  
  inline def apply(): `118` = {
    val __obj = js.Dynamic.literal(name = "link-inverse-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`118`]
  }
  
  extension [Self <: `118`](x: Self) {
    
    inline def setName(value: `link-inverse-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
