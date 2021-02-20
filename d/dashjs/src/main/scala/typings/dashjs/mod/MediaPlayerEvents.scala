package typings.dashjs.mod

import typings.dashjs.dashjsStrings.allTextTracksAdded
import typings.dashjs.dashjsStrings.astInFuture
import typings.dashjs.dashjsStrings.bufferLoaded
import typings.dashjs.dashjsStrings.bufferStalled
import typings.dashjs.dashjsStrings.bufferStateChanged
import typings.dashjs.dashjsStrings.canPlay
import typings.dashjs.dashjsStrings.captionContainerResize
import typings.dashjs.dashjsStrings.captionRendered
import typings.dashjs.dashjsStrings.error
import typings.dashjs.dashjsStrings.fragmentLoadingAbandoned
import typings.dashjs.dashjsStrings.fragmentLoadingCompleted
import typings.dashjs.dashjsStrings.fragmentLoadingStarted
import typings.dashjs.dashjsStrings.log
import typings.dashjs.dashjsStrings.manifestLoaded
import typings.dashjs.dashjsStrings.metricAdded
import typings.dashjs.dashjsStrings.metricChanged
import typings.dashjs.dashjsStrings.metricUpdated
import typings.dashjs.dashjsStrings.metricsChanged
import typings.dashjs.dashjsStrings.periodSwitchCompleted
import typings.dashjs.dashjsStrings.periodSwitchStarted
import typings.dashjs.dashjsStrings.playbackEnded
import typings.dashjs.dashjsStrings.playbackError
import typings.dashjs.dashjsStrings.playbackMetaDataLoaded
import typings.dashjs.dashjsStrings.playbackNotAllowed
import typings.dashjs.dashjsStrings.playbackPaused
import typings.dashjs.dashjsStrings.playbackPlaying
import typings.dashjs.dashjsStrings.playbackProgress
import typings.dashjs.dashjsStrings.playbackRateChanged
import typings.dashjs.dashjsStrings.playbackSeeked
import typings.dashjs.dashjsStrings.playbackSeeking
import typings.dashjs.dashjsStrings.playbackStalled
import typings.dashjs.dashjsStrings.playbackStarted
import typings.dashjs.dashjsStrings.playbackTimeUpdated
import typings.dashjs.dashjsStrings.playbackWaiting
import typings.dashjs.dashjsStrings.public_keyAdded
import typings.dashjs.dashjsStrings.public_keyError
import typings.dashjs.dashjsStrings.public_keyMessage
import typings.dashjs.dashjsStrings.public_keySessionClosed
import typings.dashjs.dashjsStrings.public_keySessionCreated
import typings.dashjs.dashjsStrings.public_keySessionRemoved
import typings.dashjs.dashjsStrings.public_keyStatusesChanged
import typings.dashjs.dashjsStrings.public_keySystemSelected
import typings.dashjs.dashjsStrings.public_licenseRequestComplete
import typings.dashjs.dashjsStrings.public_protectioncreated
import typings.dashjs.dashjsStrings.public_protectiondestroyed
import typings.dashjs.dashjsStrings.qualityChangeRendered
import typings.dashjs.dashjsStrings.qualityChangeRequested
import typings.dashjs.dashjsStrings.streamInitialized
import typings.dashjs.dashjsStrings.textTrackAdded
import typings.dashjs.dashjsStrings.trackChangeRendered
import typings.dashjs.dashjsStrings.ttmlParsed
import typings.dashjs.dashjsStrings.ttmlToParse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPlayerEvents extends StObject {
  
  var AST_IN_FUTURE: astInFuture = js.native
  
  var BUFFER_EMPTY: bufferStalled = js.native
  
  var BUFFER_LEVEL_STATE_CHANGED: bufferStateChanged = js.native
  
  var BUFFER_LOADED: bufferLoaded = js.native
  
  var CAN_PLAY: canPlay = js.native
  
  var CAPTION_CONTAINER_RESIZE: captionContainerResize = js.native
  
  var CAPTION_RENDERED: captionRendered = js.native
  
  var ERROR: error = js.native
  
  var FRAGMENT_LOADING_ABANDONED: fragmentLoadingAbandoned = js.native
  
  var FRAGMENT_LOADING_COMPLETED: fragmentLoadingCompleted = js.native
  
  var FRAGMENT_LOADING_STARTED: fragmentLoadingStarted = js.native
  
  var KEY_ADDED: public_keyAdded = js.native
  
  var KEY_ERROR: public_keyError = js.native
  
  var KEY_MESSAGE: public_keyMessage = js.native
  
  var KEY_SESSION_CLOSED: public_keySessionClosed = js.native
  
  var KEY_SESSION_CREATED: public_keySessionCreated = js.native
  
  var KEY_SESSION_REMOVED: public_keySessionRemoved = js.native
  
  var KEY_STATUSES_CHANGED: public_keyStatusesChanged = js.native
  
  var KEY_SYSTEM_SELECTED: public_keySystemSelected = js.native
  
  var LICENSE_REQUEST_COMPLETE: public_licenseRequestComplete = js.native
  
  var LOG: log = js.native
  
  var MANIFEST_LOADED: manifestLoaded = js.native
  
  var METRICS_CHANGED: metricsChanged = js.native
  
  var METRIC_ADDED: metricAdded = js.native
  
  var METRIC_CHANGED: metricChanged = js.native
  
  var METRIC_UPDATED: metricUpdated = js.native
  
  var PERIOD_SWITCH_COMPLETED: periodSwitchCompleted = js.native
  
  var PERIOD_SWITCH_STARTED: periodSwitchStarted = js.native
  
  var PLAYBACK_ENDED: playbackEnded = js.native
  
  var PLAYBACK_ERROR: playbackError = js.native
  
  var PLAYBACK_METADATA_LOADED: playbackMetaDataLoaded = js.native
  
  var PLAYBACK_NOT_ALLOWED: playbackNotAllowed = js.native
  
  var PLAYBACK_PAUSED: playbackPaused = js.native
  
  var PLAYBACK_PLAYING: playbackPlaying = js.native
  
  var PLAYBACK_PROGRESS: playbackProgress = js.native
  
  var PLAYBACK_RATE_CHANGED: playbackRateChanged = js.native
  
  var PLAYBACK_SEEKED: playbackSeeked = js.native
  
  var PLAYBACK_SEEKING: playbackSeeking = js.native
  
  var PLAYBACK_STALLED: playbackStalled = js.native
  
  var PLAYBACK_STARTED: playbackStarted = js.native
  
  var PLAYBACK_TIME_UPDATED: playbackTimeUpdated = js.native
  
  var PLAYBACK_WAITING: playbackWaiting = js.native
  
  var PROTECTION_CREATED: public_protectioncreated = js.native
  
  var PROTECTION_DESTROYED: public_protectiondestroyed = js.native
  
  var QUALITY_CHANGE_RENDERED: qualityChangeRendered = js.native
  
  var QUALITY_CHANGE_REQUESTED: qualityChangeRequested = js.native
  
  var STREAM_INITIALIZED: streamInitialized = js.native
  
  var TEXT_TRACKS_ADDED: allTextTracksAdded = js.native
  
  var TEXT_TRACK_ADDED: textTrackAdded = js.native
  
  var TRACK_CHANGE_RENDERED: trackChangeRendered = js.native
  
  var TTML_PARSED: ttmlParsed = js.native
  
  var TTML_TO_PARSE: ttmlToParse = js.native
}
object MediaPlayerEvents {
  
