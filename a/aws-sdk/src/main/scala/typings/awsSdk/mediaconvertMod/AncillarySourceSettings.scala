package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AncillarySourceSettings extends js.Object {
  
  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  var Convert608To708: js.UndefOr[AncillaryConvert608To708] = js.native
  
  /**
    * Specifies the 608 channel number in the ancillary data track from which to extract captions. Unused for passthrough.
    */
  var SourceAncillaryChannelNumber: js.UndefOr[integerMin1Max4] = js.native
  
  /**
    * By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
    */
  var TerminateCaptions: js.UndefOr[AncillaryTerminateCaptions] = js.native
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
    def setConvert608To708(value: AncillaryConvert608To708): Self = this.set("Convert608To708", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvert608To708: Self = this.set("Convert608To708", js.undefined)
    
    @scala.inline
    def setSourceAncillaryChannelNumber(value: integerMin1Max4): Self = this.set("SourceAncillaryChannelNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceAncillaryChannelNumber: Self = this.set("SourceAncillaryChannelNumber", js.undefined)
    
    @scala.inline
    def setTerminateCaptions(value: AncillaryTerminateCaptions): Self = this.set("TerminateCaptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminateCaptions: Self = this.set("TerminateCaptions", js.undefined)
  }
}
