package typings.baseui.anon

import typings.baseui.baseuiStrings.IT
import typings.baseui.baseuiStrings.Plussign39
import typings.baseui.baseuiStrings.`Italy LeftparenthesisItaliaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `118` extends StObject {
  
  val dialCode: Plussign39
  
  val id: IT
  
  val label: `Italy LeftparenthesisItaliaRightparenthesis`
}
object `118` {
  
  inline def apply(): `118` = {
    val __obj = js.Dynamic.literal(dialCode = "+39", id = "IT", label = "Italy (Italia)")
    __obj.asInstanceOf[`118`]
  }
  
  extension [Self <: `118`](x: Self) {
    
    inline def setDialCode(value: Plussign39): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Italy LeftparenthesisItaliaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
