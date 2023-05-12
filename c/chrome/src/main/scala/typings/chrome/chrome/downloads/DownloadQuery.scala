package typings.chrome.chrome.downloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadQuery extends StObject {
  
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
  
  inline def apply(): DownloadQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadQuery] (val x: Self) extends AnyVal {
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    inline def setDanger(value: String): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEndedAfter(value: String): Self = StObject.set(x, "endedAfter", value.asInstanceOf[js.Any])
    
    inline def setEndedAfterUndefined: Self = StObject.set(x, "endedAfter", js.undefined)
    
    inline def setEndedBefore(value: String): Self = StObject.set(x, "endedBefore", value.asInstanceOf[js.Any])
    
    inline def setEndedBeforeUndefined: Self = StObject.set(x, "endedBefore", js.undefined)
    
    inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameRegex(value: String): Self = StObject.set(x, "filenameRegex", value.asInstanceOf[js.Any])
    
    inline def setFilenameRegexUndefined: Self = StObject.set(x, "filenameRegex", js.undefined)
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    inline def setOrderBy(value: js.Array[String]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setOrderByVarargs(value: String*): Self = StObject.set(x, "orderBy", js.Array(value*))
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    inline def setQuery(value: js.Array[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setQueryVarargs(value: String*): Self = StObject.set(x, "query", js.Array(value*))
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStartedAfter(value: String): Self = StObject.set(x, "startedAfter", value.asInstanceOf[js.Any])
    
    inline def setStartedAfterUndefined: Self = StObject.set(x, "startedAfter", js.undefined)
    
    inline def setStartedBefore(value: String): Self = StObject.set(x, "startedBefore", value.asInstanceOf[js.Any])
    
    inline def setStartedBeforeUndefined: Self = StObject.set(x, "startedBefore", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesGreater(value: Double): Self = StObject.set(x, "totalBytesGreater", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesGreaterUndefined: Self = StObject.set(x, "totalBytesGreater", js.undefined)
    
    inline def setTotalBytesLess(value: Double): Self = StObject.set(x, "totalBytesLess", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesLessUndefined: Self = StObject.set(x, "totalBytesLess", js.undefined)
    
    inline def setTotalBytesUndefined: Self = StObject.set(x, "totalBytes", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlRegex(value: String): Self = StObject.set(x, "urlRegex", value.asInstanceOf[js.Any])
    
    inline def setUrlRegexUndefined: Self = StObject.set(x, "urlRegex", js.undefined)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
