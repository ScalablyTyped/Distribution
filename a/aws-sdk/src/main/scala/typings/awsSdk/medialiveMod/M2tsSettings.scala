package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait M2tsSettings extends js.Object {
  
  /**
    * When set to drop, output audio streams will be removed from the program if the selected input audio stream is removed from the input. This allows the output audio configuration to dynamically change based on input configuration. If this is set to encodeSilence, all output audio streams will output encoded silence when not connected to an active input stream.
    */
  var AbsentInputAudioBehavior: js.UndefOr[M2tsAbsentInputAudioBehavior] = js.native
  
  /**
    * When set to enabled, uses ARIB-compliant field muxing and removes video descriptor.
    */
  var Arib: js.UndefOr[M2tsArib] = js.native
  
  /**
    * Packet Identifier (PID) for ARIB Captions in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var AribCaptionsPid: js.UndefOr[string] = js.native
  
  /**
    * If set to auto, pid number used for ARIB Captions will be auto-selected from unused pids.  If set to useConfigured, ARIB Captions will be on the configured pid number.
    */
  var AribCaptionsPidControl: js.UndefOr[M2tsAribCaptionsPidControl] = js.native
  
  /**
    * When set to dvb, uses DVB buffer model for Dolby Digital audio.  When set to atsc, the ATSC model is used.
    */
  var AudioBufferModel: js.UndefOr[M2tsAudioBufferModel] = js.native
  
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[integerMin0] = js.native
  
  /**
    * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var AudioPids: js.UndefOr[string] = js.native
  
  /**
    * When set to atsc, uses stream type = 0x81 for AC3 and stream type = 0x87 for EAC3. When set to dvb, uses stream type = 0x06.
    */
  var AudioStreamType: js.UndefOr[M2tsAudioStreamType] = js.native
  
  /**
    * The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically determine the appropriate bitrate.
    */
  var Bitrate: js.UndefOr[integerMin0] = js.native
  
  /**
    * Controls the timing accuracy for output network traffic. Leave as MULTIPLEX to ensure accurate network packet timing. Or set to NONE, which might result in lower latency but will result in more variability in output network packet timing. This variability might cause interruptions, jitter, or bursty behavior in your playback or receiving devices.
    */
  var BufferModel: js.UndefOr[M2tsBufferModel] = js.native
  
  /**
    * When set to enabled, generates captionServiceDescriptor in PMT.
    */
  var CcDescriptor: js.UndefOr[M2tsCcDescriptor] = js.native
  
  /**
    * Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
    */
  var DvbNitSettings: js.UndefOr[typings.awsSdk.medialiveMod.DvbNitSettings] = js.native
  
  /**
    * Inserts DVB Service Description Table (SDT) at the specified table repetition interval.
    */
  var DvbSdtSettings: js.UndefOr[typings.awsSdk.medialiveMod.DvbSdtSettings] = js.native
  
  /**
    * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var DvbSubPids: js.UndefOr[string] = js.native
  
  /**
    * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
    */
  var DvbTdtSettings: js.UndefOr[typings.awsSdk.medialiveMod.DvbTdtSettings] = js.native
  
  /**
    * Packet Identifier (PID) for input source DVB Teletext data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var DvbTeletextPid: js.UndefOr[string] = js.native
  
  /**
    * If set to passthrough, passes any EBIF data from the input source to this output.
    */
  var Ebif: js.UndefOr[M2tsEbifControl] = js.native
  
  /**
    * When videoAndFixedIntervals is selected, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. Only available when EBP Cablelabs segmentation markers are selected.  Partitions 1 and 2 will always follow the video interval.
    */
  var EbpAudioInterval: js.UndefOr[M2tsAudioInterval] = js.native
  
  /**
    * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by looking ahead at input video. If another EBP is going to come in within the specified time interval, the current EBP is not emitted, and the segment is "stretched" to the next marker.  The lookahead value does not add latency to the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead accurate.
    */
  var EbpLookaheadMs: js.UndefOr[integerMin0Max10000] = js.native
  
  /**
    * Controls placement of EBP on Audio PIDs. If set to videoAndAudioPids, EBP markers will be placed on the video PID and all audio PIDs.  If set to videoPid, EBP markers will be placed on only the video PID.
    */
  var EbpPlacement: js.UndefOr[M2tsEbpPlacement] = js.native
  
  /**
    * This field is unused and deprecated.
    */
  var EcmPid: js.UndefOr[string] = js.native
  
  /**
    * Include or exclude the ES Rate field in the PES header.
    */
  var EsRateInPes: js.UndefOr[M2tsEsRateInPes] = js.native
  
  /**
    * Packet Identifier (PID) for input source ETV Platform data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var EtvPlatformPid: js.UndefOr[string] = js.native
  
  /**
    * Packet Identifier (PID) for input source ETV Signal data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var EtvSignalPid: js.UndefOr[string] = js.native
  
  /**
    * The length in seconds of each fragment. Only used with EBP markers.
    */
  var FragmentTime: js.UndefOr[doubleMin0] = js.native
  
  /**
    * If set to passthrough, passes any KLV data from the input source to this output.
    */
  var Klv: js.UndefOr[M2tsKlv] = js.native
  
  /**
    * Packet Identifier (PID) for input source KLV data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var KlvDataPids: js.UndefOr[string] = js.native
  
  /**
    * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3Behavior: js.UndefOr[M2tsNielsenId3Behavior] = js.native
  
  /**
    * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a downstream encryption system requires periodic null packets.
    */
  var NullPacketBitrate: js.UndefOr[doubleMin0] = js.native
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.  Valid values are 0, 10..1000.
    */
  var PatInterval: js.UndefOr[integerMin0Max1000] = js.native
  
  /**
    * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M2tsPcrControl] = js.native
  
  /**
    * Maximum time in milliseconds between Program Clock Reference (PCRs) inserted into the transport stream.
    */
  var PcrPeriod: js.UndefOr[integerMin0Max500] = js.native
  
  /**
    * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var PcrPid: js.UndefOr[string] = js.native
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream. Valid values are 0, 10..1000.
    */
  var PmtInterval: js.UndefOr[integerMin0Max1000] = js.native
  
  /**
    * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var PmtPid: js.UndefOr[string] = js.native
  
  /**
    * The value of the program number field in the Program Map Table.
    */
  var ProgramNum: js.UndefOr[integerMin0Max65535] = js.native
  
  /**
    * When vbr, does not insert null packets into transport stream to fill specified bitrate. The bitrate setting acts as the maximum bitrate when vbr is set.
    */
  var RateMode: js.UndefOr[M2tsRateMode] = js.native
  
  /**
    * Packet Identifier (PID) for input source SCTE-27 data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var Scte27Pids: js.UndefOr[string] = js.native
  
  /**
    * Optionally pass SCTE-35 signals from the input source to this output.
    */
  var Scte35Control: js.UndefOr[M2tsScte35Control] = js.native
  
  /**
    * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var Scte35Pid: js.UndefOr[string] = js.native
  
  /**
    * Inserts segmentation markers at each segmentationTime period. raiSegstart sets the Random Access Indicator bit in the adaptation field. raiAdapt sets the RAI bit and adds the current timecode in the private data bytes. psiSegstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebpLegacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
    */
  var SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers] = js.native
  
  /**
    * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted.
  When a segmentation style of "resetCadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of $segmentationTime seconds.
  When a segmentation style of "maintainCadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of $segmentationTime seconds. Note that EBP lookahead is a slight exception to this rule.
    */
  var SegmentationStyle: js.UndefOr[M2tsSegmentationStyle] = js.native
  
  /**
    * The length in seconds of each segment. Required unless markers is set to _none_.
    */
  var SegmentationTime: js.UndefOr[doubleMin1] = js.native
  
  /**
    * When set to passthrough, timed metadata will be passed through from input to output.
    */
  var TimedMetadataBehavior: js.UndefOr[M2tsTimedMetadataBehavior] = js.native
  
  /**
    * Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var TimedMetadataPid: js.UndefOr[string] = js.native
  
  /**
    * The value of the transport stream ID field in the Program Map Table.
    */
  var TransportStreamId: js.UndefOr[integerMin0Max65535] = js.native
  
  /**
    * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var VideoPid: js.UndefOr[string] = js.native
}
object M2tsSettings {
  
  @scala.inline
  def apply(): M2tsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[M2tsSettings]
  }
  
  @scala.inline
  implicit class M2tsSettingsOps[Self <: M2tsSettings] (val x: Self) extends AnyVal {
    
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
    def setAbsentInputAudioBehavior(value: M2tsAbsentInputAudioBehavior): Self = this.set("AbsentInputAudioBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsentInputAudioBehavior: Self = this.set("AbsentInputAudioBehavior", js.undefined)
    
    @scala.inline
    def setArib(value: M2tsArib): Self = this.set("Arib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArib: Self = this.set("Arib", js.undefined)
    
    @scala.inline
    def setAribCaptionsPid(value: string): Self = this.set("AribCaptionsPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAribCaptionsPid: Self = this.set("AribCaptionsPid", js.undefined)
    
    @scala.inline
    def setAribCaptionsPidControl(value: M2tsAribCaptionsPidControl): Self = this.set("AribCaptionsPidControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAribCaptionsPidControl: Self = this.set("AribCaptionsPidControl", js.undefined)
    
    @scala.inline
    def setAudioBufferModel(value: M2tsAudioBufferModel): Self = this.set("AudioBufferModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioBufferModel: Self = this.set("AudioBufferModel", js.undefined)
    
    @scala.inline
    def setAudioFramesPerPes(value: integerMin0): Self = this.set("AudioFramesPerPes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioFramesPerPes: Self = this.set("AudioFramesPerPes", js.undefined)
    
    @scala.inline
    def setAudioPids(value: string): Self = this.set("AudioPids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioPids: Self = this.set("AudioPids", js.undefined)
    
    @scala.inline
    def setAudioStreamType(value: M2tsAudioStreamType): Self = this.set("AudioStreamType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioStreamType: Self = this.set("AudioStreamType", js.undefined)
    
    @scala.inline
    def setBitrate(value: integerMin0): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    
    @scala.inline
    def setBufferModel(value: M2tsBufferModel): Self = this.set("BufferModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferModel: Self = this.set("BufferModel", js.undefined)
    
    @scala.inline
    def setCcDescriptor(value: M2tsCcDescriptor): Self = this.set("CcDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCcDescriptor: Self = this.set("CcDescriptor", js.undefined)
    
    @scala.inline
    def setDvbNitSettings(value: DvbNitSettings): Self = this.set("DvbNitSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvbNitSettings: Self = this.set("DvbNitSettings", js.undefined)
    
    @scala.inline
    def setDvbSdtSettings(value: DvbSdtSettings): Self = this.set("DvbSdtSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvbSdtSettings: Self = this.set("DvbSdtSettings", js.undefined)
    
    @scala.inline
    def setDvbSubPids(value: string): Self = this.set("DvbSubPids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvbSubPids: Self = this.set("DvbSubPids", js.undefined)
    
    @scala.inline
    def setDvbTdtSettings(value: DvbTdtSettings): Self = this.set("DvbTdtSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvbTdtSettings: Self = this.set("DvbTdtSettings", js.undefined)
    
    @scala.inline
    def setDvbTeletextPid(value: string): Self = this.set("DvbTeletextPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvbTeletextPid: Self = this.set("DvbTeletextPid", js.undefined)
    
    @scala.inline
    def setEbif(value: M2tsEbifControl): Self = this.set("Ebif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbif: Self = this.set("Ebif", js.undefined)
    
    @scala.inline
    def setEbpAudioInterval(value: M2tsAudioInterval): Self = this.set("EbpAudioInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbpAudioInterval: Self = this.set("EbpAudioInterval", js.undefined)
    
    @scala.inline
    def setEbpLookaheadMs(value: integerMin0Max10000): Self = this.set("EbpLookaheadMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbpLookaheadMs: Self = this.set("EbpLookaheadMs", js.undefined)
    
    @scala.inline
    def setEbpPlacement(value: M2tsEbpPlacement): Self = this.set("EbpPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbpPlacement: Self = this.set("EbpPlacement", js.undefined)
    
    @scala.inline
    def setEcmPid(value: string): Self = this.set("EcmPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcmPid: Self = this.set("EcmPid", js.undefined)
    
    @scala.inline
    def setEsRateInPes(value: M2tsEsRateInPes): Self = this.set("EsRateInPes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEsRateInPes: Self = this.set("EsRateInPes", js.undefined)
    
    @scala.inline
    def setEtvPlatformPid(value: string): Self = this.set("EtvPlatformPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtvPlatformPid: Self = this.set("EtvPlatformPid", js.undefined)
    
    @scala.inline
    def setEtvSignalPid(value: string): Self = this.set("EtvSignalPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtvSignalPid: Self = this.set("EtvSignalPid", js.undefined)
    
    @scala.inline
    def setFragmentTime(value: doubleMin0): Self = this.set("FragmentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragmentTime: Self = this.set("FragmentTime", js.undefined)
    
    @scala.inline
    def setKlv(value: M2tsKlv): Self = this.set("Klv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKlv: Self = this.set("Klv", js.undefined)
    
    @scala.inline
    def setKlvDataPids(value: string): Self = this.set("KlvDataPids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKlvDataPids: Self = this.set("KlvDataPids", js.undefined)
    
    @scala.inline
    def setNielsenId3Behavior(value: M2tsNielsenId3Behavior): Self = this.set("NielsenId3Behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNielsenId3Behavior: Self = this.set("NielsenId3Behavior", js.undefined)
    
    @scala.inline
    def setNullPacketBitrate(value: doubleMin0): Self = this.set("NullPacketBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullPacketBitrate: Self = this.set("NullPacketBitrate", js.undefined)
    
    @scala.inline
    def setPatInterval(value: integerMin0Max1000): Self = this.set("PatInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatInterval: Self = this.set("PatInterval", js.undefined)
    
    @scala.inline
    def setPcrControl(value: M2tsPcrControl): Self = this.set("PcrControl", value.asInstanceOf[js.Any])
    
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
    def setRateMode(value: M2tsRateMode): Self = this.set("RateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateMode: Self = this.set("RateMode", js.undefined)
    
    @scala.inline
    def setScte27Pids(value: string): Self = this.set("Scte27Pids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScte27Pids: Self = this.set("Scte27Pids", js.undefined)
    
    @scala.inline
    def setScte35Control(value: M2tsScte35Control): Self = this.set("Scte35Control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScte35Control: Self = this.set("Scte35Control", js.undefined)
    
    @scala.inline
    def setScte35Pid(value: string): Self = this.set("Scte35Pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScte35Pid: Self = this.set("Scte35Pid", js.undefined)
    
    @scala.inline
    def setSegmentationMarkers(value: M2tsSegmentationMarkers): Self = this.set("SegmentationMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentationMarkers: Self = this.set("SegmentationMarkers", js.undefined)
    
    @scala.inline
    def setSegmentationStyle(value: M2tsSegmentationStyle): Self = this.set("SegmentationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentationStyle: Self = this.set("SegmentationStyle", js.undefined)
    
    @scala.inline
    def setSegmentationTime(value: doubleMin1): Self = this.set("SegmentationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentationTime: Self = this.set("SegmentationTime", js.undefined)
    
    @scala.inline
    def setTimedMetadataBehavior(value: M2tsTimedMetadataBehavior): Self = this.set("TimedMetadataBehavior", value.asInstanceOf[js.Any])
    
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
