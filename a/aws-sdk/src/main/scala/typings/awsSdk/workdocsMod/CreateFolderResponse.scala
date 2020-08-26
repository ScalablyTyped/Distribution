package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFolderResponse extends js.Object {
  /**
    * The metadata of the folder.
    */
  var Metadata: js.UndefOr[FolderMetadata] = js.native
}

object CreateFolderResponse {
  @scala.inline
  def apply(): CreateFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFolderResponse]
  }
  @scala.inline
  implicit class CreateFolderResponseOps[Self <: CreateFolderResponse] (val x: Self) extends AnyVal {
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
    def setMetadata(value: FolderMetadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
  }
  
}

