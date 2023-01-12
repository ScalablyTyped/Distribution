package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign228
import typings.baseui.baseuiStrings.TG
import typings.baseui.baseuiStrings.Togo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `227` extends StObject {
  
  val dialCode: Plussign228
  
  val id: TG
  
  val label: Togo
}
object `227` {
  
  inline def apply(): `227` = {
    val __obj = js.Dynamic.literal(dialCode = "+228", id = "TG", label = "Togo")
    __obj.asInstanceOf[`227`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `227`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign228): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Togo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
