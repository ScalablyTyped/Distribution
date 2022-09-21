package typings.baseui.anon

import typings.baseui.baseuiStrings.GY
import typings.baseui.baseuiStrings.Guyana
import typings.baseui.baseuiStrings.Plussign592
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `105` extends StObject {
  
  val dialCode: Plussign592
  
  val id: GY
  
  val label: Guyana
}
object `105` {
  
  inline def apply(): `105` = {
    val __obj = js.Dynamic.literal(dialCode = "+592", id = "GY", label = "Guyana")
    __obj.asInstanceOf[`105`]
  }
  
  extension [Self <: `105`](x: Self) {
    
    inline def setDialCode(value: Plussign592): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Guyana): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
