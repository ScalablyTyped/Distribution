package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsSmoothGroupSettings extends js.Object {
  /**
    * The ID to include in each message in the sparse track. Ignored if sparseTrackType is NONE.
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
    * Identifies the type of data to place in the sparse track:
  - SCTE35: Insert SCTE-35 messages from the source content. With each message, insert an IDR frame to start a new segment.
  - SCTE35_WITHOUT_SEGMENTATION: Insert SCTE-35 messages from the source content. With each message, insert an IDR frame but don't start a new segment.
  - NONE: Don't generate a sparse track for any outputs in this output group.
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
  def apply(Destination: OutputLocationRef): MsSmoothGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsSmoothGroupSettings]
  }
  @scala.inline
  implicit class MsSmoothGroupSettingsOps[Self <: MsSmoothGroupSettings] (val x: Self) extends AnyVal {
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
    def setDestination(value: OutputLocationRef): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcquisitionPointId(value: string): Self = this.set("AcquisitionPointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcquisitionPointId: Self = this.set("AcquisitionPointId", js.undefined)
    @scala.inline
    def setAudioOnlyTimecodeControl(value: SmoothGroupAudioOnlyTimecodeControl): Self = this.set("AudioOnlyTimecodeControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioOnlyTimecodeControl: Self = this.set("AudioOnlyTimecodeControl", js.undefined)
    @scala.inline
    def setCertificateMode(value: SmoothGroupCertificateMode): Self = this.set("CertificateMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateMode: Self = this.set("CertificateMode", js.undefined)
    @scala.inline
    def setConnectionRetryInterval(value: integerMin0): Self = this.set("ConnectionRetryInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionRetryInterval: Self = this.set("ConnectionRetryInterval", js.undefined)
    @scala.inline
    def setEventId(value: string): Self = this.set("EventId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventId: Self = this.set("EventId", js.undefined)
    @scala.inline
    def setEventIdMode(value: SmoothGroupEventIdMode): Self = this.set("EventIdMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventIdMode: Self = this.set("EventIdMode", js.undefined)
    @scala.inline
    def setEventStopBehavior(value: SmoothGroupEventStopBehavior): Self = this.set("EventStopBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventStopBehavior: Self = this.set("EventStopBehavior", js.undefined)
    @scala.inline
    def setFilecacheDuration(value: integerMin0): Self = this.set("FilecacheDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilecacheDuration: Self = this.set("FilecacheDuration", js.undefined)
    @scala.inline
    def setFragmentLength(value: integerMin1): Self = this.set("FragmentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentLength: Self = this.set("FragmentLength", js.undefined)
    @scala.inline
    def setInputLossAction(value: InputLossActionForMsSmoothOut): Self = this.set("InputLossAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputLossAction: Self = this.set("InputLossAction", js.undefined)
    @scala.inline
    def setNumRetries(value: integerMin0): Self = this.set("NumRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumRetries: Self = this.set("NumRetries", js.undefined)
    @scala.inline
    def setRestartDelay(value: integerMin0): Self = this.set("RestartDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestartDelay: Self = this.set("RestartDelay", js.undefined)
    @scala.inline
    def setSegmentationMode(value: SmoothGroupSegmentationMode): Self = this.set("SegmentationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentationMode: Self = this.set("SegmentationMode", js.undefined)
    @scala.inline
    def setSendDelayMs(value: integerMin0Max10000): Self = this.set("SendDelayMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendDelayMs: Self = this.set("SendDelayMs", js.undefined)
    @scala.inline
    def setSparseTrackType(value: SmoothGroupSparseTrackType): Self = this.set("SparseTrackType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSparseTrackType: Self = this.set("SparseTrackType", js.undefined)
    @scala.inline
    def setStreamManifestBehavior(value: SmoothGroupStreamManifestBehavior): Self = this.set("StreamManifestBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamManifestBehavior: Self = this.set("StreamManifestBehavior", js.undefined)
    @scala.inline
    def setTimestampOffset(value: string): Self = this.set("TimestampOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampOffset: Self = this.set("TimestampOffset", js.undefined)
    @scala.inline
    def setTimestampOffsetMode(value: SmoothGroupTimestampOffsetMode): Self = this.set("TimestampOffsetMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampOffsetMode: Self = this.set("TimestampOffsetMode", js.undefined)
  }
  
}

