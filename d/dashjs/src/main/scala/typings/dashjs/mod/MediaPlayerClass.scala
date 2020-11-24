package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.image
import typings.dashjs.dashjsStrings.stream
import typings.dashjs.dashjsStrings.text
import typings.dashjs.dashjsStrings.video
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPlayerClass extends js.Object {
  
  def addABRCustomRule(`type`: String, rulename: String, rule: js.Object): Unit = js.native
  
  def addUTCTimingSource(schemeIdUri: String, value: String): Unit = js.native
  
  def attachProtectionController(value: ProtectionController): Unit = js.native
  
  def attachSource(urlOrManifest: String): Unit = js.native
  def attachSource(urlOrManifest: js.Object): Unit = js.native
  
  def attachTTMLRenderingDiv(div: HTMLDivElement): Unit = js.native
  
  def attachView(element: HTMLElement): Unit = js.native
  
  def clearDefaultUTCTimingSources(): Unit = js.native
  
  def convertToTimeCode(value: Double): String = js.native
  
  def displayCaptionsOnTop(value: Boolean): Unit = js.native
  
  def duration(): Double = js.native
  
  def durationAsUTC(): Double = js.native
  
  def enableBufferOccupancyABR(value: Boolean): Unit = js.native
  
  def enableForcedTextStreaming(value: Boolean): Unit = js.native
  
  def enableLastBitrateCaching(enable: Boolean): Unit = js.native
  def enableLastBitrateCaching(enable: Boolean, ttl: Double): Unit = js.native
  
  def enableLastMediaSettingsCaching(enable: Boolean): Unit = js.native
  def enableLastMediaSettingsCaching(enable: Boolean, ttl: Double): Unit = js.native
  
  def enableLowLatencyCatchUp(value: Boolean): Unit = js.native
  
  def enableManifestDateHeaderTimeSource(value: Boolean): Unit = js.native
  
  def enableText(enable: Boolean): Unit = js.native
  
  def extend(parentNameString: String, childInstance: js.Object, `override`: Boolean): Unit = js.native
  
  def formatUTC(time: Double, locales: String, hour12: Boolean): String = js.native
  def formatUTC(time: Double, locales: String, hour12: Boolean, withDate: Boolean): String = js.native
  
  def getABRStrategy(): String = js.native
  
  def getActiveStream(): Stream | Null = js.native
  
  def getAutoPlay(): Boolean = js.native
  
  def getAutoSwitchQuality(): Boolean = js.native
  
  @JSName("getAutoSwitchQualityFor")
  def getAutoSwitchQualityFor_audio(`type`: audio): Boolean = js.native
  @JSName("getAutoSwitchQualityFor")
  def getAutoSwitchQualityFor_video(`type`: video): Boolean = js.native
  
  def getAverageThroughput(value: Double): Unit = js.native
  
  def getBandwidthSafetyFactor(): Double = js.native
  
  @JSName("getBitrateInfoListFor")
  def getBitrateInfoListFor_audio(`type`: audio): js.Array[BitrateInfo] = js.native
  @JSName("getBitrateInfoListFor")
  def getBitrateInfoListFor_image(`type`: image): js.Array[BitrateInfo] = js.native
  @JSName("getBitrateInfoListFor")
  def getBitrateInfoListFor_video(`type`: video): js.Array[BitrateInfo] = js.native
  
  @JSName("getBufferLength")
  def getBufferLength_audio(`type`: audio): Double = js.native
  @JSName("getBufferLength")
  def getBufferLength_fragmentedText(`type`: fragmentedText): Double = js.native
  @JSName("getBufferLength")
  def getBufferLength_video(`type`: video): Double = js.native
  
  def getBufferTimeAtTopQuality(): Double = js.native
  
  def getBufferTimeAtTopQualityLongForm(): Double = js.native
  
  def getCurrentLiveLatency(): Double = js.native
  
  def getCurrentTextTrackIndex(): Double = js.native
  
  @JSName("getCurrentTrackFor")
  def getCurrentTrackFor_audio(`type`: audio): MediaInfo | Null = js.native
  @JSName("getCurrentTrackFor")
  def getCurrentTrackFor_fragmentedText(`type`: fragmentedText): MediaInfo | Null = js.native
  @JSName("getCurrentTrackFor")
  def getCurrentTrackFor_text(`type`: text): MediaInfo | Null = js.native
  @JSName("getCurrentTrackFor")
  def getCurrentTrackFor_video(`type`: video): MediaInfo | Null = js.native
  
  def getDVRSeekOffset(value: Double): Double = js.native
  
  def getDVRWindowSize(): Double = js.native
  
  def getDashMetrics(): DashMetrics = js.native
  
  def getDebug(): Debug = js.native
  
  def getFastSwitchEnabled(): Boolean = js.native
  
  @JSName("getInitialBitrateFor")
  def getInitialBitrateFor_audio(`type`: audio): Double = js.native
  @JSName("getInitialBitrateFor")
  def getInitialBitrateFor_video(`type`: video): Double = js.native
  
  @JSName("getInitialMediaSettingsFor")
  def getInitialMediaSettingsFor_audio(`type`: audio): MediaSettings = js.native
  @JSName("getInitialMediaSettingsFor")
  def getInitialMediaSettingsFor_video(`type`: video): MediaSettings = js.native
  
  @JSName("getInitialRepresentationRatioFor")
  def getInitialRepresentationRatioFor_audio(`type`: audio): Double = js.native
  @JSName("getInitialRepresentationRatioFor")
  def getInitialRepresentationRatioFor_video(`type`: video): Double = js.native
  
  def getJumpGaps(): Boolean = js.native
  
  def getLimitBitrateByPortal(): js.Any = js.native
  
  def getLiveDelay(): js.UndefOr[Double] = js.native
  
  def getLowLatencyEnabled(): Boolean = js.native
  
  def getLowLatencyMaxDriftBeforeSeeking(): Double = js.native
  
  def getLowLatencyMinDrift(): Double = js.native
  
  def getManifestUpdateRetryInterval(): Double = js.native
  
  @JSName("getMaxAllowedBitrateFor")
  def getMaxAllowedBitrateFor_audio(`type`: audio): Double = js.native
  @JSName("getMaxAllowedBitrateFor")
  def getMaxAllowedBitrateFor_video(`type`: video): Double = js.native
  
  @JSName("getMaxAllowedRepresentationRatioFor")
  def getMaxAllowedRepresentationRatioFor_audio(`type`: audio): Double = js.native
  @JSName("getMaxAllowedRepresentationRatioFor")
  def getMaxAllowedRepresentationRatioFor_video(`type`: video): Double = js.native
  
  @JSName("getMetricsFor")
  def getMetricsFor_audio(`type`: audio): MetricsList | Null = js.native
  @JSName("getMetricsFor")
  def getMetricsFor_stream(`type`: stream): MetricsList | Null = js.native
  @JSName("getMetricsFor")
  def getMetricsFor_text(`type`: text): MetricsList | Null = js.native
  @JSName("getMetricsFor")
  def getMetricsFor_video(`type`: video): MetricsList | Null = js.native
  
  @JSName("getMinAllowedBitrateFor")
  def getMinAllowedBitrateFor_audio(`type`: audio): Double = js.native
  @JSName("getMinAllowedBitrateFor")
  def getMinAllowedBitrateFor_video(`type`: video): Double = js.native
  
  def getMovingAverageMethod(): String = js.native
  
  def getPlaybackRate(): Double = js.native
  
  def getProtectionController(): ProtectionController = js.native
  
  @JSName("getQualityFor")
  def getQualityFor_audio(`type`: audio): Double = js.native
  @JSName("getQualityFor")
  def getQualityFor_image(`type`: image): Double = js.native
  @JSName("getQualityFor")
  def getQualityFor_video(`type`: video): Double = js.native
  
  def getScheduleWhilePaused(): Boolean = js.native
  
  def getSelectionModeForInitialTrack(): TrackSelectionMode = js.native
  
  def getSmallGapLimit(): Double = js.native
  
  def getSource(): String | js.Object = js.native
  
  def getStableBufferTime(): Double = js.native
  
  def getStreamsFromManifest(manifest: js.Object): js.Array[StreamInfo] = js.native
  
  def getTTMLRenderingDiv(): HTMLDivElement | Null = js.native
  
  def getTextDefaultEnabled(): js.UndefOr[Boolean] = js.native
  
  def getTextDefaultLanguage(): js.UndefOr[String] = js.native
  
  def getThumbnail(time: Double): Thumbnail = js.native
  
  @JSName("getTopBitrateInfoFor")
  def getTopBitrateInfoFor_audio(`type`: audio): BitrateInfo = js.native
  @JSName("getTopBitrateInfoFor")
  def getTopBitrateInfoFor_video(`type`: video): BitrateInfo = js.native
  
  @JSName("getTrackSwitchModeFor")
  def getTrackSwitchModeFor_audio(`type`: audio): TrackSwitchMode = js.native
  @JSName("getTrackSwitchModeFor")
  def getTrackSwitchModeFor_video(`type`: video): TrackSwitchMode = js.native
  
  @JSName("getTracksForTypeFromManifest")
  def getTracksForTypeFromManifest_audio(`type`: audio, manifest: js.Object, streamInfo: StreamInfo): js.Array[MediaInfo] = js.native
  @JSName("getTracksForTypeFromManifest")
  def getTracksForTypeFromManifest_fragmentedText(`type`: fragmentedText, manifest: js.Object, streamInfo: StreamInfo): js.Array[MediaInfo] = js.native
  @JSName("getTracksForTypeFromManifest")
  def getTracksForTypeFromManifest_text(`type`: text, manifest: js.Object, streamInfo: StreamInfo): js.Array[MediaInfo] = js.native
  @JSName("getTracksForTypeFromManifest")
  def getTracksForTypeFromManifest_video(`type`: video, manifest: js.Object, streamInfo: StreamInfo): js.Array[MediaInfo] = js.native
  
  @JSName("getTracksFor")
  def getTracksFor_audio(`type`: audio): js.Array[MediaInfo] = js.native
  @JSName("getTracksFor")
  def getTracksFor_fragmentedText(`type`: fragmentedText): js.Array[MediaInfo] = js.native
  @JSName("getTracksFor")
  def getTracksFor_text(`type`: text): js.Array[MediaInfo] = js.native
  @JSName("getTracksFor")
  def getTracksFor_video(`type`: video): js.Array[MediaInfo] = js.native
  
  def getUseDeadTimeLatencyForAbr(): Boolean = js.native
  
  def getUsePixelRatioInLimitBitrateByPortal(): js.Any = js.native
  
  def getVersion(): String = js.native
  
  def getVideoElement(): HTMLVideoElement = js.native
  
  def getVideoModel(): VideoModel = js.native
  
  def getVolume(): Double = js.native
  
  def getXHRWithCredentialsForType(`type`: String): Boolean = js.native
  
  def initialize(): Unit = js.native
  def initialize(view: js.UndefOr[scala.Nothing], source: js.UndefOr[scala.Nothing], autoPlay: Boolean): Unit = js.native
  def initialize(view: js.UndefOr[scala.Nothing], source: String): Unit = js.native
  def initialize(view: js.UndefOr[scala.Nothing], source: String, autoPlay: Boolean): Unit = js.native
  def initialize(view: HTMLElement): Unit = js.native
  def initialize(view: HTMLElement, source: js.UndefOr[scala.Nothing], autoPlay: Boolean): Unit = js.native
  def initialize(view: HTMLElement, source: String): Unit = js.native
  def initialize(view: HTMLElement, source: String, autoPlay: Boolean): Unit = js.native
  
  def isDynamic(): Boolean = js.native
  
  def isMuted(): Boolean = js.native
  
  def isPaused(): Boolean = js.native
  
  def isReady(): Boolean = js.native
  
  def isSeeking(): Boolean = js.native
  
  def isTextEnabled(): Boolean = js.native
  
  def keepProtectionMediaKeys(value: Boolean): Unit = js.native
  
  def off(`type`: String, listener: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
  def off(`type`: String, listener: js.Function1[/* e */ js.Any, Unit], scope: js.Object): Unit = js.native
  
  def on(`type`: String, listener: js.Function1[/* e */ Event, Unit]): Unit = js.native
  def on(`type`: String, listener: js.Function1[/* e */ Event, Unit], scope: js.Object): Unit = js.native
  def on(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['BUFFER_EMPTY' | 'BUFFER_LOADED'] */ /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['KEY_SESSION_CLOSED' | 'KEY_SESSION_REMOVED'] */ /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['METRIC_ADDED' | 'METRIC_UPDATED'] */ /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PERIOD_SWITCH_COMPLETED' | 'PERIOD_SWITCH_STARTED'] */ js.Any,
    listener: js.Function1[
      (/* e */ BufferEvent) | (/* e */ KeySessionClosedEvent) | (/* e */ MetricEvent) | (/* e */ PeriodSwitchEvent), 
      Unit
    ]
  ): Unit = js.native
  def on(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['BUFFER_EMPTY' | 'BUFFER_LOADED'] */ /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['KEY_SESSION_CLOSED' | 'KEY_SESSION_REMOVED'] */ /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['METRIC_ADDED' | 'METRIC_UPDATED'] */ /* import warning: importer.ImportType#apply Failed type conversion: dashjs.dashjs.MediaPlayerEvents['PERIOD_SWITCH_COMPLETED' | 'PERIOD_SWITCH_STARTED'] */ js.Any,
    listener: js.Function1[
      (/* e */ BufferEvent) | (/* e */ KeySessionClosedEvent) | (/* e */ MetricEvent) | (/* e */ PeriodSwitchEvent), 
      Unit
    ],
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
  
  def preload(): Unit = js.native
  
  def removeABRCustomRule(rulename: String): Unit = js.native
  
  def removeAllABRCustomRule(): Unit = js.native
  
  def removeUTCTimingSource(schemeIdUri: String, value: String): Unit = js.native
  
  def reset(): Unit = js.native
  
  def restoreDefaultUTCTimingSources(): Unit = js.native
  
  def retrieveManifest(url: String, callback: js.Function2[/* manifest */ js.Object | Null, /* error */ js.Any, Unit]): Unit = js.native
  
  def seek(value: Double): Unit = js.native
  
  def setABRStrategy(value: String): Unit = js.native
  
  def setAbandonLoadTimeout(value: Double): Unit = js.native
  
  def setAutoPlay(value: Boolean): Unit = js.native
  
  def setAutoSwitchQuality(value: Boolean): Unit = js.native
  
  @JSName("setAutoSwitchQualityFor")
  def setAutoSwitchQualityFor_audio(`type`: audio, value: Boolean): Unit = js.native
  @JSName("setAutoSwitchQualityFor")
  def setAutoSwitchQualityFor_video(`type`: video, value: Boolean): Unit = js.native
  
  def setBandwidthSafetyFactor(value: Double): Unit = js.native
  
  def setBufferAheadToKeep(value: Double): Unit = js.native
  
  def setBufferPruningInterval(value: Double): Unit = js.native
  
  def setBufferTimeAtTopQuality(value: Double): Unit = js.native
  
  def setBufferTimeAtTopQualityLongForm(value: Double): Unit = js.native
  
  def setBufferToKeep(value: Double): Unit = js.native
  
  @JSName("setCacheLoadThresholdForType")
  def setCacheLoadThresholdForType_audio(`type`: audio, value: Double): Unit = js.native
  @JSName("setCacheLoadThresholdForType")
  def setCacheLoadThresholdForType_video(`type`: video, value: Double): Unit = js.native
  
  def setCurrentTrack(track: MediaInfo): Unit = js.native
  
  def setFastSwitchEnabled(value: Boolean): Unit = js.native
  
  def setFragmentLoaderRetryAttempts(value: Double): Unit = js.native
  
  def setFragmentLoaderRetryInterval(value: Double): Unit = js.native
  
  @JSName("setInitialBitrateFor")
  def setInitialBitrateFor_audio(`type`: audio, value: Double): Unit = js.native
  @JSName("setInitialBitrateFor")
  def setInitialBitrateFor_video(`type`: video, value: Double): Unit = js.native
  
  @JSName("setInitialMediaSettingsFor")
  def setInitialMediaSettingsFor_audio(`type`: audio, value: MediaSettings): Unit = js.native
  @JSName("setInitialMediaSettingsFor")
  def setInitialMediaSettingsFor_video(`type`: video, value: MediaSettings): Unit = js.native
  
  @JSName("setInitialRepresentationRatioFor")
  def setInitialRepresentationRatioFor_audio(`type`: audio, value: Double): Unit = js.native
  @JSName("setInitialRepresentationRatioFor")
  def setInitialRepresentationRatioFor_video(`type`: video, value: Double): Unit = js.native
  
  def setJumpGaps(value: Boolean): Unit = js.native
  
  def setLimitBitrateByPortal(value: Boolean): Unit = js.native
  
  def setLiveDelay(value: Double): Unit = js.native
  
  def setLiveDelayFragmentCount(value: Double): Unit = js.native
  
  def setLongFormContentDurationThreshold(value: Double): Unit = js.native
  
  def setLowLatencyEnabled(value: Boolean): Unit = js.native
  
  def setLowLatencyMaxDriftBeforeSeeking(value: Double): Unit = js.native
  
  def setLowLatencyMinDrift(value: Double): Unit = js.native
  
  def setManifestLoaderRetryAttempts(value: Double): Unit = js.native
  
  def setManifestLoaderRetryInterval(value: Double): Unit = js.native
  
  def setManifestUpdateRetryInterval(value: Double): Unit = js.native
  
  @JSName("setMaxAllowedBitrateFor")
  def setMaxAllowedBitrateFor_audio(`type`: audio, value: Double): Unit = js.native
  @JSName("setMaxAllowedBitrateFor")
  def setMaxAllowedBitrateFor_video(`type`: video, value: Double): Unit = js.native
  
  @JSName("setMaxAllowedRepresentationRatioFor")
  def setMaxAllowedRepresentationRatioFor_audio(`type`: audio, value: Double): Unit = js.native
  @JSName("setMaxAllowedRepresentationRatioFor")
  def setMaxAllowedRepresentationRatioFor_video(`type`: video, value: Double): Unit = js.native
  
  @JSName("setMinAllowedBitrateFor")
  def setMinAllowedBitrateFor_audio(`type`: audio, value: Double): js.Any = js.native
  @JSName("setMinAllowedBitrateFor")
  def setMinAllowedBitrateFor_video(`type`: video, value: Double): js.Any = js.native
  
  def setMovingAverageMethod(value: String): Unit = js.native
  
  def setMute(value: Boolean): Unit = js.native
  
  def setPlaybackRate(value: Double): Unit = js.native
  
  def setProtectionData(value: ProtectionData): Unit = js.native
  
  @JSName("setQualityFor")
  def setQualityFor_audio(`type`: audio, value: Double): Unit = js.native
  @JSName("setQualityFor")
  def setQualityFor_image(`type`: image, value: Double): Unit = js.native
  @JSName("setQualityFor")
  def setQualityFor_video(`type`: video, value: Double): Unit = js.native
  
  def setScheduleWhilePaused(value: Boolean): Unit = js.native
  
  def setSegmentOverlapToleranceTime(value: Double): Unit = js.native
  
  def setSelectionModeForInitialTrack(mode: TrackSelectionMode): Unit = js.native
  
  def setSmallGapLimit(value: Double): Unit = js.native
  
  def setStableBufferTime(value: Double): Unit = js.native
  
  def setTextDefaultEnabled(enable: Boolean): Unit = js.native
  
  def setTextDefaultLanguage(lang: String): Unit = js.native
  
  def setTextTrack(idx: Double): Unit = js.native
  
  @JSName("setTrackSwitchModeFor")
  def setTrackSwitchModeFor_audio(`type`: audio, mode: TrackSwitchMode): Unit = js.native
  @JSName("setTrackSwitchModeFor")
  def setTrackSwitchModeFor_video(`type`: video, mode: TrackSwitchMode): Unit = js.native
  
  def setUseDeadTimeLatencyForAbr(value: Boolean): Unit = js.native
  
  def setUsePixelRatioInLimitBitrateByPortal(value: Boolean): Unit = js.native
  
  def setVolume(value: Double): Unit = js.native
  
  def setXHRWithCredentialsForType(`type`: String, value: Boolean): Unit = js.native
  
  def time(): Double = js.native
  def time(streamId: String): Double = js.native
  
  def timeAsUTC(): Double = js.native
  
  def updatePortalSize(): Unit = js.native
  
  def useDefaultABRRules(value: Boolean): Unit = js.native
  
  def useSuggestedPresentationDelay(value: Boolean): Unit = js.native
}
