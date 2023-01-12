package typings.dashjs.mod

import typings.dashjs.dashjsStrings.adaptationSetRemovedNoCapabilities
import typings.dashjs.dashjsStrings.allTextTracksAdded
import typings.dashjs.dashjsStrings.astInFuture
import typings.dashjs.dashjsStrings.bufferLevelUpdated
import typings.dashjs.dashjsStrings.bufferLoaded
import typings.dashjs.dashjsStrings.bufferStalled
import typings.dashjs.dashjsStrings.bufferStateChanged
import typings.dashjs.dashjsStrings.canPlay
import typings.dashjs.dashjsStrings.canPlayThrough
import typings.dashjs.dashjsStrings.captionContainerResize
import typings.dashjs.dashjsStrings.captionRendered
import typings.dashjs.dashjsStrings.conformanceViolation
import typings.dashjs.dashjsStrings.dynamicToStatic
import typings.dashjs.dashjsStrings.error
import typings.dashjs.dashjsStrings.eventModeOnReceive
import typings.dashjs.dashjsStrings.eventModeOnStart
import typings.dashjs.dashjsStrings.fragmentLoadingAbandoned
import typings.dashjs.dashjsStrings.fragmentLoadingCompleted
import typings.dashjs.dashjsStrings.fragmentLoadingProgress
import typings.dashjs.dashjsStrings.fragmentLoadingStarted
import typings.dashjs.dashjsStrings.log
import typings.dashjs.dashjsStrings.manifestLoaded
import typings.dashjs.dashjsStrings.manifestValidityChanged
import typings.dashjs.dashjsStrings.metricAdded
import typings.dashjs.dashjsStrings.metricChanged
import typings.dashjs.dashjsStrings.metricUpdated
import typings.dashjs.dashjsStrings.metricsChanged
import typings.dashjs.dashjsStrings.periodSwitchCompleted
import typings.dashjs.dashjsStrings.periodSwitchStarted
import typings.dashjs.dashjsStrings.playbackEnded
import typings.dashjs.dashjsStrings.playbackError
import typings.dashjs.dashjsStrings.playbackLoadedData
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
import typings.dashjs.dashjsStrings.playbackVolumeChanged
import typings.dashjs.dashjsStrings.playbackWaiting
import typings.dashjs.dashjsStrings.public_keyAdded
import typings.dashjs.dashjsStrings.public_keyError
import typings.dashjs.dashjsStrings.public_keyMessage
import typings.dashjs.dashjsStrings.public_keySessionClosed
import typings.dashjs.dashjsStrings.public_keySessionCreated
import typings.dashjs.dashjsStrings.public_keySessionRemoved
import typings.dashjs.dashjsStrings.public_keySessionUpdated
import typings.dashjs.dashjsStrings.public_keyStatusesChanged
import typings.dashjs.dashjsStrings.public_keySystemAccessComplete
import typings.dashjs.dashjsStrings.public_keySystemSelected
import typings.dashjs.dashjsStrings.public_licenseRequestComplete
import typings.dashjs.dashjsStrings.public_licenseRequestSending
import typings.dashjs.dashjsStrings.public_offlineRecordFinished
import typings.dashjs.dashjsStrings.public_offlineRecordLoadedmetadata
import typings.dashjs.dashjsStrings.public_offlineRecordStarted
import typings.dashjs.dashjsStrings.public_offlineRecordStopped
import typings.dashjs.dashjsStrings.public_protectioncreated
import typings.dashjs.dashjsStrings.public_protectiondestroyed
import typings.dashjs.dashjsStrings.qualityChangeRendered
import typings.dashjs.dashjsStrings.qualityChangeRequested
import typings.dashjs.dashjsStrings.representationSwitch
import typings.dashjs.dashjsStrings.streamActivated
import typings.dashjs.dashjsStrings.streamDeactivated
import typings.dashjs.dashjsStrings.streamInitialized
import typings.dashjs.dashjsStrings.streamInitializing
import typings.dashjs.dashjsStrings.streamTeardownComplete
import typings.dashjs.dashjsStrings.streamUpdated
import typings.dashjs.dashjsStrings.textTrackAdded
import typings.dashjs.dashjsStrings.trackChangeRendered
import typings.dashjs.dashjsStrings.ttmlParsed
import typings.dashjs.dashjsStrings.ttmlToParse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPlayerEvents extends StObject {
  
  var ADAPTATION_SET_REMOVED_NO_CAPABILITIES: adaptationSetRemovedNoCapabilities
  
  var AST_IN_FUTURE: astInFuture
  
  var BUFFER_EMPTY: bufferStalled
  
  var BUFFER_LEVEL_STATE_CHANGED: bufferStateChanged
  
  var BUFFER_LEVEL_UPDATED: bufferLevelUpdated
  
  var BUFFER_LOADED: bufferLoaded
  
  var CAN_PLAY: canPlay
  
  var CAN_PLAY_THROUGH: canPlayThrough
  
  var CAPTION_CONTAINER_RESIZE: captionContainerResize
  
  var CAPTION_RENDERED: captionRendered
  
  var CONFORMANCE_VIOLATION: conformanceViolation
  
  var DYNAMIC_TO_STATIC: dynamicToStatic
  
  var ERROR: error
  
  var EVENT_MODE_ON_RECEIVE: eventModeOnReceive
  
  var EVENT_MODE_ON_START: eventModeOnStart
  
  var FRAGMENT_LOADING_ABANDONED: fragmentLoadingAbandoned
  
  var FRAGMENT_LOADING_COMPLETED: fragmentLoadingCompleted
  
  var FRAGMENT_LOADING_PROGRESS: fragmentLoadingProgress
  
  var FRAGMENT_LOADING_STARTED: fragmentLoadingStarted
  
  var KEY_ADDED: public_keyAdded
  
  var KEY_ERROR: public_keyError
  
  var KEY_MESSAGE: public_keyMessage
  
  var KEY_SESSION_CLOSED: public_keySessionClosed
  
  var KEY_SESSION_CREATED: public_keySessionCreated
  
  var KEY_SESSION_REMOVED: public_keySessionRemoved
  
  var KEY_SESSION_UPDATED: public_keySessionUpdated
  
  var KEY_STATUSES_CHANGED: public_keyStatusesChanged
  
  var KEY_SYSTEM_ACCESS_COMPLETE: public_keySystemAccessComplete
  
  var KEY_SYSTEM_SELECTED: public_keySystemSelected
  
  var LICENSE_REQUEST_COMPLETE: public_licenseRequestComplete
  
  var LICENSE_REQUEST_SENDING: public_licenseRequestSending
  
  var LOG: log
  
  var MANIFEST_LOADED: manifestLoaded
  
  var MANIFEST_VALIDITY_CHANGED: manifestValidityChanged
  
  var METRICS_CHANGED: metricsChanged
  
  var METRIC_ADDED: metricAdded
  
  var METRIC_CHANGED: metricChanged
  
  var METRIC_UPDATED: metricUpdated
  
  var OFFLINE_RECORD_FINISHED: public_offlineRecordFinished
  
  var OFFLINE_RECORD_LOADEDMETADATA: public_offlineRecordLoadedmetadata
  
  var OFFLINE_RECORD_STARTED: public_offlineRecordStarted
  
  var OFFLINE_RECORD_STOPPED: public_offlineRecordStopped
  
  var PERIOD_SWITCH_COMPLETED: periodSwitchCompleted
  
  var PERIOD_SWITCH_STARTED: periodSwitchStarted
  
  var PLAYBACK_ENDED: playbackEnded
  
  var PLAYBACK_ERROR: playbackError
  
  var PLAYBACK_LOADED_DATA: playbackLoadedData
  
  var PLAYBACK_METADATA_LOADED: playbackMetaDataLoaded
  
  var PLAYBACK_NOT_ALLOWED: playbackNotAllowed
  
  var PLAYBACK_PAUSED: playbackPaused
  
  var PLAYBACK_PLAYING: playbackPlaying
  
  var PLAYBACK_PROGRESS: playbackProgress
  
  var PLAYBACK_RATE_CHANGED: playbackRateChanged
  
  var PLAYBACK_SEEKED: playbackSeeked
  
  var PLAYBACK_SEEKING: playbackSeeking
  
  var PLAYBACK_STALLED: playbackStalled
  
  var PLAYBACK_STARTED: playbackStarted
  
  var PLAYBACK_TIME_UPDATED: playbackTimeUpdated
  
  var PLAYBACK_VOLUME_CHANGED: playbackVolumeChanged
  
  var PLAYBACK_WAITING: playbackWaiting
  
  var PROTECTION_CREATED: public_protectioncreated
  
  var PROTECTION_DESTROYED: public_protectiondestroyed
  
  var QUALITY_CHANGE_RENDERED: qualityChangeRendered
  
  var QUALITY_CHANGE_REQUESTED: qualityChangeRequested
  
  var REPRESENTATION_SWITCH: representationSwitch
  
  var STREAM_ACTIVATED: streamActivated
  
  var STREAM_DEACTIVATED: streamDeactivated
  
  var STREAM_INITIALIZED: streamInitialized
  
  var STREAM_INITIALIZING: streamInitializing
  
  var STREAM_TEARDOWN_COMPLETE: streamTeardownComplete
  
  var STREAM_UPDATED: streamUpdated
  
  var TEXT_TRACKS_ADDED: allTextTracksAdded
  
  var TEXT_TRACK_ADDED: textTrackAdded
  
  var TRACK_CHANGE_RENDERED: trackChangeRendered
  
  var TTML_PARSED: ttmlParsed
  
  var TTML_TO_PARSE: ttmlToParse
}
object MediaPlayerEvents {
  
