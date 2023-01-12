package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign66
import typings.baseui.baseuiStrings.TH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `225` extends StObject {
  
  val dialCode: Plussign66
  
  val id: TH
  
  val label: /* Thailand (ไทย) */ String
}
object `225` {
  
  inline def apply(): `225` = {
    val __obj = js.Dynamic.literal(dialCode = "+66", id = "TH", label = "Thailand (\u0E44\u0E17\u0E22)")
    __obj.asInstanceOf[`225`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `225`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign66): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Thailand (ไทย) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
