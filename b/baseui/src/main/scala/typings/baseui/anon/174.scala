package typings.baseui.anon

import typings.baseui.baseuiStrings.NO
import typings.baseui.baseuiStrings.Plussign47
import typings.baseui.baseuiStrings.`Norway LeftparenthesisNorgeRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `174` extends StObject {
  
  val dialCode: Plussign47
  
  val id: NO
  
  val label: `Norway LeftparenthesisNorgeRightparenthesis`
}
object `174` {
  
  inline def apply(): `174` = {
    val __obj = js.Dynamic.literal(dialCode = "+47", id = "NO", label = "Norway (Norge)")
    __obj.asInstanceOf[`174`]
  }
  
  extension [Self <: `174`](x: Self) {
    
    inline def setDialCode(value: Plussign47): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Norway LeftparenthesisNorgeRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
