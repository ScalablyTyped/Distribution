package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`hover-primary-text`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `308` extends StObject {
  
  var name: `hover-primary-text`
  
  var `type`: color
}
object `308` {
  
  inline def apply(): `308` = {
    val __obj = js.Dynamic.literal(name = "hover-primary-text")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`308`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `308`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `hover-primary-text`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
