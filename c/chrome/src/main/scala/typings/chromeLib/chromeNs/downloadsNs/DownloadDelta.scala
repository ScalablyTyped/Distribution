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

