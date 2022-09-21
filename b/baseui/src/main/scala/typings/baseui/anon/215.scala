package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign211
import typings.baseui.baseuiStrings.SS
import typings.baseui.baseuiStrings.`South Sudan Leftparenthesis‫جنوب السودان‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `215` extends StObject {
  
  val dialCode: Plussign211
  
  val id: SS
  
  val label: `South Sudan Leftparenthesis‫جنوب السودان‬‎Rightparenthesis`
}
object `215` {
  
  inline def apply(): `215` = {
    val __obj = js.Dynamic.literal(dialCode = "+211", id = "SS", label = "South Sudan (\u202B\u062C\u0646\u0648\u0628 \u0627\u0644\u0633\u0648\u062F\u0627\u0646\u202C\u200E)")
    __obj.asInstanceOf[`215`]
  }
  
  extension [Self <: `215`](x: Self) {
    
    inline def setDialCode(value: Plussign211): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `South Sudan Leftparenthesis‫جنوب السودان‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
