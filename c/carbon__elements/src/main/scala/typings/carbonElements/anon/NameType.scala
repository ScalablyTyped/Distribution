package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`background-selected`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameType extends StObject {
  
  var name: `background-selected`
  
  var `type`: color
}
object NameType {
  
  inline def apply(): NameType = {
    val __obj = js.Dynamic.literal(name = "background-selected")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[NameType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameType] (val x: Self) extends AnyVal {
    
    inline def setName(value: `background-selected`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
