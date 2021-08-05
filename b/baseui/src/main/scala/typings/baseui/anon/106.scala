package typings.baseui.anon

import typings.baseui.baseuiStrings.Kosovo
import typings.baseui.baseuiStrings.Plussign383
import typings.baseui.baseuiStrings.XK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `106` extends StObject {
  
  var dialCode: Plussign383
  
  var id: XK
  
  var label: Kosovo
}
object `106` {
  
  inline def apply(): `106` = {
    val __obj = js.Dynamic.literal(dialCode = "+383", id = "XK", label = "Kosovo")
    __obj.asInstanceOf[`106`]
  }
  
  extension [Self <: `106`](x: Self) {
    
    inline def setDialCode(value: Plussign383): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: XK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Kosovo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
