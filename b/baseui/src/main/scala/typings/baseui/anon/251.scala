package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign263
import typings.baseui.baseuiStrings.ZW
import typings.baseui.baseuiStrings.Zimbabwe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `251` extends StObject {
  
  val dialCode: Plussign263
  
  val id: ZW
  
  val label: Zimbabwe
}
object `251` {
  
  inline def apply(): `251` = {
    val __obj = js.Dynamic.literal(dialCode = "+263", id = "ZW", label = "Zimbabwe")
    __obj.asInstanceOf[`251`]
  }
  
  extension [Self <: `251`](x: Self) {
    
    inline def setDialCode(value: Plussign263): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ZW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Zimbabwe): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
