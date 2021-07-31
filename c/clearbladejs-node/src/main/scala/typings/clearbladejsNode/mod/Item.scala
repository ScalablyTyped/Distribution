package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var data: js.Object
  
  def destroy(): Unit
  
  def refresh(): Unit
  
  def save(): Unit
}
object Item {
  
  @scala.inline
  def apply(data: js.Object, destroy: () => Unit, refresh: () => Unit, save: () => Unit): Item = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), refresh = js.Any.fromFunction0(refresh), save = js.Any.fromFunction0(save))
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
  }
}
