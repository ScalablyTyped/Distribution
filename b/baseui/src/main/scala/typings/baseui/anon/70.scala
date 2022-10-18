package typings.baseui.anon

import typings.baseui.baseuiStrings.DJ
import typings.baseui.baseuiStrings.Djibouti
import typings.baseui.baseuiStrings.Plussign253
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `70` extends StObject {
  
  val dialCode: Plussign253
  
  val id: DJ
  
  val label: Djibouti
}
object `70` {
  
  inline def apply(): `70` = {
    val __obj = js.Dynamic.literal(dialCode = "+253", id = "DJ", label = "Djibouti")
    __obj.asInstanceOf[`70`]
  }
  
  extension [Self <: `70`](x: Self) {
    
    inline def setDialCode(value: Plussign253): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: DJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Djibouti): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
