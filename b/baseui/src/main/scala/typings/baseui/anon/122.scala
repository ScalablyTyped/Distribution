package typings.baseui.anon

import typings.baseui.baseuiStrings.MY
import typings.baseui.baseuiStrings.Malaysia
import typings.baseui.baseuiStrings.Plussign60
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `122` extends StObject {
  
  var dialCode: Plussign60
  
  var id: MY
  
  var label: Malaysia
}
object `122` {
  
  @scala.inline
  def apply(): `122` = {
    val __obj = js.Dynamic.literal(dialCode = "+60", id = "MY", label = "Malaysia")
    __obj.asInstanceOf[`122`]
  }
  
  @scala.inline
  implicit class `122MutableBuilder`[Self <: `122`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign60): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Malaysia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
