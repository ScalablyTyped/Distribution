package typings.dashjs.mod

import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPlayerClass extends StObject {
  
  def addABRCustomRule(`type`: String, rulename: String, rule: js.Object): Unit = js.native
  
  def addUTCTimingSource(schemeIdUri: String, value: String): Unit = js.native
  
  def attachProtectionController(value: ProtectionController): Unit = js.native
  
  def attachSource(urlOrManifest: String): Unit = js.native
  def attachSource(urlOrManifest: String, startTime: String): Unit = js.native
  def attachSource(urlOrManifest: String, startTime: Double): Unit = js.native
  def attachSource(urlOrManifest: js.Object): Unit = js.native
  def attachSource(urlOrManifest: js.Object, startTime: String): Unit = js.native
  def attachSource(urlOrManifest: js.Object, startTime: Double): Unit = js.native
  
  def attachTTMLRenderingDiv(div: HTMLDivElement): Unit = js.native
  
  def attachView(element: HTMLElement): Unit = js.native
  
  def clearDefaultUTCTimingSources(): Unit = js.native
  
  def convertToTimeCode(value: Double): String = js.native
  
  def destroy(): Unit = js.native
  
  def duration(): Double = js.native
  
  def durationAsUTC(): Double = js.native
  
  def enableForcedTextStreaming(value: Boolean): Unit = js.native
  
  def enableText(enable: Boolean): Unit = js.native
  
  def extend(parentNameString: String, childInstance: js.Object, `override`: Boolean): Unit = js.native
  
  def formatUTC(time: Double, locales: String, hour12: Boolean): String = js.native
  def formatUTC(time: Double, locales: String, hour12: Boolean, withDate: Boolean): String = js.native
  
  def getActiveStream(): Stream | Null = js.native
  
  def getAutoPlay(): Boolean = js.native
  
  def getAverageThroughput(`type`: MediaType): Double = js.native
  
  def getBitrateInfoListFor(`type`: MediaType): js.Array[BitrateInfo] = js.native
  
  def getBufferLength(`type`: MediaType): Double = js.native
  
  def getCurrentLiveLatency(): Double = js.native
  
  def getCurrentTextTrackIndex(): Double = js.native
  
  def getCurrentTrackFor(`type`: MediaType): MediaInfo | Null = js.native
  
  def getDVRSeekOffset(value: Double): Double = js.native
  
  def getDVRWindowSize(): Double = js.native
  
  def getDashAdapter(): DashAdapter = js.native
  
  def getDashMetrics(): DashMetrics = js.native
  
  def getDebug(): Debug = js.native
  
  def getInitialMediaSettingsFor(`type`: MediaType): MediaSettings = js.native
  
  def getOfflineController(): OfflineController = js.native
  
  def getPlaybackRate(): Double = js.native
  
  def getProtectionController(): ProtectionController = js.native
  
  def getQualityFor(`type`: MediaType): Double = js.native
  
  def getSettings(): MediaPlayerSettingClass = js.native
  
  def getSource(): String | js.Object = js.native
  
  def getStreamsFromManifest(manifest: js.Object): js.Array[StreamInfo] = js.native
  
  def getTTMLRenderingDiv(): HTMLDivElement | Null = js.native
  
  def getTopBitrateInfoFor(`type`: MediaType): BitrateInfo = js.native
  
  def getTracksFor(`type`: MediaType): js.Array[MediaInfo] = js.native
  
  def getTracksForTypeFromManifest(`type`: MediaType, manifest: js.Object, streamInfo: StreamInfo): js.Array[MediaInfo] = js.native
  
  def getVersion(): String = js.native
  
  def getVideoElement(): HTMLVideoElement = js.native
  
  def getVideoModel(): VideoModel = js.native
  
  def getVolume(): Double = js.native
  
  def getXHRWithCredentialsForType(`type`: String): Boolean = js.native
  
  def initialize(): Unit = js.native
  def initialize(view: Unit, source: String): Unit = js.native
  def initialize(view: Unit, source: String, autoPlay: Boolean): Unit = js.native
  def initialize(view: Unit, source: String, autoPlay: Boolean, startTime: String): Unit = js.native
  def initialize(view: Unit, source: String, autoPlay: Boolean, startTime: Double): Unit = js.native
  def initialize(view: Unit, source: String, autoPlay: Unit, startTime: String): Unit = js.native
  def initialize(view: Unit, source: String, autoPlay: Unit, startTime: Double): Unit = js.native
  def initialize(view: Unit, source: Unit, autoPlay: Boolean): Unit = js.native
  def initialize(view: Unit, source: Unit, autoPlay: Boolean, startTime: String): Unit = js.native
  def initialize(view: Unit, source: Unit, autoPlay: Boolean, startTime: Double): Unit = js.native
  def initialize(view: Unit, source: Unit, autoPlay: Unit, startTime: String): Unit = js.native
  def initialize(view: Unit, source: Unit, autoPlay: Unit, startTime: Double): Unit = js.native
  def initialize(view: HTMLElement): Unit = js.native
  def initialize(view: HTMLElement, source: String): Unit = js.native
  def initialize(view: HTMLElement, source: String, autoPlay: Boolean): Unit = js.native
  def initialize(view: HTMLElement, source: String, autoPlay: Boolean, startTime: String): Unit = js.native
  def initialize(view: HTMLElement, source: String, autoPlay: Boolean, startTime: Double): Unit = js.native
  def initialize(view: HTMLElement, source: String, autoPlay: Unit, startTime: String): Unit = js.native
  def initialize(view: HTMLElement, source: String, autoPlay: Unit, startTime: Double): Unit = js.native
  def initialize(view: HTMLElement, source: Unit, autoPlay: Boolean): Unit = js.native
  def initialize(view: HTMLElement, source: Unit, autoPlay: Boolean, startTime: String): Unit = js.native
  def initialize(view: HTMLElement, source: Unit, autoPlay: Boolean, startTime: Double): Unit = js.native
  def initialize(view: HTMLElement, source: Unit, autoPlay: Unit, startTime: String): Unit = js.native
  def initialize(view: HTMLElement, source: Unit, autoPlay: Unit, startTime: Double): Unit = js.native
  
  def isDynamic(): Boolean = js.native
  
  def isMuted(): Boolean = js.native
  
  def isPaused(): Boolean = js.native
  
  def isReady(): Boolean = js.native
  
  def isSeeking(): Boolean = js.native
  
  def isTextEnabled(): Boolean = js.native
  
  def off(`type`: String, listener: js.Function1[/* e */ Any, Unit]): Unit = js.native
  def off(`type`: String, listener: js.Function1[/* e */ Any, Unit], scope: js.Object): Unit = js.native
  
  def on(`type`: String, listener: js.Function1[/* e */ Event, Unit]): Unit = js.native
  def on(`type`: String, listener: js.Function1[/* e */ Event, Unit], scope: js.Object): Unit = js.native
  def on(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['BUFFER_EMPTY' | 'BUFFER_LOADED'] */ /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['KEY_SESSION_CLOSED' | 'KEY_SESSION_REMOVED'] */ /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['METRIC_ADDED' | 'METRIC_UPDATED'] */ /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['OFFLINE_RECORD_FINISHED' | 'OFFLINE_RECORD_STARTED' | 'OFFLINE_RECORD_STOPPED'] */ /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PERIOD_SWITCH_COMPLETED' | 'PERIOD_SWITCH_STARTED'] */ js.Any,
    listener: js.Function1[
      (/* e */ BufferEvent) | (/* e */ KeySessionClosedEvent) | (/* e */ MetricEvent) | (/* e */ OfflineRecordEvent) | (/* e */ PeriodSwitchEvent), 
      Unit
    ]
  ): Unit = js.native
  def on(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['BUFFER_EMPTY' | 'BUFFER_LOADED'] */ /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['KEY_SESSION_CLOSED' | 'KEY_SESSION_REMOVED'] */ /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['METRIC_ADDED' | 'METRIC_UPDATED'] */ /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['OFFLINE_RECORD_FINISHED' | 'OFFLINE_RECORD_STARTED' | 'OFFLINE_RECORD_STOPPED'] */ /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PERIOD_SWITCH_COMPLETED' | 'PERIOD_SWITCH_STARTED'] */ js.Any,
    listener: js.Function1[
      (/* e */ BufferEvent) | (/* e */ KeySessionClosedEvent) | (/* e */ MetricEvent) | (/* e */ OfflineRecordEvent) | (/* e */ PeriodSwitchEvent), 
      Unit
    ],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_ADAPTATIONSETREMOVEDNOCAPABILITIES(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['ADAPTATION_SET_REMOVED_NO_CAPABILITIES'] */ js.Any,
    listener: js.Function1[/* e */ AdaptationSetRemovedNoCapabilitiesEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ADAPTATIONSETREMOVEDNOCAPABILITIES(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['ADAPTATION_SET_REMOVED_NO_CAPABILITIES'] */ js.Any,
    listener: js.Function1[/* e */ AdaptationSetRemovedNoCapabilitiesEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_ASTINFUTURE(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['AST_IN_FUTURE'] */ js.Any,
    listener: js.Function1[/* e */ AstInFutureEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ASTINFUTURE(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['AST_IN_FUTURE'] */ js.Any,
    listener: js.Function1[/* e */ AstInFutureEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_CAPTIONCONTAINERRESIZE(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['CAPTION_CONTAINER_RESIZE'] */ js.Any,
    listener: js.Function1[/* e */ CaptionContainerResizeEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_CAPTIONCONTAINERRESIZE(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['CAPTION_CONTAINER_RESIZE'] */ js.Any,
    listener: js.Function1[/* e */ CaptionContainerResizeEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_CAPTIONRENDERED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['CAPTION_RENDERED'] */ js.Any,
    listener: js.Function1[/* e */ CaptionRenderedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_CAPTIONRENDERED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['CAPTION_RENDERED'] */ js.Any,
    listener: js.Function1[/* e */ CaptionRenderedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_DYNAMICTOSTATIC(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['DYNAMIC_TO_STATIC'] */ js.Any,
    listener: js.Function1[/* e */ DynamicToStaticEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DYNAMICTOSTATIC(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['DYNAMIC_TO_STATIC'] */ js.Any,
    listener: js.Function1[/* e */ DynamicToStaticEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_ERROR(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['ERROR'] */ js.Any,
    listener: js.Function1[/* e */ ErrorEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ERROR(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['ERROR'] */ js.Any,
    listener: js.Function1[/* e */ ErrorEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_FRAGMENTLOADINGABANDONED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['FRAGMENT_LOADING_ABANDONED'] */ js.Any,
    listener: js.Function1[/* e */ FragmentLoadingAbandonedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_FRAGMENTLOADINGABANDONED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['FRAGMENT_LOADING_ABANDONED'] */ js.Any,
    listener: js.Function1[/* e */ FragmentLoadingAbandonedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_FRAGMENTLOADINGCOMPLETED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['FRAGMENT_LOADING_COMPLETED'] */ js.Any,
    listener: js.Function1[/* e */ FragmentLoadingCompletedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_FRAGMENTLOADINGCOMPLETED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['FRAGMENT_LOADING_COMPLETED'] */ js.Any,
    listener: js.Function1[/* e */ FragmentLoadingCompletedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_KEYERROR(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['KEY_ERROR'] */ js.Any,
    listener: js.Function1[/* e */ KeyErrorEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_KEYERROR(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['KEY_ERROR'] */ js.Any,
    listener: js.Function1[/* e */ KeyErrorEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_KEYMESSAGE(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['KEY_MESSAGE'] */ js.Any,
    listener: js.Function1[/* e */ KeyMessageEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_KEYMESSAGE(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['KEY_MESSAGE'] */ js.Any,
    listener: js.Function1[/* e */ KeyMessageEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_KEYSESSIONCREATED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['KEY_SESSION_CREATED'] */ js.Any,
    listener: js.Function1[/* e */ KeySessionEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_KEYSESSIONCREATED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['KEY_SESSION_CREATED'] */ js.Any,
    listener: js.Function1[/* e */ KeySessionEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_KEYSTATUSESCHANGED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['KEY_STATUSES_CHANGED'] */ js.Any,
    listener: js.Function1[/* e */ KeyStatusesChangedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_KEYSTATUSESCHANGED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['KEY_STATUSES_CHANGED'] */ js.Any,
    listener: js.Function1[/* e */ KeyStatusesChangedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_KEYSYSTEMSELECTED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['KEY_SYSTEM_SELECTED'] */ js.Any,
    listener: js.Function1[/* e */ KeySystemSelectedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_KEYSYSTEMSELECTED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['KEY_SYSTEM_SELECTED'] */ js.Any,
    listener: js.Function1[/* e */ KeySystemSelectedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_LICENSEREQUESTCOMPLETE(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['LICENSE_REQUEST_COMPLETE'] */ js.Any,
    listener: js.Function1[/* e */ LicenseRequestCompleteEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LICENSEREQUESTCOMPLETE(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['LICENSE_REQUEST_COMPLETE'] */ js.Any,
    listener: js.Function1[/* e */ LicenseRequestCompleteEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_LOG(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['LOG'] */ js.Any,
    listener: js.Function1[/* e */ LogEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LOG(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['LOG'] */ js.Any,
    listener: js.Function1[/* e */ LogEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_MANIFESTLOADED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['MANIFEST_LOADED'] */ js.Any,
    listener: js.Function1[/* e */ ManifestLoadedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_MANIFESTLOADED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['MANIFEST_LOADED'] */ js.Any,
    listener: js.Function1[/* e */ ManifestLoadedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_METRICCHANGED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['METRIC_CHANGED'] */ js.Any,
    listener: js.Function1[/* e */ MetricChangedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_METRICCHANGED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['METRIC_CHANGED'] */ js.Any,
    listener: js.Function1[/* e */ MetricChangedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_OFFLINERECORDLOADEDMETADATA(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['OFFLINE_RECORD_LOADEDMETADATA'] */ js.Any,
    listener: js.Function1[/* e */ OfflineRecordLoademetadataEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OFFLINERECORDLOADEDMETADATA(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['OFFLINE_RECORD_LOADEDMETADATA'] */ js.Any,
    listener: js.Function1[/* e */ OfflineRecordLoademetadataEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_PLAYBACKERROR(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PLAYBACK_ERROR'] */ js.Any,
    listener: js.Function1[/* e */ PlaybackErrorEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_PLAYBACKERROR(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PLAYBACK_ERROR'] */ js.Any,
    listener: js.Function1[/* e */ PlaybackErrorEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_PLAYBACKPAUSED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PLAYBACK_PAUSED'] */ js.Any,
    listener: js.Function1[/* e */ PlaybackPausedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_PLAYBACKPAUSED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PLAYBACK_PAUSED'] */ js.Any,
    listener: js.Function1[/* e */ PlaybackPausedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_PLAYBACKPLAYING(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PLAYBACK_PLAYING'] */ js.Any,
    listener: js.Function1[/* e */ PlaybackPlayingEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_PLAYBACKPLAYING(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PLAYBACK_PLAYING'] */ js.Any,
    listener: js.Function1[/* e */ PlaybackPlayingEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_PLAYBACKRATECHANGED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PLAYBACK_RATE_CHANGED'] */ js.Any,
    listener: js.Function1[/* e */ PlaybackRateChangedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_PLAYBACKRATECHANGED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PLAYBACK_RATE_CHANGED'] */ js.Any,
    listener: js.Function1[/* e */ PlaybackRateChangedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_PLAYBACKSEEKING(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PLAYBACK_SEEKING'] */ js.Any,
    listener: js.Function1[/* e */ PlaybackSeekingEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_PLAYBACKSEEKING(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PLAYBACK_SEEKING'] */ js.Any,
    listener: js.Function1[/* e */ PlaybackSeekingEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_PLAYBACKSTARTED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PLAYBACK_STARTED'] */ js.Any,
    listener: js.Function1[/* e */ PlaybackStartedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_PLAYBACKSTARTED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PLAYBACK_STARTED'] */ js.Any,
    listener: js.Function1[/* e */ PlaybackStartedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_PLAYBACKTIMEUPDATED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PLAYBACK_TIME_UPDATED'] */ js.Any,
    listener: js.Function1[/* e */ PlaybackTimeUpdatedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_PLAYBACKTIMEUPDATED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PLAYBACK_TIME_UPDATED'] */ js.Any,
    listener: js.Function1[/* e */ PlaybackTimeUpdatedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_PROTECTIONCREATED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PROTECTION_CREATED'] */ js.Any,
    listener: js.Function1[/* e */ ProtectionCreatedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_PROTECTIONCREATED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PROTECTION_CREATED'] */ js.Any,
    listener: js.Function1[/* e */ ProtectionCreatedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_PROTECTIONDESTROYED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PROTECTION_DESTROYED'] */ js.Any,
    listener: js.Function1[/* e */ ProtectionDestroyedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_PROTECTIONDESTROYED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PROTECTION_DESTROYED'] */ js.Any,
    listener: js.Function1[/* e */ ProtectionDestroyedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_QUALITYCHANGERENDERED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['QUALITY_CHANGE_RENDERED'] */ js.Any,
    listener: js.Function1[/* e */ QualityChangeRenderedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_QUALITYCHANGERENDERED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['QUALITY_CHANGE_RENDERED'] */ js.Any,
    listener: js.Function1[/* e */ QualityChangeRenderedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_QUALITYCHANGEREQUESTED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['QUALITY_CHANGE_REQUESTED'] */ js.Any,
    listener: js.Function1[/* e */ QualityChangeRequestedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_QUALITYCHANGEREQUESTED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['QUALITY_CHANGE_REQUESTED'] */ js.Any,
    listener: js.Function1[/* e */ QualityChangeRequestedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_STREAMINITIALIZED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['STREAM_INITIALIZED'] */ js.Any,
    listener: js.Function1[/* e */ StreamInitializedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_STREAMINITIALIZED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['STREAM_INITIALIZED'] */ js.Any,
    listener: js.Function1[/* e */ StreamInitializedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_TEXTTRACKSADDED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['TEXT_TRACKS_ADDED'] */ js.Any,
    listener: js.Function1[/* e */ TextTracksAddedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_TEXTTRACKSADDED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['TEXT_TRACKS_ADDED'] */ js.Any,
    listener: js.Function1[/* e */ TextTracksAddedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_TTMLPARSED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['TTML_PARSED'] */ js.Any,
    listener: js.Function1[/* e */ TtmlParsedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_TTMLPARSED(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['TTML_PARSED'] */ js.Any,
    listener: js.Function1[/* e */ TtmlParsedEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  @JSName("on")
  def on_TTMLTOPARSE(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['TTML_TO_PARSE'] */ js.Any,
    listener: js.Function1[/* e */ TtmlToParseEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_TTMLTOPARSE(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['TTML_TO_PARSE'] */ js.Any,
    listener: js.Function1[/* e */ TtmlToParseEvent, Unit],
    scope: js.Object
  ): Unit = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def provideThumbnail(time: Double, callback: js.Function1[/* thumbnail */ Thumbnail | Null, Unit]): Unit = js.native
  
  def registerCustomCapabilitiesFilter(filter: CapabilitiesFilter): Unit = js.native
  
  def registerLicenseRequestFilter(filter: RequestFilter): Unit = js.native
  
  def registerLicenseResponseFilter(filter: ResponseFilter): Unit = js.native
  
  def removeABRCustomRule(rulename: String): Unit = js.native
  
  def removeAllABRCustomRule(): Unit = js.native
  
  def removeUTCTimingSource(schemeIdUri: String, value: String): Unit = js.native
  
  def reset(): Unit = js.native
  
  def resetCustomInitialTrackSelectionFunction(fn: TrackSelectionFunction): Unit = js.native
  
  def resetSettings(): Unit = js.native
  
  def restoreDefaultUTCTimingSources(): Unit = js.native
  
  def retrieveManifest(url: String, callback: js.Function2[/* manifest */ js.Object | Null, /* error */ Any, Unit]): Unit = js.native
  
  def seek(value: Double): Unit = js.native
  
  def setAutoPlay(value: Boolean): Unit = js.native
  
  def setCurrentTrack(track: MediaInfo): Unit = js.native
  
  def setCustomInitialTrackSelectionFunction(fn: TrackSelectionFunction): Unit = js.native
  
  def setInitialMediaSettingsFor(`type`: MediaType, value: MediaSettings): Unit = js.native
  
  def setMute(value: Boolean): Unit = js.native
  
  def setPlaybackRate(value: Double): Unit = js.native
  
  def setProtectionData(value: ProtectionDataSet): Unit = js.native
  
  def setQualityFor(`type`: MediaType, value: Double): Unit = js.native
  def setQualityFor(`type`: MediaType, value: Double, replace: Boolean): Unit = js.native
  
  def setTextTrack(idx: Double): Unit = js.native
  
  def setVolume(value: Double): Unit = js.native
  
  def setXHRWithCredentialsForType(`type`: String, value: Boolean): Unit = js.native
  
  def time(): Double = js.native
  def time(streamId: String): Double = js.native
  
  def timeAsUTC(): Double = js.native
  
  def unregisterCustomCapabilitiesFilter(filter: CapabilitiesFilter): Unit = js.native
  
  def unregisterLicenseRequestFilter(filter: RequestFilter): Unit = js.native
  
  def unregisterLicenseResponseFilter(filter: ResponseFilter): Unit = js.native
  
  def updatePortalSize(): Unit = js.native
  
  def updateSettings(settings: MediaPlayerSettingClass): Unit = js.native
  
  def updateSource(urlOrManifest: String): Unit = js.native
  def updateSource(urlOrManifest: js.Object): Unit = js.native
}
