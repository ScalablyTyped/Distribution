package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsSmoothGroupSettings extends js.Object {
  /**
    * The value of the "Acquisition Point Identity" element used in each message placed in the sparse track.  Only enabled if sparseTrackType is not "none".
    */
  var AcquisitionPointId: js.UndefOr[string] = js.native
  /**
    * If set to passthrough for an audio-only MS Smooth output, the fragment absolute time will be set to the current timecode. This option does not write timecodes to the audio elementary stream.
    */
  var AudioOnlyTimecodeControl: js.UndefOr[SmoothGroupAudioOnlyTimecodeControl] = js.native
  /**
    * If set to verifyAuthenticity, verify the https certificate chain to a trusted Certificate Authority (CA).  This will cause https outputs to self-signed certificates to fail.
    */
  var CertificateMode: js.UndefOr[SmoothGroupCertificateMode] = js.native
  /**
    * Number of seconds to wait before retrying connection to the IIS server if the connection is lost. Content will be cached during this time and the cache will be be delivered to the IIS server once the connection is re-established.
    */
  var ConnectionRetryInterval: js.UndefOr[integerMin0] = js.native
  /**
    * Smooth Streaming publish point on an IIS server. Elemental Live acts as a "Push" encoder to IIS.
    */
  var Destination: OutputLocationRef = js.native
  /**
    * MS Smooth event ID to be sent to the IIS server.
  Should only be specified if eventIdMode is set to useConfigured.
    */
  var EventId: js.UndefOr[string] = js.native
  /**
    * Specifies whether or not to send an event ID to the IIS server. If no event ID is sent and the same Live Event is used without changing the publishing point, clients might see cached video from the previous run.
  Options:
  - "useConfigured" - use the value provided in eventId
  - "useTimestamp" - generate and send an event ID based on the current timestamp
  - "noEventId" - do not send an event ID to the IIS server.
    */
  var EventIdMode: js.UndefOr[SmoothGroupEventIdMode] = js.native
  /**
    * When set to sendEos, send EOS signal to IIS server when stopping the event
    */
  var EventStopBehavior: js.UndefOr[SmoothGroupEventStopBehavior] = js.native
  /**
    * Size in seconds of file cache for streaming outputs.
    */
  var FilecacheDuration: js.UndefOr[integerMin0] = js.native
  /**
    * Length of mp4 fragments to generate (in seconds). Fragment length must be compatible with GOP size and framerate.
    */
  var FragmentLength: js.UndefOr[integerMin1] = js.native
  /**
    * Parameter that control output group behavior on input loss.
    */
  var InputLossAction: js.UndefOr[InputLossActionForMsSmoothOut] = js.native
  /**
    * Number of retry attempts.
    */
  var NumRetries: js.UndefOr[integerMin0] = js.native
  /**
    * Number of seconds before initiating a restart due to output failure, due to exhausting the numRetries on one segment, or exceeding filecacheDuration.
    */
  var RestartDelay: js.UndefOr[integerMin0] = js.native
  /**
    * useInputSegmentation has been deprecated. The configured segment size is always used.
    */
  var SegmentationMode: js.UndefOr[SmoothGroupSegmentationMode] = js.native
  /**
    * Number of milliseconds to delay the output from the second pipeline.
    */
  var SendDelayMs: js.UndefOr[integerMin0Max10000] = js.native
  /**
    * If set to scte35, use incoming SCTE-35 messages to generate a sparse track in this group of MS-Smooth outputs.
    */
  var SparseTrackType: js.UndefOr[SmoothGroupSparseTrackType] = js.native
  /**
    * When set to send, send stream manifest so publishing point doesn't start until all streams start.
    */
  var StreamManifestBehavior: js.UndefOr[SmoothGroupStreamManifestBehavior] = js.native
  /**
    * Timestamp offset for the event.  Only used if timestampOffsetMode is set to useConfiguredOffset.
    */
  var TimestampOffset: js.UndefOr[string] = js.native
  /**
    * Type of timestamp date offset to use.
  - useEventStartDate: Use the date the event was started as the offset
  - useConfiguredOffset: Use an explicitly configured date as the offset
    */
  var TimestampOffsetMode: js.UndefOr[SmoothGroupTimestampOffsetMode] = js.native
}

