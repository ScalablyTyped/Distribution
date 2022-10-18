package typings.baseui.anon

import typings.baseui.baseuiStrings.EC
import typings.baseui.baseuiStrings.Ecuador
import typings.baseui.baseuiStrings.Plussign593
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `73` extends StObject {
  
  val dialCode: Plussign593
  
  val id: EC
  
  val label: Ecuador
}
object `73` {
  
  inline def apply(): `73` = {
    val __obj = js.Dynamic.literal(dialCode = "+593", id = "EC", label = "Ecuador")
    __obj.asInstanceOf[`73`]
  }
  
  extension [Self <: `73`](x: Self) {
    
    inline def setDialCode(value: Plussign593): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: EC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Ecuador): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
