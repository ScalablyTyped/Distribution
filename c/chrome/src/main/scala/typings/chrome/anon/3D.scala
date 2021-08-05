package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3D` extends StObject {
  
  var `3D`: js.UndefOr[Features] = js.undefined
  
  var plugins: js.UndefOr[Npapi] = js.undefined
}
object `3D` {
  
  inline def apply(): `3D` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3D`]
  }
  
  extension [Self <: `3D`](x: Self) {
    
    inline def set3D(value: Features): Self = StObject.set(x, "3D", value.asInstanceOf[js.Any])
    
    inline def set3DUndefined: Self = StObject.set(x, "3D", js.undefined)
    
    inline def setPlugins(value: Npapi): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
  }
}
