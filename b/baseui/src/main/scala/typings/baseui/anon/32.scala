package typings.baseui.anon

import typings.baseui.baseuiStrings.BZ
import typings.baseui.baseuiStrings.Belize
import typings.baseui.baseuiStrings.Plussign501
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  val dialCode: Plussign501
  
  val id: BZ
  
  val label: Belize
}
object `32` {
  
  inline def apply(): `32` = {
    val __obj = js.Dynamic.literal(dialCode = "+501", id = "BZ", label = "Belize")
    __obj.asInstanceOf[`32`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `32`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign501): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Belize): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
