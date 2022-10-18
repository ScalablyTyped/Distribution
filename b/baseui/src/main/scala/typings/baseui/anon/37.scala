package typings.baseui.anon

import typings.baseui.baseuiStrings.BA
import typings.baseui.baseuiStrings.Plussign387
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  val dialCode: Plussign387
  
  val id: BA
  
  val label: /* Bosnia and Herzegovina (Босна и Херцеговина) */ String
}
object `37` {
  
  inline def apply(): `37` = {
    val __obj = js.Dynamic.literal(dialCode = "+387", id = "BA", label = "Bosnia and Herzegovina (\u0411\u043E\u0441\u043D\u0430 \u0438 \u0425\u0435\u0440\u0446\u0435\u0433\u043E\u0432\u0438\u043D\u0430)")
    __obj.asInstanceOf[`37`]
  }
  
  extension [Self <: `37`](x: Self) {
    
    inline def setDialCode(value: Plussign387): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Bosnia and Herzegovina (Босна и Херцеговина) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
