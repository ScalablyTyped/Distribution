package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TtmlDestinationSettings extends js.Object {
  
  /**
    * Pass through style and position information from a TTML-like input source (TTML, SMPTE-TT) to the TTML output.
    */
  var StylePassthrough: js.UndefOr[TtmlStylePassthrough] = js.native
}
object TtmlDestinationSettings {
  
  @scala.inline
  def apply(): TtmlDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TtmlDestinationSettings]
  }
  
  @scala.inline
  implicit class TtmlDestinationSettingsOps[Self <: TtmlDestinationSettings] (val x: Self) extends AnyVal {
    
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
    def setStylePassthrough(value: TtmlStylePassthrough): Self = this.set("StylePassthrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylePassthrough: Self = this.set("StylePassthrough", js.undefined)
  }
}
