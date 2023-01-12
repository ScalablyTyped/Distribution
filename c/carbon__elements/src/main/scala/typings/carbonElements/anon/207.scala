package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-background-cool-gray`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `207` extends StObject {
  
  var name: `tag-background-cool-gray`
  
  var `type`: color
}
object `207` {
  
  inline def apply(): `207` = {
    val __obj = js.Dynamic.literal(name = "tag-background-cool-gray")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`207`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `207`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `tag-background-cool-gray`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
