package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign598
import typings.baseui.baseuiStrings.UY
import typings.baseui.baseuiStrings.Uruguay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `242` extends StObject {
  
  val dialCode: Plussign598
  
  val id: UY
  
  val label: Uruguay
}
object `242` {
  
  inline def apply(): `242` = {
    val __obj = js.Dynamic.literal(dialCode = "+598", id = "UY", label = "Uruguay")
    __obj.asInstanceOf[`242`]
  }
  
  extension [Self <: `242`](x: Self) {
    
    inline def setDialCode(value: Plussign598): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: UY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Uruguay): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
