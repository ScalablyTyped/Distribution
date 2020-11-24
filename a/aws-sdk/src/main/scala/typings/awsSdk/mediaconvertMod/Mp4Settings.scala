package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mp4Settings extends js.Object {
  
  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  var CslgAtom: js.UndefOr[Mp4CslgAtom] = js.native
  
  /**
    * Ignore this setting unless compliance to the CTTS box version specification matters in your workflow. Specify a value of 1 to set your CTTS box version to 1 and make your output compliant with the specification. When you specify a value of 1, you must also set CSLG atom (cslgAtom) to the value INCLUDE. Keep the default value 0 to set your CTTS box version to 0. This can provide backward compatibility for some players and packagers.
    */
  var CttsVersion: js.UndefOr[integerMin0Max1] = js.native
  
  /**
    * Inserts a free-space box immediately after the moov box.
    */
  var FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox] = js.native
  
  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  var MoovPlacement: js.UndefOr[Mp4MoovPlacement] = js.native
  
  /**
    * Overrides the "Major Brand" field in the output file. Usually not necessary to specify.
    */
  var Mp4MajorBrand: js.UndefOr[string] = js.native
}
object Mp4Settings {
  
  @scala.inline
  def apply(): Mp4Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mp4Settings]
  }
  
  @scala.inline
  implicit class Mp4SettingsOps[Self <: Mp4Settings] (val x: Self) extends AnyVal {
    
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
    def setCslgAtom(value: Mp4CslgAtom): Self = this.set("CslgAtom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCslgAtom: Self = this.set("CslgAtom", js.undefined)
    
    @scala.inline
    def setCttsVersion(value: integerMin0Max1): Self = this.set("CttsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCttsVersion: Self = this.set("CttsVersion", js.undefined)
    
    @scala.inline
    def setFreeSpaceBox(value: Mp4FreeSpaceBox): Self = this.set("FreeSpaceBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreeSpaceBox: Self = this.set("FreeSpaceBox", js.undefined)
    
    @scala.inline
    def setMoovPlacement(value: Mp4MoovPlacement): Self = this.set("MoovPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoovPlacement: Self = this.set("MoovPlacement", js.undefined)
    
    @scala.inline
    def setMp4MajorBrand(value: string): Self = this.set("Mp4MajorBrand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMp4MajorBrand: Self = this.set("Mp4MajorBrand", js.undefined)
  }
}
