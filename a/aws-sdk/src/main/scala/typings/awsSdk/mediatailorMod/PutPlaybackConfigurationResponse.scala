package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutPlaybackConfigurationResponse extends StObject {
  
  /**
    * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is 25,000 characters.
    */
  var AdDecisionServerUrl: js.UndefOr[string] = js.native
  
  /**
    * The configuration for Avail Suppression. Ad suppression can be used to turn off ad personalization in a long manifest, or if a viewer joins mid-break.
    */
  var AvailSuppression: js.UndefOr[typings.awsSdk.mediatailorMod.AvailSuppression] = js.native
  
  /**
    * The configuration for bumpers. Bumpers are short audio or video clips that play at the start or before the end of an ad break. 
    */
  var Bumper: js.UndefOr[typings.awsSdk.mediatailorMod.Bumper] = js.native
  
  /**
    * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment management. 
    */
  var CdnConfiguration: js.UndefOr[typings.awsSdk.mediatailorMod.CdnConfiguration] = js.native
  
  /**
    * The configuration for DASH content. 
    */
  var DashConfiguration: js.UndefOr[typings.awsSdk.mediatailorMod.DashConfiguration] = js.native
  
  /**
    * The configuration for HLS content. 
    */
  var HlsConfiguration: js.UndefOr[typings.awsSdk.mediatailorMod.HlsConfiguration] = js.native
  
  /**
    * The configuration for pre-roll ad insertion.
    */
  var LivePreRollConfiguration: js.UndefOr[typings.awsSdk.mediatailorMod.LivePreRollConfiguration] = js.native
  
  /**
    * The configuration for manifest processing rules. Manifest processing rules enable customization of the personalized manifests created by MediaTailor.
    */
  var ManifestProcessingRules: js.UndefOr[typings.awsSdk.mediatailorMod.ManifestProcessingRules] = js.native
  
  /**
    * The identifier for the playback configuration.
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * The maximum duration of underfilled ad time (in seconds) allowed in an ad break.
    */
  var PersonalizationThresholdSeconds: js.UndefOr[integerMin1] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the playback configuration. 
    */
  var PlaybackConfigurationArn: js.UndefOr[string] = js.native
  
  /**
    * The URL that the player accesses to get a manifest from AWS Elemental MediaTailor. This session will use server-side reporting. 
    */
  var PlaybackEndpointPrefix: js.UndefOr[string] = js.native
  
  /**
    * The URL that the player uses to initialize a session that uses client-side reporting. 
    */
  var SessionInitializationEndpointPrefix: js.UndefOr[string] = js.native
  
  /**
    * The URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID playback configurations. For VPAID, the slate is required because MediaTailor provides it in the slots designated for dynamic ad content. The slate must be a high-quality asset that contains both audio and video. 
    */
  var SlateAdUrl: js.UndefOr[string] = js.native
  
  /**
    * The tags assigned to the playback configuration. 
    */
  var Tags: js.UndefOr[mapOfString] = js.native
  
  /**
    * The name that is used to associate this playback configuration with a custom transcode profile. This overrides the dynamic transcoding defaults of MediaTailor. Use this only if you have already set up custom profiles with the help of AWS Support.
    */
  var TranscodeProfileName: js.UndefOr[string] = js.native
  
  /**
    * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
    */
  var VideoContentSourceUrl: js.UndefOr[string] = js.native
}
object PutPlaybackConfigurationResponse {
  
  @scala.inline
  def apply(): PutPlaybackConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPlaybackConfigurationResponse]
  }
  
  @scala.inline
  implicit class PutPlaybackConfigurationResponseMutableBuilder[Self <: PutPlaybackConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdDecisionServerUrl(value: string): Self = StObject.set(x, "AdDecisionServerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdDecisionServerUrlUndefined: Self = StObject.set(x, "AdDecisionServerUrl", js.undefined)
    
    @scala.inline
    def setAvailSuppression(value: AvailSuppression): Self = StObject.set(x, "AvailSuppression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailSuppressionUndefined: Self = StObject.set(x, "AvailSuppression", js.undefined)
    
    @scala.inline
    def setBumper(value: Bumper): Self = StObject.set(x, "Bumper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBumperUndefined: Self = StObject.set(x, "Bumper", js.undefined)
    
    @scala.inline
    def setCdnConfiguration(value: CdnConfiguration): Self = StObject.set(x, "CdnConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdnConfigurationUndefined: Self = StObject.set(x, "CdnConfiguration", js.undefined)
    
    @scala.inline
    def setDashConfiguration(value: DashConfiguration): Self = StObject.set(x, "DashConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashConfigurationUndefined: Self = StObject.set(x, "DashConfiguration", js.undefined)
    
    @scala.inline
    def setHlsConfiguration(value: HlsConfiguration): Self = StObject.set(x, "HlsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsConfigurationUndefined: Self = StObject.set(x, "HlsConfiguration", js.undefined)
    
    @scala.inline
    def setLivePreRollConfiguration(value: LivePreRollConfiguration): Self = StObject.set(x, "LivePreRollConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivePreRollConfigurationUndefined: Self = StObject.set(x, "LivePreRollConfiguration", js.undefined)
    
    @scala.inline
    def setManifestProcessingRules(value: ManifestProcessingRules): Self = StObject.set(x, "ManifestProcessingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestProcessingRulesUndefined: Self = StObject.set(x, "ManifestProcessingRules", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPersonalizationThresholdSeconds(value: integerMin1): Self = StObject.set(x, "PersonalizationThresholdSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalizationThresholdSecondsUndefined: Self = StObject.set(x, "PersonalizationThresholdSeconds", js.undefined)
    
    @scala.inline
    def setPlaybackConfigurationArn(value: string): Self = StObject.set(x, "PlaybackConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackConfigurationArnUndefined: Self = StObject.set(x, "PlaybackConfigurationArn", js.undefined)
    
    @scala.inline
    def setPlaybackEndpointPrefix(value: string): Self = StObject.set(x, "PlaybackEndpointPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackEndpointPrefixUndefined: Self = StObject.set(x, "PlaybackEndpointPrefix", js.undefined)
    
    @scala.inline
    def setSessionInitializationEndpointPrefix(value: string): Self = StObject.set(x, "SessionInitializationEndpointPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionInitializationEndpointPrefixUndefined: Self = StObject.set(x, "SessionInitializationEndpointPrefix", js.undefined)
    
    @scala.inline
    def setSlateAdUrl(value: string): Self = StObject.set(x, "SlateAdUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlateAdUrlUndefined: Self = StObject.set(x, "SlateAdUrl", js.undefined)
    
    @scala.inline
    def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTranscodeProfileName(value: string): Self = StObject.set(x, "TranscodeProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscodeProfileNameUndefined: Self = StObject.set(x, "TranscodeProfileName", js.undefined)
    
    @scala.inline
    def setVideoContentSourceUrl(value: string): Self = StObject.set(x, "VideoContentSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoContentSourceUrlUndefined: Self = StObject.set(x, "VideoContentSourceUrl", js.undefined)
  }
}
