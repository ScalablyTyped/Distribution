package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import typings.chrome.chromeNumbers.`16`
import typings.chrome.chromeNumbers.`32`
import typings.chrome.chromeStrings.GET
import typings.chrome.chromeStrings.POST
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
    
    inline def apply(): BooleanDelta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BooleanDelta]
    }
    
    extension [Self <: BooleanDelta](x: Self) {
      
      inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setPrevious(value: Boolean): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.file
    - typings.chrome.chromeStrings.url
    - typings.chrome.chromeStrings.content
    - typings.chrome.chromeStrings.uncommon
    - typings.chrome.chromeStrings.host
    - typings.chrome.chromeStrings.unwanted
    - typings.chrome.chromeStrings.safe
    - typings.chrome.chromeStrings.accepted
  */
  trait DangerType extends StObject
  object DangerType {
    
    inline def accepted: typings.chrome.chromeStrings.accepted = "accepted".asInstanceOf[typings.chrome.chromeStrings.accepted]
    
    inline def content: typings.chrome.chromeStrings.content = "content".asInstanceOf[typings.chrome.chromeStrings.content]
    
    inline def file: typings.chrome.chromeStrings.file = "file".asInstanceOf[typings.chrome.chromeStrings.file]
    
    inline def host: typings.chrome.chromeStrings.host = "host".asInstanceOf[typings.chrome.chromeStrings.host]
    
    inline def safe: typings.chrome.chromeStrings.safe = "safe".asInstanceOf[typings.chrome.chromeStrings.safe]
    
    inline def uncommon: typings.chrome.chromeStrings.uncommon = "uncommon".asInstanceOf[typings.chrome.chromeStrings.uncommon]
    
    inline def unwanted: typings.chrome.chromeStrings.unwanted = "unwanted".asInstanceOf[typings.chrome.chromeStrings.unwanted]
    
    inline def url: typings.chrome.chromeStrings.url = "url".asInstanceOf[typings.chrome.chromeStrings.url]
  }
  
  trait DoubleDelta extends StObject {
    
    var current: js.UndefOr[Double] = js.undefined
    
    var previous: js.UndefOr[Double] = js.undefined
  }
  object DoubleDelta {
    
    inline def apply(): DoubleDelta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleDelta]
    }
    
    extension [Self <: DoubleDelta](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setPrevious(value: Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
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
    var finalUrl: js.UndefOr[StringDelta] = js.undefined
    
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
    
    inline def apply(id: Double): DownloadDelta = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadDelta]
    }
    
    extension [Self <: DownloadDelta](x: Self) {
      
      inline def setCanResume(value: BooleanDelta): Self = StObject.set(x, "canResume", value.asInstanceOf[js.Any])
      
      inline def setCanResumeUndefined: Self = StObject.set(x, "canResume", js.undefined)
      
      inline def setDanger(value: StringDelta): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
      
      inline def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
      
      inline def setEndTime(value: StringDelta): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setError(value: StringDelta): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExists(value: BooleanDelta): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      inline def setFileSize(value: DoubleDelta): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      inline def setFilename(value: StringDelta): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFinalUrl(value: StringDelta): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
      
      inline def setFinalUrlUndefined: Self = StObject.set(x, "finalUrl", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMime(value: StringDelta): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
      
      inline def setPaused(value: BooleanDelta): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      inline def setStartTime(value: StringDelta): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setState(value: StringDelta): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTotalBytes(value: DoubleDelta): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
      
      inline def setTotalBytesUndefined: Self = StObject.set(x, "totalBytes", js.undefined)
      
      inline def setUrl(value: StringDelta): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    inline def apply(filename: String): DownloadFilenameSuggestion = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadFilenameSuggestion]
    }
    
    extension [Self <: DownloadFilenameSuggestion](x: Self) {
      
      inline def setConflictAction(value: String): Self = StObject.set(x, "conflictAction", value.asInstanceOf[js.Any])
      
      inline def setConflictActionUndefined: Self = StObject.set(x, "conflictAction", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.FILE_FAILED
    - typings.chrome.chromeStrings.FILE_ACCESS_DENIED
    - typings.chrome.chromeStrings.FILE_NO_SPACE
    - typings.chrome.chromeStrings.FILE_NAME_TOO_LONG
    - typings.chrome.chromeStrings.FILE_TOO_LARGE
    - typings.chrome.chromeStrings.FILE_VIRUS_INFECTED
    - typings.chrome.chromeStrings.FILE_TRANSIENT_ERROR
    - typings.chrome.chromeStrings.FILE_BLOCKED
    - typings.chrome.chromeStrings.FILE_SECURITY_CHECK_FAILED
    - typings.chrome.chromeStrings.FILE_TOO_SHORT
    - typings.chrome.chromeStrings.FILE_HASH_MISMATCH
    - typings.chrome.chromeStrings.FILE_SAME_AS_SOURCE
    - typings.chrome.chromeStrings.NETWORK_FAILED
    - typings.chrome.chromeStrings.NETWORK_TIMEOUT
    - typings.chrome.chromeStrings.NETWORK_DISCONNECTED
    - typings.chrome.chromeStrings.NETWORK_SERVER_DOWN
    - typings.chrome.chromeStrings.NETWORK_INVALID_REQUEST
    - typings.chrome.chromeStrings.SERVER_FAILED
    - typings.chrome.chromeStrings.SERVER_NO_RANGE
    - typings.chrome.chromeStrings.SERVER_BAD_CONTENT
    - typings.chrome.chromeStrings.SERVER_UNAUTHORIZED
    - typings.chrome.chromeStrings.SERVER_CERT_PROBLEM
    - typings.chrome.chromeStrings.SERVER_FORBIDDEN
    - typings.chrome.chromeStrings.SERVER_UNREACHABLE
    - typings.chrome.chromeStrings.SERVER_CONTENT_LENGTH_MISMATCH
    - typings.chrome.chromeStrings.SERVER_CROSS_ORIGIN_REDIRECT
    - typings.chrome.chromeStrings.USER_CANCELED
    - typings.chrome.chromeStrings.USER_SHUTDOWN
    - typings.chrome.chromeStrings.CRASH
  */
  trait DownloadInterruptReason extends StObject
  object DownloadInterruptReason {
    
    inline def CRASH: typings.chrome.chromeStrings.CRASH = "CRASH".asInstanceOf[typings.chrome.chromeStrings.CRASH]
    
    inline def FILE_ACCESS_DENIED: typings.chrome.chromeStrings.FILE_ACCESS_DENIED = "FILE_ACCESS_DENIED".asInstanceOf[typings.chrome.chromeStrings.FILE_ACCESS_DENIED]
    
    inline def FILE_BLOCKED: typings.chrome.chromeStrings.FILE_BLOCKED = "FILE_BLOCKED".asInstanceOf[typings.chrome.chromeStrings.FILE_BLOCKED]
    
    inline def FILE_FAILED: typings.chrome.chromeStrings.FILE_FAILED = "FILE_FAILED".asInstanceOf[typings.chrome.chromeStrings.FILE_FAILED]
    
    inline def FILE_HASH_MISMATCH: typings.chrome.chromeStrings.FILE_HASH_MISMATCH = "FILE_HASH_MISMATCH".asInstanceOf[typings.chrome.chromeStrings.FILE_HASH_MISMATCH]
    
    inline def FILE_NAME_TOO_LONG: typings.chrome.chromeStrings.FILE_NAME_TOO_LONG = "FILE_NAME_TOO_LONG".asInstanceOf[typings.chrome.chromeStrings.FILE_NAME_TOO_LONG]
    
    inline def FILE_NO_SPACE: typings.chrome.chromeStrings.FILE_NO_SPACE = "FILE_NO_SPACE".asInstanceOf[typings.chrome.chromeStrings.FILE_NO_SPACE]
    
    inline def FILE_SAME_AS_SOURCE: typings.chrome.chromeStrings.FILE_SAME_AS_SOURCE = "FILE_SAME_AS_SOURCE".asInstanceOf[typings.chrome.chromeStrings.FILE_SAME_AS_SOURCE]
    
    inline def FILE_SECURITY_CHECK_FAILED: typings.chrome.chromeStrings.FILE_SECURITY_CHECK_FAILED = "FILE_SECURITY_CHECK_FAILED".asInstanceOf[typings.chrome.chromeStrings.FILE_SECURITY_CHECK_FAILED]
    
    inline def FILE_TOO_LARGE: typings.chrome.chromeStrings.FILE_TOO_LARGE = "FILE_TOO_LARGE".asInstanceOf[typings.chrome.chromeStrings.FILE_TOO_LARGE]
    
    inline def FILE_TOO_SHORT: typings.chrome.chromeStrings.FILE_TOO_SHORT = "FILE_TOO_SHORT".asInstanceOf[typings.chrome.chromeStrings.FILE_TOO_SHORT]
    
    inline def FILE_TRANSIENT_ERROR: typings.chrome.chromeStrings.FILE_TRANSIENT_ERROR = "FILE_TRANSIENT_ERROR".asInstanceOf[typings.chrome.chromeStrings.FILE_TRANSIENT_ERROR]
    
    inline def FILE_VIRUS_INFECTED: typings.chrome.chromeStrings.FILE_VIRUS_INFECTED = "FILE_VIRUS_INFECTED".asInstanceOf[typings.chrome.chromeStrings.FILE_VIRUS_INFECTED]
    
    inline def NETWORK_DISCONNECTED: typings.chrome.chromeStrings.NETWORK_DISCONNECTED = "NETWORK_DISCONNECTED".asInstanceOf[typings.chrome.chromeStrings.NETWORK_DISCONNECTED]
    
    inline def NETWORK_FAILED: typings.chrome.chromeStrings.NETWORK_FAILED = "NETWORK_FAILED".asInstanceOf[typings.chrome.chromeStrings.NETWORK_FAILED]
    
    inline def NETWORK_INVALID_REQUEST: typings.chrome.chromeStrings.NETWORK_INVALID_REQUEST = "NETWORK_INVALID_REQUEST".asInstanceOf[typings.chrome.chromeStrings.NETWORK_INVALID_REQUEST]
    
    inline def NETWORK_SERVER_DOWN: typings.chrome.chromeStrings.NETWORK_SERVER_DOWN = "NETWORK_SERVER_DOWN".asInstanceOf[typings.chrome.chromeStrings.NETWORK_SERVER_DOWN]
    
    inline def NETWORK_TIMEOUT: typings.chrome.chromeStrings.NETWORK_TIMEOUT = "NETWORK_TIMEOUT".asInstanceOf[typings.chrome.chromeStrings.NETWORK_TIMEOUT]
    
    inline def SERVER_BAD_CONTENT: typings.chrome.chromeStrings.SERVER_BAD_CONTENT = "SERVER_BAD_CONTENT".asInstanceOf[typings.chrome.chromeStrings.SERVER_BAD_CONTENT]
    
    inline def SERVER_CERT_PROBLEM: typings.chrome.chromeStrings.SERVER_CERT_PROBLEM = "SERVER_CERT_PROBLEM".asInstanceOf[typings.chrome.chromeStrings.SERVER_CERT_PROBLEM]
    
    inline def SERVER_CONTENT_LENGTH_MISMATCH: typings.chrome.chromeStrings.SERVER_CONTENT_LENGTH_MISMATCH = "SERVER_CONTENT_LENGTH_MISMATCH".asInstanceOf[typings.chrome.chromeStrings.SERVER_CONTENT_LENGTH_MISMATCH]
    
    inline def SERVER_CROSS_ORIGIN_REDIRECT: typings.chrome.chromeStrings.SERVER_CROSS_ORIGIN_REDIRECT = "SERVER_CROSS_ORIGIN_REDIRECT".asInstanceOf[typings.chrome.chromeStrings.SERVER_CROSS_ORIGIN_REDIRECT]
    
    inline def SERVER_FAILED: typings.chrome.chromeStrings.SERVER_FAILED = "SERVER_FAILED".asInstanceOf[typings.chrome.chromeStrings.SERVER_FAILED]
    
    inline def SERVER_FORBIDDEN: typings.chrome.chromeStrings.SERVER_FORBIDDEN = "SERVER_FORBIDDEN".asInstanceOf[typings.chrome.chromeStrings.SERVER_FORBIDDEN]
    
    inline def SERVER_NO_RANGE: typings.chrome.chromeStrings.SERVER_NO_RANGE = "SERVER_NO_RANGE".asInstanceOf[typings.chrome.chromeStrings.SERVER_NO_RANGE]
    
    inline def SERVER_UNAUTHORIZED: typings.chrome.chromeStrings.SERVER_UNAUTHORIZED = "SERVER_UNAUTHORIZED".asInstanceOf[typings.chrome.chromeStrings.SERVER_UNAUTHORIZED]
    
    inline def SERVER_UNREACHABLE: typings.chrome.chromeStrings.SERVER_UNREACHABLE = "SERVER_UNREACHABLE".asInstanceOf[typings.chrome.chromeStrings.SERVER_UNREACHABLE]
    
    inline def USER_CANCELED: typings.chrome.chromeStrings.USER_CANCELED = "USER_CANCELED".asInstanceOf[typings.chrome.chromeStrings.USER_CANCELED]
    
    inline def USER_SHUTDOWN: typings.chrome.chromeStrings.USER_SHUTDOWN = "USER_SHUTDOWN".asInstanceOf[typings.chrome.chromeStrings.USER_SHUTDOWN]
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
    
    extension [Self <: DownloadItem](x: Self) {
      
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
  
  trait DownloadOptions extends StObject {
    
    /** Optional. Post body.  */
    var body: js.UndefOr[String] = js.undefined
    
    /** Optional. The action to take if filename already exists.  */
    var conflictAction: js.UndefOr[FilenameConflictAction] = js.undefined
    
    /** Optional. A file path relative to the Downloads directory to contain the downloaded file, possibly containing subdirectories. Absolute paths, empty paths, and paths containing back-references ".." will cause an error. onDeterminingFilename allows suggesting a filename after the file's MIME type and a tentative filename have been determined.  */
    var filename: js.UndefOr[String] = js.undefined
    
    /** Optional. Extra HTTP headers to send with the request if the URL uses the HTTP[s] protocol. Each header is represented as a dictionary containing the keys name and either value or binaryValue, restricted to those allowed by XMLHttpRequest.  */
    var headers: js.UndefOr[js.Array[HeaderNameValuePair]] = js.undefined
    
    /** Optional. The HTTP method to use if the URL uses the HTTP[S] protocol.  */
    var method: js.UndefOr[GET | POST] = js.undefined
    
    /** Optional. Use a file-chooser to allow the user to select a filename regardless of whether filename is set or already exists.  */
    var saveAs: js.UndefOr[Boolean] = js.undefined
    
    /** The URL to download. */
    var url: String
  }
  object DownloadOptions {
    
    inline def apply(url: String): DownloadOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadOptions]
    }
    
    extension [Self <: DownloadOptions](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setConflictAction(value: FilenameConflictAction): Self = StObject.set(x, "conflictAction", value.asInstanceOf[js.Any])
      
      inline def setConflictActionUndefined: Self = StObject.set(x, "conflictAction", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setHeaders(value: js.Array[HeaderNameValuePair]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: HeaderNameValuePair*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setSaveAs(value: Boolean): Self = StObject.set(x, "saveAs", value.asInstanceOf[js.Any])
      
      inline def setSaveAsUndefined: Self = StObject.set(x, "saveAs", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
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
    
    inline def apply(): DownloadQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadQuery]
    }
    
    extension [Self <: DownloadQuery](x: Self) {
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.in_progress
    - typings.chrome.chromeStrings.interrupted
    - typings.chrome.chromeStrings.complete
  */
  trait DownloadState extends StObject
  object DownloadState {
    
    inline def complete: typings.chrome.chromeStrings.complete = "complete".asInstanceOf[typings.chrome.chromeStrings.complete]
    
    inline def in_progress: typings.chrome.chromeStrings.in_progress = "in_progress".asInstanceOf[typings.chrome.chromeStrings.in_progress]
    
    inline def interrupted: typings.chrome.chromeStrings.interrupted = "interrupted".asInstanceOf[typings.chrome.chromeStrings.interrupted]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.uniquify
    - typings.chrome.chromeStrings.overwrite
    - typings.chrome.chromeStrings.prompt
  */
  trait FilenameConflictAction extends StObject
  object FilenameConflictAction {
    
    inline def overwrite: typings.chrome.chromeStrings.overwrite = "overwrite".asInstanceOf[typings.chrome.chromeStrings.overwrite]
    
    inline def prompt: typings.chrome.chromeStrings.prompt = "prompt".asInstanceOf[typings.chrome.chromeStrings.prompt]
    
    inline def uniquify: typings.chrome.chromeStrings.uniquify = "uniquify".asInstanceOf[typings.chrome.chromeStrings.uniquify]
  }
  
  trait GetFileIconOptions extends StObject {
    
    /** Optional. * The size of the returned icon. The icon will be square with dimensions size * size pixels. The default and largest size for the icon is 32x32 pixels. The only supported sizes are 16 and 32. It is an error to specify any other size.
      */
    var size: js.UndefOr[`16` | `32`] = js.undefined
  }
  object GetFileIconOptions {
    
    inline def apply(): GetFileIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetFileIconOptions]
    }
    
    extension [Self <: GetFileIconOptions](x: Self) {
      
      inline def setSize(value: `16` | `32`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait HeaderNameValuePair extends StObject {
    
    /** Name of the HTTP header. */
    var name: String
    
    /** Value of the HTTP header. */
    var value: String
  }
  object HeaderNameValuePair {
    
    inline def apply(name: String, value: String): HeaderNameValuePair = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderNameValuePair]
    }
    
    extension [Self <: HeaderNameValuePair](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringDelta extends StObject {
    
    var current: js.UndefOr[String] = js.undefined
    
    var previous: js.UndefOr[String] = js.undefined
  }
  object StringDelta {
    
    inline def apply(): StringDelta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringDelta]
    }
    
    extension [Self <: StringDelta](x: Self) {
      
      inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
}
