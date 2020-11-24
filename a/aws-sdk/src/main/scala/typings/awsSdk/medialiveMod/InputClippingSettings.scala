package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputClippingSettings extends js.Object {
  
  /**
    * The source of the timecodes in the source being clipped.
    */
  var InputTimecodeSource: typings.awsSdk.medialiveMod.InputTimecodeSource = js.native
  
  /**
    * Settings to identify the start of the clip.
    */
  var StartTimecode: js.UndefOr[typings.awsSdk.medialiveMod.StartTimecode] = js.native
  
  /**
    * Settings to identify the end of the clip.
    */
  var StopTimecode: js.UndefOr[typings.awsSdk.medialiveMod.StopTimecode] = js.native
}
object InputClippingSettings {
  
  @scala.inline
  def apply(InputTimecodeSource: InputTimecodeSource): InputClippingSettings = {
    val __obj = js.Dynamic.literal(InputTimecodeSource = InputTimecodeSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputClippingSettings]
  }
  
  @scala.inline
  implicit class InputClippingSettingsOps[Self <: InputClippingSettings] (val x: Self) extends AnyVal {
    
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
    def setInputTimecodeSource(value: InputTimecodeSource): Self = this.set("InputTimecodeSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimecode(value: StartTimecode): Self = this.set("StartTimecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimecode: Self = this.set("StartTimecode", js.undefined)
    
    @scala.inline
    def setStopTimecode(value: StopTimecode): Self = this.set("StopTimecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopTimecode: Self = this.set("StopTimecode", js.undefined)
  }
}
