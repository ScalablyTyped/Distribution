package typings.browserfs.distNodeBackendDropboxMod

import typings.dropboxjs.Dropbox.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropboxFileSystemOptions extends js.Object {
  var client: Client
}

object DropboxFileSystemOptions {
  @scala.inline
  def apply(client: Client): DropboxFileSystemOptions = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DropboxFileSystemOptions]
  }
}

