package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSettings extends js.Object {
  var ArchiveOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.ArchiveOutputSettings] = js.native
  var FrameCaptureOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.FrameCaptureOutputSettings] = js.native
  var HlsOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsOutputSettings] = js.native
  var MediaPackageOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.MediaPackageOutputSettings] = js.native
  var MsSmoothOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.MsSmoothOutputSettings] = js.native
  var MultiplexOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexOutputSettings] = js.native
  var RtmpOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.RtmpOutputSettings] = js.native
  var UdpOutputSettings: js.UndefOr[typings.awsSdk.medialiveMod.UdpOutputSettings] = js.native
}

object OutputSettings {
  @scala.inline
  def apply(
    ArchiveOutputSettings: ArchiveOutputSettings = null,
    FrameCaptureOutputSettings: FrameCaptureOutputSettings = null,
    HlsOutputSettings: HlsOutputSettings = null,
    MediaPackageOutputSettings: MediaPackageOutputSettings = null,
    MsSmoothOutputSettings: MsSmoothOutputSettings = null,
    MultiplexOutputSettings: MultiplexOutputSettings = null,
    RtmpOutputSettings: RtmpOutputSettings = null,
    UdpOutputSettings: UdpOutputSettings = null
  ): OutputSettings = {
    val __obj = js.Dynamic.literal()
    if (ArchiveOutputSettings != null) __obj.updateDynamic("ArchiveOutputSettings")(ArchiveOutputSettings.asInstanceOf[js.Any])
    if (FrameCaptureOutputSettings != null) __obj.updateDynamic("FrameCaptureOutputSettings")(FrameCaptureOutputSettings.asInstanceOf[js.Any])
    if (HlsOutputSettings != null) __obj.updateDynamic("HlsOutputSettings")(HlsOutputSettings.asInstanceOf[js.Any])
    if (MediaPackageOutputSettings != null) __obj.updateDynamic("MediaPackageOutputSettings")(MediaPackageOutputSettings.asInstanceOf[js.Any])
    if (MsSmoothOutputSettings != null) __obj.updateDynamic("MsSmoothOutputSettings")(MsSmoothOutputSettings.asInstanceOf[js.Any])
    if (MultiplexOutputSettings != null) __obj.updateDynamic("MultiplexOutputSettings")(MultiplexOutputSettings.asInstanceOf[js.Any])
    if (RtmpOutputSettings != null) __obj.updateDynamic("RtmpOutputSettings")(RtmpOutputSettings.asInstanceOf[js.Any])
    if (UdpOutputSettings != null) __obj.updateDynamic("UdpOutputSettings")(UdpOutputSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSettings]
  }
}

