package typings.baseui.anon

import typings.baseui.baseuiStrings.AU
import typings.baseui.baseuiStrings.Australia
import typings.baseui.baseuiStrings.Plussign61
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var dialCode: Plussign61
  
  var id: AU
  
  var label: Australia
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal(dialCode = "+61", id = "AU", label = "Australia")
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setDialCode(value: Plussign61): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Australia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
