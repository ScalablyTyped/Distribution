package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiplexVideoSettings extends js.Object {
  
  /**
    * The constant bitrate configuration for the video encode.
  When this field is defined, StatmuxSettings must be undefined.
    */
  var ConstantBitrate: js.UndefOr[integerMin100000Max100000000] = js.native
  
  /**
    * Statmux rate control settings.
  When this field is defined, ConstantBitrate must be undefined.
    */
  var StatmuxSettings: js.UndefOr[MultiplexStatmuxVideoSettings] = js.native
}
object MultiplexVideoSettings {
  
  @scala.inline
  def apply(): MultiplexVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexVideoSettings]
  }
  
  @scala.inline
  implicit class MultiplexVideoSettingsOps[Self <: MultiplexVideoSettings] (val x: Self) extends AnyVal {
    
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
    def setConstantBitrate(value: integerMin100000Max100000000): Self = this.set("ConstantBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstantBitrate: Self = this.set("ConstantBitrate", js.undefined)
    
    @scala.inline
    def setStatmuxSettings(value: MultiplexStatmuxVideoSettings): Self = this.set("StatmuxSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatmuxSettings: Self = this.set("StatmuxSettings", js.undefined)
  }
}
