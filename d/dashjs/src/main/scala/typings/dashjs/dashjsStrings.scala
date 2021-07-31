package typings.dashjs

import typings.dashjs.mod.MetricType
import typings.dashjs.mod.TrackSelectionMode
import typings.dashjs.mod.TrackSwitchMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dashjsStrings {
  
  @js.native
  sealed trait InitializationSegment extends StObject
  @scala.inline
  def InitializationSegment: InitializationSegment = "InitializationSegment".asInstanceOf[InitializationSegment]
  
  @js.native
  sealed trait ManifestUpdate
    extends StObject
       with MetricType
  @scala.inline
  def ManifestUpdate: ManifestUpdate = "ManifestUpdate".asInstanceOf[ManifestUpdate]
  
  @js.native
  sealed trait MediaSegment extends StObject
  @scala.inline
  def MediaSegment: MediaSegment = "MediaSegment".asInstanceOf[MediaSegment]
  
  @js.native
  sealed trait RequestsQueue
    extends StObject
       with MetricType
  @scala.inline
  def RequestsQueue: RequestsQueue = "RequestsQueue".asInstanceOf[RequestsQueue]
  
  @js.native
  sealed trait allTextTracksAdded extends StObject
  @scala.inline
  def allTextTracksAdded: allTextTracksAdded = "allTextTracksAdded".asInstanceOf[allTextTracksAdded]
  
  @js.native
  sealed trait alwaysReplace
    extends StObject
       with TrackSwitchMode
  @scala.inline
  def alwaysReplace: alwaysReplace = "alwaysReplace".asInstanceOf[alwaysReplace]
  
  @js.native
  sealed trait astInFuture extends StObject
  @scala.inline
  def astInFuture: astInFuture = "astInFuture".asInstanceOf[astInFuture]
  
  @js.native
  sealed trait audio extends StObject
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait bufferLoaded extends StObject
  @scala.inline
  def bufferLoaded: bufferLoaded = "bufferLoaded".asInstanceOf[bufferLoaded]
  
  @js.native
  sealed trait bufferStalled extends StObject
  @scala.inline
  def bufferStalled: bufferStalled = "bufferStalled".asInstanceOf[bufferStalled]
  
  @js.native
  sealed trait bufferStateChanged extends StObject
  @scala.inline
  def bufferStateChanged: bufferStateChanged = "bufferStateChanged".asInstanceOf[bufferStateChanged]
  
  @js.native
  sealed trait canPlay extends StObject
  @scala.inline
  def canPlay: canPlay = "canPlay".asInstanceOf[canPlay]
  
  @js.native
  sealed trait capability extends StObject
  @scala.inline
  def capability: capability = "capability".asInstanceOf[capability]
  
  @js.native
  sealed trait captionContainerResize extends StObject
  @scala.inline
  def captionContainerResize: captionContainerResize = "captionContainerResize".asInstanceOf[captionContainerResize]
  
  @js.native
  sealed trait captionRendered extends StObject
  @scala.inline
  def captionRendered: captionRendered = "captionRendered".asInstanceOf[captionRendered]
  
  @js.native
  sealed trait cc extends StObject
  @scala.inline
  def cc: cc = "cc".asInstanceOf[cc]
  
  @js.native
  sealed trait download extends StObject
  @scala.inline
  def download: download = "download".asInstanceOf[download]
  
  @js.native
  sealed trait embeddedText extends StObject
  @scala.inline
  def embeddedText: embeddedText = "embeddedText".asInstanceOf[embeddedText]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fragmentLoadingAbandoned extends StObject
  @scala.inline
  def fragmentLoadingAbandoned: fragmentLoadingAbandoned = "fragmentLoadingAbandoned".asInstanceOf[fragmentLoadingAbandoned]
  
  @js.native
  sealed trait fragmentLoadingCompleted extends StObject
  @scala.inline
  def fragmentLoadingCompleted: fragmentLoadingCompleted = "fragmentLoadingCompleted".asInstanceOf[fragmentLoadingCompleted]
  
  @js.native
  sealed trait fragmentLoadingStarted extends StObject
  @scala.inline
  def fragmentLoadingStarted: fragmentLoadingStarted = "fragmentLoadingStarted".asInstanceOf[fragmentLoadingStarted]
  
  @js.native
  sealed trait fragmentedText extends StObject
  @scala.inline
  def fragmentedText: fragmentedText = "fragmentedText".asInstanceOf[fragmentedText]
  
  @js.native
  sealed trait highestBitrate
    extends StObject
       with TrackSelectionMode
  @scala.inline
  def highestBitrate: highestBitrate = "highestBitrate".asInstanceOf[highestBitrate]
  
  @js.native
  sealed trait image extends StObject
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait key_message extends StObject
  @scala.inline
  def key_message: key_message = "key_message".asInstanceOf[key_message]
  
  @js.native
  sealed trait key_session extends StObject
  @scala.inline
  def key_session: key_session = "key_session".asInstanceOf[key_session]
  
  @js.native
  sealed trait log extends StObject
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait manifestError extends StObject
  @scala.inline
  def manifestError: manifestError = "manifestError".asInstanceOf[manifestError]
  
  @js.native
  sealed trait manifestLoaded extends StObject
  @scala.inline
  def manifestLoaded: manifestLoaded = "manifestLoaded".asInstanceOf[manifestLoaded]
  
  @js.native
  sealed trait mediasource extends StObject
  @scala.inline
  def mediasource: mediasource = "mediasource".asInstanceOf[mediasource]
  
  @js.native
  sealed trait metricAdded extends StObject
  @scala.inline
  def metricAdded: metricAdded = "metricAdded".asInstanceOf[metricAdded]
  
  @js.native
  sealed trait metricChanged extends StObject
  @scala.inline
  def metricChanged: metricChanged = "metricChanged".asInstanceOf[metricChanged]
  
  @js.native
  sealed trait metricUpdated extends StObject
  @scala.inline
  def metricUpdated: metricUpdated = "metricUpdated".asInstanceOf[metricUpdated]
  
  @js.native
  sealed trait metricsChanged extends StObject
  @scala.inline
  def metricsChanged: metricsChanged = "metricsChanged".asInstanceOf[metricsChanged]
  
  @js.native
  sealed trait neverReplace
    extends StObject
       with TrackSwitchMode
  @scala.inline
  def neverReplace: neverReplace = "neverReplace".asInstanceOf[neverReplace]
  
  @js.native
  sealed trait periodSwitchCompleted extends StObject
  @scala.inline
  def periodSwitchCompleted: periodSwitchCompleted = "periodSwitchCompleted".asInstanceOf[periodSwitchCompleted]
  
  @js.native
  sealed trait periodSwitchStarted extends StObject
  @scala.inline
  def periodSwitchStarted: periodSwitchStarted = "periodSwitchStarted".asInstanceOf[periodSwitchStarted]
  
  @js.native
  sealed trait playbackEnded extends StObject
  @scala.inline
  def playbackEnded: playbackEnded = "playbackEnded".asInstanceOf[playbackEnded]
  
  @js.native
  sealed trait playbackError extends StObject
  @scala.inline
  def playbackError: playbackError = "playbackError".asInstanceOf[playbackError]
  
  @js.native
  sealed trait playbackMetaDataLoaded extends StObject
  @scala.inline
  def playbackMetaDataLoaded: playbackMetaDataLoaded = "playbackMetaDataLoaded".asInstanceOf[playbackMetaDataLoaded]
  
  @js.native
  sealed trait playbackNotAllowed extends StObject
  @scala.inline
  def playbackNotAllowed: playbackNotAllowed = "playbackNotAllowed".asInstanceOf[playbackNotAllowed]
  
  @js.native
  sealed trait playbackPaused extends StObject
  @scala.inline
  def playbackPaused: playbackPaused = "playbackPaused".asInstanceOf[playbackPaused]
  
  @js.native
  sealed trait playbackPlaying extends StObject
  @scala.inline
  def playbackPlaying: playbackPlaying = "playbackPlaying".asInstanceOf[playbackPlaying]
  
  @js.native
  sealed trait playbackProgress extends StObject
  @scala.inline
  def playbackProgress: playbackProgress = "playbackProgress".asInstanceOf[playbackProgress]
  
  @js.native
  sealed trait playbackRateChanged extends StObject
  @scala.inline
  def playbackRateChanged: playbackRateChanged = "playbackRateChanged".asInstanceOf[playbackRateChanged]
  
  @js.native
  sealed trait playbackSeeked extends StObject
  @scala.inline
  def playbackSeeked: playbackSeeked = "playbackSeeked".asInstanceOf[playbackSeeked]
  
  @js.native
  sealed trait playbackSeeking extends StObject
  @scala.inline
  def playbackSeeking: playbackSeeking = "playbackSeeking".asInstanceOf[playbackSeeking]
  
  @js.native
  sealed trait playbackStalled extends StObject
  @scala.inline
  def playbackStalled: playbackStalled = "playbackStalled".asInstanceOf[playbackStalled]
  
  @js.native
  sealed trait playbackStarted extends StObject
  @scala.inline
  def playbackStarted: playbackStarted = "playbackStarted".asInstanceOf[playbackStarted]
  
  @js.native
  sealed trait playbackTimeUpdated extends StObject
  @scala.inline
  def playbackTimeUpdated: playbackTimeUpdated = "playbackTimeUpdated".asInstanceOf[playbackTimeUpdated]
  
  @js.native
  sealed trait playbackWaiting extends StObject
  @scala.inline
  def playbackWaiting: playbackWaiting = "playbackWaiting".asInstanceOf[playbackWaiting]
  
  @js.native
  sealed trait public_keyAdded extends StObject
  @scala.inline
  def public_keyAdded: public_keyAdded = "public_keyAdded".asInstanceOf[public_keyAdded]
  
  @js.native
  sealed trait public_keyError extends StObject
  @scala.inline
  def public_keyError: public_keyError = "public_keyError".asInstanceOf[public_keyError]
  
  @js.native
  sealed trait public_keyMessage extends StObject
  @scala.inline
  def public_keyMessage: public_keyMessage = "public_keyMessage".asInstanceOf[public_keyMessage]
  
  @js.native
  sealed trait public_keySessionClosed extends StObject
  @scala.inline
  def public_keySessionClosed: public_keySessionClosed = "public_keySessionClosed".asInstanceOf[public_keySessionClosed]
  
  @js.native
  sealed trait public_keySessionCreated extends StObject
  @scala.inline
  def public_keySessionCreated: public_keySessionCreated = "public_keySessionCreated".asInstanceOf[public_keySessionCreated]
  
  @js.native
  sealed trait public_keySessionRemoved extends StObject
  @scala.inline
  def public_keySessionRemoved: public_keySessionRemoved = "public_keySessionRemoved".asInstanceOf[public_keySessionRemoved]
  
  @js.native
  sealed trait public_keyStatusesChanged extends StObject
  @scala.inline
  def public_keyStatusesChanged: public_keyStatusesChanged = "public_keyStatusesChanged".asInstanceOf[public_keyStatusesChanged]
  
  @js.native
  sealed trait public_keySystemSelected extends StObject
  @scala.inline
  def public_keySystemSelected: public_keySystemSelected = "public_keySystemSelected".asInstanceOf[public_keySystemSelected]
  
  @js.native
  sealed trait public_licenseRequestComplete extends StObject
  @scala.inline
  def public_licenseRequestComplete: public_licenseRequestComplete = "public_licenseRequestComplete".asInstanceOf[public_licenseRequestComplete]
  
  @js.native
  sealed trait public_protectioncreated extends StObject
  @scala.inline
  def public_protectioncreated: public_protectioncreated = "public_protectioncreated".asInstanceOf[public_protectioncreated]
  
  @js.native
  sealed trait public_protectiondestroyed extends StObject
  @scala.inline
  def public_protectiondestroyed: public_protectiondestroyed = "public_protectiondestroyed".asInstanceOf[public_protectiondestroyed]
  
  @js.native
  sealed trait qualityChangeRendered extends StObject
  @scala.inline
  def qualityChangeRendered: qualityChangeRendered = "qualityChangeRendered".asInstanceOf[qualityChangeRendered]
  
  @js.native
  sealed trait qualityChangeRequested extends StObject
  @scala.inline
  def qualityChangeRequested: qualityChangeRequested = "qualityChangeRequested".asInstanceOf[qualityChangeRequested]
  
  @js.native
  sealed trait stream extends StObject
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  
  @js.native
  sealed trait streamInitialized extends StObject
  @scala.inline
  def streamInitialized: streamInitialized = "streamInitialized".asInstanceOf[streamInitialized]
  
  @js.native
  sealed trait text extends StObject
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait textTrackAdded extends StObject
  @scala.inline
  def textTrackAdded: textTrackAdded = "textTrackAdded".asInstanceOf[textTrackAdded]
  
  @js.native
  sealed trait trackChangeRendered extends StObject
  @scala.inline
  def trackChangeRendered: trackChangeRendered = "trackChangeRendered".asInstanceOf[trackChangeRendered]
  
  @js.native
  sealed trait ttmlParsed extends StObject
  @scala.inline
  def ttmlParsed: ttmlParsed = "ttmlParsed".asInstanceOf[ttmlParsed]
  
  @js.native
  sealed trait ttmlToParse extends StObject
  @scala.inline
  def ttmlToParse: ttmlToParse = "ttmlToParse".asInstanceOf[ttmlToParse]
  
  @js.native
  sealed trait video extends StObject
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait widestRange
    extends StObject
       with TrackSelectionMode
  @scala.inline
  def widestRange: widestRange = "widestRange".asInstanceOf[widestRange]
}
