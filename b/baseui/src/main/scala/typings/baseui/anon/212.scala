package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign211
import typings.baseui.baseuiStrings.SS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `212` extends StObject {
  
  val dialCode: Plussign211
  
  val id: SS
  
  val label: /* South Sudan (‫جنوب السودان‬‎) */ String
}
object `212` {
  
  inline def apply(): `212` = {
    val __obj = js.Dynamic.literal(dialCode = "+211", id = "SS", label = "South Sudan (\u202B\u062C\u0646\u0648\u0628 \u0627\u0644\u0633\u0648\u062F\u0627\u0646\u202C\u200E)")
    __obj.asInstanceOf[`212`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `212`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign211): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* South Sudan (‫جنوب السودان‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
