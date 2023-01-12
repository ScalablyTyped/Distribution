package typings.dashjs.anon

import typings.dashjs.mod.TrackSelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbandonLoadTimeout extends StObject {
  
  var abandonLoadTimeout: js.UndefOr[Double] = js.undefined
  
  var abr: js.UndefOr[ABRStrategy] = js.undefined
  
  var applyServiceDescription: js.UndefOr[Boolean] = js.undefined
  
  var buffer: js.UndefOr[BufferPruningInterval] = js.undefined
  
  var cacheInitSegments: js.UndefOr[Boolean] = js.undefined
  
  var cacheLoadThresholds: js.UndefOr[Audio] = js.undefined
  
  var capabilities: js.UndefOr[FilterUnsupportedEssentialProperties] = js.undefined
  
  var cmcd: js.UndefOr[Cid] = js.undefined
  
  var delay: js.UndefOr[LiveDelay] = js.undefined
  
  var enableManifestDurationMismatchFix: js.UndefOr[Boolean] = js.undefined
  
  var eventControllerRefreshDelay: js.UndefOr[Double] = js.undefined
  
  var fragmentRequestTimeout: js.UndefOr[Double] = js.undefined
  
  var gaps: js.UndefOr[EnableSeekFix] = js.undefined
  
  var lastBitrateCachingInfo: js.UndefOr[Ttl] = js.undefined
  
  var lastMediaSettingsCachingInfo: js.UndefOr[Ttl] = js.undefined
  
  var liveCatchup: js.UndefOr[Enabled] = js.undefined
  
  var manifestUpdateRetryInterval: js.UndefOr[Double] = js.undefined
  
  var metrics: js.UndefOr[MaxListDepth] = js.undefined
  
  var protection: js.UndefOr[DetectPlayreadyMessageFormat] = js.undefined
  
  var retryAttempts: js.UndefOr[FragmentInfoSegment] = js.undefined
  
  var retryIntervals: js.UndefOr[BitstreamSwitchingSegment] = js.undefined
  
  var scheduling: js.UndefOr[DefaultTimeout] = js.undefined
  
  var selectionModeForInitialTrack: js.UndefOr[TrackSelectionMode] = js.undefined
  
  var text: js.UndefOr[DefaultEnabled] = js.undefined
  
  var timeShiftBuffer: js.UndefOr[CalcFromSegmentTimeline] = js.undefined
  
  var trackSwitchMode: js.UndefOr[Video] = js.undefined
  
  var utcSynchronization: js.UndefOr[BackgroundAttempts] = js.undefined
  
  var wallclockTimeUpdateInterval: js.UndefOr[Double] = js.undefined
}
object AbandonLoadTimeout {
  
