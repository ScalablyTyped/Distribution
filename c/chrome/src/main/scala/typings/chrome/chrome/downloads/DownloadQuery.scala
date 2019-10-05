package typings.chrome.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadQuery extends js.Object {
  /** Optional. Number of bytes received so far from the host, without considering file compression.  */
  var bytesReceived: js.UndefOr[Double] = js.undefined
  /** Optional. Indication of whether this download is thought to be safe or known to be suspicious.  */
  var danger: js.UndefOr[String] = js.undefined
  /** Optional. The time when the download ended in ISO 8601 format.  */
  var endTime: js.UndefOr[String] = js.undefined
  /** Optional. Limits results to DownloadItem that ended after the time in ISO 8601 format.  */
  var endedAfter: js.UndefOr[String] = js.undefined
  /** Optional. Limits results to DownloadItem that ended before the time in ISO 8601 format.  */
  var endedBefore: js.UndefOr[String] = js.undefined
  /** Optional. Why a download was interrupted.  */
  var error: js.UndefOr[Double] = js.undefined
  /** Optional. Whether the downloaded file exists;  */
  var exists: js.UndefOr[Boolean] = js.undefined
  /** Optional. Number of bytes in the whole file post-decompression, or -1 if unknown.  */
  var fileSize: js.UndefOr[Double] = js.undefined
  /** Optional. Absolute local path.  */
  var filename: js.UndefOr[String] = js.undefined
  /** Optional. Limits results to DownloadItem whose filename matches the given regular expression.  */
  var filenameRegex: js.UndefOr[String] = js.undefined
  /** Optional. The id of the DownloadItem to query.  */
  var id: js.UndefOr[Double] = js.undefined
  /** Optional. The maximum number of matching DownloadItem returned. Defaults to 1000. Set to 0 in order to return all matching DownloadItem. See search for how to page through results.  */
  var limit: js.UndefOr[Double] = js.undefined
  /** Optional. The file's MIME type.  */
  var mime: js.UndefOr[String] = js.undefined
  /** Optional. Set elements of this array to DownloadItem properties in order to sort search results. For example, setting orderBy=['startTime'] sorts the DownloadItem by their start time in ascending order. To specify descending order, prefix with a hyphen: '-startTime'.  */
  var orderBy: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. True if the download has stopped reading data from the host, but kept the connection open.  */
  var paused: js.UndefOr[Boolean] = js.undefined
  /** Optional. This array of search terms limits results to DownloadItem whose filename or url contain all of the search terms that do not begin with a dash '-' and none of the search terms that do begin with a dash.  */
  var query: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. The time when the download began in ISO 8601 format.  */
  var startTime: js.UndefOr[String] = js.undefined
  /** Optional. Limits results to DownloadItem that started after the time in ISO 8601 format.  */
  var startedAfter: js.UndefOr[String] = js.undefined
  /** Optional. Limits results to DownloadItem that started before the time in ISO 8601 format.  */
  var startedBefore: js.UndefOr[String] = js.undefined
  /** Optional. Indicates whether the download is progressing, interrupted, or complete.  */
  var state: js.UndefOr[String] = js.undefined
  /** Optional. Number of bytes in the whole file, without considering file compression, or -1 if unknown.  */
  var totalBytes: js.UndefOr[Double] = js.undefined
  /** Optional. Limits results to DownloadItem whose totalBytes is greater than the given integer.  */
  var totalBytesGreater: js.UndefOr[Double] = js.undefined
  /** Optional. Limits results to DownloadItem whose totalBytes is less than the given integer.  */
  var totalBytesLess: js.UndefOr[Double] = js.undefined
  /** Optional. Absolute URL.  */
  var url: js.UndefOr[String] = js.undefined
  /** Optional. Limits results to DownloadItem whose url matches the given regular expression.  */
  var urlRegex: js.UndefOr[String] = js.undefined
}

object DownloadQuery {
  @scala.inline
  def apply(
    bytesReceived: Int | Double = null,
    danger: String = null,
    endTime: String = null,
    endedAfter: String = null,
    endedBefore: String = null,
    error: Int | Double = null,
    exists: js.UndefOr[Boolean] = js.undefined,
    fileSize: Int | Double = null,
    filename: String = null,
    filenameRegex: String = null,
    id: Int | Double = null,
    limit: Int | Double = null,
    mime: String = null,
    orderBy: js.Array[String] = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    query: js.Array[String] = null,
    startTime: String = null,
    startedAfter: String = null,
    startedBefore: String = null,
    state: String = null,
    totalBytes: Int | Double = null,
    totalBytesGreater: Int | Double = null,
    totalBytesLess: Int | Double = null,
    url: String = null,
    urlRegex: String = null
  ): DownloadQuery = {
    val __obj = js.Dynamic.literal()
    if (bytesReceived != null) __obj.updateDynamic("bytesReceived")(bytesReceived.asInstanceOf[js.Any])
    if (danger != null) __obj.updateDynamic("danger")(danger)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (endedAfter != null) __obj.updateDynamic("endedAfter")(endedAfter)
    if (endedBefore != null) __obj.updateDynamic("endedBefore")(endedBefore)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(exists)) __obj.updateDynamic("exists")(exists)
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (filenameRegex != null) __obj.updateDynamic("filenameRegex")(filenameRegex)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    if (query != null) __obj.updateDynamic("query")(query)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (startedAfter != null) __obj.updateDynamic("startedAfter")(startedAfter)
    if (startedBefore != null) __obj.updateDynamic("startedBefore")(startedBefore)
    if (state != null) __obj.updateDynamic("state")(state)
    if (totalBytes != null) __obj.updateDynamic("totalBytes")(totalBytes.asInstanceOf[js.Any])
    if (totalBytesGreater != null) __obj.updateDynamic("totalBytesGreater")(totalBytesGreater.asInstanceOf[js.Any])
    if (totalBytesLess != null) __obj.updateDynamic("totalBytesLess")(totalBytesLess.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (urlRegex != null) __obj.updateDynamic("urlRegex")(urlRegex)
    __obj.asInstanceOf[DownloadQuery]
  }
}

