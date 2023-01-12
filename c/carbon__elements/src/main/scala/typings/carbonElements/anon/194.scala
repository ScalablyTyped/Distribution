package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-hover-blue`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `194` extends StObject {
  
  var name: `tag-hover-blue`
  
  var `type`: color
}
object `194` {
  
  inline def apply(): `194` = {
    val __obj = js.Dynamic.literal(name = "tag-hover-blue")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`194`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `194`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `tag-hover-blue`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
