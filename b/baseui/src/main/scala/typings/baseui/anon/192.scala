package typings.baseui.anon

import typings.baseui.baseuiStrings.LC
import typings.baseui.baseuiStrings.Plussign1758
import typings.baseui.baseuiStrings.`Saint Lucia`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `192` extends StObject {
  
  val dialCode: Plussign1758
  
  val id: LC
  
  val label: `Saint Lucia`
}
object `192` {
  
  inline def apply(): `192` = {
    val __obj = js.Dynamic.literal(dialCode = "+1758", id = "LC", label = "Saint Lucia")
    __obj.asInstanceOf[`192`]
  }
  
  extension [Self <: `192`](x: Self) {
    
    inline def setDialCode(value: Plussign1758): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Saint Lucia`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
