package typings.browserfs.keyValueFilesystemMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleSyncStore extends js.Object {
  
  def del(key: String): Unit = js.native
  
  def get(key: String): js.UndefOr[Buffer] = js.native
  
  def put(key: String, data: Buffer, overwrite: Boolean): Boolean = js.native
}
object SimpleSyncStore {
  
  @scala.inline
  def apply(del: String => Unit, get: String => js.UndefOr[Buffer], put: (String, Buffer, Boolean) => Boolean): SimpleSyncStore = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), put = js.Any.fromFunction3(put))
    __obj.asInstanceOf[SimpleSyncStore]
  }
  
  @scala.inline
  implicit class SimpleSyncStoreOps[Self <: SimpleSyncStore] (val x: Self) extends AnyVal {
    
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
    def setDel(value: String => Unit): Self = this.set("del", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.UndefOr[Buffer]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPut(value: (String, Buffer, Boolean) => Boolean): Self = this.set("put", js.Any.fromFunction3(value))
  }
}
