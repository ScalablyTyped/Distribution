package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign90
import typings.baseui.baseuiStrings.TR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `232` extends StObject {
  
  val dialCode: Plussign90
  
  val id: TR
  
  val label: /* Turkey (Türkiye) */ String
}
object `232` {
  
  inline def apply(): `232` = {
    val __obj = js.Dynamic.literal(dialCode = "+90", id = "TR", label = "Turkey (T\u00FCrkiye)")
    __obj.asInstanceOf[`232`]
  }
  
  extension [Self <: `232`](x: Self) {
    
    inline def setDialCode(value: Plussign90): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Turkey (Türkiye) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
