package typings.chrome.chrome.system.display

import typings.chrome.chromeStrings.mixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MirrorModeInfoMixed extends MirrorModeInfo {
  /** The ids of the mirroring destination displays. */
  var mirroringDestinationIds: js.UndefOr[js.Array[String]] = js.native
  var mirroringSourceId: js.UndefOr[String] = js.native
  @JSName("mode")
  var mode_MirrorModeInfoMixed: mixed = js.native
}

object MirrorModeInfoMixed {
  @scala.inline
  def apply(mode: mixed): MirrorModeInfoMixed = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MirrorModeInfoMixed]
  }
  @scala.inline
  implicit class MirrorModeInfoMixedOps[Self <: MirrorModeInfoMixed] (val x: Self) extends AnyVal {
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
    def setMode(value: mixed): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMirroringDestinationIdsVarargs(value: String*): Self = this.set("mirroringDestinationIds", js.Array(value :_*))
    @scala.inline
    def setMirroringDestinationIds(value: js.Array[String]): Self = this.set("mirroringDestinationIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirroringDestinationIds: Self = this.set("mirroringDestinationIds", js.undefined)
    @scala.inline
    def setMirroringSourceId(value: String): Self = this.set("mirroringSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirroringSourceId: Self = this.set("mirroringSourceId", js.undefined)
  }
  
}

