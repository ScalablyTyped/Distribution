package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snackbar extends StObject {
  
  var button: js.UndefOr[js.Object] = js.undefined
  
  var snackbar: js.UndefOr[js.Object] = js.undefined
}
object Snackbar {
  
  inline def apply(): Snackbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snackbar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Snackbar] (val x: Self) extends AnyVal {
    
    inline def setButton(value: js.Object): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setSnackbar(value: js.Object): Self = StObject.set(x, "snackbar", value.asInstanceOf[js.Any])
    
    inline def setSnackbarUndefined: Self = StObject.set(x, "snackbar", js.undefined)
  }
}
