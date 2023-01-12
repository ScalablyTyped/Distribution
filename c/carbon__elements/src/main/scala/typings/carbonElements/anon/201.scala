package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-background-green`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201` extends StObject {
  
  var name: `tag-background-green`
  
  var `type`: color
}
object `201` {
  
  inline def apply(): `201` = {
    val __obj = js.Dynamic.literal(name = "tag-background-green")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`201`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `tag-background-green`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
