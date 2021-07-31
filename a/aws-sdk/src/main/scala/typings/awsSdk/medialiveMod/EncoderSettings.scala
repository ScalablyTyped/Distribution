package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncoderSettings extends StObject {
  
  var AudioDescriptions: listOfAudioDescription
  
  /**
    * Settings for ad avail blanking.
    */
  var AvailBlanking: js.UndefOr[typings.awsSdk.medialiveMod.AvailBlanking] = js.undefined
  
  /**
    * Event-wide configuration settings for ad avail insertion.
    */
  var AvailConfiguration: js.UndefOr[typings.awsSdk.medialiveMod.AvailConfiguration] = js.undefined
  
  /**
    * Settings for blackout slate.
    */
  var BlackoutSlate: js.UndefOr[typings.awsSdk.medialiveMod.BlackoutSlate] = js.undefined
  
  /**
    * Settings for caption decriptions
    */
  var CaptionDescriptions: js.UndefOr[listOfCaptionDescription] = js.undefined
  
  /**
    * Feature Activations
    */
  var FeatureActivations: js.UndefOr[typings.awsSdk.medialiveMod.FeatureActivations] = js.undefined
  
  /**
    * Configuration settings that apply to the event as a whole.
    */
  var GlobalConfiguration: js.UndefOr[typings.awsSdk.medialiveMod.GlobalConfiguration] = js.undefined
  
  /**
    * Nielsen configuration settings.
    */
  var NielsenConfiguration: js.UndefOr[typings.awsSdk.medialiveMod.NielsenConfiguration] = js.undefined
  
  var OutputGroups: listOfOutputGroup
  
  /**
    * Contains settings used to acquire and adjust timecode information from inputs.
    */
  var TimecodeConfig: typings.awsSdk.medialiveMod.TimecodeConfig
  
  var VideoDescriptions: listOfVideoDescription
}
object EncoderSettings {
  
  @scala.inline
  def apply(
    AudioDescriptions: listOfAudioDescription,
    OutputGroups: listOfOutputGroup,
    TimecodeConfig: TimecodeConfig,
    VideoDescriptions: listOfVideoDescription
  ): EncoderSettings = {
    val __obj = js.Dynamic.literal(AudioDescriptions = AudioDescriptions.asInstanceOf[js.Any], OutputGroups = OutputGroups.asInstanceOf[js.Any], TimecodeConfig = TimecodeConfig.asInstanceOf[js.Any], VideoDescriptions = VideoDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncoderSettings]
  }
  
  @scala.inline
  implicit class EncoderSettingsMutableBuilder[Self <: EncoderSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioDescriptions(value: listOfAudioDescription): Self = StObject.set(x, "AudioDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioDescriptionsVarargs(value: AudioDescription*): Self = StObject.set(x, "AudioDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setAvailBlanking(value: AvailBlanking): Self = StObject.set(x, "AvailBlanking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailBlankingUndefined: Self = StObject.set(x, "AvailBlanking", js.undefined)
    
    @scala.inline
    def setAvailConfiguration(value: AvailConfiguration): Self = StObject.set(x, "AvailConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailConfigurationUndefined: Self = StObject.set(x, "AvailConfiguration", js.undefined)
    
    @scala.inline
    def setBlackoutSlate(value: BlackoutSlate): Self = StObject.set(x, "BlackoutSlate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackoutSlateUndefined: Self = StObject.set(x, "BlackoutSlate", js.undefined)
    
    @scala.inline
    def setCaptionDescriptions(value: listOfCaptionDescription): Self = StObject.set(x, "CaptionDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionDescriptionsUndefined: Self = StObject.set(x, "CaptionDescriptions", js.undefined)
    
    @scala.inline
    def setCaptionDescriptionsVarargs(value: CaptionDescription*): Self = StObject.set(x, "CaptionDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setFeatureActivations(value: FeatureActivations): Self = StObject.set(x, "FeatureActivations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureActivationsUndefined: Self = StObject.set(x, "FeatureActivations", js.undefined)
    
    @scala.inline
    def setGlobalConfiguration(value: GlobalConfiguration): Self = StObject.set(x, "GlobalConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalConfigurationUndefined: Self = StObject.set(x, "GlobalConfiguration", js.undefined)
    
    @scala.inline
    def setNielsenConfiguration(value: NielsenConfiguration): Self = StObject.set(x, "NielsenConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNielsenConfigurationUndefined: Self = StObject.set(x, "NielsenConfiguration", js.undefined)
    
    @scala.inline
    def setOutputGroups(value: listOfOutputGroup): Self = StObject.set(x, "OutputGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputGroupsVarargs(value: OutputGroup*): Self = StObject.set(x, "OutputGroups", js.Array(value :_*))
    
    @scala.inline
    def setTimecodeConfig(value: TimecodeConfig): Self = StObject.set(x, "TimecodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDescriptions(value: listOfVideoDescription): Self = StObject.set(x, "VideoDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDescriptionsVarargs(value: VideoDescription*): Self = StObject.set(x, "VideoDescriptions", js.Array(value :_*))
  }
}
