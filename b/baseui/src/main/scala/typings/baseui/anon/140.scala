package typings.baseui.anon

import typings.baseui.baseuiStrings.MV
import typings.baseui.baseuiStrings.Maldives
import typings.baseui.baseuiStrings.Plussign960
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `140` extends StObject {
  
  val dialCode: Plussign960
  
  val id: MV
  
  val label: Maldives
}
object `140` {
  
  inline def apply(): `140` = {
    val __obj = js.Dynamic.literal(dialCode = "+960", id = "MV", label = "Maldives")
    __obj.asInstanceOf[`140`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `140`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign960): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Maldives): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
