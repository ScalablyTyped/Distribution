package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePresetResponse extends js.Object {
  
  /**
    * A preset is a collection of preconfigured media conversion settings that you want MediaConvert to apply to the output during the conversion process.
    */
  var Preset: js.UndefOr[typings.awsSdk.mediaconvertMod.Preset] = js.native
}
object UpdatePresetResponse {
  
  @scala.inline
  def apply(): UpdatePresetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePresetResponse]
  }
  
  @scala.inline
  implicit class UpdatePresetResponseOps[Self <: UpdatePresetResponse] (val x: Self) extends AnyVal {
    
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
    def setPreset(value: Preset): Self = this.set("Preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("Preset", js.undefined)
  }
}
