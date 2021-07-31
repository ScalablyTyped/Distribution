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
  
  @scala.inline
  def apply[TData](data: TData): ListItem[TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], next = null, prev = null)
    __obj.asInstanceOf[ListItem[TData]]
  }
  
  @scala.inline
  implicit class ListItemMutableBuilder[Self <: ListItem[?], TData] (val x: Self & ListItem[TData]) extends AnyVal {
    
    @scala.inline
    def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: ListItem[TData]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNull: Self = StObject.set(x, "next", null)
    
    @scala.inline
    def setPrev(value: ListItem[TData]): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevNull: Self = StObject.set(x, "prev", null)
  }
}
