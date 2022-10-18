package typings.baseui.anon

import typings.baseui.baseuiStrings.Kosovo
import typings.baseui.baseuiStrings.Plussign383
import typings.baseui.baseuiStrings.XK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `123` extends StObject {
  
  val dialCode: Plussign383
  
  val id: XK
  
  val label: Kosovo
}
object `123` {
  
  inline def apply(): `123` = {
    val __obj = js.Dynamic.literal(dialCode = "+383", id = "XK", label = "Kosovo")
    __obj.asInstanceOf[`123`]
  }
  
  extension [Self <: `123`](x: Self) {
    
    inline def setDialCode(value: Plussign383): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: XK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Kosovo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
