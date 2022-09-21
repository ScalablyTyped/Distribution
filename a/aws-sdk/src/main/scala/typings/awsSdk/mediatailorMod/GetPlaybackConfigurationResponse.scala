package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPlaybackConfigurationResponse extends StObject {
  
  /**
    * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is 25,000 characters.
    */
  var AdDecisionServerUrl: js.UndefOr[string] = js.undefined
  
  /**
    * The configuration for avail suppression, also known as ad suppression. For more information about ad suppression, see Ad Suppression.
    */
  var AvailSuppression: js.UndefOr[typings.awsSdk.mediatailorMod.AvailSuppression] = js.undefined
  
  /**
    * The configuration for bumpers. Bumpers are short audio or video clips that play at the start or before the end of an ad break. To learn more about bumpers, see Bumpers.
    */
  var Bumper: js.UndefOr[typings.awsSdk.mediatailorMod.Bumper] = js.undefined
  
  /**
    * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment management.
    */
  var CdnConfiguration: js.UndefOr[typings.awsSdk.mediatailorMod.CdnConfiguration] = js.undefined
  
  /**
    * The player parameters and aliases used as dynamic variables during session initialization. For more information, see Domain Variables.
    */
  var ConfigurationAliases: js.UndefOr[ConfigurationAliasesResponse] = js.undefined
  
  /**
    * The configuration for DASH content.
    */
  var DashConfiguration: js.UndefOr[typings.awsSdk.mediatailorMod.DashConfiguration] = js.undefined
  
  /**
    * The configuration for HLS content.
    */
  var HlsConfiguration: js.UndefOr[typings.awsSdk.mediatailorMod.HlsConfiguration] = js.undefined
  
  /**
    * The configuration for pre-roll ad insertion.
    */
  var LivePreRollConfiguration: js.UndefOr[typings.awsSdk.mediatailorMod.LivePreRollConfiguration] = js.undefined
  
  /**
    * The Amazon CloudWatch log settings for a playback configuration.
    */
  var LogConfiguration: js.UndefOr[typings.awsSdk.mediatailorMod.LogConfiguration] = js.undefined
  
  /**
    * The configuration for manifest processing rules. Manifest processing rules enable customization of the personalized manifests created by MediaTailor.
    */
  var ManifestProcessingRules: js.UndefOr[typings.awsSdk.mediatailorMod.ManifestProcessingRules] = js.undefined
  
  /**
    * The identifier for the playback configuration.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * Defines the maximum duration of underfilled ad time (in seconds) allowed in an ad break. If the duration of underfilled ad time exceeds the personalization threshold, then the personalization of the ad break is abandoned and the underlying content is shown. This feature applies to ad replacement in live and VOD streams, rather than ad insertion, because it relies on an underlying content stream. For more information about ad break behavior, including ad replacement and insertion, see Ad Behavior in AWS Elemental MediaTailor.
    */
  var PersonalizationThresholdSeconds: js.UndefOr[integerMin1] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the playback configuration.
    */
  var PlaybackConfigurationArn: js.UndefOr[string] = js.undefined
  
  /**
    * The URL that the player accesses to get a manifest from AWS Elemental MediaTailor. This session will use server-side reporting.
    */
  var PlaybackEndpointPrefix: js.UndefOr[string] = js.undefined
  
  /**
    * The URL that the player uses to initialize a session that uses client-side reporting.
    */
  var SessionInitializationEndpointPrefix: js.UndefOr[string] = js.undefined
  
  /**
    * The URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID playback configurations. For VPAID, the slate is required because MediaTailor provides it in the slots designated for dynamic ad content. The slate must be a high-quality asset that contains both audio and video.
    */
  var SlateAdUrl: js.UndefOr[string] = js.undefined
  
  /**
    * The tags assigned to the playback configuration.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * The name that is used to associate this playback configuration with a custom transcode profile. This overrides the dynamic transcoding defaults of MediaTailor. Use this only if you have already set up custom profiles with the help of AWS Support.
    */
  var TranscodeProfileName: js.UndefOr[string] = js.undefined
  
  /**
    * The URL prefix for the parent manifest for the stream, minus the asset ID. The maximum length is 512 characters.
    */
  var VideoContentSourceUrl: js.UndefOr[string] = js.undefined
}
object GetPlaybackConfigurationResponse {
  
