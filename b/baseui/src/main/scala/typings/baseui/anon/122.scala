package typings.baseui.anon

import typings.baseui.baseuiStrings.JO
import typings.baseui.baseuiStrings.Plussign962
import typings.baseui.baseuiStrings.`Jordan Leftparenthesis‫الأردن‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `122` extends StObject {
  
  val dialCode: Plussign962
  
  val id: JO
  
  val label: `Jordan Leftparenthesis‫الأردن‬‎Rightparenthesis`
}
object `122` {
  
  inline def apply(): `122` = {
    val __obj = js.Dynamic.literal(dialCode = "+962", id = "JO", label = "Jordan (\u202B\u0627\u0644\u0623\u0631\u062F\u0646\u202C\u200E)")
    __obj.asInstanceOf[`122`]
  }
  
  extension [Self <: `122`](x: Self) {
    
    inline def setDialCode(value: Plussign962): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: JO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Jordan Leftparenthesis‫الأردن‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
