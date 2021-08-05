package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loading extends StObject {
  
  var loading: Boolean
  
  var renderMode: typings.blueprintjsTable.renderModeMod.RenderMode
}
object Loading {
  
  inline def apply(loading: Boolean, renderMode: typings.blueprintjsTable.renderModeMod.RenderMode): Loading = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loading]
  }
  
  extension [Self <: Loading](x: Self) {
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setRenderMode(value: typings.blueprintjsTable.renderModeMod.RenderMode): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
  }
}
