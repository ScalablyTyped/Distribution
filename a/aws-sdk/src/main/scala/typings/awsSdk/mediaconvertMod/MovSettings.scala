package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MovSettings extends js.Object {
  /**
    * When enabled, include 'clap' atom if appropriate for the video output settings.
    */
  var ClapAtom: js.UndefOr[MovClapAtom] = js.native
  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  var CslgAtom: js.UndefOr[MovCslgAtom] = js.native
  /**
    * When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable when the video codec is MPEG2.
    */
  var Mpeg2FourCCControl: js.UndefOr[MovMpeg2FourCCControl] = js.native
  /**
    * If set to OMNEON, inserts Omneon-compatible padding
    */
  var PaddingControl: js.UndefOr[MovPaddingControl] = js.native
  /**
    * Always keep the default value (SELF_CONTAINED) for this setting.
    */
  var Reference: js.UndefOr[MovReference] = js.native
}

object MovSettings {
  @scala.inline
  def apply(): MovSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovSettings]
  }
  @scala.inline
  implicit class MovSettingsOps[Self <: MovSettings] (val x: Self) extends AnyVal {
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
    def setClapAtom(value: MovClapAtom): Self = this.set("ClapAtom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClapAtom: Self = this.set("ClapAtom", js.undefined)
    @scala.inline
    def setCslgAtom(value: MovCslgAtom): Self = this.set("CslgAtom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCslgAtom: Self = this.set("CslgAtom", js.undefined)
    @scala.inline
    def setMpeg2FourCCControl(value: MovMpeg2FourCCControl): Self = this.set("Mpeg2FourCCControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpeg2FourCCControl: Self = this.set("Mpeg2FourCCControl", js.undefined)
    @scala.inline
    def setPaddingControl(value: MovPaddingControl): Self = this.set("PaddingControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingControl: Self = this.set("PaddingControl", js.undefined)
    @scala.inline
    def setReference(value: MovReference): Self = this.set("Reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("Reference", js.undefined)
  }
  
}

