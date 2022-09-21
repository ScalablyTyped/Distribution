package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOptions extends StObject {
  
  var filter: FilterMode
  
  var mipmap: js.UndefOr[MipmapMode] = js.undefined
}
object FilterOptions {
  
  inline def apply(filter: FilterMode): FilterOptions = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions]
  }
  
  extension [Self <: FilterOptions](x: Self) {
    
    inline def setFilter(value: FilterMode): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setMipmap(value: MipmapMode): Self = StObject.set(x, "mipmap", value.asInstanceOf[js.Any])
    
    inline def setMipmapUndefined: Self = StObject.set(x, "mipmap", js.undefined)
  }
}
