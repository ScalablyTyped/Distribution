package typings.baseui.anon

import typings.baseui.baseuiStrings.HK
import typings.baseui.baseuiStrings.Plussign852
import typings.baseui.baseuiStrings.`Hong Kong Leftparenthesis香港Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `108` extends StObject {
  
  val dialCode: Plussign852
  
  val id: HK
  
  val label: `Hong Kong Leftparenthesis香港Rightparenthesis`
}
object `108` {
  
  inline def apply(): `108` = {
    val __obj = js.Dynamic.literal(dialCode = "+852", id = "HK", label = "Hong Kong (\u9999\u6E2F)")
    __obj.asInstanceOf[`108`]
  }
  
  extension [Self <: `108`](x: Self) {
    
    inline def setDialCode(value: Plussign852): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: HK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Hong Kong Leftparenthesis香港Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
