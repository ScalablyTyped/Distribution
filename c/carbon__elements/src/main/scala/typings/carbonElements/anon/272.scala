package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`interactive-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `272` extends StObject {
  
  var name: `interactive-02`
  
  var `type`: color
}
object `272` {
  
  inline def apply(): `272` = {
    val __obj = js.Dynamic.literal(name = "interactive-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`272`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `272`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `interactive-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
