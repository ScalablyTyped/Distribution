package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexProgramPacketIdentifiersMap extends js.Object {
  var AudioPids: js.UndefOr[listOfInteger] = js.native
  var DvbSubPids: js.UndefOr[listOfInteger] = js.native
  var DvbTeletextPid: js.UndefOr[integer] = js.native
  var EtvPlatformPid: js.UndefOr[integer] = js.native
  var EtvSignalPid: js.UndefOr[integer] = js.native
  var KlvDataPids: js.UndefOr[listOfInteger] = js.native
  var PcrPid: js.UndefOr[integer] = js.native
  var PmtPid: js.UndefOr[integer] = js.native
  var PrivateMetadataPid: js.UndefOr[integer] = js.native
  var Scte27Pids: js.UndefOr[listOfInteger] = js.native
  var Scte35Pid: js.UndefOr[integer] = js.native
  var TimedMetadataPid: js.UndefOr[integer] = js.native
  var VideoPid: js.UndefOr[integer] = js.native
}

object MultiplexProgramPacketIdentifiersMap {
  @scala.inline
  def apply(
    AudioPids: listOfInteger = null,
    DvbSubPids: listOfInteger = null,
    DvbTeletextPid: Int | Double = null,
    EtvPlatformPid: Int | Double = null,
    EtvSignalPid: Int | Double = null,
    KlvDataPids: listOfInteger = null,
    PcrPid: Int | Double = null,
    PmtPid: Int | Double = null,
    PrivateMetadataPid: Int | Double = null,
    Scte27Pids: listOfInteger = null,
    Scte35Pid: Int | Double = null,
    TimedMetadataPid: Int | Double = null,
    VideoPid: Int | Double = null
  ): MultiplexProgramPacketIdentifiersMap = {
    val __obj = js.Dynamic.literal()
    if (AudioPids != null) __obj.updateDynamic("AudioPids")(AudioPids.asInstanceOf[js.Any])
    if (DvbSubPids != null) __obj.updateDynamic("DvbSubPids")(DvbSubPids.asInstanceOf[js.Any])
    if (DvbTeletextPid != null) __obj.updateDynamic("DvbTeletextPid")(DvbTeletextPid.asInstanceOf[js.Any])
    if (EtvPlatformPid != null) __obj.updateDynamic("EtvPlatformPid")(EtvPlatformPid.asInstanceOf[js.Any])
    if (EtvSignalPid != null) __obj.updateDynamic("EtvSignalPid")(EtvSignalPid.asInstanceOf[js.Any])
    if (KlvDataPids != null) __obj.updateDynamic("KlvDataPids")(KlvDataPids.asInstanceOf[js.Any])
    if (PcrPid != null) __obj.updateDynamic("PcrPid")(PcrPid.asInstanceOf[js.Any])
    if (PmtPid != null) __obj.updateDynamic("PmtPid")(PmtPid.asInstanceOf[js.Any])
    if (PrivateMetadataPid != null) __obj.updateDynamic("PrivateMetadataPid")(PrivateMetadataPid.asInstanceOf[js.Any])
    if (Scte27Pids != null) __obj.updateDynamic("Scte27Pids")(Scte27Pids.asInstanceOf[js.Any])
    if (Scte35Pid != null) __obj.updateDynamic("Scte35Pid")(Scte35Pid.asInstanceOf[js.Any])
    if (TimedMetadataPid != null) __obj.updateDynamic("TimedMetadataPid")(TimedMetadataPid.asInstanceOf[js.Any])
    if (VideoPid != null) __obj.updateDynamic("VideoPid")(VideoPid.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexProgramPacketIdentifiersMap]
  }
}

