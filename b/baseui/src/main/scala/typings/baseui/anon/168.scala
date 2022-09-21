package typings.baseui.anon

import typings.baseui.baseuiStrings.NE
import typings.baseui.baseuiStrings.Plussign227
import typings.baseui.baseuiStrings.`Niger LeftparenthesisNijarRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168` extends StObject {
  
  val dialCode: Plussign227
  
  val id: NE
  
  val label: `Niger LeftparenthesisNijarRightparenthesis`
}
object `168` {
  
  inline def apply(): `168` = {
    val __obj = js.Dynamic.literal(dialCode = "+227", id = "NE", label = "Niger (Nijar)")
    __obj.asInstanceOf[`168`]
  }
  
  extension [Self <: `168`](x: Self) {
    
    inline def setDialCode(value: Plussign227): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Niger LeftparenthesisNijarRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
