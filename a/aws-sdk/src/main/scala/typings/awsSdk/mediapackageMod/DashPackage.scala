package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashPackage extends StObject {
  
  var AdTriggers: js.UndefOr[typings.awsSdk.mediapackageMod.AdTriggers] = js.native
  
  var AdsOnDeliveryRestrictions: js.UndefOr[typings.awsSdk.mediapackageMod.AdsOnDeliveryRestrictions] = js.native
  
  var Encryption: js.UndefOr[DashEncryption] = js.native
  
  /**
    * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
    */
  var ManifestLayout: js.UndefOr[typings.awsSdk.mediapackageMod.ManifestLayout] = js.native
  
  /**
    * Time window (in seconds) contained in each manifest.
    */
  var ManifestWindowSeconds: js.UndefOr[integer] = js.native
  
  /**
    * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
    */
  var MinBufferTimeSeconds: js.UndefOr[integer] = js.native
  
  /**
    * Minimum duration (in seconds) between potential changes to the Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation Description (MPD).
    */
  var MinUpdatePeriodSeconds: js.UndefOr[integer] = js.native
  
  /**
    * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
  Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
  be partitioned into more than one period. If the list contains "ADS", new periods will be created where
  the Channel source contains SCTE-35 ad markers.
    */
  var PeriodTriggers: js.UndefOr[listOfPeriodTriggersElement] = js.native
  
  /**
    * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
    */
  var Profile: js.UndefOr[typings.awsSdk.mediapackageMod.Profile] = js.native
  
  /**
    * Duration (in seconds) of each segment. Actual segments will be
  rounded to the nearest multiple of the source segment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
  
  /**
    * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
    */
  var SegmentTemplateFormat: js.UndefOr[typings.awsSdk.mediapackageMod.SegmentTemplateFormat] = js.native
  
  var StreamSelection: js.UndefOr[typings.awsSdk.mediapackageMod.StreamSelection] = js.native
  
  /**
    * Duration (in seconds) to delay live content before presentation.
    */
  var SuggestedPresentationDelaySeconds: js.UndefOr[integer] = js.native
  
  /**
    * Determines the type of UTCTiming included in the Media Presentation Description (MPD)
    */
  var UtcTiming: js.UndefOr[typings.awsSdk.mediapackageMod.UtcTiming] = js.native
  
  /**
    * Specifies the value attribute of the UTCTiming field when utcTiming is set to HTTP-ISO or HTTP-HEAD
    */
  var UtcTimingUri: js.UndefOr[string] = js.native
}
object DashPackage {
  
  @scala.inline
  def apply(): DashPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashPackage]
  }
  
  @scala.inline
  implicit class DashPackageMutableBuilder[Self <: DashPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdTriggers(value: AdTriggers): Self = StObject.set(x, "AdTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdTriggersUndefined: Self = StObject.set(x, "AdTriggers", js.undefined)
    
    @scala.inline
    def setAdTriggersVarargs(value: AdTriggersElement*): Self = StObject.set(x, "AdTriggers", js.Array(value :_*))
    
    @scala.inline
    def setAdsOnDeliveryRestrictions(value: AdsOnDeliveryRestrictions): Self = StObject.set(x, "AdsOnDeliveryRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdsOnDeliveryRestrictionsUndefined: Self = StObject.set(x, "AdsOnDeliveryRestrictions", js.undefined)
    
    @scala.inline
    def setEncryption(value: DashEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setManifestLayout(value: ManifestLayout): Self = StObject.set(x, "ManifestLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestLayoutUndefined: Self = StObject.set(x, "ManifestLayout", js.undefined)
    
    @scala.inline
    def setManifestWindowSeconds(value: integer): Self = StObject.set(x, "ManifestWindowSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestWindowSecondsUndefined: Self = StObject.set(x, "ManifestWindowSeconds", js.undefined)
    
    @scala.inline
    def setMinBufferTimeSeconds(value: integer): Self = StObject.set(x, "MinBufferTimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBufferTimeSecondsUndefined: Self = StObject.set(x, "MinBufferTimeSeconds", js.undefined)
    
    @scala.inline
    def setMinUpdatePeriodSeconds(value: integer): Self = StObject.set(x, "MinUpdatePeriodSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUpdatePeriodSecondsUndefined: Self = StObject.set(x, "MinUpdatePeriodSeconds", js.undefined)
    
    @scala.inline
    def setPeriodTriggers(value: listOfPeriodTriggersElement): Self = StObject.set(x, "PeriodTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodTriggersUndefined: Self = StObject.set(x, "PeriodTriggers", js.undefined)
    
    @scala.inline
    def setPeriodTriggersVarargs(value: PeriodTriggersElement*): Self = StObject.set(x, "PeriodTriggers", js.Array(value :_*))
    
    @scala.inline
    def setProfile(value: Profile): Self = StObject.set(x, "Profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "Profile", js.undefined)
    
    @scala.inline
    def setSegmentDurationSeconds(value: integer): Self = StObject.set(x, "SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentDurationSecondsUndefined: Self = StObject.set(x, "SegmentDurationSeconds", js.undefined)
    
    @scala.inline
    def setSegmentTemplateFormat(value: SegmentTemplateFormat): Self = StObject.set(x, "SegmentTemplateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentTemplateFormatUndefined: Self = StObject.set(x, "SegmentTemplateFormat", js.undefined)
    
    @scala.inline
    def setStreamSelection(value: StreamSelection): Self = StObject.set(x, "StreamSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamSelectionUndefined: Self = StObject.set(x, "StreamSelection", js.undefined)
    
    @scala.inline
    def setSuggestedPresentationDelaySeconds(value: integer): Self = StObject.set(x, "SuggestedPresentationDelaySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedPresentationDelaySecondsUndefined: Self = StObject.set(x, "SuggestedPresentationDelaySeconds", js.undefined)
    
    @scala.inline
    def setUtcTiming(value: UtcTiming): Self = StObject.set(x, "UtcTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtcTimingUndefined: Self = StObject.set(x, "UtcTiming", js.undefined)
    
    @scala.inline
    def setUtcTimingUri(value: string): Self = StObject.set(x, "UtcTimingUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtcTimingUriUndefined: Self = StObject.set(x, "UtcTimingUri", js.undefined)
  }
}
