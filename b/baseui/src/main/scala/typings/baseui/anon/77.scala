package typings.baseui.anon

import typings.baseui.baseuiStrings.EG
import typings.baseui.baseuiStrings.Plussign20
import typings.baseui.baseuiStrings.`Egypt Leftparenthesis‫مصر‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77` extends StObject {
  
  val dialCode: Plussign20
  
  val id: EG
  
  val label: `Egypt Leftparenthesis‫مصر‬‎Rightparenthesis`
}
object `77` {
  
  inline def apply(): `77` = {
    val __obj = js.Dynamic.literal(dialCode = "+20", id = "EG", label = "Egypt (\u202B\u0645\u0635\u0631\u202C\u200E)")
    __obj.asInstanceOf[`77`]
  }
  
  extension [Self <: `77`](x: Self) {
    
    inline def setDialCode(value: Plussign20): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: EG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Egypt Leftparenthesis‫مصر‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
