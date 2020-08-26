package typings.backblazeB2.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadPartOpts extends CommonArgs {
  var contentLength: js.UndefOr[Double] = js.native
  var data: Buffer = js.native
  var hash: js.UndefOr[String] = js.native
  var onUploadProgress: js.UndefOr[UploadProgressFn | Null] = js.native
  /**
    * part number: 1 to 10000
    */
  var partNumber: Double = js.native
  var uploadAuthToken: String = js.native
  var uploadUrl: String = js.native
}

object UploadPartOpts {
  @scala.inline
  def apply(data: Buffer, partNumber: Double, uploadAuthToken: String, uploadUrl: String): UploadPartOpts = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], partNumber = partNumber.asInstanceOf[js.Any], uploadAuthToken = uploadAuthToken.asInstanceOf[js.Any], uploadUrl = uploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPartOpts]
  }
  @scala.inline
  implicit class UploadPartOptsOps[Self <: UploadPartOpts] (val x: Self) extends AnyVal {
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
    def setPartNumber(value: Double): Self = this.set("partNumber", value.asInstanceOf[js.Any])
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
    def setOnUploadProgress(value: /* event */ js.Any => Unit): Self = this.set("onUploadProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUploadProgress: Self = this.set("onUploadProgress", js.undefined)
    @scala.inline
    def setOnUploadProgressNull: Self = this.set("onUploadProgress", null)
  }
  
}