  inline def apply(): GetPlaybackConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPlaybackConfigurationResponse]
  }
  
  extension [Self <: GetPlaybackConfigurationResponse](x: Self) {
    
    inline def setAdDecisionServerUrl(value: string): Self = StObject.set(x, "AdDecisionServerUrl", value.asInstanceOf[js.Any])
    
    inline def setAdDecisionServerUrlUndefined: Self = StObject.set(x, "AdDecisionServerUrl", js.undefined)
    
    inline def setAvailSuppression(value: AvailSuppression): Self = StObject.set(x, "AvailSuppression", value.asInstanceOf[js.Any])
    
    inline def setAvailSuppressionUndefined: Self = StObject.set(x, "AvailSuppression", js.undefined)
    
    inline def setBumper(value: Bumper): Self = StObject.set(x, "Bumper", value.asInstanceOf[js.Any])
    
    inline def setBumperUndefined: Self = StObject.set(x, "Bumper", js.undefined)
    
    inline def setCdnConfiguration(value: CdnConfiguration): Self = StObject.set(x, "CdnConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCdnConfigurationUndefined: Self = StObject.set(x, "CdnConfiguration", js.undefined)
    
    inline def setConfigurationAliases(value: ConfigurationAliasesResponse): Self = StObject.set(x, "ConfigurationAliases", value.asInstanceOf[js.Any])
    
    inline def setConfigurationAliasesUndefined: Self = StObject.set(x, "ConfigurationAliases", js.undefined)
    
    inline def setDashConfiguration(value: DashConfiguration): Self = StObject.set(x, "DashConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDashConfigurationUndefined: Self = StObject.set(x, "DashConfiguration", js.undefined)
    
    inline def setHlsConfiguration(value: HlsConfiguration): Self = StObject.set(x, "HlsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setHlsConfigurationUndefined: Self = StObject.set(x, "HlsConfiguration", js.undefined)
    
    inline def setLivePreRollConfiguration(value: LivePreRollConfiguration): Self = StObject.set(x, "LivePreRollConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLivePreRollConfigurationUndefined: Self = StObject.set(x, "LivePreRollConfiguration", js.undefined)
    
    inline def setLogConfiguration(value: LogConfiguration): Self = StObject.set(x, "LogConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "LogConfiguration", js.undefined)
    
    inline def setManifestProcessingRules(value: ManifestProcessingRules): Self = StObject.set(x, "ManifestProcessingRules", value.asInstanceOf[js.Any])
    
    inline def setManifestProcessingRulesUndefined: Self = StObject.set(x, "ManifestProcessingRules", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPersonalizationThresholdSeconds(value: integerMin1): Self = StObject.set(x, "PersonalizationThresholdSeconds", value.asInstanceOf[js.Any])
    
    inline def setPersonalizationThresholdSecondsUndefined: Self = StObject.set(x, "PersonalizationThresholdSeconds", js.undefined)
    
    inline def setPlaybackConfigurationArn(value: string): Self = StObject.set(x, "PlaybackConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setPlaybackConfigurationArnUndefined: Self = StObject.set(x, "PlaybackConfigurationArn", js.undefined)
    
    inline def setPlaybackEndpointPrefix(value: string): Self = StObject.set(x, "PlaybackEndpointPrefix", value.asInstanceOf[js.Any])
    
    inline def setPlaybackEndpointPrefixUndefined: Self = StObject.set(x, "PlaybackEndpointPrefix", js.undefined)
    
    inline def setSessionInitializationEndpointPrefix(value: string): Self = StObject.set(x, "SessionInitializationEndpointPrefix", value.asInstanceOf[js.Any])
    
    inline def setSessionInitializationEndpointPrefixUndefined: Self = StObject.set(x, "SessionInitializationEndpointPrefix", js.undefined)
    
    inline def setSlateAdUrl(value: string): Self = StObject.set(x, "SlateAdUrl", value.asInstanceOf[js.Any])
    
    inline def setSlateAdUrlUndefined: Self = StObject.set(x, "SlateAdUrl", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTranscodeProfileName(value: string): Self = StObject.set(x, "TranscodeProfileName", value.asInstanceOf[js.Any])
    
    inline def setTranscodeProfileNameUndefined: Self = StObject.set(x, "TranscodeProfileName", js.undefined)
    
    inline def setVideoContentSourceUrl(value: string): Self = StObject.set(x, "VideoContentSourceUrl", value.asInstanceOf[js.Any])
    
    inline def setVideoContentSourceUrlUndefined: Self = StObject.set(x, "VideoContentSourceUrl", js.undefined)
  }
}
