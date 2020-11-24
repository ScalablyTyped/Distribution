package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait M3u8Settings extends js.Object {
  
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[integerMin0] = js.native
  
  /**
    * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.
    */
  var AudioPids: js.UndefOr[string] = js.native
  
  /**
    * This parameter is unused and deprecated.
    */
  var EcmPid: js.UndefOr[string] = js.native
  
  /**
    * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3Behavior: js.UndefOr[M3u8NielsenId3Behavior] = js.native
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\" writes out the PMT once per segment file.
    */
  var PatInterval: js.UndefOr[integerMin0Max1000] = js.native
  
  /**
    * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M3u8PcrControl] = js.native
  
  /**
    * Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
    */
  var PcrPeriod: js.UndefOr[integerMin0Max500] = js.native
  
  /**
    * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value.
    */
  var PcrPid: js.UndefOr[string] = js.native
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\" writes out the PMT once per segment file.
    */
  var PmtInterval: js.UndefOr[integerMin0Max1000] = js.native
  
  /**
    * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or hexadecimal value.
    */
  var PmtPid: js.UndefOr[string] = js.native
  
  /**
    * The value of the program number field in the Program Map Table.
    */
  var ProgramNum: js.UndefOr[integerMin0Max65535] = js.native
  
  /**
    * If set to passthrough, passes any SCTE-35 signals from the input source to this output.
    */
  var Scte35Behavior: js.UndefOr[M3u8Scte35Behavior] = js.native
  
  /**
    * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal value.
    */
  var Scte35Pid: js.UndefOr[string] = js.native
  
  /**
    * When set to passthrough, timed metadata is passed through from input to output.
    */
  var TimedMetadataBehavior: js.UndefOr[M3u8TimedMetadataBehavior] = js.native
  
  /**
    * Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var TimedMetadataPid: js.UndefOr[string] = js.native
  
  /**
    * The value of the transport stream ID field in the Program Map Table.
    */
  var TransportStreamId: js.UndefOr[integerMin0Max65535] = js.native
  
  /**
    * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or hexadecimal value.
    */
  var VideoPid: js.UndefOr[string] = js.native
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
    def setAudioFramesPerPes(value: integerMin0): Self = this.set("AudioFramesPerPes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioFramesPerPes: Self = this.set("AudioFramesPerPes", js.undefined)
    
    @scala.inline
    def setAudioPids(value: string): Self = this.set("AudioPids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioPids: Self = this.set("AudioPids", js.undefined)
    
    @scala.inline
    def setEcmPid(value: string): Self = this.set("EcmPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcmPid: Self = this.set("EcmPid", js.undefined)
    
    @scala.inline
    def setNielsenId3Behavior(value: M3u8NielsenId3Behavior): Self = this.set("NielsenId3Behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNielsenId3Behavior: Self = this.set("NielsenId3Behavior", js.undefined)
    
    @scala.inline
    def setPatInterval(value: integerMin0Max1000): Self = this.set("PatInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatInterval: Self = this.set("PatInterval", js.undefined)
    
    @scala.inline
    def setPcrControl(value: M3u8PcrControl): Self = this.set("PcrControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePcrControl: Self = this.set("PcrControl", js.undefined)
    
    @scala.inline
    def setPcrPeriod(value: integerMin0Max500): Self = this.set("PcrPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePcrPeriod: Self = this.set("PcrPeriod", js.undefined)
    
    @scala.inline
    def setPcrPid(value: string): Self = this.set("PcrPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePcrPid: Self = this.set("PcrPid", js.undefined)
    
    @scala.inline
    def setPmtInterval(value: integerMin0Max1000): Self = this.set("PmtInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePmtInterval: Self = this.set("PmtInterval", js.undefined)
    
    @scala.inline
    def setPmtPid(value: string): Self = this.set("PmtPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePmtPid: Self = this.set("PmtPid", js.undefined)
    
    @scala.inline
    def setProgramNum(value: integerMin0Max65535): Self = this.set("ProgramNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgramNum: Self = this.set("ProgramNum", js.undefined)
    
    @scala.inline
    def setScte35Behavior(value: M3u8Scte35Behavior): Self = this.set("Scte35Behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScte35Behavior: Self = this.set("Scte35Behavior", js.undefined)
    
    @scala.inline
    def setScte35Pid(value: string): Self = this.set("Scte35Pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScte35Pid: Self = this.set("Scte35Pid", js.undefined)
    
    @scala.inline
    def setTimedMetadataBehavior(value: M3u8TimedMetadataBehavior): Self = this.set("TimedMetadataBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimedMetadataBehavior: Self = this.set("TimedMetadataBehavior", js.undefined)
    
    @scala.inline
    def setTimedMetadataPid(value: string): Self = this.set("TimedMetadataPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimedMetadataPid: Self = this.set("TimedMetadataPid", js.undefined)
    
    @scala.inline
    def setTransportStreamId(value: integerMin0Max65535): Self = this.set("TransportStreamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransportStreamId: Self = this.set("TransportStreamId", js.undefined)
    
    @scala.inline
    def setVideoPid(value: string): Self = this.set("VideoPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoPid: Self = this.set("VideoPid", js.undefined)
  }
}