  @scala.inline
  def apply(
    AST_IN_FUTURE: astInFuture,
    BUFFER_EMPTY: bufferStalled,
    BUFFER_LEVEL_STATE_CHANGED: bufferStateChanged,
    BUFFER_LOADED: bufferLoaded,
    CAN_PLAY: canPlay,
    CAPTION_CONTAINER_RESIZE: captionContainerResize,
    CAPTION_RENDERED: captionRendered,
    ERROR: error,
    FRAGMENT_LOADING_ABANDONED: fragmentLoadingAbandoned,
    FRAGMENT_LOADING_COMPLETED: fragmentLoadingCompleted,
    FRAGMENT_LOADING_STARTED: fragmentLoadingStarted,
    KEY_ADDED: public_keyAdded,
    KEY_ERROR: public_keyError,
    KEY_MESSAGE: public_keyMessage,
    KEY_SESSION_CLOSED: public_keySessionClosed,
    KEY_SESSION_CREATED: public_keySessionCreated,
    KEY_SESSION_REMOVED: public_keySessionRemoved,
    KEY_STATUSES_CHANGED: public_keyStatusesChanged,
    KEY_SYSTEM_SELECTED: public_keySystemSelected,
    LICENSE_REQUEST_COMPLETE: public_licenseRequestComplete,
    LOG: log,
    MANIFEST_LOADED: manifestLoaded,
    METRICS_CHANGED: metricsChanged,
    METRIC_ADDED: metricAdded,
    METRIC_CHANGED: metricChanged,
    METRIC_UPDATED: metricUpdated,
    PERIOD_SWITCH_COMPLETED: periodSwitchCompleted,
    PERIOD_SWITCH_STARTED: periodSwitchStarted,
    PLAYBACK_ENDED: playbackEnded,
    PLAYBACK_ERROR: playbackError,
    PLAYBACK_METADATA_LOADED: playbackMetaDataLoaded,
    PLAYBACK_NOT_ALLOWED: playbackNotAllowed,
    PLAYBACK_PAUSED: playbackPaused,
    PLAYBACK_PLAYING: playbackPlaying,
    PLAYBACK_PROGRESS: playbackProgress,
    PLAYBACK_RATE_CHANGED: playbackRateChanged,
    PLAYBACK_SEEKED: playbackSeeked,
    PLAYBACK_SEEKING: playbackSeeking,
    PLAYBACK_STALLED: playbackStalled,
    PLAYBACK_STARTED: playbackStarted,
    PLAYBACK_TIME_UPDATED: playbackTimeUpdated,
    PLAYBACK_WAITING: playbackWaiting,
    PROTECTION_CREATED: public_protectioncreated,
    PROTECTION_DESTROYED: public_protectiondestroyed,
    QUALITY_CHANGE_RENDERED: qualityChangeRendered,
    QUALITY_CHANGE_REQUESTED: qualityChangeRequested,
    STREAM_INITIALIZED: streamInitialized,
    TEXT_TRACKS_ADDED: allTextTracksAdded,
    TEXT_TRACK_ADDED: textTrackAdded,
    TRACK_CHANGE_RENDERED: trackChangeRendered,
    TTML_PARSED: ttmlParsed,
    TTML_TO_PARSE: ttmlToParse
  ): MediaPlayerEvents = {
    val __obj = js.Dynamic.literal(AST_IN_FUTURE = AST_IN_FUTURE.asInstanceOf[js.Any], BUFFER_EMPTY = BUFFER_EMPTY.asInstanceOf[js.Any], BUFFER_LEVEL_STATE_CHANGED = BUFFER_LEVEL_STATE_CHANGED.asInstanceOf[js.Any], BUFFER_LOADED = BUFFER_LOADED.asInstanceOf[js.Any], CAN_PLAY = CAN_PLAY.asInstanceOf[js.Any], CAPTION_CONTAINER_RESIZE = CAPTION_CONTAINER_RESIZE.asInstanceOf[js.Any], CAPTION_RENDERED = CAPTION_RENDERED.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FRAGMENT_LOADING_ABANDONED = FRAGMENT_LOADING_ABANDONED.asInstanceOf[js.Any], FRAGMENT_LOADING_COMPLETED = FRAGMENT_LOADING_COMPLETED.asInstanceOf[js.Any], FRAGMENT_LOADING_STARTED = FRAGMENT_LOADING_STARTED.asInstanceOf[js.Any], KEY_ADDED = KEY_ADDED.asInstanceOf[js.Any], KEY_ERROR = KEY_ERROR.asInstanceOf[js.Any], KEY_MESSAGE = KEY_MESSAGE.asInstanceOf[js.Any], KEY_SESSION_CLOSED = KEY_SESSION_CLOSED.asInstanceOf[js.Any], KEY_SESSION_CREATED = KEY_SESSION_CREATED.asInstanceOf[js.Any], KEY_SESSION_REMOVED = KEY_SESSION_REMOVED.asInstanceOf[js.Any], KEY_STATUSES_CHANGED = KEY_STATUSES_CHANGED.asInstanceOf[js.Any], KEY_SYSTEM_SELECTED = KEY_SYSTEM_SELECTED.asInstanceOf[js.Any], LICENSE_REQUEST_COMPLETE = LICENSE_REQUEST_COMPLETE.asInstanceOf[js.Any], LOG = LOG.asInstanceOf[js.Any], MANIFEST_LOADED = MANIFEST_LOADED.asInstanceOf[js.Any], METRICS_CHANGED = METRICS_CHANGED.asInstanceOf[js.Any], METRIC_ADDED = METRIC_ADDED.asInstanceOf[js.Any], METRIC_CHANGED = METRIC_CHANGED.asInstanceOf[js.Any], METRIC_UPDATED = METRIC_UPDATED.asInstanceOf[js.Any], PERIOD_SWITCH_COMPLETED = PERIOD_SWITCH_COMPLETED.asInstanceOf[js.Any], PERIOD_SWITCH_STARTED = PERIOD_SWITCH_STARTED.asInstanceOf[js.Any], PLAYBACK_ENDED = PLAYBACK_ENDED.asInstanceOf[js.Any], PLAYBACK_ERROR = PLAYBACK_ERROR.asInstanceOf[js.Any], PLAYBACK_METADATA_LOADED = PLAYBACK_METADATA_LOADED.asInstanceOf[js.Any], PLAYBACK_NOT_ALLOWED = PLAYBACK_NOT_ALLOWED.asInstanceOf[js.Any], PLAYBACK_PAUSED = PLAYBACK_PAUSED.asInstanceOf[js.Any], PLAYBACK_PLAYING = PLAYBACK_PLAYING.asInstanceOf[js.Any], PLAYBACK_PROGRESS = PLAYBACK_PROGRESS.asInstanceOf[js.Any], PLAYBACK_RATE_CHANGED = PLAYBACK_RATE_CHANGED.asInstanceOf[js.Any], PLAYBACK_SEEKED = PLAYBACK_SEEKED.asInstanceOf[js.Any], PLAYBACK_SEEKING = PLAYBACK_SEEKING.asInstanceOf[js.Any], PLAYBACK_STALLED = PLAYBACK_STALLED.asInstanceOf[js.Any], PLAYBACK_STARTED = PLAYBACK_STARTED.asInstanceOf[js.Any], PLAYBACK_TIME_UPDATED = PLAYBACK_TIME_UPDATED.asInstanceOf[js.Any], PLAYBACK_WAITING = PLAYBACK_WAITING.asInstanceOf[js.Any], PROTECTION_CREATED = PROTECTION_CREATED.asInstanceOf[js.Any], PROTECTION_DESTROYED = PROTECTION_DESTROYED.asInstanceOf[js.Any], QUALITY_CHANGE_RENDERED = QUALITY_CHANGE_RENDERED.asInstanceOf[js.Any], QUALITY_CHANGE_REQUESTED = QUALITY_CHANGE_REQUESTED.asInstanceOf[js.Any], STREAM_INITIALIZED = STREAM_INITIALIZED.asInstanceOf[js.Any], TEXT_TRACKS_ADDED = TEXT_TRACKS_ADDED.asInstanceOf[js.Any], TEXT_TRACK_ADDED = TEXT_TRACK_ADDED.asInstanceOf[js.Any], TRACK_CHANGE_RENDERED = TRACK_CHANGE_RENDERED.asInstanceOf[js.Any], TTML_PARSED = TTML_PARSED.asInstanceOf[js.Any], TTML_TO_PARSE = TTML_TO_PARSE.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlayerEvents]
  }
  
