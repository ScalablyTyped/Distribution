package typings.contentfulManagement.tagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagApi extends js.Object {
  
  def delete(): js.Promise[Unit] = js.native
  
  def update(): js.Promise[Tag] = js.native
}
object TagApi {
  
  @scala.inline
  def apply(delete: () => js.Promise[Unit], update: () => js.Promise[Tag]): TagApi = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[TagApi]
  }
  
  @scala.inline
  implicit class TagApiOps[Self <: TagApi] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: () => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => js.Promise[Tag]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
