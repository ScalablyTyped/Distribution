package typings.browserfs.dropboxMod

import typings.dropboxjs.Dropbox.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropboxFileSystemOptions extends js.Object {
  var client: Client = js.native
}

object DropboxFileSystemOptions {
  @scala.inline
  def apply(client: Client): DropboxFileSystemOptions = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropboxFileSystemOptions]
  }
  @scala.inline
  implicit class DropboxFileSystemOptionsOps[Self <: DropboxFileSystemOptions] (val x: Self) extends AnyVal {
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
    def setClient(value: Client): Self = this.set("client", value.asInstanceOf[js.Any])
  }
  
}

