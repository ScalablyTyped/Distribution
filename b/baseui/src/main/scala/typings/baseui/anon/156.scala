package typings.baseui.anon

import typings.baseui.baseuiStrings.ME
import typings.baseui.baseuiStrings.Plussign382
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `156` extends StObject {
  
  val dialCode: Plussign382
  
  val id: ME
  
  val label: String
}
object `156` {
  
  inline def apply(): `156` = {
    val __obj = js.Dynamic.literal(dialCode = "+382", id = "ME", label = "Montenegro (Crna Gora)")
    __obj.asInstanceOf[`156`]
  }
  
  extension [Self <: `156`](x: Self) {
    
    inline def setDialCode(value: Plussign382): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ME): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
