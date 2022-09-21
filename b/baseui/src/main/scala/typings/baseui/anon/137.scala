package typings.baseui.anon

import typings.baseui.baseuiStrings.LU
import typings.baseui.baseuiStrings.Luxembourg
import typings.baseui.baseuiStrings.Plussign352
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `137` extends StObject {
  
  val dialCode: Plussign352
  
  val id: LU
  
  val label: Luxembourg
}
object `137` {
  
  inline def apply(): `137` = {
    val __obj = js.Dynamic.literal(dialCode = "+352", id = "LU", label = "Luxembourg")
    __obj.asInstanceOf[`137`]
  }
  
  extension [Self <: `137`](x: Self) {
    
    inline def setDialCode(value: Plussign352): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Luxembourg): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
