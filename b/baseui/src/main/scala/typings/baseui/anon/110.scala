package typings.baseui.anon

import typings.baseui.baseuiStrings.IS
import typings.baseui.baseuiStrings.Plussign354
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  val dialCode: Plussign354
  
  val id: IS
  
  val label: String
}
object `110` {
  
  inline def apply(): `110` = {
    val __obj = js.Dynamic.literal(dialCode = "+354", id = "IS", label = "Iceland (\u00CDsland)")
    __obj.asInstanceOf[`110`]
  }
  
  extension [Self <: `110`](x: Self) {
    
    inline def setDialCode(value: Plussign354): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
