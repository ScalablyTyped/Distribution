package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsConfiguration extends StObject {
  
  /**
    * Set the InsightsEnabled value to true to enable insights or false to disable insights.
    */
  var InsightsEnabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be enabled on a group with InsightsEnabled set to true.
    */
  var NotificationsEnabled: js.UndefOr[NullableBoolean] = js.undefined
}
object InsightsConfiguration {
  
  @scala.inline
  def apply(): InsightsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightsConfiguration]
  }
  
  @scala.inline
  implicit class InsightsConfigurationMutableBuilder[Self <: InsightsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsightsEnabled(value: NullableBoolean): Self = StObject.set(x, "InsightsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightsEnabledUndefined: Self = StObject.set(x, "InsightsEnabled", js.undefined)
    
    @scala.inline
    def setNotificationsEnabled(value: NullableBoolean): Self = StObject.set(x, "NotificationsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsEnabledUndefined: Self = StObject.set(x, "NotificationsEnabled", js.undefined)
  }
}
