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
  var keys_FormOptions: js.UndefOr[Any] = js.undefined
}
object FormOptions {
  
  inline def apply(): FormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormOptions] (val x: Self) extends AnyVal {
    
    inline def setKeys(value: Any): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
  }
}
