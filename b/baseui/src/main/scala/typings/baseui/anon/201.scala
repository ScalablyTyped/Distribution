package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign239
import typings.baseui.baseuiStrings.ST
import typings.baseui.baseuiStrings.`São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201` extends StObject {
  
  val dialCode: Plussign239
  
  val id: ST
  
  val label: `São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis`
}
object `201` {
  
  inline def apply(): `201` = {
    val __obj = js.Dynamic.literal(dialCode = "+239", id = "ST", label = "S\u00E3o Tom\u00E9 and Pr\u00EDncipe (S\u00E3o Tom\u00E9 e Pr\u00EDncipe)")
    __obj.asInstanceOf[`201`]
  }
  
  extension [Self <: `201`](x: Self) {
    
    inline def setDialCode(value: Plussign239): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ST): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
