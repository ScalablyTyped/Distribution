package typings.bootbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootboxButton extends StObject {
  
  var callback: js.UndefOr[js.Function0[_]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
}
object BootboxButton {
  
  @scala.inline
  def apply(): BootboxButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootboxButton]
  }
  
  @scala.inline
  implicit class BootboxButtonMutableBuilder[Self <: BootboxButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: () => _): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
