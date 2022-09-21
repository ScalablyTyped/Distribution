package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign992
import typings.baseui.baseuiStrings.TJ
import typings.baseui.baseuiStrings.Tajikistan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `226` extends StObject {
  
  val dialCode: Plussign992
  
  val id: TJ
  
  val label: Tajikistan
}
object `226` {
  
  inline def apply(): `226` = {
    val __obj = js.Dynamic.literal(dialCode = "+992", id = "TJ", label = "Tajikistan")
    __obj.asInstanceOf[`226`]
  }
  
  extension [Self <: `226`](x: Self) {
    
    inline def setDialCode(value: Plussign992): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Tajikistan): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
