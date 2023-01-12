package typings.baseui.anon

import typings.baseui.baseuiStrings.PT
import typings.baseui.baseuiStrings.Plussign351
import typings.baseui.baseuiStrings.Portugal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `182` extends StObject {
  
  val dialCode: Plussign351
  
  val id: PT
  
  val label: Portugal
}
object `182` {
  
  inline def apply(): `182` = {
    val __obj = js.Dynamic.literal(dialCode = "+351", id = "PT", label = "Portugal")
    __obj.asInstanceOf[`182`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `182`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign351): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Portugal): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
