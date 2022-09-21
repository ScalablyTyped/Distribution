package typings.baseui.anon

import typings.baseui.baseuiStrings.AR
import typings.baseui.baseuiStrings.Argentina
import typings.baseui.baseuiStrings.Plussign54
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  val dialCode: Plussign54
  
  val id: AR
  
  val label: Argentina
}
object `23` {
  
  inline def apply(): `23` = {
    val __obj = js.Dynamic.literal(dialCode = "+54", id = "AR", label = "Argentina")
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setDialCode(value: Plussign54): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Argentina): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
