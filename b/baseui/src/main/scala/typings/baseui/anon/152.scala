package typings.baseui.anon

import typings.baseui.baseuiStrings.FM
import typings.baseui.baseuiStrings.Micronesia
import typings.baseui.baseuiStrings.Plussign691
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `152` extends StObject {
  
  val dialCode: Plussign691
  
  val id: FM
  
  val label: Micronesia
}
object `152` {
  
  inline def apply(): `152` = {
    val __obj = js.Dynamic.literal(dialCode = "+691", id = "FM", label = "Micronesia")
    __obj.asInstanceOf[`152`]
  }
  
  extension [Self <: `152`](x: Self) {
    
    inline def setDialCode(value: Plussign691): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: FM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Micronesia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
