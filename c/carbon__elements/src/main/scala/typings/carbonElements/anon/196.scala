package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-color-cyan`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `196` extends StObject {
  
  var name: `tag-color-cyan`
  
  var `type`: color
}
object `196` {
  
  inline def apply(): `196` = {
    val __obj = js.Dynamic.literal(name = "tag-color-cyan")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`196`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `196`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `tag-color-cyan`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
