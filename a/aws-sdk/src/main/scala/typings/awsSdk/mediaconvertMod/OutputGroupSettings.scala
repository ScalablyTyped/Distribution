package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputGroupSettings extends js.Object {
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to CMAF_GROUP_SETTINGS. Each output in a CMAF Output Group may only contain a single video, audio, or caption output.
    */
  var CmafGroupSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.CmafGroupSettings] = js.native
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to DASH_ISO_GROUP_SETTINGS.
    */
  var DashIsoGroupSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DashIsoGroupSettings] = js.native
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to FILE_GROUP_SETTINGS.
    */
  var FileGroupSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.FileGroupSettings] = js.native
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to HLS_GROUP_SETTINGS.
    */
  var HlsGroupSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.HlsGroupSettings] = js.native
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to MS_SMOOTH_GROUP_SETTINGS.
    */
  var MsSmoothGroupSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.MsSmoothGroupSettings] = js.native
  /**
    * Type of output group (File group, Apple HLS, DASH ISO, Microsoft Smooth Streaming, CMAF)
    */
  var Type: js.UndefOr[OutputGroupType] = js.native
}

object OutputGroupSettings {
  @scala.inline
  def apply(): OutputGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputGroupSettings]
  }
  @scala.inline
  implicit class OutputGroupSettingsOps[Self <: OutputGroupSettings] (val x: Self) extends AnyVal {
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
    def setCmafGroupSettings(value: CmafGroupSettings): Self = this.set("CmafGroupSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCmafGroupSettings: Self = this.set("CmafGroupSettings", js.undefined)
    @scala.inline
    def setDashIsoGroupSettings(value: DashIsoGroupSettings): Self = this.set("DashIsoGroupSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashIsoGroupSettings: Self = this.set("DashIsoGroupSettings", js.undefined)
    @scala.inline
    def setFileGroupSettings(value: FileGroupSettings): Self = this.set("FileGroupSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileGroupSettings: Self = this.set("FileGroupSettings", js.undefined)
    @scala.inline
    def setHlsGroupSettings(value: HlsGroupSettings): Self = this.set("HlsGroupSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHlsGroupSettings: Self = this.set("HlsGroupSettings", js.undefined)
    @scala.inline
    def setMsSmoothGroupSettings(value: MsSmoothGroupSettings): Self = this.set("MsSmoothGroupSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsSmoothGroupSettings: Self = this.set("MsSmoothGroupSettings", js.undefined)
    @scala.inline
    def setType(value: OutputGroupType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

