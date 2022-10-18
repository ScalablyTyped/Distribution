package typings.baseui.anon

import typings.baseui.baseuiStrings.BL
import typings.baseui.baseuiStrings.Plussign590
import typings.baseui.baseuiStrings.`Saint Barthélemy`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `189` extends StObject {
  
  val dialCode: Plussign590
  
  val id: BL
  
  val label: `Saint Barthélemy`
}
object `189` {
  
  inline def apply(): `189` = {
    val __obj = js.Dynamic.literal(dialCode = "+590", id = "BL", label = "Saint Barth\u00E9lemy")
    __obj.asInstanceOf[`189`]
  }
  
  extension [Self <: `189`](x: Self) {
    
    inline def setDialCode(value: Plussign590): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Saint Barthélemy`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
