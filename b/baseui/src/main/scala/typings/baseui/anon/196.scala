package typings.baseui.anon

import typings.baseui.baseuiStrings.MF
import typings.baseui.baseuiStrings.Plussign590
import typings.baseui.baseuiStrings.`Saint Martin LeftparenthesisSaint-Martin Leftparenthesispartie françaiseRightparenthesisRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `196` extends StObject {
  
  val dialCode: Plussign590
  
  val id: MF
  
  val label: `Saint Martin LeftparenthesisSaint-Martin Leftparenthesispartie françaiseRightparenthesisRightparenthesis`
}
object `196` {
  
  inline def apply(): `196` = {
    val __obj = js.Dynamic.literal(dialCode = "+590", id = "MF", label = "Saint Martin (Saint-Martin (partie fran\u00E7aise))")
    __obj.asInstanceOf[`196`]
  }
  
  extension [Self <: `196`](x: Self) {
    
    inline def setDialCode(value: Plussign590): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(
      value: `Saint Martin LeftparenthesisSaint-Martin Leftparenthesispartie françaiseRightparenthesisRightparenthesis`
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
