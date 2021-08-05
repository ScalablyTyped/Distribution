package typings.baseui.anon

import typings.baseui.baseuiStrings.NG
import typings.baseui.baseuiStrings.Nigeria
import typings.baseui.baseuiStrings.Plussign234
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `149` extends StObject {
  
  var dialCode: Plussign234
  
  var id: NG
  
  var label: Nigeria
}
object `149` {
  
  inline def apply(): `149` = {
    val __obj = js.Dynamic.literal(dialCode = "+234", id = "NG", label = "Nigeria")
    __obj.asInstanceOf[`149`]
  }
  
  extension [Self <: `149`](x: Self) {
    
    inline def setDialCode(value: Plussign234): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Nigeria): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
