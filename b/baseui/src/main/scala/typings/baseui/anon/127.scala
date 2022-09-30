package typings.baseui.anon

import typings.baseui.baseuiStrings.KW
import typings.baseui.baseuiStrings.Plussign965
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `127` extends StObject {
  
  val dialCode: Plussign965
  
  val id: KW
  
  val label: String
}
object `127` {
  
  inline def apply(): `127` = {
    val __obj = js.Dynamic.literal(dialCode = "+965", id = "KW", label = "Kuwait (\u202B\u0627\u0644\u0643\u0648\u064A\u062A\u202C\u200E)")
    __obj.asInstanceOf[`127`]
  }
  
  extension [Self <: `127`](x: Self) {
    
    inline def setDialCode(value: Plussign965): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
