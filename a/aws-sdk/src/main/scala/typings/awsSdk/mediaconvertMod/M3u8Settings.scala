package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait M3u8Settings extends StObject {
  
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation.
    */
  var AudioPids: js.UndefOr[listOfIntegerMin32Max8182] = js.undefined
  
  /**
    * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3: js.UndefOr[M3u8NielsenId3] = js.undefined
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var PatInterval: js.UndefOr[integerMin0Max1000] = js.undefined
  
  /**
    * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M3u8PcrControl] = js.undefined
  
  /**
    * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID.
    */
  var PcrPid: js.UndefOr[integerMin32Max8182] = js.undefined
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var PmtInterval: js.UndefOr[integerMin0Max1000] = js.undefined
  
  /**
    * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream.
    */
  var PmtPid: js.UndefOr[integerMin32Max8182] = js.undefined
  
  /**
    * Packet Identifier (PID) of the private metadata stream in the transport stream.
    */
  var PrivateMetadataPid: js.UndefOr[integerMin32Max8182] = js.undefined
  
  /**
    * The value of the program number field in the Program Map Table.
    */
  var ProgramNumber: js.UndefOr[integerMin0Max65535] = js.undefined
  
  /**
    * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
    */
  var Scte35Pid: js.UndefOr[integerMin32Max8182] = js.undefined
  
  /**
    * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE) if you don't want manifest conditioning. Choose Passthrough (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest conditioning. In both cases, also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml).
    */
  var Scte35Source: js.UndefOr[M3u8Scte35Source] = js.undefined
  
  /**
    * Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from the input in this output.
    */
  var TimedMetadata: js.UndefOr[typings.awsSdk.mediaconvertMod.TimedMetadata] = js.undefined
  
  /**
    * Packet Identifier (PID) of the timed metadata stream in the transport stream.
    */
  var TimedMetadataPid: js.UndefOr[integerMin32Max8182] = js.undefined
  
  /**
    * The value of the transport stream ID field in the Program Map Table.
    */
  var TransportStreamId: js.UndefOr[integerMin0Max65535] = js.undefined
  
  /**
    * Packet Identifier (PID) of the elementary video stream in the transport stream.
    */
  var VideoPid: js.UndefOr[integerMin32Max8182] = js.undefined
}
object M3u8Settings {
  
  inline def apply(): M3u8Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[M3u8Settings]
  }
  
  extension [Self <: M3u8Settings](x: Self) {
    
    inline def setAudioFramesPerPes(value: integerMin0Max2147483647): Self = StObject.set(x, "AudioFramesPerPes", value.asInstanceOf[js.Any])
    
    inline def setAudioFramesPerPesUndefined: Self = StObject.set(x, "AudioFramesPerPes", js.undefined)
    
    inline def setAudioPids(value: listOfIntegerMin32Max8182): Self = StObject.set(x, "AudioPids", value.asInstanceOf[js.Any])
    
    inline def setAudioPidsUndefined: Self = StObject.set(x, "AudioPids", js.undefined)
    
    inline def setAudioPidsVarargs(value: integerMin32Max8182*): Self = StObject.set(x, "AudioPids", js.Array(value :_*))
    
    inline def setNielsenId3(value: M3u8NielsenId3): Self = StObject.set(x, "NielsenId3", value.asInstanceOf[js.Any])
    
    inline def setNielsenId3Undefined: Self = StObject.set(x, "NielsenId3", js.undefined)
    
    inline def setPatInterval(value: integerMin0Max1000): Self = StObject.set(x, "PatInterval", value.asInstanceOf[js.Any])
    
    inline def setPatIntervalUndefined: Self = StObject.set(x, "PatInterval", js.undefined)
    
    inline def setPcrControl(value: M3u8PcrControl): Self = StObject.set(x, "PcrControl", value.asInstanceOf[js.Any])
    
    inline def setPcrControlUndefined: Self = StObject.set(x, "PcrControl", js.undefined)
    
    inline def setPcrPid(value: integerMin32Max8182): Self = StObject.set(x, "PcrPid", value.asInstanceOf[js.Any])
    
    inline def setPcrPidUndefined: Self = StObject.set(x, "PcrPid", js.undefined)
    
    inline def setPmtInterval(value: integerMin0Max1000): Self = StObject.set(x, "PmtInterval", value.asInstanceOf[js.Any])
    
    inline def setPmtIntervalUndefined: Self = StObject.set(x, "PmtInterval", js.undefined)
    
    inline def setPmtPid(value: integerMin32Max8182): Self = StObject.set(x, "PmtPid", value.asInstanceOf[js.Any])
    
    inline def setPmtPidUndefined: Self = StObject.set(x, "PmtPid", js.undefined)
    
    inline def setPrivateMetadataPid(value: integerMin32Max8182): Self = StObject.set(x, "PrivateMetadataPid", value.asInstanceOf[js.Any])
    
    inline def setPrivateMetadataPidUndefined: Self = StObject.set(x, "PrivateMetadataPid", js.undefined)
    
    inline def setProgramNumber(value: integerMin0Max65535): Self = StObject.set(x, "ProgramNumber", value.asInstanceOf[js.Any])
    
    inline def setProgramNumberUndefined: Self = StObject.set(x, "ProgramNumber", js.undefined)
    
    inline def setScte35Pid(value: integerMin32Max8182): Self = StObject.set(x, "Scte35Pid", value.asInstanceOf[js.Any])
    
    inline def setScte35PidUndefined: Self = StObject.set(x, "Scte35Pid", js.undefined)
    
    inline def setScte35Source(value: M3u8Scte35Source): Self = StObject.set(x, "Scte35Source", value.asInstanceOf[js.Any])
    
    inline def setScte35SourceUndefined: Self = StObject.set(x, "Scte35Source", js.undefined)
    
    inline def setTimedMetadata(value: TimedMetadata): Self = StObject.set(x, "TimedMetadata", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataPid(value: integerMin32Max8182): Self = StObject.set(x, "TimedMetadataPid", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataPidUndefined: Self = StObject.set(x, "TimedMetadataPid", js.undefined)
    
    inline def setTimedMetadataUndefined: Self = StObject.set(x, "TimedMetadata", js.undefined)
    
    inline def setTransportStreamId(value: integerMin0Max65535): Self = StObject.set(x, "TransportStreamId", value.asInstanceOf[js.Any])
    
    inline def setTransportStreamIdUndefined: Self = StObject.set(x, "TransportStreamId", js.undefined)
    
    inline def setVideoPid(value: integerMin32Max8182): Self = StObject.set(x, "VideoPid", value.asInstanceOf[js.Any])
    
    inline def setVideoPidUndefined: Self = StObject.set(x, "VideoPid", js.undefined)
  }
}
