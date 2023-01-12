package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-color-teal`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `199` extends StObject {
  
  var name: `tag-color-teal`
  
  var `type`: color
}
object `199` {
  
  inline def apply(): `199` = {
    val __obj = js.Dynamic.literal(name = "tag-color-teal")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`199`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `199`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `tag-color-teal`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
