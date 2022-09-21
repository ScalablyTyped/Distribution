package typings.baseui.anon

import typings.baseui.baseuiStrings.LV
import typings.baseui.baseuiStrings.Plussign371
import typings.baseui.baseuiStrings.`Latvia LeftparenthesisLatvijaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `130` extends StObject {
  
  val dialCode: Plussign371
  
  val id: LV
  
  val label: `Latvia LeftparenthesisLatvijaRightparenthesis`
}
object `130` {
  
  inline def apply(): `130` = {
    val __obj = js.Dynamic.literal(dialCode = "+371", id = "LV", label = "Latvia (Latvija)")
    __obj.asInstanceOf[`130`]
  }
  
  extension [Self <: `130`](x: Self) {
    
    inline def setDialCode(value: Plussign371): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Latvia LeftparenthesisLatvijaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
