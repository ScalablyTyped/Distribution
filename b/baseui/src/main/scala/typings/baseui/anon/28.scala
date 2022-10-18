package typings.baseui.anon

import typings.baseui.baseuiStrings.BD
import typings.baseui.baseuiStrings.Plussign880
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `28` extends StObject {
  
  val dialCode: Plussign880
  
  val id: BD
  
  val label: /* Bangladesh (বাংলাদেশ) */ String
}
object `28` {
  
  inline def apply(): `28` = {
    val __obj = js.Dynamic.literal(dialCode = "+880", id = "BD", label = "Bangladesh (\u09AC\u09BE\u0982\u09B2\u09BE\u09A6\u09C7\u09B6)")
    __obj.asInstanceOf[`28`]
  }
  
  extension [Self <: `28`](x: Self) {
    
    inline def setDialCode(value: Plussign880): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Bangladesh (বাংলাদেশ) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
