package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign421
import typings.baseui.baseuiStrings.SK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `209` extends StObject {
  
  val dialCode: Plussign421
  
  val id: SK
  
  val label: String
}
object `209` {
  
  inline def apply(): `209` = {
    val __obj = js.Dynamic.literal(dialCode = "+421", id = "SK", label = "Slovakia (Slovensko)")
    __obj.asInstanceOf[`209`]
  }
  
  extension [Self <: `209`](x: Self) {
    
    inline def setDialCode(value: Plussign421): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
