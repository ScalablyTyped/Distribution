package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-background-cyan`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `195` extends StObject {
  
  var name: `tag-background-cyan`
  
  var `type`: color
}
object `195` {
  
  inline def apply(): `195` = {
    val __obj = js.Dynamic.literal(name = "tag-background-cyan")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`195`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `195`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `tag-background-cyan`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
