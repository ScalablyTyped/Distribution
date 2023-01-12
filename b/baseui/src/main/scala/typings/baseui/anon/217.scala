package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign47
import typings.baseui.baseuiStrings.SJ
import typings.baseui.baseuiStrings.`Svalbard and Jan Mayen`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `217` extends StObject {
  
  val dialCode: Plussign47
  
  val id: SJ
  
  val label: `Svalbard and Jan Mayen`
}
object `217` {
  
  inline def apply(): `217` = {
    val __obj = js.Dynamic.literal(dialCode = "+47", id = "SJ", label = "Svalbard and Jan Mayen")
    __obj.asInstanceOf[`217`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `217`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign47): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Svalbard and Jan Mayen`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
