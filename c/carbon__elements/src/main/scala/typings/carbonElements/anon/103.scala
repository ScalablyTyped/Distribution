package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`text-primary`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `103` extends StObject {
  
  var name: `text-primary`
  
  var `type`: color
}
object `103` {
  
  inline def apply(): `103` = {
    val __obj = js.Dynamic.literal(name = "text-primary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`103`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `103`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `text-primary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
