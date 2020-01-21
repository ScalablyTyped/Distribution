package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaybackConfiguration extends js.Object {
  /**
    * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is 25,000 characters.
    */
  var AdDecisionServerUrl: js.UndefOr[string] = js.native
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
    * The identifier for the playback configuration.
    */
  var Name: js.UndefOr[string] = js.native
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

object PlaybackConfiguration {
  @scala.inline
  def apply(
    AdDecisionServerUrl: string = null,
    CdnConfiguration: CdnConfiguration = null,
    DashConfiguration: DashConfiguration = null,
    HlsConfiguration: HlsConfiguration = null,
    Name: string = null,
    PlaybackConfigurationArn: string = null,
    PlaybackEndpointPrefix: string = null,
    SessionInitializationEndpointPrefix: string = null,
    SlateAdUrl: string = null,
    Tags: mapOfString = null,
    TranscodeProfileName: string = null,
    VideoContentSourceUrl: string = null
  ): PlaybackConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AdDecisionServerUrl != null) __obj.updateDynamic("AdDecisionServerUrl")(AdDecisionServerUrl.asInstanceOf[js.Any])
    if (CdnConfiguration != null) __obj.updateDynamic("CdnConfiguration")(CdnConfiguration.asInstanceOf[js.Any])
    if (DashConfiguration != null) __obj.updateDynamic("DashConfiguration")(DashConfiguration.asInstanceOf[js.Any])
    if (HlsConfiguration != null) __obj.updateDynamic("HlsConfiguration")(HlsConfiguration.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PlaybackConfigurationArn != null) __obj.updateDynamic("PlaybackConfigurationArn")(PlaybackConfigurationArn.asInstanceOf[js.Any])
    if (PlaybackEndpointPrefix != null) __obj.updateDynamic("PlaybackEndpointPrefix")(PlaybackEndpointPrefix.asInstanceOf[js.Any])
    if (SessionInitializationEndpointPrefix != null) __obj.updateDynamic("SessionInitializationEndpointPrefix")(SessionInitializationEndpointPrefix.asInstanceOf[js.Any])
    if (SlateAdUrl != null) __obj.updateDynamic("SlateAdUrl")(SlateAdUrl.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TranscodeProfileName != null) __obj.updateDynamic("TranscodeProfileName")(TranscodeProfileName.asInstanceOf[js.Any])
    if (VideoContentSourceUrl != null) __obj.updateDynamic("VideoContentSourceUrl")(VideoContentSourceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackConfiguration]
  }
}

