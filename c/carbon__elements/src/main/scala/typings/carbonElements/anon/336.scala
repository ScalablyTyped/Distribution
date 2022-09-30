package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.color
import typings.carbonElements.carbonElementsStrings.danger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `336` extends StObject {
  
  var name: danger
  
  var `type`: color
}
object `336` {
  
  inline def apply(): `336` = {
    val __obj = js.Dynamic.literal(name = "danger")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`336`]
  }
  
  extension [Self <: `336`](x: Self) {
    
    inline def setName(value: danger): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