  inline def apply(): MediaPlayerEvents = {
    val __obj = js.Dynamic.literal(ADAPTATION_SET_REMOVED_NO_CAPABILITIES = "adaptationSetRemovedNoCapabilities", AST_IN_FUTURE = "astInFuture", BUFFER_EMPTY = "bufferStalled", BUFFER_LEVEL_STATE_CHANGED = "bufferStateChanged", BUFFER_LEVEL_UPDATED = "bufferLevelUpdated", BUFFER_LOADED = "bufferLoaded", CAN_PLAY = "canPlay", CAN_PLAY_THROUGH = "canPlayThrough", CAPTION_CONTAINER_RESIZE = "captionContainerResize", CAPTION_RENDERED = "captionRendered", CONFORMANCE_VIOLATION = "conformanceViolation", DYNAMIC_TO_STATIC = "dynamicToStatic", ERROR = "error", EVENT_MODE_ON_RECEIVE = "eventModeOnReceive", EVENT_MODE_ON_START = "eventModeOnStart", FRAGMENT_LOADING_ABANDONED = "fragmentLoadingAbandoned", FRAGMENT_LOADING_COMPLETED = "fragmentLoadingCompleted", FRAGMENT_LOADING_PROGRESS = "fragmentLoadingProgress", FRAGMENT_LOADING_STARTED = "fragmentLoadingStarted", KEY_ADDED = "public_keyAdded", KEY_ERROR = "public_keyError", KEY_MESSAGE = "public_keyMessage", KEY_SESSION_CLOSED = "public_keySessionClosed", KEY_SESSION_CREATED = "public_keySessionCreated", KEY_SESSION_REMOVED = "public_keySessionRemoved", KEY_SESSION_UPDATED = "public_keySessionUpdated", KEY_STATUSES_CHANGED = "public_keyStatusesChanged", KEY_SYSTEM_ACCESS_COMPLETE = "public_keySystemAccessComplete", KEY_SYSTEM_SELECTED = "public_keySystemSelected", LICENSE_REQUEST_COMPLETE = "public_licenseRequestComplete", LICENSE_REQUEST_SENDING = "public_licenseRequestSending", LOG = "log", MANIFEST_LOADED = "manifestLoaded", MANIFEST_VALIDITY_CHANGED = "manifestValidityChanged", METRICS_CHANGED = "metricsChanged", METRIC_ADDED = "metricAdded", METRIC_CHANGED = "metricChanged", METRIC_UPDATED = "metricUpdated", OFFLINE_RECORD_FINISHED = "public_offlineRecordFinished", OFFLINE_RECORD_LOADEDMETADATA = "public_offlineRecordLoadedmetadata", OFFLINE_RECORD_STARTED = "public_offlineRecordStarted", OFFLINE_RECORD_STOPPED = "public_offlineRecordStopped", PERIOD_SWITCH_COMPLETED = "periodSwitchCompleted", PERIOD_SWITCH_STARTED = "periodSwitchStarted", PLAYBACK_ENDED = "playbackEnded", PLAYBACK_ERROR = "playbackError", PLAYBACK_LOADED_DATA = "playbackLoadedData", PLAYBACK_METADATA_LOADED = "playbackMetaDataLoaded", PLAYBACK_NOT_ALLOWED = "playbackNotAllowed", PLAYBACK_PAUSED = "playbackPaused", PLAYBACK_PLAYING = "playbackPlaying", PLAYBACK_PROGRESS = "playbackProgress", PLAYBACK_RATE_CHANGED = "playbackRateChanged", PLAYBACK_SEEKED = "playbackSeeked", PLAYBACK_SEEKING = "playbackSeeking", PLAYBACK_STALLED = "playbackStalled", PLAYBACK_STARTED = "playbackStarted", PLAYBACK_TIME_UPDATED = "playbackTimeUpdated", PLAYBACK_VOLUME_CHANGED = "playbackVolumeChanged", PLAYBACK_WAITING = "playbackWaiting", PROTECTION_CREATED = "public_protectioncreated", PROTECTION_DESTROYED = "public_protectiondestroyed", QUALITY_CHANGE_RENDERED = "qualityChangeRendered", QUALITY_CHANGE_REQUESTED = "qualityChangeRequested", REPRESENTATION_SWITCH = "representationSwitch", STREAM_ACTIVATED = "streamActivated", STREAM_DEACTIVATED = "streamDeactivated", STREAM_INITIALIZED = "streamInitialized", STREAM_INITIALIZING = "streamInitializing", STREAM_TEARDOWN_COMPLETE = "streamTeardownComplete", STREAM_UPDATED = "streamUpdated", TEXT_TRACKS_ADDED = "allTextTracksAdded", TEXT_TRACK_ADDED = "textTrackAdded", TRACK_CHANGE_RENDERED = "trackChangeRendered", TTML_PARSED = "ttmlParsed", TTML_TO_PARSE = "ttmlToParse")
    __obj.asInstanceOf[MediaPlayerEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaPlayerEvents] (val x: Self) extends AnyVal {
    
    inline def setADAPTATION_SET_REMOVED_NO_CAPABILITIES(value: adaptationSetRemovedNoCapabilities): Self = StObject.set(x, "ADAPTATION_SET_REMOVED_NO_CAPABILITIES", value.asInstanceOf[js.Any])
    
    inline def setAST_IN_FUTURE(value: astInFuture): Self = StObject.set(x, "AST_IN_FUTURE", value.asInstanceOf[js.Any])
    
    inline def setBUFFER_EMPTY(value: bufferStalled): Self = StObject.set(x, "BUFFER_EMPTY", value.asInstanceOf[js.Any])
    
    inline def setBUFFER_LEVEL_STATE_CHANGED(value: bufferStateChanged): Self = StObject.set(x, "BUFFER_LEVEL_STATE_CHANGED", value.asInstanceOf[js.Any])
    
    inline def setBUFFER_LEVEL_UPDATED(value: bufferLevelUpdated): Self = StObject.set(x, "BUFFER_LEVEL_UPDATED", value.asInstanceOf[js.Any])
    
    inline def setBUFFER_LOADED(value: bufferLoaded): Self = StObject.set(x, "BUFFER_LOADED", value.asInstanceOf[js.Any])
    
    inline def setCAN_PLAY(value: canPlay): Self = StObject.set(x, "CAN_PLAY", value.asInstanceOf[js.Any])
    
    inline def setCAN_PLAY_THROUGH(value: canPlayThrough): Self = StObject.set(x, "CAN_PLAY_THROUGH", value.asInstanceOf[js.Any])
    
    inline def setCAPTION_CONTAINER_RESIZE(value: captionContainerResize): Self = StObject.set(x, "CAPTION_CONTAINER_RESIZE", value.asInstanceOf[js.Any])
    
    inline def setCAPTION_RENDERED(value: captionRendered): Self = StObject.set(x, "CAPTION_RENDERED", value.asInstanceOf[js.Any])
    
    inline def setCONFORMANCE_VIOLATION(value: conformanceViolation): Self = StObject.set(x, "CONFORMANCE_VIOLATION", value.asInstanceOf[js.Any])
    
    inline def setDYNAMIC_TO_STATIC(value: dynamicToStatic): Self = StObject.set(x, "DYNAMIC_TO_STATIC", value.asInstanceOf[js.Any])
    
    inline def setERROR(value: error): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setEVENT_MODE_ON_RECEIVE(value: eventModeOnReceive): Self = StObject.set(x, "EVENT_MODE_ON_RECEIVE", value.asInstanceOf[js.Any])
    
    inline def setEVENT_MODE_ON_START(value: eventModeOnStart): Self = StObject.set(x, "EVENT_MODE_ON_START", value.asInstanceOf[js.Any])
    
    inline def setFRAGMENT_LOADING_ABANDONED(value: fragmentLoadingAbandoned): Self = StObject.set(x, "FRAGMENT_LOADING_ABANDONED", value.asInstanceOf[js.Any])
    
    inline def setFRAGMENT_LOADING_COMPLETED(value: fragmentLoadingCompleted): Self = StObject.set(x, "FRAGMENT_LOADING_COMPLETED", value.asInstanceOf[js.Any])
    
    inline def setFRAGMENT_LOADING_PROGRESS(value: fragmentLoadingProgress): Self = StObject.set(x, "FRAGMENT_LOADING_PROGRESS", value.asInstanceOf[js.Any])
    
    inline def setFRAGMENT_LOADING_STARTED(value: fragmentLoadingStarted): Self = StObject.set(x, "FRAGMENT_LOADING_STARTED", value.asInstanceOf[js.Any])
    
    inline def setKEY_ADDED(value: public_keyAdded): Self = StObject.set(x, "KEY_ADDED", value.asInstanceOf[js.Any])
    
    inline def setKEY_ERROR(value: public_keyError): Self = StObject.set(x, "KEY_ERROR", value.asInstanceOf[js.Any])
    
    inline def setKEY_MESSAGE(value: public_keyMessage): Self = StObject.set(x, "KEY_MESSAGE", value.asInstanceOf[js.Any])
    
    inline def setKEY_SESSION_CLOSED(value: public_keySessionClosed): Self = StObject.set(x, "KEY_SESSION_CLOSED", value.asInstanceOf[js.Any])
    
    inline def setKEY_SESSION_CREATED(value: public_keySessionCreated): Self = StObject.set(x, "KEY_SESSION_CREATED", value.asInstanceOf[js.Any])
    
    inline def setKEY_SESSION_REMOVED(value: public_keySessionRemoved): Self = StObject.set(x, "KEY_SESSION_REMOVED", value.asInstanceOf[js.Any])
    
    inline def setKEY_SESSION_UPDATED(value: public_keySessionUpdated): Self = StObject.set(x, "KEY_SESSION_UPDATED", value.asInstanceOf[js.Any])
    
    inline def setKEY_STATUSES_CHANGED(value: public_keyStatusesChanged): Self = StObject.set(x, "KEY_STATUSES_CHANGED", value.asInstanceOf[js.Any])
    
    inline def setKEY_SYSTEM_ACCESS_COMPLETE(value: public_keySystemAccessComplete): Self = StObject.set(x, "KEY_SYSTEM_ACCESS_COMPLETE", value.asInstanceOf[js.Any])
    
    inline def setKEY_SYSTEM_SELECTED(value: public_keySystemSelected): Self = StObject.set(x, "KEY_SYSTEM_SELECTED", value.asInstanceOf[js.Any])
    
    inline def setLICENSE_REQUEST_COMPLETE(value: public_licenseRequestComplete): Self = StObject.set(x, "LICENSE_REQUEST_COMPLETE", value.asInstanceOf[js.Any])
    
    inline def setLICENSE_REQUEST_SENDING(value: public_licenseRequestSending): Self = StObject.set(x, "LICENSE_REQUEST_SENDING", value.asInstanceOf[js.Any])
    
    inline def setLOG(value: log): Self = StObject.set(x, "LOG", value.asInstanceOf[js.Any])
    
    inline def setMANIFEST_LOADED(value: manifestLoaded): Self = StObject.set(x, "MANIFEST_LOADED", value.asInstanceOf[js.Any])
    
    inline def setMANIFEST_VALIDITY_CHANGED(value: manifestValidityChanged): Self = StObject.set(x, "MANIFEST_VALIDITY_CHANGED", value.asInstanceOf[js.Any])
    
    inline def setMETRICS_CHANGED(value: metricsChanged): Self = StObject.set(x, "METRICS_CHANGED", value.asInstanceOf[js.Any])
    
    inline def setMETRIC_ADDED(value: metricAdded): Self = StObject.set(x, "METRIC_ADDED", value.asInstanceOf[js.Any])
    
    inline def setMETRIC_CHANGED(value: metricChanged): Self = StObject.set(x, "METRIC_CHANGED", value.asInstanceOf[js.Any])
    
    inline def setMETRIC_UPDATED(value: metricUpdated): Self = StObject.set(x, "METRIC_UPDATED", value.asInstanceOf[js.Any])
    
    inline def setOFFLINE_RECORD_FINISHED(value: public_offlineRecordFinished): Self = StObject.set(x, "OFFLINE_RECORD_FINISHED", value.asInstanceOf[js.Any])
    
    inline def setOFFLINE_RECORD_LOADEDMETADATA(value: public_offlineRecordLoadedmetadata): Self = StObject.set(x, "OFFLINE_RECORD_LOADEDMETADATA", value.asInstanceOf[js.Any])
    
    inline def setOFFLINE_RECORD_STARTED(value: public_offlineRecordStarted): Self = StObject.set(x, "OFFLINE_RECORD_STARTED", value.asInstanceOf[js.Any])
    
    inline def setOFFLINE_RECORD_STOPPED(value: public_offlineRecordStopped): Self = StObject.set(x, "OFFLINE_RECORD_STOPPED", value.asInstanceOf[js.Any])
    
    inline def setPERIOD_SWITCH_COMPLETED(value: periodSwitchCompleted): Self = StObject.set(x, "PERIOD_SWITCH_COMPLETED", value.asInstanceOf[js.Any])
    
    inline def setPERIOD_SWITCH_STARTED(value: periodSwitchStarted): Self = StObject.set(x, "PERIOD_SWITCH_STARTED", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_ENDED(value: playbackEnded): Self = StObject.set(x, "PLAYBACK_ENDED", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_ERROR(value: playbackError): Self = StObject.set(x, "PLAYBACK_ERROR", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_LOADED_DATA(value: playbackLoadedData): Self = StObject.set(x, "PLAYBACK_LOADED_DATA", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_METADATA_LOADED(value: playbackMetaDataLoaded): Self = StObject.set(x, "PLAYBACK_METADATA_LOADED", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_NOT_ALLOWED(value: playbackNotAllowed): Self = StObject.set(x, "PLAYBACK_NOT_ALLOWED", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_PAUSED(value: playbackPaused): Self = StObject.set(x, "PLAYBACK_PAUSED", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_PLAYING(value: playbackPlaying): Self = StObject.set(x, "PLAYBACK_PLAYING", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_PROGRESS(value: playbackProgress): Self = StObject.set(x, "PLAYBACK_PROGRESS", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_RATE_CHANGED(value: playbackRateChanged): Self = StObject.set(x, "PLAYBACK_RATE_CHANGED", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_SEEKED(value: playbackSeeked): Self = StObject.set(x, "PLAYBACK_SEEKED", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_SEEKING(value: playbackSeeking): Self = StObject.set(x, "PLAYBACK_SEEKING", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_STALLED(value: playbackStalled): Self = StObject.set(x, "PLAYBACK_STALLED", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_STARTED(value: playbackStarted): Self = StObject.set(x, "PLAYBACK_STARTED", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_TIME_UPDATED(value: playbackTimeUpdated): Self = StObject.set(x, "PLAYBACK_TIME_UPDATED", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_VOLUME_CHANGED(value: playbackVolumeChanged): Self = StObject.set(x, "PLAYBACK_VOLUME_CHANGED", value.asInstanceOf[js.Any])
    
    inline def setPLAYBACK_WAITING(value: playbackWaiting): Self = StObject.set(x, "PLAYBACK_WAITING", value.asInstanceOf[js.Any])
    
    inline def setPROTECTION_CREATED(value: public_protectioncreated): Self = StObject.set(x, "PROTECTION_CREATED", value.asInstanceOf[js.Any])
    
    inline def setPROTECTION_DESTROYED(value: public_protectiondestroyed): Self = StObject.set(x, "PROTECTION_DESTROYED", value.asInstanceOf[js.Any])
    
    inline def setQUALITY_CHANGE_RENDERED(value: qualityChangeRendered): Self = StObject.set(x, "QUALITY_CHANGE_RENDERED", value.asInstanceOf[js.Any])
    
    inline def setQUALITY_CHANGE_REQUESTED(value: qualityChangeRequested): Self = StObject.set(x, "QUALITY_CHANGE_REQUESTED", value.asInstanceOf[js.Any])
    
    inline def setREPRESENTATION_SWITCH(value: representationSwitch): Self = StObject.set(x, "REPRESENTATION_SWITCH", value.asInstanceOf[js.Any])
    
    inline def setSTREAM_ACTIVATED(value: streamActivated): Self = StObject.set(x, "STREAM_ACTIVATED", value.asInstanceOf[js.Any])
    
    inline def setSTREAM_DEACTIVATED(value: streamDeactivated): Self = StObject.set(x, "STREAM_DEACTIVATED", value.asInstanceOf[js.Any])
    
    inline def setSTREAM_INITIALIZED(value: streamInitialized): Self = StObject.set(x, "STREAM_INITIALIZED", value.asInstanceOf[js.Any])
    
    inline def setSTREAM_INITIALIZING(value: streamInitializing): Self = StObject.set(x, "STREAM_INITIALIZING", value.asInstanceOf[js.Any])
    
    inline def setSTREAM_TEARDOWN_COMPLETE(value: streamTeardownComplete): Self = StObject.set(x, "STREAM_TEARDOWN_COMPLETE", value.asInstanceOf[js.Any])
    
    inline def setSTREAM_UPDATED(value: streamUpdated): Self = StObject.set(x, "STREAM_UPDATED", value.asInstanceOf[js.Any])
    
    inline def setTEXT_TRACKS_ADDED(value: allTextTracksAdded): Self = StObject.set(x, "TEXT_TRACKS_ADDED", value.asInstanceOf[js.Any])
    
    inline def setTEXT_TRACK_ADDED(value: textTrackAdded): Self = StObject.set(x, "TEXT_TRACK_ADDED", value.asInstanceOf[js.Any])
    
    inline def setTRACK_CHANGE_RENDERED(value: trackChangeRendered): Self = StObject.set(x, "TRACK_CHANGE_RENDERED", value.asInstanceOf[js.Any])
    
    inline def setTTML_PARSED(value: ttmlParsed): Self = StObject.set(x, "TTML_PARSED", value.asInstanceOf[js.Any])
    
    inline def setTTML_TO_PARSE(value: ttmlToParse): Self = StObject.set(x, "TTML_TO_PARSE", value.asInstanceOf[js.Any])
  }
}
