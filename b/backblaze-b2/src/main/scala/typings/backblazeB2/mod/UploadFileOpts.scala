package typings.backblazeB2.mod

import typings.node.Buffer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadFileOpts extends CommonArgs {
  /**
    * data length
    * @default  data.byteLength or data.length
    */
  var contentLength: js.UndefOr[Double] = js.native
  var data: Buffer = js.native
  var fileName: String = js.native
  /**
    * data hash
    * @default sha1(data)
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * info headers, prepended with X-Bz-Info- when sent,
    * throws error if more than 10 keys set.
    * valid characters should be a-z, A-Z and '-',
    * all other characters will cause an error to be thrown
    */
  var info: js.UndefOr[Record[String, String]] = js.native
  /**
    * mime type
    * @default 'b2/x-auto'
    */
  var mime: js.UndefOr[String] = js.native
  var onUploadProgress: js.UndefOr[UploadProgressFn | Null] = js.native
  var uploadAuthToken: String = js.native
  var uploadUrl: String = js.native
}

object UploadFileOpts {
  @scala.inline
  def apply(data: Buffer, fileName: String, uploadAuthToken: String, uploadUrl: String): UploadFileOpts = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], uploadAuthToken = uploadAuthToken.asInstanceOf[js.Any], uploadUrl = uploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOpts]
  }
  @scala.inline
  implicit class UploadFileOptsOps[Self <: UploadFileOpts] (val x: Self) extends AnyVal {
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
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadAuthToken(value: String): Self = this.set("uploadAuthToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadUrl(value: String): Self = this.set("uploadUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentLength(value: Double): Self = this.set("contentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentLength: Self = this.set("contentLength", js.undefined)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setInfo(value: Record[String, String]): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    @scala.inline
    def setOnUploadProgress(value: /* event */ js.Any => Unit): Self = this.set("onUploadProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUploadProgress: Self = this.set("onUploadProgress", js.undefined)
    @scala.inline
    def setOnUploadProgressNull: Self = this.set("onUploadProgress", null)
  }
  
}

