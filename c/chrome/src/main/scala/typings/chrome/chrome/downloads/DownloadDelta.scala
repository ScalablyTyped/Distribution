package typings.chrome.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadDelta extends js.Object {
  /** Optional. The change in canResume, if any.  */
  var canResume: js.UndefOr[BooleanDelta] = js.undefined
  /** Optional. The change in danger, if any.  */
  var danger: js.UndefOr[StringDelta] = js.undefined
  /** Optional. The change in endTime, if any.  */
  var endTime: js.UndefOr[StringDelta] = js.undefined
  /** Optional. The change in error, if any.  */
  var error: js.UndefOr[StringDelta] = js.undefined
  /** Optional. The change in exists, if any.  */
  var exists: js.UndefOr[BooleanDelta] = js.undefined
  /** Optional. The change in fileSize, if any.  */
  var fileSize: js.UndefOr[DoubleDelta] = js.undefined
  /** Optional. The change in filename, if any.  */
  var filename: js.UndefOr[StringDelta] = js.undefined
  /**
    * Optional. The change in finalUrl, if any.
    * @since Since Chrome 54.
    */
  var finalUrl: StringDelta
  /** The id of the DownloadItem that changed. */
  var id: Double
  /** Optional. The change in mime, if any.  */
  var mime: js.UndefOr[StringDelta] = js.undefined
  /** Optional. The change in paused, if any.  */
  var paused: js.UndefOr[BooleanDelta] = js.undefined
  /** Optional. The change in startTime, if any.  */
  var startTime: js.UndefOr[StringDelta] = js.undefined
  /** Optional. The change in state, if any.  */
  var state: js.UndefOr[StringDelta] = js.undefined
  /** Optional. The change in totalBytes, if any.  */
  var totalBytes: js.UndefOr[DoubleDelta] = js.undefined
  /** Optional. The change in url, if any.  */
  var url: js.UndefOr[StringDelta] = js.undefined
}

object DownloadDelta {
  @scala.inline
  def apply(
    finalUrl: StringDelta,
    id: Double,
    canResume: BooleanDelta = null,
    danger: StringDelta = null,
    endTime: StringDelta = null,
    error: StringDelta = null,
    exists: BooleanDelta = null,
    fileSize: DoubleDelta = null,
    filename: StringDelta = null,
    mime: StringDelta = null,
    paused: BooleanDelta = null,
    startTime: StringDelta = null,
    state: StringDelta = null,
    totalBytes: DoubleDelta = null,
    url: StringDelta = null
  ): DownloadDelta = {
    val __obj = js.Dynamic.literal(finalUrl = finalUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (canResume != null) __obj.updateDynamic("canResume")(canResume.asInstanceOf[js.Any])
    if (danger != null) __obj.updateDynamic("danger")(danger.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (exists != null) __obj.updateDynamic("exists")(exists.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (paused != null) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (totalBytes != null) __obj.updateDynamic("totalBytes")(totalBytes.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadDelta]
  }
}

