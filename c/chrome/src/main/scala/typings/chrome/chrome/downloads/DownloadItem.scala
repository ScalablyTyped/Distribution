package typings.chrome.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadItem extends js.Object {
  /** Optional. The identifier for the extension that initiated this download if this download was initiated by an extension. Does not change once it is set.  */
  var byExtensionId: js.UndefOr[String] = js.native
  /** Optional. The localized name of the extension that initiated this download if this download was initiated by an extension. May change if the extension changes its name or if the user changes their locale.  */
  var byExtensionName: js.UndefOr[String] = js.native
  /** Number of bytes received so far from the host, without considering file compression. */
  var bytesReceived: Double = js.native
  /** True if the download is in progress and paused, or else if it is interrupted and can be resumed starting from where it was interrupted. */
  var canResume: Boolean = js.native
  /** Indication of whether this download is thought to be safe or known to be suspicious. */
  var danger: String = js.native
  /** Optional. The time when the download ended in ISO 8601 format. May be passed directly to the Date constructor: chrome.downloads.search({}, function(items){items.forEach(function(item){if (item.endTime) console.log(new Date(item.endTime))})})  */
  var endTime: js.UndefOr[String] = js.native
  /** Optional. Why the download was interrupted. Several kinds of HTTP errors may be grouped under one of the errors beginning with SERVER_. Errors relating to the network begin with NETWORK_, errors relating to the process of writing the file to the file system begin with FILE_, and interruptions initiated by the user begin with USER_.  */
  var error: js.UndefOr[String] = js.native
  /** Optional. Estimated time when the download will complete in ISO 8601 format. May be passed directly to the Date constructor: chrome.downloads.search({}, function(items){items.forEach(function(item){if (item.estimatedEndTime) console.log(new Date(item.estimatedEndTime))})})  */
  var estimatedEndTime: js.UndefOr[String] = js.native
  /** Whether the downloaded file still exists. This information may be out of date because Chrome does not automatically watch for file removal. Call search() in order to trigger the check for file existence. When the existence check completes, if the file has been deleted, then an onChanged event will fire. Note that search() does not wait for the existence check to finish before returning, so results from search() may not accurately reflect the file system. Also, search() may be called as often as necessary, but will not check for file existence any more frequently than once every 10 seconds. */
  var exists: Boolean = js.native
  /** Number of bytes in the whole file post-decompression, or -1 if unknown. */
  var fileSize: Double = js.native
  /** Absolute local path. */
  var filename: String = js.native
  /**
    * The absolute URL that this download is being made from, after all redirects.
    * @since Since Chrome 54.
    */
  var finalUrl: String = js.native
  /** An identifier that is persistent across browser sessions. */
  var id: Double = js.native
  /** False if this download is recorded in the history, true if it is not recorded. */
  var incognito: Boolean = js.native
  /** The file's MIME type. */
  var mime: String = js.native
  /** True if the download has stopped reading data from the host, but kept the connection open. */
  var paused: Boolean = js.native
  /** Absolute URL. */
  var referrer: String = js.native
  /** The time when the download began in ISO 8601 format. May be passed directly to the Date constructor: chrome.downloads.search({}, function(items){items.forEach(function(item){console.log(new Date(item.startTime))})}) */
  var startTime: String = js.native
  /** Indicates whether the download is progressing, interrupted, or complete. */
  var state: String = js.native
  /** Number of bytes in the whole file, without considering file compression, or -1 if unknown. */
  var totalBytes: Double = js.native
  /** The absolute URL that this download initiated from, before any redirects. */
  var url: String = js.native
}

object DownloadItem {
  @scala.inline
  def apply(
    bytesReceived: Double,
    canResume: Boolean,
    danger: String,
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
    state: String,
    totalBytes: Double,
    url: String
  ): DownloadItem = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], canResume = canResume.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], finalUrl = finalUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadItem]
  }
  @scala.inline
  implicit class DownloadItemOps[Self <: DownloadItem] (val x: Self) extends AnyVal {
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
    def setCanResume(value: Boolean): Self = this.set("canResume", value.asInstanceOf[js.Any])
    @scala.inline
    def setDanger(value: String): Self = this.set("danger", value.asInstanceOf[js.Any])
    @scala.inline
    def setExists(value: Boolean): Self = this.set("exists", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalUrl(value: String): Self = this.set("finalUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncognito(value: Boolean): Self = this.set("incognito", value.asInstanceOf[js.Any])
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytes(value: Double): Self = this.set("totalBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setByExtensionId(value: String): Self = this.set("byExtensionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByExtensionId: Self = this.set("byExtensionId", js.undefined)
    @scala.inline
    def setByExtensionName(value: String): Self = this.set("byExtensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByExtensionName: Self = this.set("byExtensionName", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setEstimatedEndTime(value: String): Self = this.set("estimatedEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedEndTime: Self = this.set("estimatedEndTime", js.undefined)
  }
  
}

