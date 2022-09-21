package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign688
import typings.baseui.baseuiStrings.TV
import typings.baseui.baseuiStrings.Tuvalu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `238` extends StObject {
  
  val dialCode: Plussign688
  
  val id: TV
  
  val label: Tuvalu
}
object `238` {
  
  inline def apply(): `238` = {
    val __obj = js.Dynamic.literal(dialCode = "+688", id = "TV", label = "Tuvalu")
    __obj.asInstanceOf[`238`]
  }
  
  extension [Self <: `238`](x: Self) {
    
    inline def setDialCode(value: Plussign688): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Tuvalu): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
