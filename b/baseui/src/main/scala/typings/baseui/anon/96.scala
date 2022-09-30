package typings.baseui.anon

import typings.baseui.baseuiStrings.GR
import typings.baseui.baseuiStrings.Plussign30
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `96` extends StObject {
  
  val dialCode: Plussign30
  
  val id: GR
  
  val label: String
}
object `96` {
  
  inline def apply(): `96` = {
    val __obj = js.Dynamic.literal(dialCode = "+30", id = "GR", label = "Greece (\u0395\u03BB\u03BB\u03AC\u03B4\u03B1)")
    __obj.asInstanceOf[`96`]
  }
  
  extension [Self <: `96`](x: Self) {
    
    inline def setDialCode(value: Plussign30): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
