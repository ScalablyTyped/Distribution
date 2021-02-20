package typings.chui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback extends StObject {
  
  var callback: js.UndefOr[js.Function] = js.native
  
  var cancelButton: js.UndefOr[String] = js.native
  
  var continueButton: js.UndefOr[String] = js.native
  
  var empty: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object Callback {
  
  @scala.inline
  def apply(): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setCancelButton(value: String): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
    
    @scala.inline
    def setContinueButton(value: String): Self = StObject.set(x, "continueButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueButtonUndefined: Self = StObject.set(x, "continueButton", js.undefined)
    
    @scala.inline
    def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
