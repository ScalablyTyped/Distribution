package typings.baseui.anon

import typings.baseui.baseuiStrings.IE
import typings.baseui.baseuiStrings.Ireland
import typings.baseui.baseuiStrings.Plussign353
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `115` extends StObject {
  
  val dialCode: Plussign353
  
  val id: IE
  
  val label: Ireland
}
object `115` {
  
  inline def apply(): `115` = {
    val __obj = js.Dynamic.literal(dialCode = "+353", id = "IE", label = "Ireland")
    __obj.asInstanceOf[`115`]
  }
  
  extension [Self <: `115`](x: Self) {
    
    inline def setDialCode(value: Plussign353): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Ireland): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
