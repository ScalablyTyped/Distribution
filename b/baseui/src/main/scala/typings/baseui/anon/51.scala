package typings.baseui.anon

import typings.baseui.baseuiStrings.CF
import typings.baseui.baseuiStrings.Plussign236
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51` extends StObject {
  
  val dialCode: Plussign236
  
  val id: CF
  
  val label: /* Central African Republic (République centrafricaine) */ String
}
object `51` {
  
  inline def apply(): `51` = {
    val __obj = js.Dynamic.literal(dialCode = "+236", id = "CF", label = "Central African Republic (R\u00E9publique centrafricaine)")
    __obj.asInstanceOf[`51`]
  }
  
  extension [Self <: `51`](x: Self) {
    
    inline def setDialCode(value: Plussign236): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Central African Republic (République centrafricaine) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
