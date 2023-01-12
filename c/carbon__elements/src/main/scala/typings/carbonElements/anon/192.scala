package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-background-blue`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `192` extends StObject {
  
  var name: `tag-background-blue`
  
  var `type`: color
}
object `192` {
  
  inline def apply(): `192` = {
    val __obj = js.Dynamic.literal(name = "tag-background-blue")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`192`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `192`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `tag-background-blue`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
