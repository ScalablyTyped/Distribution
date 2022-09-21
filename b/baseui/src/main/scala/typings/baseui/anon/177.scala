package typings.baseui.anon

import typings.baseui.baseuiStrings.PW
import typings.baseui.baseuiStrings.Palau
import typings.baseui.baseuiStrings.Plussign680
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `177` extends StObject {
  
  val dialCode: Plussign680
  
  val id: PW
  
  val label: Palau
}
object `177` {
  
  inline def apply(): `177` = {
    val __obj = js.Dynamic.literal(dialCode = "+680", id = "PW", label = "Palau")
    __obj.asInstanceOf[`177`]
  }
  
  extension [Self <: `177`](x: Self) {
    
    inline def setDialCode(value: Plussign680): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Palau): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
