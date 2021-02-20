package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyOptions extends StObject {
  
  var keepFocus: js.UndefOr[Boolean] = js.native
  
  var modifiers: js.UndefOr[String] = js.native
  
  var reset: js.UndefOr[Boolean] = js.native
}
object KeyOptions {
  
  @scala.inline
  def apply(): KeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyOptions]
  }
  
  @scala.inline
  implicit class KeyOptionsMutableBuilder[Self <: KeyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeepFocus(value: Boolean): Self = StObject.set(x, "keepFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepFocusUndefined: Self = StObject.set(x, "keepFocus", js.undefined)
    
    @scala.inline
    def setModifiers(value: String): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
  }
}
