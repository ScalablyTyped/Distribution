package typings.baseui.anon

import typings.baseui.baseuiStrings.CG
import typings.baseui.baseuiStrings.Plussign242
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60` extends StObject {
  
  val dialCode: Plussign242
  
  val id: CG
  
  val label: /* Congo (Republic) (Congo-Brazzaville) */ String
}
object `60` {
  
  inline def apply(): `60` = {
    val __obj = js.Dynamic.literal(dialCode = "+242", id = "CG", label = "Congo (Republic) (Congo-Brazzaville)")
    __obj.asInstanceOf[`60`]
  }
  
  extension [Self <: `60`](x: Self) {
    
    inline def setDialCode(value: Plussign242): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Congo (Republic) (Congo-Brazzaville) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
