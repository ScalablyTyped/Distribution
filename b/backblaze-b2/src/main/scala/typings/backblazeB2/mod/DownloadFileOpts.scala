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

trait DownloadFileOpts extends CommonArgs {
  var onDownloadProgress: js.UndefOr[UploadProgressFn | Null] = js.undefined
  var responseType: arraybuffer | blob | document | json | text | stream
}

object DownloadFileOpts {
  @scala.inline
  def apply(
    responseType: arraybuffer | blob | document | json | text | stream,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null,
    onDownloadProgress: js.UndefOr[Null | (/* event */ js.Any => Unit)] = js.undefined
  ): DownloadFileOpts = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(onDownloadProgress)) __obj.updateDynamic("onDownloadProgress")(if (onDownloadProgress != null) js.Any.fromFunction1(onDownloadProgress.asInstanceOf[/* event */ js.Any => Unit]) else null)
    __obj.asInstanceOf[DownloadFileOpts]
  }
}

