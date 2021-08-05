package typings.baseui.anon

import typings.baseui.baseuiStrings.IM
import typings.baseui.baseuiStrings.Plussign44
import typings.baseui.baseuiStrings.`Isle of Man`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `96` extends StObject {
  
  var dialCode: Plussign44
  
  var id: IM
  
  var label: `Isle of Man`
}
object `96` {
  
  inline def apply(): `96` = {
    val __obj = js.Dynamic.literal(dialCode = "+44", id = "IM", label = "Isle of Man")
    __obj.asInstanceOf[`96`]
  }
  
  extension [Self <: `96`](x: Self) {
    
    inline def setDialCode(value: Plussign44): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Isle of Man`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
