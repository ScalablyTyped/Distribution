package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItem[TData] extends StObject {
  
  var data: TData = js.native
  
  var next: ListItem[TData] | Null = js.native
  
  var prev: ListItem[TData] | Null = js.native
}
object ListItem {
  
  @scala.inline
  def apply[TData](data: TData): ListItem[TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem[TData]]
  }
  
  @scala.inline
  implicit class ListItemMutableBuilder[Self <: ListItem[_], TData] (val x: Self with ListItem[TData]) extends AnyVal {
    
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
