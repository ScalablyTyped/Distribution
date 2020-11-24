package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait M3u8Settings extends js.Object {
  
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[integerMin0Max2147483647] = js.native
  
  /**
    * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation.
    */
  var AudioPids: js.UndefOr[listOfIntegerMin32Max8182] = js.native
  
  /**
    * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3: js.UndefOr[M3u8NielsenId3] = js.native
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var PatInterval: js.UndefOr[integerMin0Max1000] = js.native
  
  /**
    * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M3u8PcrControl] = js.native
  
  /**
    * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID.
    */
  var PcrPid: js.UndefOr[integerMin32Max8182] = js.native
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var PmtInterval: js.UndefOr[integerMin0Max1000] = js.native
  
  /**
    * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream.
    */
  var PmtPid: js.UndefOr[integerMin32Max8182] = js.native
  
  /**
    * Packet Identifier (PID) of the private metadata stream in the transport stream.
    */
  var PrivateMetadataPid: js.UndefOr[integerMin32Max8182] = js.native
  
  /**
    * The value of the program number field in the Program Map Table.
    */
  var ProgramNumber: js.UndefOr[integerMin0Max65535] = js.native
  
  /**
    * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
    */
  var Scte35Pid: js.UndefOr[integerMin32Max8182] = js.native
  
  /**
    * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE) if you don't want manifest conditioning. Choose Passthrough (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest conditioning. In both cases, also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml).
    */
  var Scte35Source: js.UndefOr[M3u8Scte35Source] = js.native
  
  /**
    * Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from the input in this output.
    */
  var TimedMetadata: js.UndefOr[typings.awsSdk.mediaconvertMod.TimedMetadata] = js.native
  
  /**
    * Packet Identifier (PID) of the timed metadata stream in the transport stream.
    */
  var TimedMetadataPid: js.UndefOr[integerMin32Max8182] = js.native
  
  /**
    * The value of the transport stream ID field in the Program Map Table.
    */
  var TransportStreamId: js.UndefOr[integerMin0Max65535] = js.native
  
  /**
    * Packet Identifier (PID) of the elementary video stream in the transport stream.
    */
  var VideoPid: js.UndefOr[integerMin32Max8182] = js.native
}
object M3u8Settings {
  
  @scala.inline
  def apply(): M3u8Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[M3u8Settings]
  }
  
  @scala.inline
  implicit class M3u8SettingsOps[Self <: M3u8Settings] (val x: Self) extends AnyVal {
    
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
    def setAudioFramesPerPes(value: integerMin0Max2147483647): Self = this.set("AudioFramesPerPes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioFramesPerPes: Self = this.set("AudioFramesPerPes", js.undefined)
    
    @scala.inline
    def setAudioPidsVarargs(value: integerMin32Max8182*): Self = this.set("AudioPids", js.Array(value :_*))
    
    @scala.inline
    def setAudioPids(value: listOfIntegerMin32Max8182): Self = this.set("AudioPids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioPids: Self = this.set("AudioPids", js.undefined)
    
    @scala.inline
    def setNielsenId3(value: M3u8NielsenId3): Self = this.set("NielsenId3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNielsenId3: Self = this.set("NielsenId3", js.undefined)
    
    @scala.inline
    def setPatInterval(value: integerMin0Max1000): Self = this.set("PatInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatInterval: Self = this.set("PatInterval", js.undefined)
    
    @scala.inline
    def setPcrControl(value: M3u8PcrControl): Self = this.set("PcrControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePcrControl: Self = this.set("PcrControl", js.undefined)
    
    @scala.inline
    def setPcrPid(value: integerMin32Max8182): Self = this.set("PcrPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePcrPid: Self = this.set("PcrPid", js.undefined)
    
    @scala.inline
    def setPmtInterval(value: integerMin0Max1000): Self = this.set("PmtInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePmtInterval: Self = this.set("PmtInterval", js.undefined)
    
    @scala.inline
    def setPmtPid(value: integerMin32Max8182): Self = this.set("PmtPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePmtPid: Self = this.set("PmtPid", js.undefined)
    
    @scala.inline
    def setPrivateMetadataPid(value: integerMin32Max8182): Self = this.set("PrivateMetadataPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateMetadataPid: Self = this.set("PrivateMetadataPid", js.undefined)
    
    @scala.inline
    def setProgramNumber(value: integerMin0Max65535): Self = this.set("ProgramNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgramNumber: Self = this.set("ProgramNumber", js.undefined)
    
    @scala.inline
    def setScte35Pid(value: integerMin32Max8182): Self = this.set("Scte35Pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScte35Pid: Self = this.set("Scte35Pid", js.undefined)
    
    @scala.inline
    def setScte35Source(value: M3u8Scte35Source): Self = this.set("Scte35Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScte35Source: Self = this.set("Scte35Source", js.undefined)
    
    @scala.inline
    def setTimedMetadata(value: TimedMetadata): Self = this.set("TimedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimedMetadata: Self = this.set("TimedMetadata", js.undefined)
    
    @scala.inline
    def setTimedMetadataPid(value: integerMin32Max8182): Self = this.set("TimedMetadataPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimedMetadataPid: Self = this.set("TimedMetadataPid", js.undefined)
    
    @scala.inline
    def setTransportStreamId(value: integerMin0Max65535): Self = this.set("TransportStreamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransportStreamId: Self = this.set("TransportStreamId", js.undefined)
    
    @scala.inline
    def setVideoPid(value: integerMin32Max8182): Self = this.set("VideoPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoPid: Self = this.set("VideoPid", js.undefined)
  }
}
