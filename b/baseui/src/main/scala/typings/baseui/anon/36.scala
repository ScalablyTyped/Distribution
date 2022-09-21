package typings.baseui.anon

import typings.baseui.baseuiStrings.BJ
import typings.baseui.baseuiStrings.Plussign229
import typings.baseui.baseuiStrings.`Benin LeftparenthesisBéninRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  val dialCode: Plussign229
  
  val id: BJ
  
  val label: `Benin LeftparenthesisBéninRightparenthesis`
}
object `36` {
  
  inline def apply(): `36` = {
    val __obj = js.Dynamic.literal(dialCode = "+229", id = "BJ", label = "Benin (B\u00E9nin)")
    __obj.asInstanceOf[`36`]
  }
  
  extension [Self <: `36`](x: Self) {
    
    inline def setDialCode(value: Plussign229): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Benin LeftparenthesisBéninRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
