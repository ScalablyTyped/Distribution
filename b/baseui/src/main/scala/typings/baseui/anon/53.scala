package typings.baseui.anon

import typings.baseui.baseuiStrings.DJ
import typings.baseui.baseuiStrings.Djibouti
import typings.baseui.baseuiStrings.Plussign253
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  var dialCode: Plussign253
  
  var id: DJ
  
  var label: Djibouti
}
object `53` {
  
  inline def apply(): `53` = {
    val __obj = js.Dynamic.literal(dialCode = "+253", id = "DJ", label = "Djibouti")
    __obj.asInstanceOf[`53`]
  }
  
  extension [Self <: `53`](x: Self) {
    
    inline def setDialCode(value: Plussign253): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: DJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Djibouti): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
