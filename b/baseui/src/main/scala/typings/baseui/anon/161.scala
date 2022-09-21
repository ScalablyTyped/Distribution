package typings.baseui.anon

import typings.baseui.baseuiStrings.NA
import typings.baseui.baseuiStrings.Plussign264
import typings.baseui.baseuiStrings.`Namibia LeftparenthesisNamibiëRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `161` extends StObject {
  
  val dialCode: Plussign264
  
  val id: NA
  
  val label: `Namibia LeftparenthesisNamibiëRightparenthesis`
}
object `161` {
  
  inline def apply(): `161` = {
    val __obj = js.Dynamic.literal(dialCode = "+264", id = "NA", label = "Namibia (Namibi\u00EB)")
    __obj.asInstanceOf[`161`]
  }
  
  extension [Self <: `161`](x: Self) {
    
    inline def setDialCode(value: Plussign264): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Namibia LeftparenthesisNamibiëRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
