package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-background-gray`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `204` extends StObject {
  
  var name: `tag-background-gray`
  
  var `type`: color
}
object `204` {
  
  inline def apply(): `204` = {
    val __obj = js.Dynamic.literal(name = "tag-background-gray")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`204`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `204`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `tag-background-gray`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
