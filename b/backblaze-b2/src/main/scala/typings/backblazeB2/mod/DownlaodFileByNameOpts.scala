package typings.backblazeB2.mod

import typings.backblazeB2.backblazeB2Strings.arraybuffer
import typings.backblazeB2.backblazeB2Strings.blob
import typings.backblazeB2.backblazeB2Strings.document
import typings.backblazeB2.backblazeB2Strings.json
import typings.backblazeB2.backblazeB2Strings.stream
import typings.backblazeB2.backblazeB2Strings.text
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownlaodFileByNameOpts extends DownloadFileOpts {
  var bucketName: String
  var fileName: String
}

object DownlaodFileByNameOpts {
  @scala.inline
  def apply(
    bucketName: String,
    fileName: String,
    responseType: arraybuffer | blob | document | json | text | stream,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null,
    onDownloadProgress: js.UndefOr[Null | (/* event */ js.Any => Unit)] = js.undefined
  ): DownlaodFileByNameOpts = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(onDownloadProgress)) __obj.updateDynamic("onDownloadProgress")(if (onDownloadProgress != null) js.Any.fromFunction1(onDownloadProgress.asInstanceOf[/* event */ js.Any => Unit]) else null)
    __obj.asInstanceOf[DownlaodFileByNameOpts]
  }
}

