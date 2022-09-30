package typings.baseui.anon

import typings.baseui.baseuiStrings.BD
import typings.baseui.baseuiStrings.Plussign880
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  val dialCode: Plussign880
  
  val id: BD
  
  val label: String
}
object `31` {
  
  inline def apply(): `31` = {
    val __obj = js.Dynamic.literal(dialCode = "+880", id = "BD", label = "Bangladesh (\u09AC\u09BE\u0982\u09B2\u09BE\u09A6\u09C7\u09B6)")
    __obj.asInstanceOf[`31`]
  }
  
  extension [Self <: `31`](x: Self) {
    
    inline def setDialCode(value: Plussign880): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
