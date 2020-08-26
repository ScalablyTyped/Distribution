package typings.backblazeB2.anon

import typings.backblazeB2.backblazeB2Strings.arraybuffer
import typings.backblazeB2.backblazeB2Strings.blob
import typings.backblazeB2.backblazeB2Strings.document
import typings.backblazeB2.backblazeB2Strings.json
import typings.backblazeB2.backblazeB2Strings.stream
import typings.backblazeB2.backblazeB2Strings.text
import typings.backblazeB2.mod.UploadProgressFn
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  fileId :string} & backblaze-b2.backblaze-b2.DownloadFileOpts */
@js.native
trait fileIdstringDownloadFileO extends js.Object {
  var axios: js.UndefOr[Record[String, _]] = js.native
  var axiosOverride: js.UndefOr[Record[String, _]] = js.native
  var fileId: String = js.native
  var onDownloadProgress: js.UndefOr[UploadProgressFn | Null] = js.native
  var responseType: arraybuffer | blob | document | json | text | stream = js.native
}

object fileIdstringDownloadFileO {
  @scala.inline
  def apply(fileId: String, responseType: arraybuffer | blob | document | json | text | stream): fileIdstringDownloadFileO = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[fileIdstringDownloadFileO]
  }
  @scala.inline
  implicit class fileIdstringDownloadFileOOps[Self <: fileIdstringDownloadFileO] (val x: Self) extends AnyVal {
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
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseType(value: arraybuffer | blob | document | json | text | stream): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxios(value: Record[String, _]): Self = this.set("axios", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxios: Self = this.set("axios", js.undefined)
    @scala.inline
    def setAxiosOverride(value: Record[String, _]): Self = this.set("axiosOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxiosOverride: Self = this.set("axiosOverride", js.undefined)
    @scala.inline
    def setOnDownloadProgress(value: /* event */ js.Any => Unit): Self = this.set("onDownloadProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDownloadProgress: Self = this.set("onDownloadProgress", js.undefined)
    @scala.inline
    def setOnDownloadProgressNull: Self = this.set("onDownloadProgress", null)
  }
  
}

