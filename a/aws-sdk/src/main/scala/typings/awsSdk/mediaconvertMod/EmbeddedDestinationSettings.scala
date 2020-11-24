package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedDestinationSettings extends js.Object {
  
  /**
    * Ignore this setting unless your input captions are SCC format and your output captions are embedded in the video stream. Specify a CC number for each captions channel in this output. If you have two channels, choose CC numbers that aren't in the same field. For example, choose 1 and 3. For more information, see https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
    */
  var Destination608ChannelNumber: js.UndefOr[integerMin1Max4] = js.native
  
  /**
    * Ignore this setting unless your input captions are SCC format and you want both 608 and 708 captions embedded in your output stream. Optionally, specify the 708 service number for each output captions channel. Choose a different number for each channel. To use this setting, also set Force 608 to 708 upconvert (Convert608To708) to Upconvert (UPCONVERT) in your input captions selector settings. If you choose to upconvert but don't specify a 708 service number, MediaConvert uses the number that you specify for CC channel number (destination608ChannelNumber) for the 708 service number. For more information, see https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
    */
  var Destination708ServiceNumber: js.UndefOr[integerMin1Max6] = js.native
}
object EmbeddedDestinationSettings {
  
  @scala.inline
  def apply(): EmbeddedDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedDestinationSettings]
  }
  
  @scala.inline
  implicit class EmbeddedDestinationSettingsOps[Self <: EmbeddedDestinationSettings] (val x: Self) extends AnyVal {
    
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
    def setDestination608ChannelNumber(value: integerMin1Max4): Self = this.set("Destination608ChannelNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination608ChannelNumber: Self = this.set("Destination608ChannelNumber", js.undefined)
    
    @scala.inline
    def setDestination708ServiceNumber(value: integerMin1Max6): Self = this.set("Destination708ServiceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination708ServiceNumber: Self = this.set("Destination708ServiceNumber", js.undefined)
  }
}
