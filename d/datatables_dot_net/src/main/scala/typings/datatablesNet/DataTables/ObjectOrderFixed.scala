package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectOrderFixed extends StObject {
  
  /**
    * Two-element array:
    * 0: Column index to order upon.
    * 1: Direction so order to apply ("asc" for ascending order or "desc" for descending order).
    */
  var post: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Two-element array:
    * 0: Column index to order upon.
    * 1: Direction so order to apply ("asc" for ascending order or "desc" for descending order).
    */
  var pre: js.UndefOr[js.Array[_]] = js.native
}
object ObjectOrderFixed {
  
  @scala.inline
  def apply(): ObjectOrderFixed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOrderFixed]
  }
  
  @scala.inline
  implicit class ObjectOrderFixedMutableBuilder[Self <: ObjectOrderFixed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPost(value: js.Array[_]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    @scala.inline
    def setPostVarargs(value: js.Any*): Self = StObject.set(x, "post", js.Array(value :_*))
    
    @scala.inline
    def setPre(value: js.Array[_]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    
    @scala.inline
    def setPreVarargs(value: js.Any*): Self = StObject.set(x, "pre", js.Array(value :_*))
  }
}
