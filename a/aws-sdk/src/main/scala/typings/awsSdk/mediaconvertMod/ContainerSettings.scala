package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerSettings extends StObject {
  
  /**
    * These settings relate to the fragmented MP4 container for the segments in your CMAF outputs.
    */
  var CmfcSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.CmfcSettings] = js.undefined
  
  /**
    * Container for this output. Some containers require a container settings object. If not specified, the default object will be created.
    */
  var Container: js.UndefOr[ContainerType] = js.undefined
  
  /**
    * Settings for F4v container
    */
  var F4vSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.F4vSettings] = js.undefined
  
  /**
    * MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map table (PMT). Each transport stream program contains subsets of data, including audio, video, and metadata. Each of these subsets of data has a numerical label called a packet identifier (PID). Each transport stream program corresponds to one MediaConvert output. The PMT lists the types of data in a program along with their PID. Downstream systems and players use the program map table to look up the PID for each type of data it accesses and then uses the PIDs to locate specific data within the asset.
    */
  var M2tsSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.M2tsSettings] = js.undefined
  
  /**
    * These settings relate to the MPEG-2 transport stream (MPEG2-TS) container for the MPEG2-TS segments in your HLS outputs.
    */
  var M3u8Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.M3u8Settings] = js.undefined
  
  /**
    * These settings relate to your QuickTime MOV output container.
    */
  var MovSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.MovSettings] = js.undefined
  
  /**
    * These settings relate to your MP4 output container. You can create audio only outputs with this container. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/supported-codecs-containers-audio-only.html#output-codecs-and-containers-supported-for-audio-only.
    */
  var Mp4Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Mp4Settings] = js.undefined
  
  /**
    * These settings relate to the fragmented MP4 container for the segments in your DASH outputs.
    */
  var MpdSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.MpdSettings] = js.undefined
  
  /**
    * These settings relate to your MXF output container.
    */
  var MxfSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.MxfSettings] = js.undefined
}
object ContainerSettings {
  
  inline def apply(): ContainerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerSettings]
  }
  
  extension [Self <: ContainerSettings](x: Self) {
    
    inline def setCmfcSettings(value: CmfcSettings): Self = StObject.set(x, "CmfcSettings", value.asInstanceOf[js.Any])
    
    inline def setCmfcSettingsUndefined: Self = StObject.set(x, "CmfcSettings", js.undefined)
    
    inline def setContainer(value: ContainerType): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "Container", js.undefined)
    
    inline def setF4vSettings(value: F4vSettings): Self = StObject.set(x, "F4vSettings", value.asInstanceOf[js.Any])
    
    inline def setF4vSettingsUndefined: Self = StObject.set(x, "F4vSettings", js.undefined)
    
    inline def setM2tsSettings(value: M2tsSettings): Self = StObject.set(x, "M2tsSettings", value.asInstanceOf[js.Any])
    
    inline def setM2tsSettingsUndefined: Self = StObject.set(x, "M2tsSettings", js.undefined)
    
    inline def setM3u8Settings(value: M3u8Settings): Self = StObject.set(x, "M3u8Settings", value.asInstanceOf[js.Any])
    
    inline def setM3u8SettingsUndefined: Self = StObject.set(x, "M3u8Settings", js.undefined)
    
    inline def setMovSettings(value: MovSettings): Self = StObject.set(x, "MovSettings", value.asInstanceOf[js.Any])
    
    inline def setMovSettingsUndefined: Self = StObject.set(x, "MovSettings", js.undefined)
    
    inline def setMp4Settings(value: Mp4Settings): Self = StObject.set(x, "Mp4Settings", value.asInstanceOf[js.Any])
    
    inline def setMp4SettingsUndefined: Self = StObject.set(x, "Mp4Settings", js.undefined)
    
    inline def setMpdSettings(value: MpdSettings): Self = StObject.set(x, "MpdSettings", value.asInstanceOf[js.Any])
    
    inline def setMpdSettingsUndefined: Self = StObject.set(x, "MpdSettings", js.undefined)
    
    inline def setMxfSettings(value: MxfSettings): Self = StObject.set(x, "MxfSettings", value.asInstanceOf[js.Any])
    
    inline def setMxfSettingsUndefined: Self = StObject.set(x, "MxfSettings", js.undefined)
  }
}
