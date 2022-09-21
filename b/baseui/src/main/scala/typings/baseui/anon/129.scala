package typings.baseui.anon

import typings.baseui.baseuiStrings.LA
import typings.baseui.baseuiStrings.Plussign856
import typings.baseui.baseuiStrings.`Laos LeftparenthesisລາວRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129` extends StObject {
  
  val dialCode: Plussign856
  
  val id: LA
  
  val label: `Laos LeftparenthesisລາວRightparenthesis`
}
object `129` {
  
  inline def apply(): `129` = {
    val __obj = js.Dynamic.literal(dialCode = "+856", id = "LA", label = "Laos (\u0EA5\u0EB2\u0EA7)")
    __obj.asInstanceOf[`129`]
  }
  
  extension [Self <: `129`](x: Self) {
    
    inline def setDialCode(value: Plussign856): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Laos LeftparenthesisລາວRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
