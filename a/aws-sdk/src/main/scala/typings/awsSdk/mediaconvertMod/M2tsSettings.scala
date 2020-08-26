package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait M2tsSettings extends js.Object {
  /**
    * Selects between the DVB and ATSC buffer models for Dolby Digital audio.
    */
  var AudioBufferModel: js.UndefOr[M2tsAudioBufferModel] = js.native
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * Specify the packet identifiers (PIDs) for any elementary audio streams you include in this output. Specify multiple PIDs as a JSON array. Default is the range 482-492.
    */
  var AudioPids: js.UndefOr[listOfIntegerMin32Max8182] = js.native
  /**
    * Specify the output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically determine the appropriate bitrate. Other common values are 3750000, 7500000, and 15000000.
    */
  var Bitrate: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * Controls what buffer model to use for accurate interleaving. If set to MULTIPLEX, use multiplex  buffer model. If set to NONE, this can lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
    */
  var BufferModel: js.UndefOr[M2tsBufferModel] = js.native
  /**
    * Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
    */
  var DvbNitSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DvbNitSettings] = js.native
  /**
    * Inserts DVB Service Description Table (NIT) at the specified table repetition interval.
    */
  var DvbSdtSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DvbSdtSettings] = js.native
  /**
    * Specify the packet identifiers (PIDs) for DVB subtitle data included in this output. Specify multiple PIDs as a JSON array. Default is the range 460-479.
    */
  var DvbSubPids: js.UndefOr[listOfIntegerMin32Max8182] = js.native
  /**
    * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
    */
  var DvbTdtSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DvbTdtSettings] = js.native
  /**
    * Specify the packet identifier (PID) for DVB teletext data you include in this output. Default is 499.
    */
  var DvbTeletextPid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. When set to VIDEO_INTERVAL, these additional markers will not be inserted. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
    */
  var EbpAudioInterval: js.UndefOr[M2tsEbpAudioInterval] = js.native
  /**
    * Selects which PIDs to place EBP markers on. They can either be placed only on the video PID, or on both the video PID and all audio PIDs. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
    */
  var EbpPlacement: js.UndefOr[M2tsEbpPlacement] = js.native
  /**
    * Controls whether to include the ES Rate field in the PES header.
    */
  var EsRateInPes: js.UndefOr[M2tsEsRateInPes] = js.native
  /**
    * Keep the default value (DEFAULT) unless you know that your audio EBP markers are incorrectly appearing before your video EBP markers. To correct this problem, set this value to Force (FORCE).
    */
  var ForceTsVideoEbpOrder: js.UndefOr[M2tsForceTsVideoEbpOrder] = js.native
  /**
    * The length, in seconds, of each fragment. Only used with EBP markers.
    */
  var FragmentTime: js.UndefOr[doubleMin0] = js.native
  /**
    * Specify the maximum time, in milliseconds, between Program Clock References (PCRs) inserted into the transport stream.
    */
  var MaxPcrInterval: js.UndefOr[integerMin0Max500] = js.native
  /**
    * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by looking ahead at input video. If another EBP is going to come in within the specified time interval, the current EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead value does not add latency to the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead accurate.
    */
  var MinEbpInterval: js.UndefOr[integerMin0Max10000] = js.native
  /**
    * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3: js.UndefOr[M2tsNielsenId3] = js.native
  /**
    * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a downstream encryption system requires periodic null packets.
    */
  var NullPacketBitrate: js.UndefOr[doubleMin0] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var PatInterval: js.UndefOr[integerMin0Max1000] = js.native
  /**
    * When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M2tsPcrControl] = js.native
  /**
    * Specify the packet identifier (PID) for the program clock reference (PCR) in this output. If you do not specify a value, the service will use the value for Video PID (VideoPid).
    */
  var PcrPid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * Specify the number of milliseconds between instances of the program map table (PMT) in the output transport stream.
    */
  var PmtInterval: js.UndefOr[integerMin0Max1000] = js.native
  /**
    * Specify the packet identifier (PID) for the program map table (PMT) itself. Default is 480.
    */
  var PmtPid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * Specify the packet identifier (PID) of the private metadata stream. Default is 503.
    */
  var PrivateMetadataPid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * Use Program number (programNumber) to specify the program number used in the program map table (PMT) for this output. Default is 1. Program numbers and program map tables are parts of MPEG-2 transport stream containers, used for organizing data.
    */
  var ProgramNumber: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * When set to CBR, inserts null packets into transport stream to fill specified bitrate. When set to VBR, the bitrate setting acts as the maximum bitrate, but the output will not be padded up to that bitrate.
    */
  var RateMode: js.UndefOr[M2tsRateMode] = js.native
  /**
    * Include this in your job settings to put SCTE-35 markers in your HLS and transport stream outputs at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  var Scte35Esam: js.UndefOr[M2tsScte35Esam] = js.native
  /**
    * Specify the packet identifier (PID) of the SCTE-35 stream in the transport stream.
    */
  var Scte35Pid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE). Also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml). Also enable ESAM SCTE-35 (include the property scte35Esam).
    */
  var Scte35Source: js.UndefOr[M2tsScte35Source] = js.native
  /**
    * Inserts segmentation markers at each segmentation_time period. rai_segstart sets the Random Access Indicator bit in the adaptation field. rai_adapt sets the RAI bit and adds the current timecode in the private data bytes. psi_segstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
    */
  var SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers] = js.native
  /**
    * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted. When a segmentation style of "reset_cadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of of $segmentation_time seconds. When a segmentation style of "maintain_cadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of $segmentation_time seconds. Note that EBP lookahead is a slight exception to this rule.
    */
  var SegmentationStyle: js.UndefOr[M2tsSegmentationStyle] = js.native
  /**
    * Specify the length, in seconds, of each segment. Required unless markers is set to _none_.
    */
  var SegmentationTime: js.UndefOr[doubleMin0] = js.native
  /**
    * Specify the packet identifier (PID) for timed metadata in this output. Default is 502.
    */
  var TimedMetadataPid: js.UndefOr[integerMin32Max8182] = js.native
  /**
    * Specify the ID for the transport stream itself in the program map table for this output. Transport stream IDs and program map tables are parts of MPEG-2 transport stream containers, used for organizing data.
    */
  var TransportStreamId: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * Specify the packet identifier (PID) of the elementary video stream in the transport stream.
    */
  var VideoPid: js.UndefOr[integerMin32Max8182] = js.native
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
    def setAudioBufferModel(value: M2tsAudioBufferModel): Self = this.set("AudioBufferModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioBufferModel: Self = this.set("AudioBufferModel", js.undefined)
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
    def setBitrate(value: integerMin0Max2147483647): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    @scala.inline
    def setBufferModel(value: M2tsBufferModel): Self = this.set("BufferModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferModel: Self = this.set("BufferModel", js.undefined)
    @scala.inline
    def setDvbNitSettings(value: DvbNitSettings): Self = this.set("DvbNitSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDvbNitSettings: Self = this.set("DvbNitSettings", js.undefined)
    @scala.inline
    def setDvbSdtSettings(value: DvbSdtSettings): Self = this.set("DvbSdtSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDvbSdtSettings: Self = this.set("DvbSdtSettings", js.undefined)
    @scala.inline
    def setDvbSubPidsVarargs(value: integerMin32Max8182*): Self = this.set("DvbSubPids", js.Array(value :_*))
    @scala.inline
    def setDvbSubPids(value: listOfIntegerMin32Max8182): Self = this.set("DvbSubPids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDvbSubPids: Self = this.set("DvbSubPids", js.undefined)
    @scala.inline
    def setDvbTdtSettings(value: DvbTdtSettings): Self = this.set("DvbTdtSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDvbTdtSettings: Self = this.set("DvbTdtSettings", js.undefined)
    @scala.inline
    def setDvbTeletextPid(value: integerMin32Max8182): Self = this.set("DvbTeletextPid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDvbTeletextPid: Self = this.set("DvbTeletextPid", js.undefined)
    @scala.inline
    def setEbpAudioInterval(value: M2tsEbpAudioInterval): Self = this.set("EbpAudioInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbpAudioInterval: Self = this.set("EbpAudioInterval", js.undefined)
    @scala.inline
    def setEbpPlacement(value: M2tsEbpPlacement): Self = this.set("EbpPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbpPlacement: Self = this.set("EbpPlacement", js.undefined)
    @scala.inline
    def setEsRateInPes(value: M2tsEsRateInPes): Self = this.set("EsRateInPes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEsRateInPes: Self = this.set("EsRateInPes", js.undefined)
    @scala.inline
    def setForceTsVideoEbpOrder(value: M2tsForceTsVideoEbpOrder): Self = this.set("ForceTsVideoEbpOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceTsVideoEbpOrder: Self = this.set("ForceTsVideoEbpOrder", js.undefined)
    @scala.inline
    def setFragmentTime(value: doubleMin0): Self = this.set("FragmentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentTime: Self = this.set("FragmentTime", js.undefined)
    @scala.inline
    def setMaxPcrInterval(value: integerMin0Max500): Self = this.set("MaxPcrInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPcrInterval: Self = this.set("MaxPcrInterval", js.undefined)
    @scala.inline
    def setMinEbpInterval(value: integerMin0Max10000): Self = this.set("MinEbpInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinEbpInterval: Self = this.set("MinEbpInterval", js.undefined)
    @scala.inline
    def setNielsenId3(value: M2tsNielsenId3): Self = this.set("NielsenId3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNielsenId3: Self = this.set("NielsenId3", js.undefined)
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
    def setRateMode(value: M2tsRateMode): Self = this.set("RateMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateMode: Self = this.set("RateMode", js.undefined)
    @scala.inline
    def setScte35Esam(value: M2tsScte35Esam): Self = this.set("Scte35Esam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScte35Esam: Self = this.set("Scte35Esam", js.undefined)
    @scala.inline
    def setScte35Pid(value: integerMin32Max8182): Self = this.set("Scte35Pid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScte35Pid: Self = this.set("Scte35Pid", js.undefined)
    @scala.inline
    def setScte35Source(value: M2tsScte35Source): Self = this.set("Scte35Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScte35Source: Self = this.set("Scte35Source", js.undefined)
    @scala.inline
    def setSegmentationMarkers(value: M2tsSegmentationMarkers): Self = this.set("SegmentationMarkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentationMarkers: Self = this.set("SegmentationMarkers", js.undefined)
    @scala.inline
    def setSegmentationStyle(value: M2tsSegmentationStyle): Self = this.set("SegmentationStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentationStyle: Self = this.set("SegmentationStyle", js.undefined)
    @scala.inline
    def setSegmentationTime(value: doubleMin0): Self = this.set("SegmentationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentationTime: Self = this.set("SegmentationTime", js.undefined)
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

