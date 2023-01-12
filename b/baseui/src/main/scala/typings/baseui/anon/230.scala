package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1868
import typings.baseui.baseuiStrings.TT
import typings.baseui.baseuiStrings.`Trinisoad and Tobago`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `230` extends StObject {
  
  val dialCode: Plussign1868
  
  val id: TT
  
  val label: `Trinisoad and Tobago`
}
object `230` {
  
  inline def apply(): `230` = {
    val __obj = js.Dynamic.literal(dialCode = "+1868", id = "TT", label = "Trinisoad and Tobago")
    __obj.asInstanceOf[`230`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `230`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign1868): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Trinisoad and Tobago`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
