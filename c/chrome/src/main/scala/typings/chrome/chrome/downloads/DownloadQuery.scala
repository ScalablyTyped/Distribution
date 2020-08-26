package typings.chrome.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadQuery extends js.Object {
  /** Optional. Number of bytes received so far from the host, without considering file compression.  */
  var bytesReceived: js.UndefOr[Double] = js.native
  /** Optional. Indication of whether this download is thought to be safe or known to be suspicious.  */
  var danger: js.UndefOr[String] = js.native
  /** Optional. The time when the download ended in ISO 8601 format.  */
  var endTime: js.UndefOr[String] = js.native
  /** Optional. Limits results to DownloadItem that ended after the time in ISO 8601 format.  */
  var endedAfter: js.UndefOr[String] = js.native
  /** Optional. Limits results to DownloadItem that ended before the time in ISO 8601 format.  */
  var endedBefore: js.UndefOr[String] = js.native
  /** Optional. Why a download was interrupted.  */
  var error: js.UndefOr[Double] = js.native
  /** Optional. Whether the downloaded file exists;  */
  var exists: js.UndefOr[Boolean] = js.native
  /** Optional. Number of bytes in the whole file post-decompression, or -1 if unknown.  */
  var fileSize: js.UndefOr[Double] = js.native
  /** Optional. Absolute local path.  */
  var filename: js.UndefOr[String] = js.native
  /** Optional. Limits results to DownloadItem whose filename matches the given regular expression.  */
  var filenameRegex: js.UndefOr[String] = js.native
  /** Optional. The id of the DownloadItem to query.  */
  var id: js.UndefOr[Double] = js.native
  /** Optional. The maximum number of matching DownloadItem returned. Defaults to 1000. Set to 0 in order to return all matching DownloadItem. See search for how to page through results.  */
  var limit: js.UndefOr[Double] = js.native
  /** Optional. The file's MIME type.  */
  var mime: js.UndefOr[String] = js.native
  /** Optional. Set elements of this array to DownloadItem properties in order to sort search results. For example, setting orderBy=['startTime'] sorts the DownloadItem by their start time in ascending order. To specify descending order, prefix with a hyphen: '-startTime'.  */
  var orderBy: js.UndefOr[js.Array[String]] = js.native
  /** Optional. True if the download has stopped reading data from the host, but kept the connection open.  */
  var paused: js.UndefOr[Boolean] = js.native
  /** Optional. This array of search terms limits results to DownloadItem whose filename or url contain all of the search terms that do not begin with a dash '-' and none of the search terms that do begin with a dash.  */
  var query: js.UndefOr[js.Array[String]] = js.native
  /** Optional. The time when the download began in ISO 8601 format.  */
  var startTime: js.UndefOr[String] = js.native
  /** Optional. Limits results to DownloadItem that started after the time in ISO 8601 format.  */
  var startedAfter: js.UndefOr[String] = js.native
  /** Optional. Limits results to DownloadItem that started before the time in ISO 8601 format.  */
  var startedBefore: js.UndefOr[String] = js.native
  /** Optional. Indicates whether the download is progressing, interrupted, or complete.  */
  var state: js.UndefOr[String] = js.native
  /** Optional. Number of bytes in the whole file, without considering file compression, or -1 if unknown.  */
  var totalBytes: js.UndefOr[Double] = js.native
  /** Optional. Limits results to DownloadItem whose totalBytes is greater than the given integer.  */
  var totalBytesGreater: js.UndefOr[Double] = js.native
  /** Optional. Limits results to DownloadItem whose totalBytes is less than the given integer.  */
  var totalBytesLess: js.UndefOr[Double] = js.native
  /** Optional. Absolute URL.  */
  var url: js.UndefOr[String] = js.native
  /** Optional. Limits results to DownloadItem whose url matches the given regular expression.  */
  var urlRegex: js.UndefOr[String] = js.native
}

object DownloadQuery {
  @scala.inline
  def apply(): DownloadQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadQuery]
  }
  @scala.inline
  implicit class DownloadQueryOps[Self <: DownloadQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBytesReceived(value: Double): Self = this.set("bytesReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesReceived: Self = this.set("bytesReceived", js.undefined)
    @scala.inline
    def setDanger(value: String): Self = this.set("danger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDanger: Self = this.set("danger", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setEndedAfter(value: String): Self = this.set("endedAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndedAfter: Self = this.set("endedAfter", js.undefined)
    @scala.inline
    def setEndedBefore(value: String): Self = this.set("endedBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndedBefore: Self = this.set("endedBefore", js.undefined)
    @scala.inline
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExists(value: Boolean): Self = this.set("exists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExists: Self = this.set("exists", js.undefined)
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFilenameRegex(value: String): Self = this.set("filenameRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilenameRegex: Self = this.set("filenameRegex", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    @scala.inline
    def setOrderByVarargs(value: String*): Self = this.set("orderBy", js.Array(value :_*))
    @scala.inline
    def setOrderBy(value: js.Array[String]): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    @scala.inline
    def setQueryVarargs(value: String*): Self = this.set("query", js.Array(value :_*))
    @scala.inline
    def setQuery(value: js.Array[String]): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStartedAfter(value: String): Self = this.set("startedAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedAfter: Self = this.set("startedAfter", js.undefined)
    @scala.inline
    def setStartedBefore(value: String): Self = this.set("startedBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedBefore: Self = this.set("startedBefore", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTotalBytes(value: Double): Self = this.set("totalBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalBytes: Self = this.set("totalBytes", js.undefined)
    @scala.inline
    def setTotalBytesGreater(value: Double): Self = this.set("totalBytesGreater", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalBytesGreater: Self = this.set("totalBytesGreater", js.undefined)
    @scala.inline
    def setTotalBytesLess(value: Double): Self = this.set("totalBytesLess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalBytesLess: Self = this.set("totalBytesLess", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUrlRegex(value: String): Self = this.set("urlRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlRegex: Self = this.set("urlRegex", js.undefined)
  }
  
}

