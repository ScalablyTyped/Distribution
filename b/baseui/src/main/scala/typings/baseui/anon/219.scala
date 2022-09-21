package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign597
import typings.baseui.baseuiStrings.SR
import typings.baseui.baseuiStrings.Suriname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `219` extends StObject {
  
  val dialCode: Plussign597
  
  val id: SR
  
  val label: Suriname
}
object `219` {
  
  inline def apply(): `219` = {
    val __obj = js.Dynamic.literal(dialCode = "+597", id = "SR", label = "Suriname")
    __obj.asInstanceOf[`219`]
  }
  
  extension [Self <: `219`](x: Self) {
    
    inline def setDialCode(value: Plussign597): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Suriname): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
