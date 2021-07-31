package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormOptions
  extends StObject
     with BoxOptions {
  
  /**
    * Allow default keys (tab, vi keys, enter).
    */
  @JSName("keys")
  var keys_FormOptions: js.UndefOr[js.Any] = js.undefined
}
object FormOptions {
  
  @scala.inline
  def apply(): FormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormOptions]
  }
  
  @scala.inline
  implicit class FormOptionsMutableBuilder[Self <: FormOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Any): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
  }
}
