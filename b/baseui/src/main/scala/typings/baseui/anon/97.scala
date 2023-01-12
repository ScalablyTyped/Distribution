package typings.baseui.anon

import typings.baseui.baseuiStrings.GU
import typings.baseui.baseuiStrings.Guam
import typings.baseui.baseuiStrings.Plussign1671
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  val dialCode: Plussign1671
  
  val id: GU
  
  val label: Guam
}
object `97` {
  
  inline def apply(): `97` = {
    val __obj = js.Dynamic.literal(dialCode = "+1671", id = "GU", label = "Guam")
    __obj.asInstanceOf[`97`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `97`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign1671): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Guam): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
