package typings.ckeditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusInited extends StObject {
  
  var focusInited: js.UndefOr[Boolean] = js.native
  
  var initOnlyNew: js.UndefOr[Boolean] = js.native
}
object FocusInited {
  
  @scala.inline
  def apply(): FocusInited = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusInited]
  }
  
  @scala.inline
  implicit class FocusInitedMutableBuilder[Self <: FocusInited] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusInited(value: Boolean): Self = StObject.set(x, "focusInited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusInitedUndefined: Self = StObject.set(x, "focusInited", js.undefined)
    
    @scala.inline
    def setInitOnlyNew(value: Boolean): Self = StObject.set(x, "initOnlyNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitOnlyNewUndefined: Self = StObject.set(x, "initOnlyNew", js.undefined)
  }
}
