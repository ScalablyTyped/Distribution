package typings.browserfs.folderAdapterMod

import typings.browserfs.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FolderAdapterOptions extends js.Object {
  var folder: String = js.native
  var wrapped: FileSystem = js.native
}

object FolderAdapterOptions {
  @scala.inline
  def apply(folder: String, wrapped: FileSystem): FolderAdapterOptions = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], wrapped = wrapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderAdapterOptions]
  }
  @scala.inline
  implicit class FolderAdapterOptionsOps[Self <: FolderAdapterOptions] (val x: Self) extends AnyVal {
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
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapped(value: FileSystem): Self = this.set("wrapped", value.asInstanceOf[js.Any])
  }
  
}

