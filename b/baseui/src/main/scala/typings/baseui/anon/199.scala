package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign966
import typings.baseui.baseuiStrings.SA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `199` extends StObject {
  
  val dialCode: Plussign966
  
  val id: SA
  
  val label: /* Saudi Arabia (‫المملكة العربية السعودية‬‎) */ String
}
object `199` {
  
  inline def apply(): `199` = {
    val __obj = js.Dynamic.literal(dialCode = "+966", id = "SA", label = "Saudi Arabia (\u202B\u0627\u0644\u0645\u0645\u0644\u0643\u0629 \u0627\u0644\u0639\u0631\u0628\u064A\u0629 \u0627\u0644\u0633\u0639\u0648\u062F\u064A\u0629\u202C\u200E)")
    __obj.asInstanceOf[`199`]
  }
  
  extension [Self <: `199`](x: Self) {
    
    inline def setDialCode(value: Plussign966): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Saudi Arabia (‫المملكة العربية السعودية‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
