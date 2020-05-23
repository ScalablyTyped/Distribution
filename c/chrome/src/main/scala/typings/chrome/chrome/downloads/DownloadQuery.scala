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
    bytesReceived: js.UndefOr[Double] = js.undefined,
    danger: String = null,
    endTime: String = null,
    endedAfter: String = null,
    endedBefore: String = null,
    error: js.UndefOr[Double] = js.undefined,
    exists: js.UndefOr[Boolean] = js.undefined,
    fileSize: js.UndefOr[Double] = js.undefined,
    filename: String = null,
    filenameRegex: String = null,
    id: js.UndefOr[Double] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    mime: String = null,
    orderBy: js.Array[String] = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    query: js.Array[String] = null,
    startTime: String = null,
    startedAfter: String = null,
    startedBefore: String = null,
    state: String = null,
    totalBytes: js.UndefOr[Double] = js.undefined,
    totalBytesGreater: js.UndefOr[Double] = js.undefined,
    totalBytesLess: js.UndefOr[Double] = js.undefined,
    url: String = null,
    urlRegex: String = null
  ): DownloadQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bytesReceived)) __obj.updateDynamic("bytesReceived")(bytesReceived.get.asInstanceOf[js.Any])
    if (danger != null) __obj.updateDynamic("danger")(danger.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (endedAfter != null) __obj.updateDynamic("endedAfter")(endedAfter.asInstanceOf[js.Any])
    if (endedBefore != null) __obj.updateDynamic("endedBefore")(endedBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exists)) __obj.updateDynamic("exists")(exists.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fileSize)) __obj.updateDynamic("fileSize")(fileSize.get.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (filenameRegex != null) __obj.updateDynamic("filenameRegex")(filenameRegex.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.get.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (startedAfter != null) __obj.updateDynamic("startedAfter")(startedAfter.asInstanceOf[js.Any])
    if (startedBefore != null) __obj.updateDynamic("startedBefore")(startedBefore.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(totalBytes)) __obj.updateDynamic("totalBytes")(totalBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalBytesGreater)) __obj.updateDynamic("totalBytesGreater")(totalBytesGreater.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalBytesLess)) __obj.updateDynamic("totalBytesLess")(totalBytesLess.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlRegex != null) __obj.updateDynamic("urlRegex")(urlRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadQuery]
  }
}

