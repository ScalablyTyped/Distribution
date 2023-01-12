package typings.baseui.anon

import typings.baseui.baseuiStrings.GG
import typings.baseui.baseuiStrings.Guernsey
import typings.baseui.baseuiStrings.Plussign44
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `99` extends StObject {
  
  val dialCode: Plussign44
  
  val id: GG
  
  val label: Guernsey
}
object `99` {
  
  inline def apply(): `99` = {
    val __obj = js.Dynamic.literal(dialCode = "+44", id = "GG", label = "Guernsey")
    __obj.asInstanceOf[`99`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `99`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign44): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Guernsey): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
