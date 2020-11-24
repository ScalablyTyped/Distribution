package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsConfiguration extends js.Object {
  
  /**
    * Set the InsightsEnabled value to true to enable insights or false to disable insights.
    */
  var InsightsEnabled: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be enabled on a group with InsightsEnabled set to true.
    */
  var NotificationsEnabled: js.UndefOr[NullableBoolean] = js.native
}
object InsightsConfiguration {
  
  @scala.inline
  def apply(): InsightsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightsConfiguration]
  }
  
  @scala.inline
  implicit class InsightsConfigurationOps[Self <: InsightsConfiguration] (val x: Self) extends AnyVal {
    
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
    def setInsightsEnabled(value: NullableBoolean): Self = this.set("InsightsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsightsEnabled: Self = this.set("InsightsEnabled", js.undefined)
    
    @scala.inline
    def setNotificationsEnabled(value: NullableBoolean): Self = this.set("NotificationsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationsEnabled: Self = this.set("NotificationsEnabled", js.undefined)
  }
}
