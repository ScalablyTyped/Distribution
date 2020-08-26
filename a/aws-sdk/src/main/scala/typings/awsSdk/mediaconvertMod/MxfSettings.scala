package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MxfSettings extends js.Object {
  /**
    * Optional. When you have AFD signaling set up in your output video stream, use this setting to choose whether to also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video stream for this output to the MXF wrapper. Regardless of which option you choose, the AFD values remain in the video stream. Related settings: To set up your output to include or exclude AFD values, see AfdSignaling, under VideoDescription. On the console, find AFD signaling under the output's video encoding settings.
    */
  var AfdSignaling: js.UndefOr[MxfAfdSignaling] = js.native
}

object MxfSettings {
  @scala.inline
  def apply(): MxfSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MxfSettings]
  }
  @scala.inline
  implicit class MxfSettingsOps[Self <: MxfSettings] (val x: Self) extends AnyVal {
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
    def setAfdSignaling(value: MxfAfdSignaling): Self = this.set("AfdSignaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfdSignaling: Self = this.set("AfdSignaling", js.undefined)
  }
  
}

