package typings.backblazeB2.mod

import typings.node.Buffer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileOpts extends CommonArgs {
  /**
    * data length
    * @default  data.byteLength or data.length
    */
  var contentLength: js.UndefOr[Double] = js.undefined
  var data: Buffer
  var fileName: String
  /**
    * data hash
    * @default sha1(data)
    */
  var hash: js.UndefOr[String] = js.undefined
  /**
    * info headers, prepended with X-Bz-Info- when sent,
    * throws error if more than 10 keys set.
    * valid characters should be a-z, A-Z and '-',
    * all other characters will cause an error to be thrown
    */
  var info: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * mime type
    * @default 'b2/x-auto'
    */
  var mime: js.UndefOr[String] = js.undefined
  var onUploadProgress: js.UndefOr[UploadProgressFn | Null] = js.undefined
  var uploadAuthToken: String
  var uploadUrl: String
}

object UploadFileOpts {
  @scala.inline
  def apply(
    data: Buffer,
    fileName: String,
    uploadAuthToken: String,
    uploadUrl: String,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null,
    contentLength: js.UndefOr[Double] = js.undefined,
    hash: String = null,
    info: Record[String, String] = null,
    mime: String = null,
    onUploadProgress: js.UndefOr[Null | (/* event */ js.Any => Unit)] = js.undefined
  ): UploadFileOpts = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], uploadAuthToken = uploadAuthToken.asInstanceOf[js.Any], uploadUrl = uploadUrl.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(contentLength)) __obj.updateDynamic("contentLength")(contentLength.get.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (!js.isUndefined(onUploadProgress)) __obj.updateDynamic("onUploadProgress")(if (onUploadProgress != null) js.Any.fromFunction1(onUploadProgress.asInstanceOf[/* event */ js.Any => Unit]) else null)
    __obj.asInstanceOf[UploadFileOpts]
  }
}

