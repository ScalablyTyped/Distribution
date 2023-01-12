package typings.baseui.anon

import typings.baseui.baseuiStrings.MT
import typings.baseui.baseuiStrings.Malta
import typings.baseui.baseuiStrings.Plussign356
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `142` extends StObject {
  
  val dialCode: Plussign356
  
  val id: MT
  
  val label: Malta
}
object `142` {
  
  inline def apply(): `142` = {
    val __obj = js.Dynamic.literal(dialCode = "+356", id = "MT", label = "Malta")
    __obj.asInstanceOf[`142`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `142`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign356): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Malta): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
