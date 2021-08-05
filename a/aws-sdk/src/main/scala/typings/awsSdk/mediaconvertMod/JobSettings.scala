package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobSettings extends StObject {
  
  /**
    * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
    */
  var AdAvailOffset: js.UndefOr[integerMinNegative1000Max1000] = js.undefined
  
  /**
    * Settings for ad avail blanking.  Video can be blanked or overlaid with an image, and audio muted during SCTE-35 triggered ad avails.
    */
  var AvailBlanking: js.UndefOr[typings.awsSdk.mediaconvertMod.AvailBlanking] = js.undefined
  
  /**
    * Settings for Event Signaling And Messaging (ESAM).
    */
  var Esam: js.UndefOr[EsamSettings] = js.undefined
  
  /**
    * Use Inputs (inputs) to define source file used in the transcode job. There can be multiple inputs add in a job. These inputs will be concantenated together to create the output.
    */
  var Inputs: js.UndefOr[listOfInput] = js.undefined
  
  /**
    * Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all outputs in all output groups.
    */
  var MotionImageInserter: js.UndefOr[typings.awsSdk.mediaconvertMod.MotionImageInserter] = js.undefined
  
  /**
    * Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging for all outputs in the job. To enable Nielsen configuration programmatically, include an instance of nielsenConfiguration in your JSON job specification. Even if you don't include any children of nielsenConfiguration, you still enable the setting.
    */
  var NielsenConfiguration: js.UndefOr[typings.awsSdk.mediaconvertMod.NielsenConfiguration] = js.undefined
  
  /**
    * Ignore these settings unless you are using Nielsen non-linear watermarking. Specify the values that  MediaConvert uses to generate and place Nielsen watermarks in your output audio. In addition to  specifying these values, you also need to set up your cloud TIC server. These settings apply to  every output in your job. The MediaConvert implementation is currently with the following Nielsen versions: Nielsen Watermark SDK Version 5.2.1 Nielsen NLM Watermark Engine Version 1.2.7 Nielsen Watermark Authenticator [SID_TIC] Version [5.0.0]
    */
  var NielsenNonLinearWatermark: js.UndefOr[NielsenNonLinearWatermarkSettings] = js.undefined
  
  /**
    * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
    */
  var OutputGroups: js.UndefOr[listOfOutputGroup] = js.undefined
  
  /**
    * Contains settings used to acquire and adjust timecode information from inputs.
    */
  var TimecodeConfig: js.UndefOr[typings.awsSdk.mediaconvertMod.TimecodeConfig] = js.undefined
  
  /**
    * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in any HLS outputs. To include timed metadata, you must enable it here, enable it in each output container, and specify tags and timecodes in ID3 insertion (Id3Insertion) objects.
    */
  var TimedMetadataInsertion: js.UndefOr[typings.awsSdk.mediaconvertMod.TimedMetadataInsertion] = js.undefined
}
object JobSettings {
  
  inline def apply(): JobSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSettings]
  }
  
  extension [Self <: JobSettings](x: Self) {
    
    inline def setAdAvailOffset(value: integerMinNegative1000Max1000): Self = StObject.set(x, "AdAvailOffset", value.asInstanceOf[js.Any])
    
    inline def setAdAvailOffsetUndefined: Self = StObject.set(x, "AdAvailOffset", js.undefined)
    
    inline def setAvailBlanking(value: AvailBlanking): Self = StObject.set(x, "AvailBlanking", value.asInstanceOf[js.Any])
    
    inline def setAvailBlankingUndefined: Self = StObject.set(x, "AvailBlanking", js.undefined)
    
    inline def setEsam(value: EsamSettings): Self = StObject.set(x, "Esam", value.asInstanceOf[js.Any])
    
    inline def setEsamUndefined: Self = StObject.set(x, "Esam", js.undefined)
    
    inline def setInputs(value: listOfInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "Inputs", js.undefined)
    
    inline def setInputsVarargs(value: Input*): Self = StObject.set(x, "Inputs", js.Array(value :_*))
    
    inline def setMotionImageInserter(value: MotionImageInserter): Self = StObject.set(x, "MotionImageInserter", value.asInstanceOf[js.Any])
    
    inline def setMotionImageInserterUndefined: Self = StObject.set(x, "MotionImageInserter", js.undefined)
    
    inline def setNielsenConfiguration(value: NielsenConfiguration): Self = StObject.set(x, "NielsenConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNielsenConfigurationUndefined: Self = StObject.set(x, "NielsenConfiguration", js.undefined)
    
    inline def setNielsenNonLinearWatermark(value: NielsenNonLinearWatermarkSettings): Self = StObject.set(x, "NielsenNonLinearWatermark", value.asInstanceOf[js.Any])
    
    inline def setNielsenNonLinearWatermarkUndefined: Self = StObject.set(x, "NielsenNonLinearWatermark", js.undefined)
    
    inline def setOutputGroups(value: listOfOutputGroup): Self = StObject.set(x, "OutputGroups", value.asInstanceOf[js.Any])
    
    inline def setOutputGroupsUndefined: Self = StObject.set(x, "OutputGroups", js.undefined)
    
    inline def setOutputGroupsVarargs(value: OutputGroup*): Self = StObject.set(x, "OutputGroups", js.Array(value :_*))
    
    inline def setTimecodeConfig(value: TimecodeConfig): Self = StObject.set(x, "TimecodeConfig", value.asInstanceOf[js.Any])
    
    inline def setTimecodeConfigUndefined: Self = StObject.set(x, "TimecodeConfig", js.undefined)
    
    inline def setTimedMetadataInsertion(value: TimedMetadataInsertion): Self = StObject.set(x, "TimedMetadataInsertion", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataInsertionUndefined: Self = StObject.set(x, "TimedMetadataInsertion", js.undefined)
  }
}
