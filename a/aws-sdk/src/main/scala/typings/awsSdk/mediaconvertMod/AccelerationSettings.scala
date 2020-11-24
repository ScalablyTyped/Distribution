package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccelerationSettings extends js.Object {
  
  /**
    * Specify the conditions when the service will run your job with accelerated transcoding.
    */
  var Mode: AccelerationMode = js.native
}
object AccelerationSettings {
  
  @scala.inline
  def apply(Mode: AccelerationMode): AccelerationSettings = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerationSettings]
  }
  
  @scala.inline
  implicit class AccelerationSettingsOps[Self <: AccelerationSettings] (val x: Self) extends AnyVal {
    
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
    def setMode(value: AccelerationMode): Self = this.set("Mode", value.asInstanceOf[js.Any])
  }
}
