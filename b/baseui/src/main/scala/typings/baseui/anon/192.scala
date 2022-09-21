package typings.baseui.anon

import typings.baseui.baseuiStrings.BL
import typings.baseui.baseuiStrings.Plussign590
import typings.baseui.baseuiStrings.`Saint Barthélemy`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `192` extends StObject {
  
  val dialCode: Plussign590
  
  val id: BL
  
  val label: `Saint Barthélemy`
}
object `192` {
  
  inline def apply(): `192` = {
    val __obj = js.Dynamic.literal(dialCode = "+590", id = "BL", label = "Saint Barth\u00E9lemy")
    __obj.asInstanceOf[`192`]
  }
  
  extension [Self <: `192`](x: Self) {
    
    inline def setDialCode(value: Plussign590): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Saint Barthélemy`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
