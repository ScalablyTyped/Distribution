package typings.baseui.anon

import typings.baseui.baseuiStrings.CC
import typings.baseui.baseuiStrings.Plussign61
import typings.baseui.baseuiStrings.`Cocos LeftparenthesisKeelingRightparenthesis Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  var dialCode: Plussign61
  
  var id: CC
  
  var label: `Cocos LeftparenthesisKeelingRightparenthesis Islands`
}
object `39` {
  
  inline def apply(): `39` = {
    val __obj = js.Dynamic.literal(dialCode = "+61", id = "CC", label = "Cocos (Keeling) Islands")
    __obj.asInstanceOf[`39`]
  }
  
  extension [Self <: `39`](x: Self) {
    
    inline def setDialCode(value: Plussign61): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Cocos LeftparenthesisKeelingRightparenthesis Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
