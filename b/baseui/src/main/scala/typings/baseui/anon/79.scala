package typings.baseui.anon

import typings.baseui.baseuiStrings.ET
import typings.baseui.baseuiStrings.Ethiopia
import typings.baseui.baseuiStrings.Plussign251
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `79` extends StObject {
  
  val dialCode: Plussign251
  
  val id: ET
  
  val label: Ethiopia
}
object `79` {
  
  inline def apply(): `79` = {
    val __obj = js.Dynamic.literal(dialCode = "+251", id = "ET", label = "Ethiopia")
    __obj.asInstanceOf[`79`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `79`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign251): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ET): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Ethiopia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
