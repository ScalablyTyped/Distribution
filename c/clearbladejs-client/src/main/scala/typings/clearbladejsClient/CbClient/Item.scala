package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends js.Object {
  
  var data: js.Object = js.native
  
  def destroy(callback: CbCallback): Unit = js.native
  
  def refresh(callback: CbCallback): Unit = js.native
  
  def save(callback: CbCallback): Unit = js.native
}
object Item {
  
  @scala.inline
  def apply(
    data: js.Object,
    destroy: CbCallback => Unit,
    refresh: CbCallback => Unit,
    save: CbCallback => Unit
  ): Item = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction1(destroy), refresh = js.Any.fromFunction1(refresh), save = js.Any.fromFunction1(save))
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: CbCallback => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefresh(value: CbCallback => Unit): Self = this.set("refresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSave(value: CbCallback => Unit): Self = this.set("save", js.Any.fromFunction1(value))
  }
}
