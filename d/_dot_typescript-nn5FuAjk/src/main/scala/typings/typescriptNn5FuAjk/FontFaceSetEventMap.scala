package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFaceSetEventMap extends StObject {
  
  var loading: Event
  
  var loadingdone: Event
  
  var loadingerror: Event
}
object FontFaceSetEventMap {
  
  inline def apply(loading: Event, loadingdone: Event, loadingerror: Event): FontFaceSetEventMap = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], loadingdone = loadingdone.asInstanceOf[js.Any], loadingerror = loadingerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFaceSetEventMap]
  }
  
  extension [Self <: FontFaceSetEventMap](x: Self) {
    
    inline def setLoading(value: Event): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingdone(value: Event): Self = StObject.set(x, "loadingdone", value.asInstanceOf[js.Any])
    
    inline def setLoadingerror(value: Event): Self = StObject.set(x, "loadingerror", value.asInstanceOf[js.Any])
  }
}
