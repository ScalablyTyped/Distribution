package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign252
import typings.baseui.baseuiStrings.SO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `209` extends StObject {
  
  val dialCode: Plussign252
  
  val id: SO
  
  val label: /* Somalia (Soomaaliya) */ String
}
object `209` {
  
  inline def apply(): `209` = {
    val __obj = js.Dynamic.literal(dialCode = "+252", id = "SO", label = "Somalia (Soomaaliya)")
    __obj.asInstanceOf[`209`]
  }
  
  extension [Self <: `209`](x: Self) {
    
    inline def setDialCode(value: Plussign252): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Somalia (Soomaaliya) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
