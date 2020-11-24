package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiplexStatmuxVideoSettings extends js.Object {
  
  /**
    * Maximum statmux bitrate.
    */
  var MaximumBitrate: js.UndefOr[integerMin100000Max100000000] = js.native
  
  /**
    * Minimum statmux bitrate.
    */
  var MinimumBitrate: js.UndefOr[integerMin100000Max100000000] = js.native
  
  /**
    * The purpose of the priority is to use a combination of the\nmultiplex rate control algorithm and the QVBR capability of the\nencoder to prioritize the video quality of some channels in a\nmultiplex over others.  Channels that have a higher priority will\nget higher video quality at the expense of the video quality of\nother channels in the multiplex with lower priority.
    */
  var Priority: js.UndefOr[integerMinNegative5Max5] = js.native
}
object MultiplexStatmuxVideoSettings {
  
  @scala.inline
  def apply(): MultiplexStatmuxVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexStatmuxVideoSettings]
  }
  
  @scala.inline
  implicit class MultiplexStatmuxVideoSettingsOps[Self <: MultiplexStatmuxVideoSettings] (val x: Self) extends AnyVal {
    
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
    def setMaximumBitrate(value: integerMin100000Max100000000): Self = this.set("MaximumBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumBitrate: Self = this.set("MaximumBitrate", js.undefined)
    
    @scala.inline
    def setMinimumBitrate(value: integerMin100000Max100000000): Self = this.set("MinimumBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumBitrate: Self = this.set("MinimumBitrate", js.undefined)
    
    @scala.inline
    def setPriority(value: integerMinNegative5Max5): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
  }
}
