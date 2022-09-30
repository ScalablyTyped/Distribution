package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign90
import typings.baseui.baseuiStrings.TR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `235` extends StObject {
  
  val dialCode: Plussign90
  
  val id: TR
  
  val label: String
}
object `235` {
  
  inline def apply(): `235` = {
    val __obj = js.Dynamic.literal(dialCode = "+90", id = "TR", label = "Turkey (T\u00FCrkiye)")
    __obj.asInstanceOf[`235`]
  }
  
  extension [Self <: `235`](x: Self) {
    
    inline def setDialCode(value: Plussign90): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
