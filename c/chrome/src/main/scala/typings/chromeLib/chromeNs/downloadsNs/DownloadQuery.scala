package typings
package chromeLib.chromeNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadQuery extends js.Object {
  /** Optional. Number of bytes received so far from the host, without considering file compression.  */
  var bytesReceived: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Indication of whether this download is thought to be safe or known to be suspicious.  */
  var danger: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The time when the download ended in ISO 8601 format.  */
  var endTime: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Limits results to DownloadItem that ended after the given ms since the epoch.  */
  var endedAfter: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Limits results to DownloadItem that ended before the given ms since the epoch.  */
  var endedBefore: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Why a download was interrupted.  */
  var error: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Whether the downloaded file exists;  */
  var exists: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Number of bytes in the whole file post-decompression, or -1 if unknown.  */
  var fileSize: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Absolute local path.  */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Limits results to DownloadItem whose filename matches the given regular expression.  */
  var filenameRegex: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The id of the DownloadItem to query.  */
  var id: js.UndefOr[scala.Double] = js.undefined
  /** Optional. The maximum number of matching DownloadItem returned. Defaults to 1000. Set to 0 in order to return all matching DownloadItem. See search for how to page through results.  */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** Optional. The file's MIME type.  */
  var mime: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Set elements of this array to DownloadItem properties in order to sort search results. For example, setting orderBy=['startTime'] sorts the DownloadItem by their start time in ascending order. To specify descending order, prefix with a hyphen: '-startTime'.  */
  var orderBy: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional. True if the download has stopped reading data from the host, but kept the connection open.  */
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. This array of search terms limits results to DownloadItem whose filename or url contain all of the search terms that do not begin with a dash '-' and none of the search terms that do begin with a dash.  */
  var query: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional. The time when the download began in ISO 8601 format.  */
  var startTime: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Limits results to DownloadItem that started after the given ms since the epoch.  */
  var startedAfter: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Limits results to DownloadItem that started before the given ms since the epoch.  */
  var startedBefore: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Indicates whether the download is progressing, interrupted, or complete.  */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Number of bytes in the whole file, without considering file compression, or -1 if unknown.  */
  var totalBytes: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Limits results to DownloadItem whose totalBytes is greater than the given integer.  */
  var totalBytesGreater: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Limits results to DownloadItem whose totalBytes is less than the given integer.  */
  var totalBytesLess: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Absolute URL.  */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Limits results to DownloadItem whose url matches the given regular expression.  */
  var urlRegex: js.UndefOr[java.lang.String] = js.undefined
}

