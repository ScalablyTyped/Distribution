package typings.baseui.anon

import typings.baseui.baseuiStrings.CR
import typings.baseui.baseuiStrings.Plussign506
import typings.baseui.baseuiStrings.`Costa Rica`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  var dialCode: Plussign506
  
  var id: CR
  
  var label: `Costa Rica`
}
object `45` {
  
  inline def apply(): `45` = {
    val __obj = js.Dynamic.literal(dialCode = "+506", id = "CR", label = "Costa Rica")
    __obj.asInstanceOf[`45`]
  }
  
  extension [Self <: `45`](x: Self) {
    
    inline def setDialCode(value: Plussign506): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Costa Rica`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
