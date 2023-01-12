package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`hover-field`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `335` extends StObject {
  
  var name: `hover-field`
  
  var `type`: color
}
object `335` {
  
  inline def apply(): `335` = {
    val __obj = js.Dynamic.literal(name = "hover-field")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`335`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `335`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `hover-field`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
