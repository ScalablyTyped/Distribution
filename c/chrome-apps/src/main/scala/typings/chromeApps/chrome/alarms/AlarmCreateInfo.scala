package typings.chromeApps.chrome.alarms

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlarmCreateInfo extends js.Object {
  
  /** Length of time in minutes after which the onAlarm event should fire.  */
  var delayInMinutes: js.UndefOr[integer] = js.native
  
  /** If set, the onAlarm event should fire every periodInMinutes minutes after the initial event specified by when or delayInMinutes. If not set, the alarm will only fire once.  */
  var periodInMinutes: js.UndefOr[integer] = js.native
  
  /** Time at which the alarm should fire, in milliseconds past the epoch (e.g. Date.now() + n).  */
  var when: js.UndefOr[integer] = js.native
}
object AlarmCreateInfo {
  
  @scala.inline
  def apply(): AlarmCreateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmCreateInfo]
  }
  
  @scala.inline
  implicit class AlarmCreateInfoOps[Self <: AlarmCreateInfo] (val x: Self) extends AnyVal {
    
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
    def setDelayInMinutes(value: integer): Self = this.set("delayInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayInMinutes: Self = this.set("delayInMinutes", js.undefined)
    
    @scala.inline
    def setPeriodInMinutes(value: integer): Self = this.set("periodInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodInMinutes: Self = this.set("periodInMinutes", js.undefined)
    
    @scala.inline
    def setWhen(value: integer): Self = this.set("when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
}
