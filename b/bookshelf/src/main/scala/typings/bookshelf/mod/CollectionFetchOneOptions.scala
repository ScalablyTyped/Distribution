package typings.bookshelf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionFetchOneOptions extends StObject {
  
  var columns: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var require: js.UndefOr[Boolean] = js.undefined
}
object CollectionFetchOneOptions {
  
  inline def apply(): CollectionFetchOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionFetchOneOptions]
  }
  
  extension [Self <: CollectionFetchOneOptions](x: Self) {
    
    inline def setColumns(value: String | js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setRequire(value: Boolean): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
  }
}
