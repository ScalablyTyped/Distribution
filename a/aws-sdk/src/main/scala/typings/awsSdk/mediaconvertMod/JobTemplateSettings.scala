package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobTemplateSettings extends js.Object {
  
  /**
    * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
    */
  var AdAvailOffset: js.UndefOr[integerMinNegative1000Max1000] = js.native
  
  /**
    * Settings for ad avail blanking.  Video can be blanked or overlaid with an image, and audio muted during SCTE-35 triggered ad avails.
    */
  var AvailBlanking: js.UndefOr[typings.awsSdk.mediaconvertMod.AvailBlanking] = js.native
  
  /**
    * Settings for Event Signaling And Messaging (ESAM).
    */
  var Esam: js.UndefOr[EsamSettings] = js.native
  
  /**
    * Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a job template.  Using the API, you can include multiple inputs when referencing a job template.
    */
  var Inputs: js.UndefOr[listOfInputTemplate] = js.native
  
  /**
    * Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all outputs in all output groups.
    */
  var MotionImageInserter: js.UndefOr[typings.awsSdk.mediaconvertMod.MotionImageInserter] = js.native
  
  /**
    * Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging for all outputs in the job. To enable Nielsen configuration programmatically, include an instance of nielsenConfiguration in your JSON job specification. Even if you don't include any children of nielsenConfiguration, you still enable the setting.
    */
  var NielsenConfiguration: js.UndefOr[typings.awsSdk.mediaconvertMod.NielsenConfiguration] = js.native
  
  /**
    * Ignore these settings unless you are using Nielsen non-linear watermarking. Specify the values that  MediaConvert uses to generate and place Nielsen watermarks in your output audio. In addition to  specifying these values, you also need to set up your cloud TIC server. These settings apply to  every output in your job. The MediaConvert implementation is currently with the following Nielsen versions: Nielsen Watermark SDK Version 5.2.1 Nielsen NLM Watermark Engine Version 1.2.7 Nielsen Watermark Authenticator [SID_TIC] Version [5.0.0]
    */
  var NielsenNonLinearWatermark: js.UndefOr[NielsenNonLinearWatermarkSettings] = js.native
  
  /**
    * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
    */
  var OutputGroups: js.UndefOr[listOfOutputGroup] = js.native
  
  /**
    * Contains settings used to acquire and adjust timecode information from inputs.
    */
  var TimecodeConfig: js.UndefOr[typings.awsSdk.mediaconvertMod.TimecodeConfig] = js.native
  
  /**
    * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in any HLS outputs. To include timed metadata, you must enable it here, enable it in each output container, and specify tags and timecodes in ID3 insertion (Id3Insertion) objects.
    */
  var TimedMetadataInsertion: js.UndefOr[typings.awsSdk.mediaconvertMod.TimedMetadataInsertion] = js.native
}
object JobTemplateSettings {
  
  @scala.inline
  def apply(): JobTemplateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTemplateSettings]
  }
  
  @scala.inline
  implicit class JobTemplateSettingsOps[Self <: JobTemplateSettings] (val x: Self) extends AnyVal {
    
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
    def setAdAvailOffset(value: integerMinNegative1000Max1000): Self = this.set("AdAvailOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdAvailOffset: Self = this.set("AdAvailOffset", js.undefined)
    
    @scala.inline
    def setAvailBlanking(value: AvailBlanking): Self = this.set("AvailBlanking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailBlanking: Self = this.set("AvailBlanking", js.undefined)
    
    @scala.inline
    def setEsam(value: EsamSettings): Self = this.set("Esam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEsam: Self = this.set("Esam", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: InputTemplate*): Self = this.set("Inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: listOfInputTemplate): Self = this.set("Inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("Inputs", js.undefined)
    
    @scala.inline
    def setMotionImageInserter(value: MotionImageInserter): Self = this.set("MotionImageInserter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionImageInserter: Self = this.set("MotionImageInserter", js.undefined)
    
    @scala.inline
    def setNielsenConfiguration(value: NielsenConfiguration): Self = this.set("NielsenConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNielsenConfiguration: Self = this.set("NielsenConfiguration", js.undefined)
    
    @scala.inline
    def setNielsenNonLinearWatermark(value: NielsenNonLinearWatermarkSettings): Self = this.set("NielsenNonLinearWatermark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNielsenNonLinearWatermark: Self = this.set("NielsenNonLinearWatermark", js.undefined)
    
    @scala.inline
    def setOutputGroupsVarargs(value: OutputGroup*): Self = this.set("OutputGroups", js.Array(value :_*))
    
    @scala.inline
    def setOutputGroups(value: listOfOutputGroup): Self = this.set("OutputGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputGroups: Self = this.set("OutputGroups", js.undefined)
    
    @scala.inline
    def setTimecodeConfig(value: TimecodeConfig): Self = this.set("TimecodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimecodeConfig: Self = this.set("TimecodeConfig", js.undefined)
    
    @scala.inline
    def setTimedMetadataInsertion(value: TimedMetadataInsertion): Self = this.set("TimedMetadataInsertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimedMetadataInsertion: Self = this.set("TimedMetadataInsertion", js.undefined)
  }
}
