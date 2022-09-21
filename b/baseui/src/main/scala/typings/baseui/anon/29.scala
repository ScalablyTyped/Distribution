package typings.baseui.anon

import typings.baseui.baseuiStrings.BS
import typings.baseui.baseuiStrings.Bahamas
import typings.baseui.baseuiStrings.Plussign1242
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  val dialCode: Plussign1242
  
  val id: BS
  
  val label: Bahamas
}
object `29` {
  
  inline def apply(): `29` = {
    val __obj = js.Dynamic.literal(dialCode = "+1242", id = "BS", label = "Bahamas")
    __obj.asInstanceOf[`29`]
  }
  
  extension [Self <: `29`](x: Self) {
    
    inline def setDialCode(value: Plussign1242): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Bahamas): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
