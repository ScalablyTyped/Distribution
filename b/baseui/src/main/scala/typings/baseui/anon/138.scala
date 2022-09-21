package typings.baseui.anon

import typings.baseui.baseuiStrings.MO
import typings.baseui.baseuiStrings.Plussign853
import typings.baseui.baseuiStrings.`Macau Leftparenthesis澳門Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `138` extends StObject {
  
  val dialCode: Plussign853
  
  val id: MO
  
  val label: `Macau Leftparenthesis澳門Rightparenthesis`
}
object `138` {
  
  inline def apply(): `138` = {
    val __obj = js.Dynamic.literal(dialCode = "+853", id = "MO", label = "Macau (\u6FB3\u9580)")
    __obj.asInstanceOf[`138`]
  }
  
  extension [Self <: `138`](x: Self) {
    
    inline def setDialCode(value: Plussign853): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Macau Leftparenthesis澳門Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
