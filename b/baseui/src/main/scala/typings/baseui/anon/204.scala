package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign65
import typings.baseui.baseuiStrings.SG
import typings.baseui.baseuiStrings.Singapore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `204` extends StObject {
  
  val dialCode: Plussign65
  
  val id: SG
  
  val label: Singapore
}
object `204` {
  
  inline def apply(): `204` = {
    val __obj = js.Dynamic.literal(dialCode = "+65", id = "SG", label = "Singapore")
    __obj.asInstanceOf[`204`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `204`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign65): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Singapore): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
