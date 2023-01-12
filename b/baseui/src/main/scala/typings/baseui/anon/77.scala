package typings.baseui.anon

import typings.baseui.baseuiStrings.ER
import typings.baseui.baseuiStrings.Eritrea
import typings.baseui.baseuiStrings.Plussign291
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77` extends StObject {
  
  val dialCode: Plussign291
  
  val id: ER
  
  val label: Eritrea
}
object `77` {
  
  inline def apply(): `77` = {
    val __obj = js.Dynamic.literal(dialCode = "+291", id = "ER", label = "Eritrea")
    __obj.asInstanceOf[`77`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `77`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign291): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ER): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Eritrea): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
