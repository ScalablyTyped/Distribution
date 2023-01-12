package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-accent-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `74` extends StObject {
  
  var name: `layer-accent-02`
  
  var `type`: color
}
object `74` {
  
  inline def apply(): `74` = {
    val __obj = js.Dynamic.literal(name = "layer-accent-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`74`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `74`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `layer-accent-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
