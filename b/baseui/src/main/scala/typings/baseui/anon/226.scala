package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign670
import typings.baseui.baseuiStrings.TL
import typings.baseui.baseuiStrings.`Timor-Leste`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `226` extends StObject {
  
  val dialCode: Plussign670
  
  val id: TL
  
  val label: `Timor-Leste`
}
object `226` {
  
  inline def apply(): `226` = {
    val __obj = js.Dynamic.literal(dialCode = "+670", id = "TL", label = "Timor-Leste")
    __obj.asInstanceOf[`226`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `226`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign670): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Timor-Leste`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
