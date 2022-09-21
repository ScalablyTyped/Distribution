package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign65
import typings.baseui.baseuiStrings.SG
import typings.baseui.baseuiStrings.Singapore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `207` extends StObject {
  
  val dialCode: Plussign65
  
  val id: SG
  
  val label: Singapore
}
object `207` {
  
  inline def apply(): `207` = {
    val __obj = js.Dynamic.literal(dialCode = "+65", id = "SG", label = "Singapore")
    __obj.asInstanceOf[`207`]
  }
  
  extension [Self <: `207`](x: Self) {
    
    inline def setDialCode(value: Plussign65): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Singapore): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
