package typings.bookshelf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionFetchOptions extends StObject {
  
  var require: js.UndefOr[Boolean] = js.undefined
  
  var withRelated: js.UndefOr[String | js.Array[String]] = js.undefined
}
object CollectionFetchOptions {
  
  inline def apply(): CollectionFetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionFetchOptions]
  }
  
  extension [Self <: CollectionFetchOptions](x: Self) {
    
    inline def setRequire(value: Boolean): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    inline def setWithRelated(value: String | js.Array[String]): Self = StObject.set(x, "withRelated", value.asInstanceOf[js.Any])
    
    inline def setWithRelatedUndefined: Self = StObject.set(x, "withRelated", js.undefined)
    
    inline def setWithRelatedVarargs(value: String*): Self = StObject.set(x, "withRelated", js.Array(value*))
  }
}
