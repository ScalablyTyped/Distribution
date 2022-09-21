package typings.baseui.anon

import typings.baseui.baseuiStrings.NZ
import typings.baseui.baseuiStrings.Plussign64
import typings.baseui.baseuiStrings.`New Zealand`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `166` extends StObject {
  
  val dialCode: Plussign64
  
  val id: NZ
  
  val label: `New Zealand`
}
object `166` {
  
  inline def apply(): `166` = {
    val __obj = js.Dynamic.literal(dialCode = "+64", id = "NZ", label = "New Zealand")
    __obj.asInstanceOf[`166`]
  }
  
  extension [Self <: `166`](x: Self) {
    
    inline def setDialCode(value: Plussign64): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `New Zealand`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
