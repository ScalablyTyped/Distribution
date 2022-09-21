package typings.baseui.anon

import typings.baseui.baseuiStrings.BN
import typings.baseui.baseuiStrings.Brunei
import typings.baseui.baseuiStrings.Plussign673
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  val dialCode: Plussign673
  
  val id: BN
  
  val label: Brunei
}
object `45` {
  
  inline def apply(): `45` = {
    val __obj = js.Dynamic.literal(dialCode = "+673", id = "BN", label = "Brunei")
    __obj.asInstanceOf[`45`]
  }
  
  extension [Self <: `45`](x: Self) {
    
    inline def setDialCode(value: Plussign673): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Brunei): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
