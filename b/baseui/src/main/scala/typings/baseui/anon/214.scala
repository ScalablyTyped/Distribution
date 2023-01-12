package typings.baseui.anon

import typings.baseui.baseuiStrings.LK
import typings.baseui.baseuiStrings.Plussign94
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `214` extends StObject {
  
  val dialCode: Plussign94
  
  val id: LK
  
  val label: /* Sri Lanka (ශ්‍රී ලංකාව) */ String
}
object `214` {
  
  inline def apply(): `214` = {
    val __obj = js.Dynamic.literal(dialCode = "+94", id = "LK", label = "Sri Lanka (\u0DC1\u0DCA\u200D\u0DBB\u0DD3 \u0DBD\u0D82\u0D9A\u0DCF\u0DC0)")
    __obj.asInstanceOf[`214`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `214`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign94): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Sri Lanka (ශ්‍රී ලංකාව) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
