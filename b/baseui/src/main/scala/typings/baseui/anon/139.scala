package typings.baseui.anon

import typings.baseui.baseuiStrings.MK
import typings.baseui.baseuiStrings.Plussign389
import typings.baseui.baseuiStrings.`North Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `139` extends StObject {
  
  val dialCode: Plussign389
  
  val id: MK
  
  val label: `North Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis`
}
object `139` {
  
  inline def apply(): `139` = {
    val __obj = js.Dynamic.literal(dialCode = "+389", id = "MK", label = "North Macedonia (FYROM) (\u041C\u0430\u043A\u0435\u0434\u043E\u043D\u0438\u0458\u0430)")
    __obj.asInstanceOf[`139`]
  }
  
  extension [Self <: `139`](x: Self) {
    
    inline def setDialCode(value: Plussign389): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(
      value: `North Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis`
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
