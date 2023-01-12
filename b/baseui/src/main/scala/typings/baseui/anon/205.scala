package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1721
import typings.baseui.baseuiStrings.SX
import typings.baseui.baseuiStrings.`Sint Maarten`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `205` extends StObject {
  
  val dialCode: Plussign1721
  
  val id: SX
  
  val label: `Sint Maarten`
}
object `205` {
  
  inline def apply(): `205` = {
    val __obj = js.Dynamic.literal(dialCode = "+1721", id = "SX", label = "Sint Maarten")
    __obj.asInstanceOf[`205`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `205`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign1721): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SX): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Sint Maarten`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
