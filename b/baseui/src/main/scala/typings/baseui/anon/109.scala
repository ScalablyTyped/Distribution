package typings.baseui.anon

import typings.baseui.baseuiStrings.HU
import typings.baseui.baseuiStrings.Plussign36
import typings.baseui.baseuiStrings.`Hungary LeftparenthesisMagyarországRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `109` extends StObject {
  
  val dialCode: Plussign36
  
  val id: HU
  
  val label: `Hungary LeftparenthesisMagyarországRightparenthesis`
}
object `109` {
  
  inline def apply(): `109` = {
    val __obj = js.Dynamic.literal(dialCode = "+36", id = "HU", label = "Hungary (Magyarorsz\u00E1g)")
    __obj.asInstanceOf[`109`]
  }
  
  extension [Self <: `109`](x: Self) {
    
    inline def setDialCode(value: Plussign36): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: HU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Hungary LeftparenthesisMagyarországRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
