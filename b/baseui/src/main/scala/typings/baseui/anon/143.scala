package typings.baseui.anon

import typings.baseui.baseuiStrings.MV
import typings.baseui.baseuiStrings.Maldives
import typings.baseui.baseuiStrings.Plussign960
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `143` extends StObject {
  
  val dialCode: Plussign960
  
  val id: MV
  
  val label: Maldives
}
object `143` {
  
  inline def apply(): `143` = {
    val __obj = js.Dynamic.literal(dialCode = "+960", id = "MV", label = "Maldives")
    __obj.asInstanceOf[`143`]
  }
  
  extension [Self <: `143`](x: Self) {
    
    inline def setDialCode(value: Plussign960): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Maldives): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
