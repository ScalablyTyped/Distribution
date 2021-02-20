package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonKey extends StObject {
  
  var altKey: js.UndefOr[Boolean] = js.native
  
  var ctrlKey: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var metaKey: js.UndefOr[Boolean] = js.native
  
  var shiftKey: js.UndefOr[Boolean] = js.native
}
object ButtonKey {
  
  @scala.inline
  def apply(): ButtonKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonKey]
  }
  
  @scala.inline
  implicit class ButtonKeyMutableBuilder[Self <: ButtonKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
  }
}
