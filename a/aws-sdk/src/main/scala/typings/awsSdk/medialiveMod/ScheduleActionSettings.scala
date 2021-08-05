package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleActionSettings extends StObject {
  
  /**
    * Action to insert HLS ID3 segment tagging
    */
  var HlsId3SegmentTaggingSettings: js.UndefOr[HlsId3SegmentTaggingScheduleActionSettings] = js.undefined
  
  /**
    * Action to insert HLS metadata
    */
  var HlsTimedMetadataSettings: js.UndefOr[HlsTimedMetadataScheduleActionSettings] = js.undefined
  
  /**
    * Action to prepare an input for a future immediate input switch
    */
  var InputPrepareSettings: js.UndefOr[InputPrepareScheduleActionSettings] = js.undefined
  
  /**
    * Action to switch the input
    */
  var InputSwitchSettings: js.UndefOr[InputSwitchScheduleActionSettings] = js.undefined
  
  /**
    * Action to pause or unpause one or both channel pipelines
    */
  var PauseStateSettings: js.UndefOr[PauseStateScheduleActionSettings] = js.undefined
  
  /**
    * Action to insert SCTE-35 return_to_network message
    */
  var Scte35ReturnToNetworkSettings: js.UndefOr[Scte35ReturnToNetworkScheduleActionSettings] = js.undefined
  
  /**
    * Action to insert SCTE-35 splice_insert message
    */
  var Scte35SpliceInsertSettings: js.UndefOr[Scte35SpliceInsertScheduleActionSettings] = js.undefined
  
  /**
    * Action to insert SCTE-35 time_signal message
    */
  var Scte35TimeSignalSettings: js.UndefOr[Scte35TimeSignalScheduleActionSettings] = js.undefined
  
  /**
    * Action to activate a static image overlay
    */
  var StaticImageActivateSettings: js.UndefOr[StaticImageActivateScheduleActionSettings] = js.undefined
  
  /**
    * Action to deactivate a static image overlay
    */
  var StaticImageDeactivateSettings: js.UndefOr[StaticImageDeactivateScheduleActionSettings] = js.undefined
}
object ScheduleActionSettings {
  
  inline def apply(): ScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleActionSettings]
  }
  
  extension [Self <: ScheduleActionSettings](x: Self) {
    
    inline def setHlsId3SegmentTaggingSettings(value: HlsId3SegmentTaggingScheduleActionSettings): Self = StObject.set(x, "HlsId3SegmentTaggingSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsId3SegmentTaggingSettingsUndefined: Self = StObject.set(x, "HlsId3SegmentTaggingSettings", js.undefined)
    
    inline def setHlsTimedMetadataSettings(value: HlsTimedMetadataScheduleActionSettings): Self = StObject.set(x, "HlsTimedMetadataSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsTimedMetadataSettingsUndefined: Self = StObject.set(x, "HlsTimedMetadataSettings", js.undefined)
    
    inline def setInputPrepareSettings(value: InputPrepareScheduleActionSettings): Self = StObject.set(x, "InputPrepareSettings", value.asInstanceOf[js.Any])
    
    inline def setInputPrepareSettingsUndefined: Self = StObject.set(x, "InputPrepareSettings", js.undefined)
    
    inline def setInputSwitchSettings(value: InputSwitchScheduleActionSettings): Self = StObject.set(x, "InputSwitchSettings", value.asInstanceOf[js.Any])
    
    inline def setInputSwitchSettingsUndefined: Self = StObject.set(x, "InputSwitchSettings", js.undefined)
    
    inline def setPauseStateSettings(value: PauseStateScheduleActionSettings): Self = StObject.set(x, "PauseStateSettings", value.asInstanceOf[js.Any])
    
    inline def setPauseStateSettingsUndefined: Self = StObject.set(x, "PauseStateSettings", js.undefined)
    
    inline def setScte35ReturnToNetworkSettings(value: Scte35ReturnToNetworkScheduleActionSettings): Self = StObject.set(x, "Scte35ReturnToNetworkSettings", value.asInstanceOf[js.Any])
    
    inline def setScte35ReturnToNetworkSettingsUndefined: Self = StObject.set(x, "Scte35ReturnToNetworkSettings", js.undefined)
    
    inline def setScte35SpliceInsertSettings(value: Scte35SpliceInsertScheduleActionSettings): Self = StObject.set(x, "Scte35SpliceInsertSettings", value.asInstanceOf[js.Any])
    
    inline def setScte35SpliceInsertSettingsUndefined: Self = StObject.set(x, "Scte35SpliceInsertSettings", js.undefined)
    
    inline def setScte35TimeSignalSettings(value: Scte35TimeSignalScheduleActionSettings): Self = StObject.set(x, "Scte35TimeSignalSettings", value.asInstanceOf[js.Any])
    
    inline def setScte35TimeSignalSettingsUndefined: Self = StObject.set(x, "Scte35TimeSignalSettings", js.undefined)
    
    inline def setStaticImageActivateSettings(value: StaticImageActivateScheduleActionSettings): Self = StObject.set(x, "StaticImageActivateSettings", value.asInstanceOf[js.Any])
    
    inline def setStaticImageActivateSettingsUndefined: Self = StObject.set(x, "StaticImageActivateSettings", js.undefined)
    
    inline def setStaticImageDeactivateSettings(value: StaticImageDeactivateScheduleActionSettings): Self = StObject.set(x, "StaticImageDeactivateSettings", value.asInstanceOf[js.Any])
    
    inline def setStaticImageDeactivateSettingsUndefined: Self = StObject.set(x, "StaticImageDeactivateSettings", js.undefined)
  }
}
