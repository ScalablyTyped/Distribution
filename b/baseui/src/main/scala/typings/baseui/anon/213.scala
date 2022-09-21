package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign27
import typings.baseui.baseuiStrings.ZA
import typings.baseui.baseuiStrings.`South Africa`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `213` extends StObject {
  
  val dialCode: Plussign27
  
  val id: ZA
  
  val label: `South Africa`
}
object `213` {
  
  inline def apply(): `213` = {
    val __obj = js.Dynamic.literal(dialCode = "+27", id = "ZA", label = "South Africa")
    __obj.asInstanceOf[`213`]
  }
  
  extension [Self <: `213`](x: Self) {
    
    inline def setDialCode(value: Plussign27): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ZA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `South Africa`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
