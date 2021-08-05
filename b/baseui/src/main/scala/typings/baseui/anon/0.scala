package typings.baseui.anon

import typings.baseui.baseuiStrings.AO
import typings.baseui.baseuiStrings.Angola
import typings.baseui.baseuiStrings.Plussign244
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var dialCode: Plussign244
  
  var id: AO
  
  var label: Angola
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(dialCode = "+244", id = "AO", label = "Angola")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setDialCode(value: Plussign244): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Angola): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
