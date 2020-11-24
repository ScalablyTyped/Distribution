package typings.cpx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncOptions extends js.Object {
  
  /** remove files that copied on past before copy. */
  var clean: js.UndefOr[Boolean] = js.native
  
  /** Follow symbolic links when copying from them. */
  var dereference: js.UndefOr[Boolean] = js.native
  
  /** Copy empty directories which is matched with the glob. */
  var includeEmptyDirs: js.UndefOr[Boolean] = js.native
  
  /** Preserve UID, GID, ATIME, and MTIME of files. */
  var preserve: js.UndefOr[Boolean] = js.native
  
  /** Do not overwrite files on destination if the source file is older. */
  var update: js.UndefOr[Boolean] = js.native
}
object SyncOptions {
  
  @scala.inline
  def apply(): SyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncOptions]
  }
  
  @scala.inline
  implicit class SyncOptionsOps[Self <: SyncOptions] (val x: Self) extends AnyVal {
    
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
    def setClean(value: Boolean): Self = this.set("clean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClean: Self = this.set("clean", js.undefined)
    
    @scala.inline
    def setDereference(value: Boolean): Self = this.set("dereference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDereference: Self = this.set("dereference", js.undefined)
    
    @scala.inline
    def setIncludeEmptyDirs(value: Boolean): Self = this.set("includeEmptyDirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeEmptyDirs: Self = this.set("includeEmptyDirs", js.undefined)
    
    @scala.inline
    def setPreserve(value: Boolean): Self = this.set("preserve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserve: Self = this.set("preserve", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
