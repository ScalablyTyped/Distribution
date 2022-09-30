package typings.baseui.anon

import typings.baseui.baseuiStrings.LT
import typings.baseui.baseuiStrings.Plussign370
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `136` extends StObject {
  
  val dialCode: Plussign370
  
  val id: LT
  
  val label: String
}
object `136` {
  
  inline def apply(): `136` = {
    val __obj = js.Dynamic.literal(dialCode = "+370", id = "LT", label = "Lithuania (Lietuva)")
    __obj.asInstanceOf[`136`]
  }
  
  extension [Self <: `136`](x: Self) {
    
    inline def setDialCode(value: Plussign370): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
