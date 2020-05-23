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
    DvbTeletextPid: js.UndefOr[integer] = js.undefined,
    EtvPlatformPid: js.UndefOr[integer] = js.undefined,
    EtvSignalPid: js.UndefOr[integer] = js.undefined,
    KlvDataPids: listOfInteger = null,
    PcrPid: js.UndefOr[integer] = js.undefined,
    PmtPid: js.UndefOr[integer] = js.undefined,
    PrivateMetadataPid: js.UndefOr[integer] = js.undefined,
    Scte27Pids: listOfInteger = null,
    Scte35Pid: js.UndefOr[integer] = js.undefined,
    TimedMetadataPid: js.UndefOr[integer] = js.undefined,
    VideoPid: js.UndefOr[integer] = js.undefined
  ): MultiplexProgramPacketIdentifiersMap = {
    val __obj = js.Dynamic.literal()
    if (AudioPids != null) __obj.updateDynamic("AudioPids")(AudioPids.asInstanceOf[js.Any])
    if (DvbSubPids != null) __obj.updateDynamic("DvbSubPids")(DvbSubPids.asInstanceOf[js.Any])
    if (!js.isUndefined(DvbTeletextPid)) __obj.updateDynamic("DvbTeletextPid")(DvbTeletextPid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EtvPlatformPid)) __obj.updateDynamic("EtvPlatformPid")(EtvPlatformPid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EtvSignalPid)) __obj.updateDynamic("EtvSignalPid")(EtvSignalPid.get.asInstanceOf[js.Any])
    if (KlvDataPids != null) __obj.updateDynamic("KlvDataPids")(KlvDataPids.asInstanceOf[js.Any])
    if (!js.isUndefined(PcrPid)) __obj.updateDynamic("PcrPid")(PcrPid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PmtPid)) __obj.updateDynamic("PmtPid")(PmtPid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PrivateMetadataPid)) __obj.updateDynamic("PrivateMetadataPid")(PrivateMetadataPid.get.asInstanceOf[js.Any])
    if (Scte27Pids != null) __obj.updateDynamic("Scte27Pids")(Scte27Pids.asInstanceOf[js.Any])
    if (!js.isUndefined(Scte35Pid)) __obj.updateDynamic("Scte35Pid")(Scte35Pid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TimedMetadataPid)) __obj.updateDynamic("TimedMetadataPid")(TimedMetadataPid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(VideoPid)) __obj.updateDynamic("VideoPid")(VideoPid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexProgramPacketIdentifiersMap]
  }
}

