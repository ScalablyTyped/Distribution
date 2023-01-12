package typings.baseui.anon

import typings.baseui.baseuiStrings.NG
import typings.baseui.baseuiStrings.Nigeria
import typings.baseui.baseuiStrings.Plussign234
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `166` extends StObject {
  
  val dialCode: Plussign234
  
  val id: NG
  
  val label: Nigeria
}
object `166` {
  
  inline def apply(): `166` = {
    val __obj = js.Dynamic.literal(dialCode = "+234", id = "NG", label = "Nigeria")
    __obj.asInstanceOf[`166`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `166`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign234): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Nigeria): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
