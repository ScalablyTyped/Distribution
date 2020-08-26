package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailSettings extends js.Object {
  var Scte35SpliceInsert: js.UndefOr[typings.awsSdk.medialiveMod.Scte35SpliceInsert] = js.native
  var Scte35TimeSignalApos: js.UndefOr[typings.awsSdk.medialiveMod.Scte35TimeSignalApos] = js.native
}

object AvailSettings {
  @scala.inline
  def apply(): AvailSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailSettings]
  }
  @scala.inline
  implicit class AvailSettingsOps[Self <: AvailSettings] (val x: Self) extends AnyVal {
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
    def setScte35SpliceInsert(value: Scte35SpliceInsert): Self = this.set("Scte35SpliceInsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScte35SpliceInsert: Self = this.set("Scte35SpliceInsert", js.undefined)
    @scala.inline
    def setScte35TimeSignalApos(value: Scte35TimeSignalApos): Self = this.set("Scte35TimeSignalApos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScte35TimeSignalApos: Self = this.set("Scte35TimeSignalApos", js.undefined)
  }
  
}

