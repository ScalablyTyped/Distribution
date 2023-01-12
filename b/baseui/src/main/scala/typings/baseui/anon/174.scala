package typings.baseui.anon

import typings.baseui.baseuiStrings.PW
import typings.baseui.baseuiStrings.Palau
import typings.baseui.baseuiStrings.Plussign680
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `174` extends StObject {
  
  val dialCode: Plussign680
  
  val id: PW
  
  val label: Palau
}
object `174` {
  
  inline def apply(): `174` = {
    val __obj = js.Dynamic.literal(dialCode = "+680", id = "PW", label = "Palau")
    __obj.asInstanceOf[`174`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `174`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign680): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Palau): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
