package typings.baseui.anon

import typings.baseui.baseuiStrings.IL
import typings.baseui.baseuiStrings.Plussign972
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `117` extends StObject {
  
  val dialCode: Plussign972
  
  val id: IL
  
  val label: String
}
object `117` {
  
  inline def apply(): `117` = {
    val __obj = js.Dynamic.literal(dialCode = "+972", id = "IL", label = "Israel (\u202B\u05D9\u05E9\u05E8\u05D0\u05DC\u202C\u200E)")
    __obj.asInstanceOf[`117`]
  }
  
  extension [Self <: `117`](x: Self) {
    
    inline def setDialCode(value: Plussign972): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
