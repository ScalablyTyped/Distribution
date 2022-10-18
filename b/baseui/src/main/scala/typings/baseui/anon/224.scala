package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign255
import typings.baseui.baseuiStrings.TZ
import typings.baseui.baseuiStrings.Tanzania
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `224` extends StObject {
  
  val dialCode: Plussign255
  
  val id: TZ
  
  val label: Tanzania
}
object `224` {
  
  inline def apply(): `224` = {
    val __obj = js.Dynamic.literal(dialCode = "+255", id = "TZ", label = "Tanzania")
    __obj.asInstanceOf[`224`]
  }
  
  extension [Self <: `224`](x: Self) {
    
    inline def setDialCode(value: Plussign255): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Tanzania): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
