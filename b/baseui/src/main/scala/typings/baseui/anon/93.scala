package typings.baseui.anon

import typings.baseui.baseuiStrings.GR
import typings.baseui.baseuiStrings.Plussign30
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `93` extends StObject {
  
  val dialCode: Plussign30
  
  val id: GR
  
  val label: /* Greece (Ελλάδα) */ String
}
object `93` {
  
  inline def apply(): `93` = {
    val __obj = js.Dynamic.literal(dialCode = "+30", id = "GR", label = "Greece (\u0395\u03BB\u03BB\u03AC\u03B4\u03B1)")
    __obj.asInstanceOf[`93`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `93`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign30): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Greece (Ελλάδα) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
