package typings.baseui.anon

import typings.baseui.baseuiStrings.CM
import typings.baseui.baseuiStrings.Plussign237
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  val dialCode: Plussign237
  
  val id: CM
  
  val label: /* Cameroon (Cameroun) */ String
}
object `47` {
  
  inline def apply(): `47` = {
    val __obj = js.Dynamic.literal(dialCode = "+237", id = "CM", label = "Cameroon (Cameroun)")
    __obj.asInstanceOf[`47`]
  }
  
  extension [Self <: `47`](x: Self) {
    
    inline def setDialCode(value: Plussign237): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Cameroon (Cameroun) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
