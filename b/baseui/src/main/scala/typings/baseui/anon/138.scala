package typings.baseui.anon

import typings.baseui.baseuiStrings.MW
import typings.baseui.baseuiStrings.Malawi
import typings.baseui.baseuiStrings.Plussign265
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `138` extends StObject {
  
  val dialCode: Plussign265
  
  val id: MW
  
  val label: Malawi
}
object `138` {
  
  inline def apply(): `138` = {
    val __obj = js.Dynamic.literal(dialCode = "+265", id = "MW", label = "Malawi")
    __obj.asInstanceOf[`138`]
  }
  
  extension [Self <: `138`](x: Self) {
    
    inline def setDialCode(value: Plussign265): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Malawi): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
