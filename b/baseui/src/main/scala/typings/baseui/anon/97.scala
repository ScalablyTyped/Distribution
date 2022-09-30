package typings.baseui.anon

import typings.baseui.baseuiStrings.GL
import typings.baseui.baseuiStrings.Plussign299
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  val dialCode: Plussign299
  
  val id: GL
  
  val label: String
}
object `97` {
  
  inline def apply(): `97` = {
    val __obj = js.Dynamic.literal(dialCode = "+299", id = "GL", label = "Greenland (Kalaallit Nunaat)")
    __obj.asInstanceOf[`97`]
  }
  
  extension [Self <: `97`](x: Self) {
    
    inline def setDialCode(value: Plussign299): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
