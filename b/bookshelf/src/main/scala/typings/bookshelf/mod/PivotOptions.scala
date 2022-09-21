package typings.bookshelf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotOptions extends StObject {
  
  var query: js.UndefOr[js.Function | Any] = js.undefined
  
  var require: js.UndefOr[Boolean] = js.undefined
}
object PivotOptions {
  
  inline def apply(): PivotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotOptions]
  }
  
  extension [Self <: PivotOptions](x: Self) {
    
    inline def setQuery(value: js.Function | Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRequire(value: Boolean): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
  }
}
