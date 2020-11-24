package typings.browserfs.asyncMirrorMod

import typings.browserfs.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncMirrorOptions extends js.Object {
  
  var async: FileSystem = js.native
  
  var sync: FileSystem = js.native
}
object AsyncMirrorOptions {
  
  @scala.inline
  def apply(async: FileSystem, sync: FileSystem): AsyncMirrorOptions = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncMirrorOptions]
  }
  
  @scala.inline
  implicit class AsyncMirrorOptionsOps[Self <: AsyncMirrorOptions] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: FileSystem): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSync(value: FileSystem): Self = this.set("sync", value.asInstanceOf[js.Any])
  }
}
