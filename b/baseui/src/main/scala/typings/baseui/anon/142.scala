package typings.baseui.anon

import typings.baseui.baseuiStrings.NR
import typings.baseui.baseuiStrings.Nauru
import typings.baseui.baseuiStrings.Plussign674
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `142` extends StObject {
  
  var dialCode: Plussign674
  
  var id: NR
  
  var label: Nauru
}
object `142` {
  
  inline def apply(): `142` = {
    val __obj = js.Dynamic.literal(dialCode = "+674", id = "NR", label = "Nauru")
    __obj.asInstanceOf[`142`]
  }
  
  extension [Self <: `142`](x: Self) {
    
    inline def setDialCode(value: Plussign674): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Nauru): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
