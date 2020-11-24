package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncoderSettings extends js.Object {
  
  var AudioDescriptions: listOfAudioDescription = js.native
  
  /**
    * Settings for ad avail blanking.
    */
  var AvailBlanking: js.UndefOr[typings.awsSdk.medialiveMod.AvailBlanking] = js.native
  
  /**
    * Event-wide configuration settings for ad avail insertion.
    */
  var AvailConfiguration: js.UndefOr[typings.awsSdk.medialiveMod.AvailConfiguration] = js.native
  
  /**
    * Settings for blackout slate.
    */
  var BlackoutSlate: js.UndefOr[typings.awsSdk.medialiveMod.BlackoutSlate] = js.native
  
  /**
    * Settings for caption decriptions
    */
  var CaptionDescriptions: js.UndefOr[listOfCaptionDescription] = js.native
  
  /**
    * Feature Activations
    */
  var FeatureActivations: js.UndefOr[typings.awsSdk.medialiveMod.FeatureActivations] = js.native
  
  /**
    * Configuration settings that apply to the event as a whole.
    */
  var GlobalConfiguration: js.UndefOr[typings.awsSdk.medialiveMod.GlobalConfiguration] = js.native
  
  /**
    * Nielsen configuration settings.
    */
  var NielsenConfiguration: js.UndefOr[typings.awsSdk.medialiveMod.NielsenConfiguration] = js.native
  
  var OutputGroups: listOfOutputGroup = js.native
  
  /**
    * Contains settings used to acquire and adjust timecode information from inputs.
    */
  var TimecodeConfig: typings.awsSdk.medialiveMod.TimecodeConfig = js.native
  
  var VideoDescriptions: listOfVideoDescription = js.native
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
  implicit class EncoderSettingsOps[Self <: EncoderSettings] (val x: Self) extends AnyVal {
    
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
    def setAudioDescriptionsVarargs(value: AudioDescription*): Self = this.set("AudioDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setAudioDescriptions(value: listOfAudioDescription): Self = this.set("AudioDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputGroupsVarargs(value: OutputGroup*): Self = this.set("OutputGroups", js.Array(value :_*))
    
    @scala.inline
    def setOutputGroups(value: listOfOutputGroup): Self = this.set("OutputGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimecodeConfig(value: TimecodeConfig): Self = this.set("TimecodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDescriptionsVarargs(value: VideoDescription*): Self = this.set("VideoDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setVideoDescriptions(value: listOfVideoDescription): Self = this.set("VideoDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailBlanking(value: AvailBlanking): Self = this.set("AvailBlanking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailBlanking: Self = this.set("AvailBlanking", js.undefined)
    
    @scala.inline
    def setAvailConfiguration(value: AvailConfiguration): Self = this.set("AvailConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailConfiguration: Self = this.set("AvailConfiguration", js.undefined)
    
    @scala.inline
    def setBlackoutSlate(value: BlackoutSlate): Self = this.set("BlackoutSlate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlackoutSlate: Self = this.set("BlackoutSlate", js.undefined)
    
    @scala.inline
    def setCaptionDescriptionsVarargs(value: CaptionDescription*): Self = this.set("CaptionDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setCaptionDescriptions(value: listOfCaptionDescription): Self = this.set("CaptionDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionDescriptions: Self = this.set("CaptionDescriptions", js.undefined)
    
    @scala.inline
    def setFeatureActivations(value: FeatureActivations): Self = this.set("FeatureActivations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureActivations: Self = this.set("FeatureActivations", js.undefined)
    
    @scala.inline
    def setGlobalConfiguration(value: GlobalConfiguration): Self = this.set("GlobalConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalConfiguration: Self = this.set("GlobalConfiguration", js.undefined)
    
    @scala.inline
    def setNielsenConfiguration(value: NielsenConfiguration): Self = this.set("NielsenConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNielsenConfiguration: Self = this.set("NielsenConfiguration", js.undefined)
  }
}