  inline def apply(): AbandonLoadTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbandonLoadTimeout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AbandonLoadTimeout] (val x: Self) extends AnyVal {
    
    inline def setAbandonLoadTimeout(value: Double): Self = StObject.set(x, "abandonLoadTimeout", value.asInstanceOf[js.Any])
    
    inline def setAbandonLoadTimeoutUndefined: Self = StObject.set(x, "abandonLoadTimeout", js.undefined)
    
    inline def setAbr(value: ABRStrategy): Self = StObject.set(x, "abr", value.asInstanceOf[js.Any])
    
    inline def setAbrUndefined: Self = StObject.set(x, "abr", js.undefined)
    
    inline def setApplyServiceDescription(value: Boolean): Self = StObject.set(x, "applyServiceDescription", value.asInstanceOf[js.Any])
    
    inline def setApplyServiceDescriptionUndefined: Self = StObject.set(x, "applyServiceDescription", js.undefined)
    
    inline def setBuffer(value: BufferPruningInterval): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setCacheInitSegments(value: Boolean): Self = StObject.set(x, "cacheInitSegments", value.asInstanceOf[js.Any])
    
    inline def setCacheInitSegmentsUndefined: Self = StObject.set(x, "cacheInitSegments", js.undefined)
    
    inline def setCacheLoadThresholds(value: Audio): Self = StObject.set(x, "cacheLoadThresholds", value.asInstanceOf[js.Any])
    
    inline def setCacheLoadThresholdsUndefined: Self = StObject.set(x, "cacheLoadThresholds", js.undefined)
    
    inline def setCapabilities(value: FilterUnsupportedEssentialProperties): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCmcd(value: Cid): Self = StObject.set(x, "cmcd", value.asInstanceOf[js.Any])
    
    inline def setCmcdUndefined: Self = StObject.set(x, "cmcd", js.undefined)
    
    inline def setDelay(value: LiveDelay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setEnableManifestDurationMismatchFix(value: Boolean): Self = StObject.set(x, "enableManifestDurationMismatchFix", value.asInstanceOf[js.Any])
    
    inline def setEnableManifestDurationMismatchFixUndefined: Self = StObject.set(x, "enableManifestDurationMismatchFix", js.undefined)
    
    inline def setEventControllerRefreshDelay(value: Double): Self = StObject.set(x, "eventControllerRefreshDelay", value.asInstanceOf[js.Any])
    
    inline def setEventControllerRefreshDelayUndefined: Self = StObject.set(x, "eventControllerRefreshDelay", js.undefined)
    
    inline def setFragmentRequestTimeout(value: Double): Self = StObject.set(x, "fragmentRequestTimeout", value.asInstanceOf[js.Any])
    
    inline def setFragmentRequestTimeoutUndefined: Self = StObject.set(x, "fragmentRequestTimeout", js.undefined)
    
    inline def setGaps(value: EnableSeekFix): Self = StObject.set(x, "gaps", value.asInstanceOf[js.Any])
    
    inline def setGapsUndefined: Self = StObject.set(x, "gaps", js.undefined)
    
    inline def setLastBitrateCachingInfo(value: Ttl): Self = StObject.set(x, "lastBitrateCachingInfo", value.asInstanceOf[js.Any])
    
    inline def setLastBitrateCachingInfoUndefined: Self = StObject.set(x, "lastBitrateCachingInfo", js.undefined)
    
    inline def setLastMediaSettingsCachingInfo(value: Ttl): Self = StObject.set(x, "lastMediaSettingsCachingInfo", value.asInstanceOf[js.Any])
    
    inline def setLastMediaSettingsCachingInfoUndefined: Self = StObject.set(x, "lastMediaSettingsCachingInfo", js.undefined)
    
    inline def setLiveCatchup(value: Enabled): Self = StObject.set(x, "liveCatchup", value.asInstanceOf[js.Any])
    
    inline def setLiveCatchupUndefined: Self = StObject.set(x, "liveCatchup", js.undefined)
    
    inline def setManifestUpdateRetryInterval(value: Double): Self = StObject.set(x, "manifestUpdateRetryInterval", value.asInstanceOf[js.Any])
    
    inline def setManifestUpdateRetryIntervalUndefined: Self = StObject.set(x, "manifestUpdateRetryInterval", js.undefined)
    
    inline def setMetrics(value: MaxListDepth): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setProtection(value: DetectPlayreadyMessageFormat): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    inline def setRetryAttempts(value: FragmentInfoSegment): Self = StObject.set(x, "retryAttempts", value.asInstanceOf[js.Any])
    
    inline def setRetryAttemptsUndefined: Self = StObject.set(x, "retryAttempts", js.undefined)
    
    inline def setRetryIntervals(value: BitstreamSwitchingSegment): Self = StObject.set(x, "retryIntervals", value.asInstanceOf[js.Any])
    
    inline def setRetryIntervalsUndefined: Self = StObject.set(x, "retryIntervals", js.undefined)
    
    inline def setScheduling(value: DefaultTimeout): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    
    inline def setSelectionModeForInitialTrack(value: TrackSelectionMode): Self = StObject.set(x, "selectionModeForInitialTrack", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeForInitialTrackUndefined: Self = StObject.set(x, "selectionModeForInitialTrack", js.undefined)
    
    inline def setText(value: DefaultEnabled): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTimeShiftBuffer(value: CalcFromSegmentTimeline): Self = StObject.set(x, "timeShiftBuffer", value.asInstanceOf[js.Any])
    
    inline def setTimeShiftBufferUndefined: Self = StObject.set(x, "timeShiftBuffer", js.undefined)
    
    inline def setTrackSwitchMode(value: Video): Self = StObject.set(x, "trackSwitchMode", value.asInstanceOf[js.Any])
    
    inline def setTrackSwitchModeUndefined: Self = StObject.set(x, "trackSwitchMode", js.undefined)
    
    inline def setUtcSynchronization(value: BackgroundAttempts): Self = StObject.set(x, "utcSynchronization", value.asInstanceOf[js.Any])
    
    inline def setUtcSynchronizationUndefined: Self = StObject.set(x, "utcSynchronization", js.undefined)
    
    inline def setWallclockTimeUpdateInterval(value: Double): Self = StObject.set(x, "wallclockTimeUpdateInterval", value.asInstanceOf[js.Any])
    
    inline def setWallclockTimeUpdateIntervalUndefined: Self = StObject.set(x, "wallclockTimeUpdateInterval", js.undefined)
  }
}
