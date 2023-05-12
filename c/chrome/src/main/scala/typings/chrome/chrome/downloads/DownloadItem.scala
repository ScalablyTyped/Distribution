package typings.chrome.chrome.downloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadItem extends StObject {
  
  /** Optional. The identifier for the extension that initiated this download if this download was initiated by an extension. Does not change once it is set.  */
  var byExtensionId: js.UndefOr[String] = js.undefined
  
  /** Optional. The localized name of the extension that initiated this download if this download was initiated by an extension. May change if the extension changes its name or if the user changes their locale.  */
  var byExtensionName: js.UndefOr[String] = js.undefined
  
  /** Number of bytes received so far from the host, without considering file compression. */
  var bytesReceived: Double
  
  /** True if the download is in progress and paused, or else if it is interrupted and can be resumed starting from where it was interrupted. */
  var canResume: Boolean
  
  /** Indication of whether this download is thought to be safe or known to be suspicious. */
  var danger: DangerType
  
  /** Optional. The time when the download ended in ISO 8601 format. May be passed directly to the Date constructor: chrome.downloads.search({}, function(items){items.forEach(function(item){if (item.endTime) console.log(new Date(item.endTime))})})  */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Optional. Why the download was interrupted. Several kinds of HTTP errors may be grouped under one of the errors beginning with SERVER_. Errors relating to the network begin with NETWORK_, errors relating to the process of writing the file to the file system begin with FILE_, and interruptions initiated by the user begin with USER_.  */
  var error: js.UndefOr[DownloadInterruptReason] = js.undefined
  
  /** Optional. Estimated time when the download will complete in ISO 8601 format. May be passed directly to the Date constructor: chrome.downloads.search({}, function(items){items.forEach(function(item){if (item.estimatedEndTime) console.log(new Date(item.estimatedEndTime))})})  */
  var estimatedEndTime: js.UndefOr[String] = js.undefined
  
  /** Whether the downloaded file still exists. This information may be out of date because Chrome does not automatically watch for file removal. Call search() in order to trigger the check for file existence. When the existence check completes, if the file has been deleted, then an onChanged event will fire. Note that search() does not wait for the existence check to finish before returning, so results from search() may not accurately reflect the file system. Also, search() may be called as often as necessary, but will not check for file existence any more frequently than once every 10 seconds. */
  var exists: Boolean
  
  /** Number of bytes in the whole file post-decompression, or -1 if unknown. */
  var fileSize: Double
  
  /** Absolute local path. */
  var filename: String
  
  /**
    * The absolute URL that this download is being made from, after all redirects.
    * @since Since Chrome 54.
    */
  var finalUrl: String
  
  /** An identifier that is persistent across browser sessions. */
  var id: Double
  
  /** False if this download is recorded in the history, true if it is not recorded. */
  var incognito: Boolean
  
  /** The file's MIME type. */
  var mime: String
  
  /** True if the download has stopped reading data from the host, but kept the connection open. */
  var paused: Boolean
  
  /** Absolute URL. */
  var referrer: String
  
  /** The time when the download began in ISO 8601 format. May be passed directly to the Date constructor: chrome.downloads.search({}, function(items){items.forEach(function(item){console.log(new Date(item.startTime))})}) */
  var startTime: String
  
  /** Indicates whether the download is progressing, interrupted, or complete. */
  var state: DownloadState
  
  /** Number of bytes in the whole file, without considering file compression, or -1 if unknown. */
  var totalBytes: Double
  
  /** The absolute URL that this download initiated from, before any redirects. */
  var url: String
}
object DownloadItem {
  
  inline def apply(
    bytesReceived: Double,
    canResume: Boolean,
    danger: DangerType,
    exists: Boolean,
    fileSize: Double,
    filename: String,
    finalUrl: String,
    id: Double,
    incognito: Boolean,
    mime: String,
    paused: Boolean,
    referrer: String,
    startTime: String,
    state: DownloadState,
    totalBytes: Double,
    url: String
  ): DownloadItem = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], canResume = canResume.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], finalUrl = finalUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadItem] (val x: Self) extends AnyVal {
    
    inline def setByExtensionId(value: String): Self = StObject.set(x, "byExtensionId", value.asInstanceOf[js.Any])
    
    inline def setByExtensionIdUndefined: Self = StObject.set(x, "byExtensionId", js.undefined)
    
    inline def setByExtensionName(value: String): Self = StObject.set(x, "byExtensionName", value.asInstanceOf[js.Any])
    
    inline def setByExtensionNameUndefined: Self = StObject.set(x, "byExtensionName", js.undefined)
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setCanResume(value: Boolean): Self = StObject.set(x, "canResume", value.asInstanceOf[js.Any])
    
    inline def setDanger(value: DangerType): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setError(value: DownloadInterruptReason): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setEstimatedEndTime(value: String): Self = StObject.set(x, "estimatedEndTime", value.asInstanceOf[js.Any])
    
    inline def setEstimatedEndTimeUndefined: Self = StObject.set(x, "estimatedEndTime", js.undefined)
    
    inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFinalUrl(value: String): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
    
    inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setState(value: DownloadState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
