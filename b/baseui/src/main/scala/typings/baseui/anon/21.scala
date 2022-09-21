package typings.baseui.anon

import typings.baseui.baseuiStrings.AI
import typings.baseui.baseuiStrings.Anguilla
import typings.baseui.baseuiStrings.Plussign1264
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  val dialCode: Plussign1264
  
  val id: AI
  
  val label: Anguilla
}
object `21` {
  
  inline def apply(): `21` = {
    val __obj = js.Dynamic.literal(dialCode = "+1264", id = "AI", label = "Anguilla")
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setDialCode(value: Plussign1264): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Anguilla): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
