package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashPackage extends js.Object {
  
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
  implicit class DashPackageOps[Self <: DashPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdTriggersVarargs(value: AdTriggersElement*): Self = this.set("AdTriggers", js.Array(value :_*))
    
    @scala.inline
    def setAdTriggers(value: AdTriggers): Self = this.set("AdTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdTriggers: Self = this.set("AdTriggers", js.undefined)
    
    @scala.inline
    def setAdsOnDeliveryRestrictions(value: AdsOnDeliveryRestrictions): Self = this.set("AdsOnDeliveryRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdsOnDeliveryRestrictions: Self = this.set("AdsOnDeliveryRestrictions", js.undefined)
    
    @scala.inline
    def setEncryption(value: DashEncryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    
    @scala.inline
    def setManifestLayout(value: ManifestLayout): Self = this.set("ManifestLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifestLayout: Self = this.set("ManifestLayout", js.undefined)
    
    @scala.inline
    def setManifestWindowSeconds(value: integer): Self = this.set("ManifestWindowSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifestWindowSeconds: Self = this.set("ManifestWindowSeconds", js.undefined)
    
    @scala.inline
    def setMinBufferTimeSeconds(value: integer): Self = this.set("MinBufferTimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinBufferTimeSeconds: Self = this.set("MinBufferTimeSeconds", js.undefined)
    
    @scala.inline
    def setMinUpdatePeriodSeconds(value: integer): Self = this.set("MinUpdatePeriodSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinUpdatePeriodSeconds: Self = this.set("MinUpdatePeriodSeconds", js.undefined)
    
    @scala.inline
    def setPeriodTriggersVarargs(value: PeriodTriggersElement*): Self = this.set("PeriodTriggers", js.Array(value :_*))
    
    @scala.inline
    def setPeriodTriggers(value: listOfPeriodTriggersElement): Self = this.set("PeriodTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodTriggers: Self = this.set("PeriodTriggers", js.undefined)
    
    @scala.inline
    def setProfile(value: Profile): Self = this.set("Profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("Profile", js.undefined)
    
    @scala.inline
    def setSegmentDurationSeconds(value: integer): Self = this.set("SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentDurationSeconds: Self = this.set("SegmentDurationSeconds", js.undefined)
    
    @scala.inline
    def setSegmentTemplateFormat(value: SegmentTemplateFormat): Self = this.set("SegmentTemplateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentTemplateFormat: Self = this.set("SegmentTemplateFormat", js.undefined)
    
    @scala.inline
    def setStreamSelection(value: StreamSelection): Self = this.set("StreamSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamSelection: Self = this.set("StreamSelection", js.undefined)
    
    @scala.inline
    def setSuggestedPresentationDelaySeconds(value: integer): Self = this.set("SuggestedPresentationDelaySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedPresentationDelaySeconds: Self = this.set("SuggestedPresentationDelaySeconds", js.undefined)
    
    @scala.inline
    def setUtcTiming(value: UtcTiming): Self = this.set("UtcTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtcTiming: Self = this.set("UtcTiming", js.undefined)
    
    @scala.inline
    def setUtcTimingUri(value: string): Self = this.set("UtcTimingUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtcTimingUri: Self = this.set("UtcTimingUri", js.undefined)
  }
}
