package typings.baseui.anon

import typings.baseui.baseuiStrings.HK
import typings.baseui.baseuiStrings.Plussign852
import typings.baseui.baseuiStrings.`Hong Kong Leftparenthesis香港Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `88` extends StObject {
  
  var dialCode: Plussign852
  
  var id: HK
  
  var label: `Hong Kong Leftparenthesis香港Rightparenthesis`
}
object `88` {
  
  inline def apply(): `88` = {
    val __obj = js.Dynamic.literal(dialCode = "+852", id = "HK", label = "Hong Kong (\u9999\u6E2F)")
    __obj.asInstanceOf[`88`]
  }
  
  extension [Self <: `88`](x: Self) {
    
    inline def setDialCode(value: Plussign852): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: HK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Hong Kong Leftparenthesis香港Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
