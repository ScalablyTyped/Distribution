package typings.chromeApps.chrome.audio

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDeviceProperties extends js.Object {
  
  /**
    * The audio device's desired sound level. Defaults to the device's current sound level.
    * If used with audio input device, represents audio device gain.
    * If used with audio output device, represents audio device volume.
    */
  var level: js.UndefOr[integer] = js.native
}
object SetDeviceProperties {
  
  @scala.inline
  def apply(): SetDeviceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetDeviceProperties]
  }
  
  @scala.inline
  implicit class SetDevicePropertiesOps[Self <: SetDeviceProperties] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: integer): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
}
