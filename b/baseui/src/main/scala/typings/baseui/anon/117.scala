package typings.baseui.anon

import typings.baseui.baseuiStrings.JP
import typings.baseui.baseuiStrings.Plussign81
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `117` extends StObject {
  
  val dialCode: Plussign81
  
  val id: JP
  
  val label: /* Japan (日本) */ String
}
object `117` {
  
  inline def apply(): `117` = {
    val __obj = js.Dynamic.literal(dialCode = "+81", id = "JP", label = "Japan (\u65E5\u672C)")
    __obj.asInstanceOf[`117`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `117`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign81): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: JP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Japan (日本) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
