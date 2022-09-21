package typings.bookshelf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchOptions
  extends StObject
     with SyncOptions {
  
  var columns: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** @default true */
  var require: js.UndefOr[Boolean] = js.undefined
  
  var withRelated: js.UndefOr[js.Array[String | WithRelatedQuery]] = js.undefined
}
object FetchOptions {
  
  inline def apply(): FetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions]
  }
  
  extension [Self <: FetchOptions](x: Self) {
    
    inline def setColumns(value: String | js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setRequire(value: Boolean): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    inline def setWithRelated(value: js.Array[String | WithRelatedQuery]): Self = StObject.set(x, "withRelated", value.asInstanceOf[js.Any])
    
    inline def setWithRelatedUndefined: Self = StObject.set(x, "withRelated", js.undefined)
    
    inline def setWithRelatedVarargs(value: (String | WithRelatedQuery)*): Self = StObject.set(x, "withRelated", js.Array(value*))
  }
}
