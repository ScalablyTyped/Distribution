package typings.browserfs.folderAdapterMod

import typings.browserfs.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderAdapterOptions extends js.Object {
  var folder: String
  var wrapped: FileSystem
}

object FolderAdapterOptions {
  @scala.inline
  def apply(folder: String, wrapped: FileSystem): FolderAdapterOptions = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], wrapped = wrapped.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FolderAdapterOptions]
  }
}

