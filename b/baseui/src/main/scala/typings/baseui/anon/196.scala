package typings.baseui.anon

import typings.baseui.baseuiStrings.ES
import typings.baseui.baseuiStrings.Plussign34
import typings.baseui.baseuiStrings.`Spain LeftparenthesisEspañaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `196` extends StObject {
  
  var dialCode: Plussign34
  
  var id: ES
  
  var label: `Spain LeftparenthesisEspañaRightparenthesis`
}
object `196` {
  
  inline def apply(): `196` = {
    val __obj = js.Dynamic.literal(dialCode = "+34", id = "ES", label = "Spain (Espa\u00F1a)")
    __obj.asInstanceOf[`196`]
  }
  
  extension [Self <: `196`](x: Self) {
    
    inline def setDialCode(value: Plussign34): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ES): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Spain LeftparenthesisEspañaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
