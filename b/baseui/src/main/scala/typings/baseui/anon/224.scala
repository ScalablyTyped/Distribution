package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign963
import typings.baseui.baseuiStrings.SY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `224` extends StObject {
  
  val dialCode: Plussign963
  
  val id: SY
  
  val label: String
}
object `224` {
  
  inline def apply(): `224` = {
    val __obj = js.Dynamic.literal(dialCode = "+963", id = "SY", label = "Syria (\u202B\u0633\u0648\u0631\u064A\u0627\u202C\u200E)")
    __obj.asInstanceOf[`224`]
  }
  
  extension [Self <: `224`](x: Self) {
    
    inline def setDialCode(value: Plussign963): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
