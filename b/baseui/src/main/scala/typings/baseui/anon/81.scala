package typings.baseui.anon

import typings.baseui.baseuiStrings.FO
import typings.baseui.baseuiStrings.Plussign298
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `81` extends StObject {
  
  val dialCode: Plussign298
  
  val id: FO
  
  val label: /* Faroe Islands (Føroyar) */ String
}
object `81` {
  
  inline def apply(): `81` = {
    val __obj = js.Dynamic.literal(dialCode = "+298", id = "FO", label = "Faroe Islands (F\u00F8royar)")
    __obj.asInstanceOf[`81`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `81`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign298): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: FO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Faroe Islands (Føroyar) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