  @scala.inline
  implicit class MediaPlayerEventsMutableBuilder[Self <: MediaPlayerEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAST_IN_FUTURE(value: astInFuture): Self = StObject.set(x, "AST_IN_FUTURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBUFFER_EMPTY(value: bufferStalled): Self = StObject.set(x, "BUFFER_EMPTY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBUFFER_LEVEL_STATE_CHANGED(value: bufferStateChanged): Self = StObject.set(x, "BUFFER_LEVEL_STATE_CHANGED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBUFFER_LOADED(value: bufferLoaded): Self = StObject.set(x, "BUFFER_LOADED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAN_PLAY(value: canPlay): Self = StObject.set(x, "CAN_PLAY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPTION_CONTAINER_RESIZE(value: captionContainerResize): Self = StObject.set(x, "CAPTION_CONTAINER_RESIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPTION_RENDERED(value: captionRendered): Self = StObject.set(x, "CAPTION_RENDERED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: error): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFRAGMENT_LOADING_ABANDONED(value: fragmentLoadingAbandoned): Self = StObject.set(x, "FRAGMENT_LOADING_ABANDONED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFRAGMENT_LOADING_COMPLETED(value: fragmentLoadingCompleted): Self = StObject.set(x, "FRAGMENT_LOADING_COMPLETED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFRAGMENT_LOADING_STARTED(value: fragmentLoadingStarted): Self = StObject.set(x, "FRAGMENT_LOADING_STARTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKEY_ADDED(value: public_keyAdded): Self = StObject.set(x, "KEY_ADDED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKEY_ERROR(value: public_keyError): Self = StObject.set(x, "KEY_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKEY_MESSAGE(value: public_keyMessage): Self = StObject.set(x, "KEY_MESSAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKEY_SESSION_CLOSED(value: public_keySessionClosed): Self = StObject.set(x, "KEY_SESSION_CLOSED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKEY_SESSION_CREATED(value: public_keySessionCreated): Self = StObject.set(x, "KEY_SESSION_CREATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKEY_SESSION_REMOVED(value: public_keySessionRemoved): Self = StObject.set(x, "KEY_SESSION_REMOVED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKEY_STATUSES_CHANGED(value: public_keyStatusesChanged): Self = StObject.set(x, "KEY_STATUSES_CHANGED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKEY_SYSTEM_SELECTED(value: public_keySystemSelected): Self = StObject.set(x, "KEY_SYSTEM_SELECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLICENSE_REQUEST_COMPLETE(value: public_licenseRequestComplete): Self = StObject.set(x, "LICENSE_REQUEST_COMPLETE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOG(value: log): Self = StObject.set(x, "LOG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMANIFEST_LOADED(value: manifestLoaded): Self = StObject.set(x, "MANIFEST_LOADED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMETRICS_CHANGED(value: metricsChanged): Self = StObject.set(x, "METRICS_CHANGED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMETRIC_ADDED(value: metricAdded): Self = StObject.set(x, "METRIC_ADDED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMETRIC_CHANGED(value: metricChanged): Self = StObject.set(x, "METRIC_CHANGED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMETRIC_UPDATED(value: metricUpdated): Self = StObject.set(x, "METRIC_UPDATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPERIOD_SWITCH_COMPLETED(value: periodSwitchCompleted): Self = StObject.set(x, "PERIOD_SWITCH_COMPLETED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPERIOD_SWITCH_STARTED(value: periodSwitchStarted): Self = StObject.set(x, "PERIOD_SWITCH_STARTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYBACK_ENDED(value: playbackEnded): Self = StObject.set(x, "PLAYBACK_ENDED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYBACK_ERROR(value: playbackError): Self = StObject.set(x, "PLAYBACK_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYBACK_METADATA_LOADED(value: playbackMetaDataLoaded): Self = StObject.set(x, "PLAYBACK_METADATA_LOADED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYBACK_NOT_ALLOWED(value: playbackNotAllowed): Self = StObject.set(x, "PLAYBACK_NOT_ALLOWED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYBACK_PAUSED(value: playbackPaused): Self = StObject.set(x, "PLAYBACK_PAUSED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYBACK_PLAYING(value: playbackPlaying): Self = StObject.set(x, "PLAYBACK_PLAYING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYBACK_PROGRESS(value: playbackProgress): Self = StObject.set(x, "PLAYBACK_PROGRESS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYBACK_RATE_CHANGED(value: playbackRateChanged): Self = StObject.set(x, "PLAYBACK_RATE_CHANGED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYBACK_SEEKED(value: playbackSeeked): Self = StObject.set(x, "PLAYBACK_SEEKED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYBACK_SEEKING(value: playbackSeeking): Self = StObject.set(x, "PLAYBACK_SEEKING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYBACK_STALLED(value: playbackStalled): Self = StObject.set(x, "PLAYBACK_STALLED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYBACK_STARTED(value: playbackStarted): Self = StObject.set(x, "PLAYBACK_STARTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYBACK_TIME_UPDATED(value: playbackTimeUpdated): Self = StObject.set(x, "PLAYBACK_TIME_UPDATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYBACK_WAITING(value: playbackWaiting): Self = StObject.set(x, "PLAYBACK_WAITING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPROTECTION_CREATED(value: public_protectioncreated): Self = StObject.set(x, "PROTECTION_CREATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPROTECTION_DESTROYED(value: public_protectiondestroyed): Self = StObject.set(x, "PROTECTION_DESTROYED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUALITY_CHANGE_RENDERED(value: qualityChangeRendered): Self = StObject.set(x, "QUALITY_CHANGE_RENDERED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUALITY_CHANGE_REQUESTED(value: qualityChangeRequested): Self = StObject.set(x, "QUALITY_CHANGE_REQUESTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTREAM_INITIALIZED(value: streamInitialized): Self = StObject.set(x, "STREAM_INITIALIZED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEXT_TRACKS_ADDED(value: allTextTracksAdded): Self = StObject.set(x, "TEXT_TRACKS_ADDED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEXT_TRACK_ADDED(value: textTrackAdded): Self = StObject.set(x, "TEXT_TRACK_ADDED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRACK_CHANGE_RENDERED(value: trackChangeRendered): Self = StObject.set(x, "TRACK_CHANGE_RENDERED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTTML_PARSED(value: ttmlParsed): Self = StObject.set(x, "TTML_PARSED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTTML_TO_PARSE(value: ttmlToParse): Self = StObject.set(x, "TTML_TO_PARSE", value.asInstanceOf[js.Any])
  }
}
