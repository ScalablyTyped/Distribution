package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadPresetResponse extends js.Object {
  
  /**
    * A section of the response body that provides information about the preset.
    */
  var Preset: js.UndefOr[typings.awsSdk.elastictranscoderMod.Preset] = js.native
}
object ReadPresetResponse {
  
  @scala.inline
  def apply(): ReadPresetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadPresetResponse]
  }
  
  @scala.inline
  implicit class ReadPresetResponseOps[Self <: ReadPresetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPreset(value: Preset): Self = this.set("Preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("Preset", js.undefined)
  }
}