object MsSmoothGroupSettings {
  @scala.inline
  def apply(
    Destination: OutputLocationRef,
    AcquisitionPointId: string = null,
    AudioOnlyTimecodeControl: SmoothGroupAudioOnlyTimecodeControl = null,
    CertificateMode: SmoothGroupCertificateMode = null,
    ConnectionRetryInterval: Int | Double = null,
    EventId: string = null,
    EventIdMode: SmoothGroupEventIdMode = null,
    EventStopBehavior: SmoothGroupEventStopBehavior = null,
    FilecacheDuration: Int | Double = null,
    FragmentLength: Int | Double = null,
    InputLossAction: InputLossActionForMsSmoothOut = null,
    NumRetries: Int | Double = null,
    RestartDelay: Int | Double = null,
    SegmentationMode: SmoothGroupSegmentationMode = null,
    SendDelayMs: Int | Double = null,
    SparseTrackType: SmoothGroupSparseTrackType = null,
    StreamManifestBehavior: SmoothGroupStreamManifestBehavior = null,
    TimestampOffset: string = null,
    TimestampOffsetMode: SmoothGroupTimestampOffsetMode = null
  ): MsSmoothGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    if (AcquisitionPointId != null) __obj.updateDynamic("AcquisitionPointId")(AcquisitionPointId.asInstanceOf[js.Any])
    if (AudioOnlyTimecodeControl != null) __obj.updateDynamic("AudioOnlyTimecodeControl")(AudioOnlyTimecodeControl.asInstanceOf[js.Any])
    if (CertificateMode != null) __obj.updateDynamic("CertificateMode")(CertificateMode.asInstanceOf[js.Any])
    if (ConnectionRetryInterval != null) __obj.updateDynamic("ConnectionRetryInterval")(ConnectionRetryInterval.asInstanceOf[js.Any])
    if (EventId != null) __obj.updateDynamic("EventId")(EventId.asInstanceOf[js.Any])
    if (EventIdMode != null) __obj.updateDynamic("EventIdMode")(EventIdMode.asInstanceOf[js.Any])
    if (EventStopBehavior != null) __obj.updateDynamic("EventStopBehavior")(EventStopBehavior.asInstanceOf[js.Any])
    if (FilecacheDuration != null) __obj.updateDynamic("FilecacheDuration")(FilecacheDuration.asInstanceOf[js.Any])
    if (FragmentLength != null) __obj.updateDynamic("FragmentLength")(FragmentLength.asInstanceOf[js.Any])
    if (InputLossAction != null) __obj.updateDynamic("InputLossAction")(InputLossAction.asInstanceOf[js.Any])
    if (NumRetries != null) __obj.updateDynamic("NumRetries")(NumRetries.asInstanceOf[js.Any])
    if (RestartDelay != null) __obj.updateDynamic("RestartDelay")(RestartDelay.asInstanceOf[js.Any])
    if (SegmentationMode != null) __obj.updateDynamic("SegmentationMode")(SegmentationMode.asInstanceOf[js.Any])
    if (SendDelayMs != null) __obj.updateDynamic("SendDelayMs")(SendDelayMs.asInstanceOf[js.Any])
    if (SparseTrackType != null) __obj.updateDynamic("SparseTrackType")(SparseTrackType.asInstanceOf[js.Any])
    if (StreamManifestBehavior != null) __obj.updateDynamic("StreamManifestBehavior")(StreamManifestBehavior.asInstanceOf[js.Any])
    if (TimestampOffset != null) __obj.updateDynamic("TimestampOffset")(TimestampOffset.asInstanceOf[js.Any])
    if (TimestampOffsetMode != null) __obj.updateDynamic("TimestampOffsetMode")(TimestampOffsetMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsSmoothGroupSettings]
  }
}

