package typings.baseui.anon

import typings.baseui.baseuiStrings.HR
import typings.baseui.baseuiStrings.Plussign385
import typings.baseui.baseuiStrings.`Croatia LeftparenthesisHrvatskaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67` extends StObject {
  
  val dialCode: Plussign385
  
  val id: HR
  
  val label: `Croatia LeftparenthesisHrvatskaRightparenthesis`
}
object `67` {
  
  inline def apply(): `67` = {
    val __obj = js.Dynamic.literal(dialCode = "+385", id = "HR", label = "Croatia (Hrvatska)")
    __obj.asInstanceOf[`67`]
  }
  
  extension [Self <: `67`](x: Self) {
    
    inline def setDialCode(value: Plussign385): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: HR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Croatia LeftparenthesisHrvatskaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
