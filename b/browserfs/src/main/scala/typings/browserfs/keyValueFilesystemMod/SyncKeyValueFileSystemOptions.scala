package typings.browserfs.keyValueFilesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncKeyValueFileSystemOptions extends js.Object {
  
  /**
    * The actual key-value store to read from/write to.
    */
  var store: SyncKeyValueStore = js.native
}
object SyncKeyValueFileSystemOptions {
  
  @scala.inline
  def apply(store: SyncKeyValueStore): SyncKeyValueFileSystemOptions = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncKeyValueFileSystemOptions]
  }
  
  @scala.inline
  implicit class SyncKeyValueFileSystemOptionsOps[Self <: SyncKeyValueFileSystemOptions] (val x: Self) extends AnyVal {
    
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
    def setStore(value: SyncKeyValueStore): Self = this.set("store", value.asInstanceOf[js.Any])
  }
}
