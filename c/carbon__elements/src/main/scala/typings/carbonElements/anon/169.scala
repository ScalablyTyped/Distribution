package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`button-primary-hover`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `169` extends StObject {
  
  var name: `button-primary-hover`
  
  var `type`: color
}
object `169` {
  
  inline def apply(): `169` = {
    val __obj = js.Dynamic.literal(name = "button-primary-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`169`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `169`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `button-primary-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
