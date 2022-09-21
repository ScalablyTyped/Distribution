package typings.baseui.anon

import typings.baseui.baseuiStrings.FK
import typings.baseui.baseuiStrings.Plussign500
import typings.baseui.baseuiStrings.`Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `83` extends StObject {
  
  val dialCode: Plussign500
  
  val id: FK
  
  val label: `Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis`
}
object `83` {
  
  inline def apply(): `83` = {
    val __obj = js.Dynamic.literal(dialCode = "+500", id = "FK", label = "Falkland Islands (Islas Malvinas)")
    __obj.asInstanceOf[`83`]
  }
  
  extension [Self <: `83`](x: Self) {
    
    inline def setDialCode(value: Plussign500): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: FK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
