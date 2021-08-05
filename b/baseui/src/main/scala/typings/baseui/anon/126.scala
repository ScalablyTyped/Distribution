package typings.baseui.anon

import typings.baseui.baseuiStrings.MH
import typings.baseui.baseuiStrings.Plussign692
import typings.baseui.baseuiStrings.`Marshall Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `126` extends StObject {
  
  var dialCode: Plussign692
  
  var id: MH
  
  var label: `Marshall Islands`
}
object `126` {
  
  inline def apply(): `126` = {
    val __obj = js.Dynamic.literal(dialCode = "+692", id = "MH", label = "Marshall Islands")
    __obj.asInstanceOf[`126`]
  }
  
  extension [Self <: `126`](x: Self) {
    
    inline def setDialCode(value: Plussign692): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Marshall Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
