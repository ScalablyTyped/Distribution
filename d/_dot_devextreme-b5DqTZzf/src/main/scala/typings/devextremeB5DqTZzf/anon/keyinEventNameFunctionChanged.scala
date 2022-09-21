package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in .devextreme-b5DqTZzf..devextreme-b5DqTZzf.DevExpress.data.DataSource.EventName ]:? std.Function} */
trait keyinEventNameFunctionChanged extends StObject {
  
  var changed: js.UndefOr[js.Function] = js.undefined
  
  var loadError: js.UndefOr[js.Function] = js.undefined
  
  var loadingChanged: js.UndefOr[js.Function] = js.undefined
}
object keyinEventNameFunctionChanged {
  
  inline def apply(): keyinEventNameFunctionChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinEventNameFunctionChanged]
  }
  
  extension [Self <: keyinEventNameFunctionChanged](x: Self) {
    
    inline def setChanged(value: js.Function): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
    
    inline def setLoadError(value: js.Function): Self = StObject.set(x, "loadError", value.asInstanceOf[js.Any])
    
    inline def setLoadErrorUndefined: Self = StObject.set(x, "loadError", js.undefined)
    
    inline def setLoadingChanged(value: js.Function): Self = StObject.set(x, "loadingChanged", value.asInstanceOf[js.Any])
    
    inline def setLoadingChangedUndefined: Self = StObject.set(x, "loadingChanged", js.undefined)
  }
}
