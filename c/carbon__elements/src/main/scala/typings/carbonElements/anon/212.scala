package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-hover-warm-gray`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `212` extends StObject {
  
  var name: `tag-hover-warm-gray`
  
  var `type`: color
}
object `212` {
  
  inline def apply(): `212` = {
    val __obj = js.Dynamic.literal(name = "tag-hover-warm-gray")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`212`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `212`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `tag-hover-warm-gray`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
