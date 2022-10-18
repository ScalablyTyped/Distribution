package typings.baseui.anon

import typings.baseui.baseuiStrings.MC
import typings.baseui.baseuiStrings.Monaco
import typings.baseui.baseuiStrings.Plussign377
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `151` extends StObject {
  
  val dialCode: Plussign377
  
  val id: MC
  
  val label: Monaco
}
object `151` {
  
  inline def apply(): `151` = {
    val __obj = js.Dynamic.literal(dialCode = "+377", id = "MC", label = "Monaco")
    __obj.asInstanceOf[`151`]
  }
  
  extension [Self <: `151`](x: Self) {
    
    inline def setDialCode(value: Plussign377): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Monaco): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
