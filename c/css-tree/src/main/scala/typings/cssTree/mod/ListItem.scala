package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItem[TData] extends StObject {
  
  var data: TData
  
  var next: ListItem[TData] | Null
  
  var prev: ListItem[TData] | Null
}
object ListItem {
  
  inline def apply[TData](data: TData): ListItem[TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], next = null, prev = null)
    __obj.asInstanceOf[ListItem[TData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListItem[?], TData] (val x: Self & ListItem[TData]) extends AnyVal {
    
    inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setNext(value: ListItem[TData]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setPrev(value: ListItem[TData]): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevNull: Self = StObject.set(x, "prev", null)
  }
}
