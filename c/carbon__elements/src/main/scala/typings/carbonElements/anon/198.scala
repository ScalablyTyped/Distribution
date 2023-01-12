package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-background-teal`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `198` extends StObject {
  
  var name: `tag-background-teal`
  
  var `type`: color
}
object `198` {
  
  inline def apply(): `198` = {
    val __obj = js.Dynamic.literal(name = "tag-background-teal")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`198`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `198`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `tag-background-teal`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
