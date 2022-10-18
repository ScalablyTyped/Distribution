package typings.baseui.anon

import typings.baseui.baseuiStrings.CA
import typings.baseui.baseuiStrings.Canada
import typings.baseui.baseuiStrings.Plussign1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48` extends StObject {
  
  val dialCode: Plussign1
  
  val id: CA
  
  val label: Canada
}
object `48` {
  
  inline def apply(): `48` = {
    val __obj = js.Dynamic.literal(dialCode = "+1", id = "CA", label = "Canada")
    __obj.asInstanceOf[`48`]
  }
  
  extension [Self <: `48`](x: Self) {
    
    inline def setDialCode(value: Plussign1): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Canada): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
