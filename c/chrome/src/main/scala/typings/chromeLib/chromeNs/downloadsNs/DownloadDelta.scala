package typings
package chromeLib.chromeNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadDelta extends js.Object {
  /** Optional. The change in canResume, if any.  */
  var canResume: js.UndefOr[BooleanDelta] = js.undefined
  /** Optional. The change in danger, if any.  */
  var danger: js.UndefOr[StringDelta] = js.undefined
  /** Optional. The change in endTime, if any.  */
  var endTime: js.UndefOr[DoubleDelta] = js.undefined
  /** Optional. The change in error, if any.  */
  var error: js.UndefOr[StringDelta] = js.undefined
  /** Optional. The change in exists, if any.  */
  var exists: js.UndefOr[BooleanDelta] = js.undefined
  /** Optional. The change in fileSize, if any.  */
  var fileSize: js.UndefOr[DoubleDelta] = js.undefined
  /** Optional. The change in filename, if any.  */
  var filename: js.UndefOr[StringDelta] = js.undefined
  /** The id of the DownloadItem that changed. */
  var id: scala.Double
  /** Optional. The change in mime, if any.  */
  var mime: js.UndefOr[StringDelta] = js.undefined
  /** Optional. The change in paused, if any.  */
  var paused: js.UndefOr[BooleanDelta] = js.undefined
  /** Optional. The change in startTime, if any.  */
  var startTime: js.UndefOr[DoubleDelta] = js.undefined
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
    id: scala.Double,
    canResume: BooleanDelta = null,
    danger: StringDelta = null,
    endTime: DoubleDelta = null,
    error: StringDelta = null,
    exists: BooleanDelta = null,
    fileSize: DoubleDelta = null,
    filename: StringDelta = null,
    mime: StringDelta = null,
    paused: BooleanDelta = null,
    startTime: DoubleDelta = null,
    state: StringDelta = null,
    totalBytes: DoubleDelta = null,
    url: StringDelta = null
  ): DownloadDelta = {
    val __obj = js.Dynamic.literal(id = id)
    if (canResume != null) __obj.updateDynamic("canResume")(canResume)
    if (danger != null) __obj.updateDynamic("danger")(danger)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (error != null) __obj.updateDynamic("error")(error)
    if (exists != null) __obj.updateDynamic("exists")(exists)
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (paused != null) __obj.updateDynamic("paused")(paused)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (state != null) __obj.updateDynamic("state")(state)
    if (totalBytes != null) __obj.updateDynamic("totalBytes")(totalBytes)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[DownloadDelta]
  }
}

