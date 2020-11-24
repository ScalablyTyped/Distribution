package typings.browserfs.keyValueFilesystemMod

import typings.browserfs.fileSystemMod.BFSCallback
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncKeyValueROTransaction extends js.Object {
  
  /**
    * Retrieves the data at the given key.
    * @param key The key to look under for data.
    */
  def get(key: String, cb: BFSCallback[Buffer]): Unit = js.native
}
object AsyncKeyValueROTransaction {
  
  @scala.inline
  def apply(get: (String, BFSCallback[Buffer]) => Unit): AsyncKeyValueROTransaction = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[AsyncKeyValueROTransaction]
  }
  
  @scala.inline
  implicit class AsyncKeyValueROTransactionOps[Self <: AsyncKeyValueROTransaction] (val x: Self) extends AnyVal {
    
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
    def setGet(value: (String, BFSCallback[Buffer]) => Unit): Self = this.set("get", js.Any.fromFunction2(value))
  }
}
