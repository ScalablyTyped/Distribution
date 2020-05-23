package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    AudioFramesPerPes: js.UndefOr[integerMin0Max2147483647] = js.undefined,
    AudioPids: listOfIntegerMin32Max8182 = null,
    NielsenId3: M3u8NielsenId3 = null,
    PatInterval: js.UndefOr[integerMin0Max1000] = js.undefined,
    PcrControl: M3u8PcrControl = null,
    PcrPid: js.UndefOr[integerMin32Max8182] = js.undefined,
    PmtInterval: js.UndefOr[integerMin0Max1000] = js.undefined,
    PmtPid: js.UndefOr[integerMin32Max8182] = js.undefined,
    PrivateMetadataPid: js.UndefOr[integerMin32Max8182] = js.undefined,
    ProgramNumber: js.UndefOr[integerMin0Max65535] = js.undefined,
    Scte35Pid: js.UndefOr[integerMin32Max8182] = js.undefined,
    Scte35Source: M3u8Scte35Source = null,
    TimedMetadata: TimedMetadata = null,
    TimedMetadataPid: js.UndefOr[integerMin32Max8182] = js.undefined,
    TransportStreamId: js.UndefOr[integerMin0Max65535] = js.undefined,
    VideoPid: js.UndefOr[integerMin32Max8182] = js.undefined
  ): M3u8Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AudioFramesPerPes)) __obj.updateDynamic("AudioFramesPerPes")(AudioFramesPerPes.get.asInstanceOf[js.Any])
    if (AudioPids != null) __obj.updateDynamic("AudioPids")(AudioPids.asInstanceOf[js.Any])
    if (NielsenId3 != null) __obj.updateDynamic("NielsenId3")(NielsenId3.asInstanceOf[js.Any])
    if (!js.isUndefined(PatInterval)) __obj.updateDynamic("PatInterval")(PatInterval.get.asInstanceOf[js.Any])
    if (PcrControl != null) __obj.updateDynamic("PcrControl")(PcrControl.asInstanceOf[js.Any])
    if (!js.isUndefined(PcrPid)) __obj.updateDynamic("PcrPid")(PcrPid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PmtInterval)) __obj.updateDynamic("PmtInterval")(PmtInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PmtPid)) __obj.updateDynamic("PmtPid")(PmtPid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PrivateMetadataPid)) __obj.updateDynamic("PrivateMetadataPid")(PrivateMetadataPid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ProgramNumber)) __obj.updateDynamic("ProgramNumber")(ProgramNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Scte35Pid)) __obj.updateDynamic("Scte35Pid")(Scte35Pid.get.asInstanceOf[js.Any])
    if (Scte35Source != null) __obj.updateDynamic("Scte35Source")(Scte35Source.asInstanceOf[js.Any])
    if (TimedMetadata != null) __obj.updateDynamic("TimedMetadata")(TimedMetadata.asInstanceOf[js.Any])
    if (!js.isUndefined(TimedMetadataPid)) __obj.updateDynamic("TimedMetadataPid")(TimedMetadataPid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TransportStreamId)) __obj.updateDynamic("TransportStreamId")(TransportStreamId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(VideoPid)) __obj.updateDynamic("VideoPid")(VideoPid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[M3u8Settings]
  }
}

