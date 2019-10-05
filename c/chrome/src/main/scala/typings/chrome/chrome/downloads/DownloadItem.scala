package typings.chrome.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadItem extends js.Object {
  /** Optional. The identifier for the extension that initiated this download if this download was initiated by an extension. Does not change once it is set.  */
  var byExtensionId: js.UndefOr[String] = js.undefined
  /** Optional. The localized name of the extension that initiated this download if this download was initiated by an extension. May change if the extension changes its name or if the user changes their locale.  */
  var byExtensionName: js.UndefOr[String] = js.undefined
  /** Number of bytes received so far from the host, without considering file compression. */
  var bytesReceived: Double
  /** True if the download is in progress and paused, or else if it is interrupted and can be resumed starting from where it was interrupted. */
  var canResume: Boolean
  /** Indication of whether this download is thought to be safe or known to be suspicious. */
  var danger: String
  /** Optional. The time when the download ended in ISO 8601 format. May be passed directly to the Date constructor: chrome.downloads.search({}, function(items){items.forEach(function(item){if (item.endTime) console.log(new Date(item.endTime))})})  */
  var endTime: js.UndefOr[String] = js.undefined
  /** Optional. Why the download was interrupted. Several kinds of HTTP errors may be grouped under one of the errors beginning with SERVER_. Errors relating to the network begin with NETWORK_, errors relating to the process of writing the file to the file system begin with FILE_, and interruptions initiated by the user begin with USER_.  */
  var error: js.UndefOr[String] = js.undefined
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
  var state: String
  /** Number of bytes in the whole file, without considering file compression, or -1 if unknown. */
  var totalBytes: Double
  /** The absolute URL that this download initiated from, before any redirects. */
  var url: String
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
    url: String,
    byExtensionId: String = null,
    byExtensionName: String = null,
    endTime: String = null,
    error: String = null,
    estimatedEndTime: String = null
  ): DownloadItem = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived, canResume = canResume, danger = danger, exists = exists, fileSize = fileSize, filename = filename, finalUrl = finalUrl, id = id, incognito = incognito, mime = mime, paused = paused, referrer = referrer, startTime = startTime, state = state, totalBytes = totalBytes, url = url)
    if (byExtensionId != null) __obj.updateDynamic("byExtensionId")(byExtensionId)
    if (byExtensionName != null) __obj.updateDynamic("byExtensionName")(byExtensionName)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (error != null) __obj.updateDynamic("error")(error)
    if (estimatedEndTime != null) __obj.updateDynamic("estimatedEndTime")(estimatedEndTime)
    __obj.asInstanceOf[DownloadItem]
  }
}

