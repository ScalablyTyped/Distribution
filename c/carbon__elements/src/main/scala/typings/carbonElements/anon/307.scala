package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`active-primary`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `307` extends StObject {
  
  var name: `active-primary`
  
  var `type`: color
}
object `307` {
  
  inline def apply(): `307` = {
    val __obj = js.Dynamic.literal(name = "active-primary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`307`]
  }
  
  extension [Self <: `307`](x: Self) {
    
    inline def setName(value: `active-primary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
