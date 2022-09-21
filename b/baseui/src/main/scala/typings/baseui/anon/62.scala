package typings.baseui.anon

import typings.baseui.baseuiStrings.CD
import typings.baseui.baseuiStrings.Plussign243
import typings.baseui.baseuiStrings.`Congo LeftparenthesisDRCRightparenthesis LeftparenthesisJamhuri ya Kisoemokrasia ya KongoRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62` extends StObject {
  
  val dialCode: Plussign243
  
  val id: CD
  
  val label: `Congo LeftparenthesisDRCRightparenthesis LeftparenthesisJamhuri ya Kisoemokrasia ya KongoRightparenthesis`
}
object `62` {
  
  inline def apply(): `62` = {
    val __obj = js.Dynamic.literal(dialCode = "+243", id = "CD", label = "Congo (DRC) (Jamhuri ya Kisoemokrasia ya Kongo)")
    __obj.asInstanceOf[`62`]
  }
  
  extension [Self <: `62`](x: Self) {
    
    inline def setDialCode(value: Plussign243): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(
      value: `Congo LeftparenthesisDRCRightparenthesis LeftparenthesisJamhuri ya Kisoemokrasia ya KongoRightparenthesis`
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
