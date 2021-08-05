package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectOrderFixed extends StObject {
  
  /**
    * Two-element array:
    * 0: Column index to order upon.
    * 1: Direction so order to apply ("asc" for ascending order or "desc" for descending order).
    */
  var post: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Two-element array:
    * 0: Column index to order upon.
    * 1: Direction so order to apply ("asc" for ascending order or "desc" for descending order).
    */
  var pre: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object ObjectOrderFixed {
  
  inline def apply(): ObjectOrderFixed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOrderFixed]
  }
  
  extension [Self <: ObjectOrderFixed](x: Self) {
    
    inline def setPost(value: js.Array[js.Any]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setPostVarargs(value: js.Any*): Self = StObject.set(x, "post", js.Array(value :_*))
    
    inline def setPre(value: js.Array[js.Any]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    
    inline def setPreVarargs(value: js.Any*): Self = StObject.set(x, "pre", js.Array(value :_*))
  }
}
