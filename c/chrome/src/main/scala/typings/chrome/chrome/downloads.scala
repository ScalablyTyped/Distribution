package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Dev Tools - Downloads
////////////////////
/**
  * Use the chrome.downloads API to programmatically initiate, monitor, manipulate, and search for downloads.
  * Availability: Since Chrome 31.
  * Permissions:  "downloads"
  */
object downloads {
  
  trait BooleanDelta extends StObject {
    
    var current: js.UndefOr[Boolean] = js.undefined
    
    var previous: js.UndefOr[Boolean] = js.undefined
  }
  object BooleanDelta {
    
    @scala.inline
    def apply(): BooleanDelta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BooleanDelta]
    }
    
    @scala.inline
    implicit class BooleanDeltaMutableBuilder[Self <: BooleanDelta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setPrevious(value: Boolean): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  trait DoubleDelta extends StObject {
    
    var current: js.UndefOr[Double] = js.undefined
    
    var previous: js.UndefOr[Double] = js.undefined
  }
  object DoubleDelta {
    
    @scala.inline
    def apply(): DoubleDelta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleDelta]
    }
    
    @scala.inline
    implicit class DoubleDeltaMutableBuilder[Self <: DoubleDelta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setPrevious(value: Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  type DownloadChangedEvent = Event[js.Function1[/* downloadDelta */ DownloadDelta, Unit]]
  
  type DownloadCreatedEvent = Event[js.Function1[/* downloadItem */ DownloadItem, Unit]]
  
  trait DownloadDelta extends StObject {
    
    /** Optional. The change in canResume, if any.  */
    var canResume: js.UndefOr[BooleanDelta] = js.undefined
    
    /** Optional. The change in danger, if any.  */
    var danger: js.UndefOr[StringDelta] = js.undefined
    
    /** Optional. The change in endTime, if any.  */
    var endTime: js.UndefOr[StringDelta] = js.undefined
    
    /** Optional. The change in error, if any.  */
    var error: js.UndefOr[StringDelta] = js.undefined
    
    /** Optional. The change in exists, if any.  */
    var exists: js.UndefOr[BooleanDelta] = js.undefined
    
    /** Optional. The change in fileSize, if any.  */
    var fileSize: js.UndefOr[DoubleDelta] = js.undefined
    
    /** Optional. The change in filename, if any.  */
    var filename: js.UndefOr[StringDelta] = js.undefined
    
    /**
      * Optional. The change in finalUrl, if any.
      * @since Since Chrome 54.
      */
    var finalUrl: StringDelta
    
    /** The id of the DownloadItem that changed. */
    var id: Double
    
    /** Optional. The change in mime, if any.  */
    var mime: js.UndefOr[StringDelta] = js.undefined
    
    /** Optional. The change in paused, if any.  */
    var paused: js.UndefOr[BooleanDelta] = js.undefined
    
    /** Optional. The change in startTime, if any.  */
    var startTime: js.UndefOr[StringDelta] = js.undefined
    
    /** Optional. The change in state, if any.  */
    var state: js.UndefOr[StringDelta] = js.undefined
    
    /** Optional. The change in totalBytes, if any.  */
    var totalBytes: js.UndefOr[DoubleDelta] = js.undefined
    
    /** Optional. The change in url, if any.  */
    var url: js.UndefOr[StringDelta] = js.undefined
  }
  object DownloadDelta {
    
    @scala.inline
    def apply(finalUrl: StringDelta, id: Double): DownloadDelta = {
      val __obj = js.Dynamic.literal(finalUrl = finalUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadDelta]
    }
    
    @scala.inline
    implicit class DownloadDeltaMutableBuilder[Self <: DownloadDelta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanResume(value: BooleanDelta): Self = StObject.set(x, "canResume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanResumeUndefined: Self = StObject.set(x, "canResume", js.undefined)
      
      @scala.inline
      def setDanger(value: StringDelta): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
      
      @scala.inline
      def setEndTime(value: StringDelta): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      @scala.inline
      def setError(value: StringDelta): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setExists(value: BooleanDelta): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      @scala.inline
      def setFileSize(value: DoubleDelta): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      @scala.inline
      def setFilename(value: StringDelta): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setFinalUrl(value: StringDelta): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMime(value: StringDelta): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
      
      @scala.inline
      def setPaused(value: BooleanDelta): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      @scala.inline
      def setStartTime(value: StringDelta): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      @scala.inline
      def setState(value: StringDelta): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTotalBytes(value: DoubleDelta): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBytesUndefined: Self = StObject.set(x, "totalBytes", js.undefined)
      
      @scala.inline
      def setUrl(value: StringDelta): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type DownloadDeterminingFilenameEvent = Event[
    js.Function2[
      /* downloadItem */ DownloadItem, 
      /* suggest */ js.Function1[/* suggestion */ js.UndefOr[DownloadFilenameSuggestion], Unit], 
      Unit
    ]
  ]
  
  type DownloadErasedEvent = Event[js.Function1[/* downloadId */ Double, Unit]]
  
  trait DownloadFilenameSuggestion extends StObject {
    
    /** Optional. The action to take if filename already exists.  */
    var conflictAction: js.UndefOr[String] = js.undefined
    
    /** The DownloadItem's new target DownloadItem.filename, as a path relative to the user's default Downloads directory, possibly containing subdirectories. Absolute paths, empty paths, and paths containing back-references ".." will be ignored. */
    var filename: String
  }
  object DownloadFilenameSuggestion {
    
    @scala.inline
    def apply(filename: String): DownloadFilenameSuggestion = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadFilenameSuggestion]
    }
    
    @scala.inline
    implicit class DownloadFilenameSuggestionMutableBuilder[Self <: DownloadFilenameSuggestion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConflictAction(value: String): Self = StObject.set(x, "conflictAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConflictActionUndefined: Self = StObject.set(x, "conflictAction", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
  
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
      url: String
    ): DownloadItem = {
      val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], canResume = canResume.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], finalUrl = finalUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadItem]
    }
    
    @scala.inline
    implicit class DownloadItemMutableBuilder[Self <: DownloadItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByExtensionId(value: String): Self = StObject.set(x, "byExtensionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByExtensionIdUndefined: Self = StObject.set(x, "byExtensionId", js.undefined)
      
      @scala.inline
      def setByExtensionName(value: String): Self = StObject.set(x, "byExtensionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByExtensionNameUndefined: Self = StObject.set(x, "byExtensionName", js.undefined)
      
      @scala.inline
      def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanResume(value: Boolean): Self = StObject.set(x, "canResume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDanger(value: String): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setEstimatedEndTime(value: String): Self = StObject.set(x, "estimatedEndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEstimatedEndTimeUndefined: Self = StObject.set(x, "estimatedEndTime", js.undefined)
      
      @scala.inline
      def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalUrl(value: String): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadOptions extends StObject {
    
    /** Optional. Post body.  */
    var body: js.UndefOr[String] = js.undefined
    
    /** Optional. The action to take if filename already exists.  */
    var conflictAction: js.UndefOr[String] = js.undefined
    
    /** Optional. A file path relative to the Downloads directory to contain the downloaded file, possibly containing subdirectories. Absolute paths, empty paths, and paths containing back-references ".." will cause an error. onDeterminingFilename allows suggesting a filename after the file's MIME type and a tentative filename have been determined.  */
    var filename: js.UndefOr[String] = js.undefined
    
    /** Optional. Extra HTTP headers to send with the request if the URL uses the HTTP[s] protocol. Each header is represented as a dictionary containing the keys name and either value or binaryValue, restricted to those allowed by XMLHttpRequest.  */
    var headers: js.UndefOr[js.Array[HeaderNameValuePair]] = js.undefined
    
    /** Optional. The HTTP method to use if the URL uses the HTTP[S] protocol.  */
    var method: js.UndefOr[String] = js.undefined
    
    /** Optional. Use a file-chooser to allow the user to select a filename regardless of whether filename is set or already exists.  */
    var saveAs: js.UndefOr[Boolean] = js.undefined
    
    /** The URL to download. */
    var url: String
  }
  object DownloadOptions {
    
    @scala.inline
    def apply(url: String): DownloadOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadOptions]
    }
    
    @scala.inline
    implicit class DownloadOptionsMutableBuilder[Self <: DownloadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setConflictAction(value: String): Self = StObject.set(x, "conflictAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConflictActionUndefined: Self = StObject.set(x, "conflictAction", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Array[HeaderNameValuePair]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: HeaderNameValuePair*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setSaveAs(value: Boolean): Self = StObject.set(x, "saveAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveAsUndefined: Self = StObject.set(x, "saveAs", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
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
    
    @scala.inline
    def apply(): DownloadQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadQuery]
    }
    
    @scala.inline
    implicit class DownloadQueryMutableBuilder[Self <: DownloadQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
      
      @scala.inline
      def setDanger(value: String): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
      
      @scala.inline
      def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      @scala.inline
      def setEndedAfter(value: String): Self = StObject.set(x, "endedAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndedAfterUndefined: Self = StObject.set(x, "endedAfter", js.undefined)
      
      @scala.inline
      def setEndedBefore(value: String): Self = StObject.set(x, "endedBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndedBeforeUndefined: Self = StObject.set(x, "endedBefore", js.undefined)
      
      @scala.inline
      def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameRegex(value: String): Self = StObject.set(x, "filenameRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameRegexUndefined: Self = StObject.set(x, "filenameRegex", js.undefined)
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
      
      @scala.inline
      def setOrderBy(value: js.Array[String]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      @scala.inline
      def setOrderByVarargs(value: String*): Self = StObject.set(x, "orderBy", js.Array(value :_*))
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Array[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setQueryVarargs(value: String*): Self = StObject.set(x, "query", js.Array(value :_*))
      
      @scala.inline
      def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      @scala.inline
      def setStartedAfter(value: String): Self = StObject.set(x, "startedAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartedAfterUndefined: Self = StObject.set(x, "startedAfter", js.undefined)
      
      @scala.inline
      def setStartedBefore(value: String): Self = StObject.set(x, "startedBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartedBeforeUndefined: Self = StObject.set(x, "startedBefore", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBytesGreater(value: Double): Self = StObject.set(x, "totalBytesGreater", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBytesGreaterUndefined: Self = StObject.set(x, "totalBytesGreater", js.undefined)
      
      @scala.inline
      def setTotalBytesLess(value: Double): Self = StObject.set(x, "totalBytesLess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBytesLessUndefined: Self = StObject.set(x, "totalBytesLess", js.undefined)
      
      @scala.inline
      def setTotalBytesUndefined: Self = StObject.set(x, "totalBytes", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlRegex(value: String): Self = StObject.set(x, "urlRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlRegexUndefined: Self = StObject.set(x, "urlRegex", js.undefined)
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait GetFileIconOptions extends StObject {
    
    /** Optional. * The size of the returned icon. The icon will be square with dimensions size * size pixels. The default and largest size for the icon is 32x32 pixels. The only supported sizes are 16 and 32. It is an error to specify any other size.
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object GetFileIconOptions {
    
    @scala.inline
    def apply(): GetFileIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetFileIconOptions]
    }
    
    @scala.inline
    implicit class GetFileIconOptionsMutableBuilder[Self <: GetFileIconOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait HeaderNameValuePair extends StObject {
    
    /** Name of the HTTP header. */
    var name: String
    
    /** Value of the HTTP header. */
    var value: String
  }
  object HeaderNameValuePair {
    
    @scala.inline
    def apply(name: String, value: String): HeaderNameValuePair = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderNameValuePair]
    }
    
    @scala.inline
    implicit class HeaderNameValuePairMutableBuilder[Self <: HeaderNameValuePair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringDelta extends StObject {
    
    var current: js.UndefOr[String] = js.undefined
    
    var previous: js.UndefOr[String] = js.undefined
  }
  object StringDelta {
    
    @scala.inline
    def apply(): StringDelta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringDelta]
    }
    
    @scala.inline
    implicit class StringDeltaMutableBuilder[Self <: StringDelta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
}
