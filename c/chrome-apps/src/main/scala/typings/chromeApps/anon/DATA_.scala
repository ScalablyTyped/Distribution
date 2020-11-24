package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.data_
import typings.chromeApps.chromeAppsStrings.explicitFeedback
import typings.chromeApps.chromeAppsStrings.feedback_
import typings.chromeApps.chromeAppsStrings.notification_
import typings.chromeApps.chromeAppsStrings.periodic_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DATA_ extends js.Object {
  
  var DATA: data_ = js.native
  
  var EXPLICIT_FEEDBACK: explicitFeedback = js.native
  
  var FEEDBACK: feedback_ = js.native
  
  var NOTIFICATION: notification_ = js.native
  
  var PERIODIC: periodic_ = js.native
}
object DATA_ {
  
  @scala.inline
  def apply(
    DATA: data_,
    EXPLICIT_FEEDBACK: explicitFeedback,
    FEEDBACK: feedback_,
    NOTIFICATION: notification_,
    PERIODIC: periodic_
  ): DATA_ = {
    val __obj = js.Dynamic.literal(DATA = DATA.asInstanceOf[js.Any], EXPLICIT_FEEDBACK = EXPLICIT_FEEDBACK.asInstanceOf[js.Any], FEEDBACK = FEEDBACK.asInstanceOf[js.Any], NOTIFICATION = NOTIFICATION.asInstanceOf[js.Any], PERIODIC = PERIODIC.asInstanceOf[js.Any])
    __obj.asInstanceOf[DATA_]
  }
  
  @scala.inline
  implicit class DATA_Ops[Self <: DATA_] (val x: Self) extends AnyVal {
    
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
    def setDATA(value: data_): Self = this.set("DATA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXPLICIT_FEEDBACK(value: explicitFeedback): Self = this.set("EXPLICIT_FEEDBACK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFEEDBACK(value: feedback_): Self = this.set("FEEDBACK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOTIFICATION(value: notification_): Self = this.set("NOTIFICATION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPERIODIC(value: periodic_): Self = this.set("PERIODIC", value.asInstanceOf[js.Any])
  }
}
