package typings.baseui.anon

import typings.baseui.baseuiStrings.GT
import typings.baseui.baseuiStrings.Guatemala
import typings.baseui.baseuiStrings.Plussign502
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `98` extends StObject {
  
  val dialCode: Plussign502
  
  val id: GT
  
  val label: Guatemala
}
object `98` {
  
  inline def apply(): `98` = {
    val __obj = js.Dynamic.literal(dialCode = "+502", id = "GT", label = "Guatemala")
    __obj.asInstanceOf[`98`]
  }
  
  extension [Self <: `98`](x: Self) {
    
    inline def setDialCode(value: Plussign502): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Guatemala): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
