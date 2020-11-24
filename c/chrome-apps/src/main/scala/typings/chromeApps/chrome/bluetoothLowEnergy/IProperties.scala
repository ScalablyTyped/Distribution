package typings.chromeApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProperties extends js.Object {
  
  /**
    * Flag indicating whether a connection to the device is left open when the event page of the application is unloaded. The default value is false.
    * @see [HowToManageAppLifecycle]{@link https://developer.chrome.com/apps/app_lifecycle}
    * @default false
    */
  var persistent: Boolean = js.native
}
object IProperties {
  
  @scala.inline
  def apply(persistent: Boolean): IProperties = {
    val __obj = js.Dynamic.literal(persistent = persistent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProperties]
  }
  
  @scala.inline
  implicit class IPropertiesOps[Self <: IProperties] (val x: Self) extends AnyVal {
    
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
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
  }
}
