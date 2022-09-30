package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`text-placeholder`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `105` extends StObject {
  
  var name: `text-placeholder`
  
  var `type`: color
}
object `105` {
  
  inline def apply(): `105` = {
    val __obj = js.Dynamic.literal(name = "text-placeholder")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`105`]
  }
  
  extension [Self <: `105`](x: Self) {
    
    inline def setName(value: `text-placeholder`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
