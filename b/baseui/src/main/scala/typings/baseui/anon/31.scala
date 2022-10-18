package typings.baseui.anon

import typings.baseui.baseuiStrings.BE
import typings.baseui.baseuiStrings.Plussign32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  val dialCode: Plussign32
  
  val id: BE
  
  val label: /* Belgium (België) */ String
}
object `31` {
  
  inline def apply(): `31` = {
    val __obj = js.Dynamic.literal(dialCode = "+32", id = "BE", label = "Belgium (Belgi\u00EB)")
    __obj.asInstanceOf[`31`]
  }
  
  extension [Self <: `31`](x: Self) {
    
    inline def setDialCode(value: Plussign32): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Belgium (België) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
