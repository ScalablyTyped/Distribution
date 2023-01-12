package typings.baseui.anon

import typings.baseui.baseuiStrings.AO
import typings.baseui.baseuiStrings.Angola
import typings.baseui.baseuiStrings.Plussign244
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  val dialCode: Plussign244
  
  val id: AO
  
  val label: Angola
}
object `17` {
  
  inline def apply(): `17` = {
    val __obj = js.Dynamic.literal(dialCode = "+244", id = "AO", label = "Angola")
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `17`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign244): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Angola): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
