package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign260
import typings.baseui.baseuiStrings.ZM
import typings.baseui.baseuiStrings.Zambia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `233` extends StObject {
  
  var dialCode: Plussign260
  
  var id: ZM
  
  var label: Zambia
}
object `233` {
  
  @scala.inline
  def apply(): `233` = {
    val __obj = js.Dynamic.literal(dialCode = "+260", id = "ZM", label = "Zambia")
    __obj.asInstanceOf[`233`]
  }
  
  @scala.inline
  implicit class `233MutableBuilder`[Self <: `233`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign260): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ZM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Zambia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
