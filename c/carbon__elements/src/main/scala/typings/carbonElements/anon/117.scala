package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`link-inverse-active`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `117` extends StObject {
  
  var name: `link-inverse-active`
  
  var `type`: color
}
object `117` {
  
  inline def apply(): `117` = {
    val __obj = js.Dynamic.literal(name = "link-inverse-active")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`117`]
  }
  
  extension [Self <: `117`](x: Self) {
    
    inline def setName(value: `link-inverse-active`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
