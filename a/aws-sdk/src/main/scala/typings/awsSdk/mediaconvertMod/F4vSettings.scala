package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait F4vSettings extends js.Object {
  
  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  var MoovPlacement: js.UndefOr[F4vMoovPlacement] = js.native
}
object F4vSettings {
  
  @scala.inline
  def apply(): F4vSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[F4vSettings]
  }
  
  @scala.inline
  implicit class F4vSettingsOps[Self <: F4vSettings] (val x: Self) extends AnyVal {
    
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
    def setMoovPlacement(value: F4vMoovPlacement): Self = this.set("MoovPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoovPlacement: Self = this.set("MoovPlacement", js.undefined)
  }
}
