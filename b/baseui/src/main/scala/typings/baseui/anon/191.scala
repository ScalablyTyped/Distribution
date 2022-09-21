package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign250
import typings.baseui.baseuiStrings.RW
import typings.baseui.baseuiStrings.Rwanda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `191` extends StObject {
  
  val dialCode: Plussign250
  
  val id: RW
  
  val label: Rwanda
}
object `191` {
  
  inline def apply(): `191` = {
    val __obj = js.Dynamic.literal(dialCode = "+250", id = "RW", label = "Rwanda")
    __obj.asInstanceOf[`191`]
  }
  
  extension [Self <: `191`](x: Self) {
    
    inline def setDialCode(value: Plussign250): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: RW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Rwanda): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
