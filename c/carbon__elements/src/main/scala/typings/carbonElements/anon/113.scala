package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`link-primary-hover`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  var name: `link-primary-hover`
  
  var `type`: color
}
object `113` {
  
  inline def apply(): `113` = {
    val __obj = js.Dynamic.literal(name = "link-primary-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`113`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `113`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `link-primary-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
