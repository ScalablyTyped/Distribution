package typings.baseui.anon

import typings.baseui.baseuiStrings.PK
import typings.baseui.baseuiStrings.Plussign92
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `173` extends StObject {
  
  val dialCode: Plussign92
  
  val id: PK
  
  val label: /* Pakistan (‫پاکستان‬‎) */ String
}
object `173` {
  
  inline def apply(): `173` = {
    val __obj = js.Dynamic.literal(dialCode = "+92", id = "PK", label = "Pakistan (\u202B\u067E\u0627\u06A9\u0633\u062A\u0627\u0646\u202C\u200E)")
    __obj.asInstanceOf[`173`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `173`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign92): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Pakistan (‫پاکستان‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
