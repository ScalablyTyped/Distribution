package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign685
import typings.baseui.baseuiStrings.Samoa
import typings.baseui.baseuiStrings.WS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `179` extends StObject {
  
  var dialCode: Plussign685
  
  var id: WS
  
  var label: Samoa
}
object `179` {
  
  @scala.inline
  def apply(): `179` = {
    val __obj = js.Dynamic.literal(dialCode = "+685", id = "WS", label = "Samoa")
    __obj.asInstanceOf[`179`]
  }
  
  @scala.inline
  implicit class `179MutableBuilder`[Self <: `179`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign685): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: WS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Samoa): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
