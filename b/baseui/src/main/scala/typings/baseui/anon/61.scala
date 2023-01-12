package typings.baseui.anon

import typings.baseui.baseuiStrings.CK
import typings.baseui.baseuiStrings.Plussign682
import typings.baseui.baseuiStrings.`Cook Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  val dialCode: Plussign682
  
  val id: CK
  
  val label: `Cook Islands`
}
object `61` {
  
  inline def apply(): `61` = {
    val __obj = js.Dynamic.literal(dialCode = "+682", id = "CK", label = "Cook Islands")
    __obj.asInstanceOf[`61`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `61`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign682): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Cook Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
