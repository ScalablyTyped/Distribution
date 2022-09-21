package typings.baseui.anon

import typings.baseui.baseuiStrings.BI
import typings.baseui.baseuiStrings.Plussign257
import typings.baseui.baseuiStrings.`Burundi LeftparenthesisUburundiRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48` extends StObject {
  
  val dialCode: Plussign257
  
  val id: BI
  
  val label: `Burundi LeftparenthesisUburundiRightparenthesis`
}
object `48` {
  
  inline def apply(): `48` = {
    val __obj = js.Dynamic.literal(dialCode = "+257", id = "BI", label = "Burundi (Uburundi)")
    __obj.asInstanceOf[`48`]
  }
  
  extension [Self <: `48`](x: Self) {
    
    inline def setDialCode(value: Plussign257): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Burundi LeftparenthesisUburundiRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
