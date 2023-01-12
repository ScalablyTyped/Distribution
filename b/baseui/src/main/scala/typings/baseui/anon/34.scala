package typings.baseui.anon

import typings.baseui.baseuiStrings.BM
import typings.baseui.baseuiStrings.Bermuda
import typings.baseui.baseuiStrings.Plussign1441
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  val dialCode: Plussign1441
  
  val id: BM
  
  val label: Bermuda
}
object `34` {
  
  inline def apply(): `34` = {
    val __obj = js.Dynamic.literal(dialCode = "+1441", id = "BM", label = "Bermuda")
    __obj.asInstanceOf[`34`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `34`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign1441): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Bermuda): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
