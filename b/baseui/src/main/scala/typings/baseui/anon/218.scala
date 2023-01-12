package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign268
import typings.baseui.baseuiStrings.SZ
import typings.baseui.baseuiStrings.Swaziland
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `218` extends StObject {
  
  val dialCode: Plussign268
  
  val id: SZ
  
  val label: Swaziland
}
object `218` {
  
  inline def apply(): `218` = {
    val __obj = js.Dynamic.literal(dialCode = "+268", id = "SZ", label = "Swaziland")
    __obj.asInstanceOf[`218`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `218`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign268): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Swaziland): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
