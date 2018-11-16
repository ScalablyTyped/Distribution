package typings
package chromeLib.chromeNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DownloadItem extends js.Object {
  /** Optional. The identifier for the extension that initiated this download if this download was initiated by an extension. Does not change once it is set.  */
  var byExtensionId: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The localized name of the extension that initiated this download if this download was initiated by an extension. May change if the extension changes its name or if the user changes their locale.  */
  var byExtensionName: js.UndefOr[java.lang.String] = js.undefined
  /** Number of bytes received so far from the host, without considering file compression. */
  var bytesReceived: scala.Double
  /** True if the download is in progress and paused, or else if it is interrupted and can be resumed starting from where it was interrupted. */
  var canResume: scala.Boolean
  /** Indication of whether this download is thought to be safe or known to be suspicious. */
  var danger: java.lang.String
  /** Optional. The time when the download ended in ISO 8601 format. May be passed directly to the Date constructor: chrome.downloads.search({}, function(items){items.forEach(function(item){if (item.endTime) console.log(new Date(item.endTime))})})  */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Why the download was interrupted. Several kinds of HTTP errors may be grouped under one of the errors beginning with SERVER_. Errors relating to the network begin with NETWORK_, errors relating to the process of writing the file to the file system begin with FILE_, and interruptions initiated by the user begin with USER_.  */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Estimated time when the download will complete in ISO 8601 format. May be passed directly to the Date constructor: chrome.downloads.search({}, function(items){items.forEach(function(item){if (item.estimatedEndTime) console.log(new Date(item.estimatedEndTime))})})  */
  var estimatedEndTime: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the downloaded file still exists. This information may be out of date because Chrome does not automatically watch for file removal. Call search() in order to trigger the check for file existence. When the existence check completes, if the file has been deleted, then an onChanged event will fire. Note that search() does not wait for the existence check to finish before returning, so results from search() may not accurately reflect the file system. Also, search() may be called as often as necessary, but will not check for file existence any more frequently than once every 10 seconds. */
  var exists: scala.Boolean
  /** Number of bytes in the whole file post-decompression, or -1 if unknown. */
  var fileSize: scala.Double
  /** Absolute local path. */
  var filename: java.lang.String
  /** An identifier that is persistent across browser sessions. */
  var id: scala.Double
  /** False if this download is recorded in the history, true if it is not recorded. */
  var incognito: scala.Boolean
  /** The file's MIME type. */
  var mime: java.lang.String
  /** True if the download has stopped reading data from the host, but kept the connection open. */
  var paused: scala.Boolean
  /** Absolute URL. */
  var referrer: java.lang.String
  /** The time when the download began in ISO 8601 format. May be passed directly to the Date constructor: chrome.downloads.search({}, function(items){items.forEach(function(item){console.log(new Date(item.startTime))})}) */
  var startTime: java.lang.String
  /** Indicates whether the download is progressing, interrupted, or complete. */
  var state: java.lang.String
  /** Number of bytes in the whole file, without considering file compression, or -1 if unknown. */
  var totalBytes: scala.Double
  /** Absolute URL. */
  var url: java.lang.String
}

