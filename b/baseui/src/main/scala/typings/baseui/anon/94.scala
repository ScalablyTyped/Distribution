package typings.baseui.anon

import typings.baseui.baseuiStrings.GL
import typings.baseui.baseuiStrings.Plussign299
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `94` extends StObject {
  
  val dialCode: Plussign299
  
  val id: GL
  
  val label: /* Greenland (Kalaallit Nunaat) */ String
}
object `94` {
  
  inline def apply(): `94` = {
    val __obj = js.Dynamic.literal(dialCode = "+299", id = "GL", label = "Greenland (Kalaallit Nunaat)")
    __obj.asInstanceOf[`94`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `94`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign299): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Greenland (Kalaallit Nunaat) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
