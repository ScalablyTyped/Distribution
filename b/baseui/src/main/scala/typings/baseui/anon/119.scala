package typings.baseui.anon

import typings.baseui.baseuiStrings.JO
import typings.baseui.baseuiStrings.Plussign962
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `119` extends StObject {
  
  val dialCode: Plussign962
  
  val id: JO
  
  val label: /* Jordan (‫الأردن‬‎) */ String
}
object `119` {
  
  inline def apply(): `119` = {
    val __obj = js.Dynamic.literal(dialCode = "+962", id = "JO", label = "Jordan (\u202B\u0627\u0644\u0623\u0631\u062F\u0646\u202C\u200E)")
    __obj.asInstanceOf[`119`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `119`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign962): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: JO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Jordan (‫الأردن‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
