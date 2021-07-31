package typings.baseui.anon

import typings.baseui.baseuiStrings.KH
import typings.baseui.baseuiStrings.Plussign855
import typings.baseui.baseuiStrings.`Cambodia Leftparenthesisកម្ពុជាRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  var dialCode: Plussign855
  
  var id: KH
  
  var label: `Cambodia Leftparenthesisកម្ពុជាRightparenthesis`
}
object `29` {
  
  @scala.inline
  def apply(): `29` = {
    val __obj = js.Dynamic.literal(dialCode = "+855", id = "KH", label = "Cambodia (\u1780\u1798\u17D2\u1796\u17BB\u1787\u17B6)")
    __obj.asInstanceOf[`29`]
  }
  
  @scala.inline
  implicit class `29MutableBuilder`[Self <: `29`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign855): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Cambodia Leftparenthesisកម្ពុជាRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
