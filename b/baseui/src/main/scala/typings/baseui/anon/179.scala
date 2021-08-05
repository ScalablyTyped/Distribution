package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign685
import typings.baseui.baseuiStrings.Samoa
import typings.baseui.baseuiStrings.WS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `179` extends StObject {
  
  var dialCode: Plussign685
  
  var id: WS
  
  var label: Samoa
}
object `179` {
  
  inline def apply(): `179` = {
    val __obj = js.Dynamic.literal(dialCode = "+685", id = "WS", label = "Samoa")
    __obj.asInstanceOf[`179`]
  }
  
  extension [Self <: `179`](x: Self) {
    
    inline def setDialCode(value: Plussign685): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: WS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Samoa): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
