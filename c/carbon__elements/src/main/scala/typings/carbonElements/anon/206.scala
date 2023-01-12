package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-hover-gray`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `206` extends StObject {
  
  var name: `tag-hover-gray`
  
  var `type`: color
}
object `206` {
  
  inline def apply(): `206` = {
    val __obj = js.Dynamic.literal(name = "tag-hover-gray")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`206`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `206`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `tag-hover-gray`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
