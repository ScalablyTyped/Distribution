package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`link-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `290` extends StObject {
  
  var name: `link-02`
  
  var `type`: color
}
object `290` {
  
  inline def apply(): `290` = {
    val __obj = js.Dynamic.literal(name = "link-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`290`]
  }
  
  extension [Self <: `290`](x: Self) {
    
    inline def setName(value: `link-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
