package typings.browserfs.distNodeBackendFolderAdapterMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
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
    val __obj = js.Dynamic.literal(folder = folder, wrapped = wrapped)
  
    __obj.asInstanceOf[FolderAdapterOptions]
  }
}

