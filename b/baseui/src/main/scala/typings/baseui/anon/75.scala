package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign503
import typings.baseui.baseuiStrings.SV
import typings.baseui.baseuiStrings.`El Salvador`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `75` extends StObject {
  
  val dialCode: Plussign503
  
  val id: SV
  
  val label: `El Salvador`
}
object `75` {
  
  inline def apply(): `75` = {
    val __obj = js.Dynamic.literal(dialCode = "+503", id = "SV", label = "El Salvador")
    __obj.asInstanceOf[`75`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `75`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign503): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `El Salvador`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
