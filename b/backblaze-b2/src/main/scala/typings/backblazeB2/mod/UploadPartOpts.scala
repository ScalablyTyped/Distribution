package typings.backblazeB2.mod

import typings.node.Buffer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadPartOpts extends CommonArgs {
  var contentLength: js.UndefOr[Double] = js.undefined
  var data: Buffer
  var hash: js.UndefOr[String] = js.undefined
  var onUploadProgress: js.UndefOr[UploadProgressFn | Null] = js.undefined
  /**
    * part number: 1 to 10000
    */
  var partNumber: Double
  var uploadAuthToken: String
  var uploadUrl: String
}

object UploadPartOpts {
  @scala.inline
  def apply(
    data: Buffer,
    partNumber: Double,
    uploadAuthToken: String,
    uploadUrl: String,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null,
    contentLength: js.UndefOr[Double] = js.undefined,
    hash: String = null,
    onUploadProgress: js.UndefOr[Null | (/* event */ js.Any => Unit)] = js.undefined
  ): UploadPartOpts = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], partNumber = partNumber.asInstanceOf[js.Any], uploadAuthToken = uploadAuthToken.asInstanceOf[js.Any], uploadUrl = uploadUrl.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(contentLength)) __obj.updateDynamic("contentLength")(contentLength.get.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(onUploadProgress)) __obj.updateDynamic("onUploadProgress")(if (onUploadProgress != null) js.Any.fromFunction1(onUploadProgress.asInstanceOf[/* event */ js.Any => Unit]) else null)
    __obj.asInstanceOf[UploadPartOpts]
  }
}

