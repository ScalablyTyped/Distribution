package typings.baseui.anon

import typings.baseui.baseuiStrings.AT
import typings.baseui.baseuiStrings.Plussign43
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  val dialCode: Plussign43
  
  val id: AT
  
  val label: String
}
object `27` {
  
  inline def apply(): `27` = {
    val __obj = js.Dynamic.literal(dialCode = "+43", id = "AT", label = "Austria (\u00D6sterreich)")
    __obj.asInstanceOf[`27`]
  }
  
  extension [Self <: `27`](x: Self) {
    
    inline def setDialCode(value: Plussign43): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
