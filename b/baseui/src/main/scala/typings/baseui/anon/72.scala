package typings.baseui.anon

import typings.baseui.baseuiStrings.DK
import typings.baseui.baseuiStrings.Plussign45
import typings.baseui.baseuiStrings.`Denmark LeftparenthesisDanmarkRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `72` extends StObject {
  
  val dialCode: Plussign45
  
  val id: DK
  
  val label: `Denmark LeftparenthesisDanmarkRightparenthesis`
}
object `72` {
  
  inline def apply(): `72` = {
    val __obj = js.Dynamic.literal(dialCode = "+45", id = "DK", label = "Denmark (Danmark)")
    __obj.asInstanceOf[`72`]
  }
  
  extension [Self <: `72`](x: Self) {
    
    inline def setDialCode(value: Plussign45): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: DK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Denmark LeftparenthesisDanmarkRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
