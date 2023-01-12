package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign381
import typings.baseui.baseuiStrings.RS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201` extends StObject {
  
  val dialCode: Plussign381
  
  val id: RS
  
  val label: /* Serbia (Србија) */ String
}
object `201` {
  
  inline def apply(): `201` = {
    val __obj = js.Dynamic.literal(dialCode = "+381", id = "RS", label = "Serbia (\u0421\u0440\u0431\u0438\u0458\u0430)")
    __obj.asInstanceOf[`201`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign381): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: RS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Serbia (Србија) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
