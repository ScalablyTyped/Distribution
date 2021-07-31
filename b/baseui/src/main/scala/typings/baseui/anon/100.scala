package typings.baseui.anon

import typings.baseui.baseuiStrings.JP
import typings.baseui.baseuiStrings.Plussign81
import typings.baseui.baseuiStrings.`Japan Leftparenthesis日本Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `100` extends StObject {
  
  var dialCode: Plussign81
  
  var id: JP
  
  var label: `Japan Leftparenthesis日本Rightparenthesis`
}
object `100` {
  
  @scala.inline
  def apply(): `100` = {
    val __obj = js.Dynamic.literal(dialCode = "+81", id = "JP", label = "Japan (\u65E5\u672C)")
    __obj.asInstanceOf[`100`]
  }
  
  @scala.inline
  implicit class `100MutableBuilder`[Self <: `100`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign81): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: JP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Japan Leftparenthesis日本Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
