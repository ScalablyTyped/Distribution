package typings.baseui.anon

import typings.baseui.baseuiStrings.MR
import typings.baseui.baseuiStrings.Plussign222
import typings.baseui.baseuiStrings.`Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `148` extends StObject {
  
  val dialCode: Plussign222
  
  val id: MR
  
  val label: `Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis`
}
object `148` {
  
  inline def apply(): `148` = {
    val __obj = js.Dynamic.literal(dialCode = "+222", id = "MR", label = "Mauritania (\u202B\u0645\u0648\u0631\u064A\u062A\u0627\u0646\u064A\u0627\u202C\u200E)")
    __obj.asInstanceOf[`148`]
  }
  
  extension [Self <: `148`](x: Self) {
    
    inline def setDialCode(value: Plussign222): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
