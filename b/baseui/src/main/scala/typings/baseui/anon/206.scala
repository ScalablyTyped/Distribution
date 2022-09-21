package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign232
import typings.baseui.baseuiStrings.SL
import typings.baseui.baseuiStrings.`Sierra Leone`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `206` extends StObject {
  
  val dialCode: Plussign232
  
  val id: SL
  
  val label: `Sierra Leone`
}
object `206` {
  
  inline def apply(): `206` = {
    val __obj = js.Dynamic.literal(dialCode = "+232", id = "SL", label = "Sierra Leone")
    __obj.asInstanceOf[`206`]
  }
  
  extension [Self <: `206`](x: Self) {
    
    inline def setDialCode(value: Plussign232): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Sierra Leone`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
