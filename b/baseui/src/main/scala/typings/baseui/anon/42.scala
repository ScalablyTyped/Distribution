package typings.baseui.anon

import typings.baseui.baseuiStrings.BR
import typings.baseui.baseuiStrings.Plussign55
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42` extends StObject {
  
  val dialCode: Plussign55
  
  val id: BR
  
  val label: String
}
object `42` {
  
  inline def apply(): `42` = {
    val __obj = js.Dynamic.literal(dialCode = "+55", id = "BR", label = "Brazil (Brasil)")
    __obj.asInstanceOf[`42`]
  }
  
  extension [Self <: `42`](x: Self) {
    
    inline def setDialCode(value: Plussign55): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
