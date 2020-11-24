package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AncillarySourceSettings extends js.Object {
  
  /**
    * Specifies the number (1 to 4) of the captions channel you want to extract from the ancillary captions. If you plan to convert the ancillary captions to another format, complete this field. If you plan to choose Embedded as the captions destination in the output (to pass through all the channels in the ancillary captions), leave this field blank because MediaLive ignores the field.
    */
  var SourceAncillaryChannelNumber: js.UndefOr[integerMin1Max4] = js.native
}
object AncillarySourceSettings {
  
  @scala.inline
  def apply(): AncillarySourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AncillarySourceSettings]
  }
  
  @scala.inline
  implicit class AncillarySourceSettingsOps[Self <: AncillarySourceSettings] (val x: Self) extends AnyVal {
    
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
    def setSourceAncillaryChannelNumber(value: integerMin1Max4): Self = this.set("SourceAncillaryChannelNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceAncillaryChannelNumber: Self = this.set("SourceAncillaryChannelNumber", js.undefined)
  }
}
