package typings.baseui.anon

import typings.baseui.baseuiStrings.IO
import typings.baseui.baseuiStrings.Plussign246
import typings.baseui.baseuiStrings.`British Indian Ocean Territory`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  val dialCode: Plussign246
  
  val id: IO
  
  val label: `British Indian Ocean Territory`
}
object `40` {
  
  inline def apply(): `40` = {
    val __obj = js.Dynamic.literal(dialCode = "+246", id = "IO", label = "British Indian Ocean Territory")
    __obj.asInstanceOf[`40`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `40`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign246): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `British Indian Ocean Territory`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
