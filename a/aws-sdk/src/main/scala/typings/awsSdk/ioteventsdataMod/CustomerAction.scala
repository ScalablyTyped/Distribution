package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerAction extends StObject {
  
  /**
    * Contains the configuration information of an acknowledge action.
    */
  var acknowledgeActionConfiguration: js.UndefOr[AcknowledgeActionConfiguration] = js.undefined
  
  /**
    * The name of the action. The action name can be one of the following values:    SNOOZE - When you snooze the alarm, the alarm state changes to SNOOZE_DISABLED.    ENABLE - When you enable the alarm, the alarm state changes to NORMAL.    DISABLE - When you disable the alarm, the alarm state changes to DISABLED.    ACKNOWLEDGE - When you acknowledge the alarm, the alarm state changes to ACKNOWLEDGED.    RESET - When you reset the alarm, the alarm state changes to NORMAL.   For more information, see the AlarmState API.
    */
  var actionName: js.UndefOr[CustomerActionName] = js.undefined
  
  /**
    * Contains the configuration information of a disable action.
    */
  var disableActionConfiguration: js.UndefOr[DisableActionConfiguration] = js.undefined
  
  /**
    * Contains the configuration information of an enable action.
    */
  var enableActionConfiguration: js.UndefOr[EnableActionConfiguration] = js.undefined
  
  /**
    * Contains the configuration information of a reset action.
    */
  var resetActionConfiguration: js.UndefOr[ResetActionConfiguration] = js.undefined
  
  /**
    * Contains the configuration information of a snooze action.
    */
  var snoozeActionConfiguration: js.UndefOr[SnoozeActionConfiguration] = js.undefined
}
object CustomerAction {
  
  inline def apply(): CustomerAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerAction]
  }
  
  extension [Self <: CustomerAction](x: Self) {
    
    inline def setAcknowledgeActionConfiguration(value: AcknowledgeActionConfiguration): Self = StObject.set(x, "acknowledgeActionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgeActionConfigurationUndefined: Self = StObject.set(x, "acknowledgeActionConfiguration", js.undefined)
    
    inline def setActionName(value: CustomerActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    inline def setDisableActionConfiguration(value: DisableActionConfiguration): Self = StObject.set(x, "disableActionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDisableActionConfigurationUndefined: Self = StObject.set(x, "disableActionConfiguration", js.undefined)
    
    inline def setEnableActionConfiguration(value: EnableActionConfiguration): Self = StObject.set(x, "enableActionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEnableActionConfigurationUndefined: Self = StObject.set(x, "enableActionConfiguration", js.undefined)
    
    inline def setResetActionConfiguration(value: ResetActionConfiguration): Self = StObject.set(x, "resetActionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setResetActionConfigurationUndefined: Self = StObject.set(x, "resetActionConfiguration", js.undefined)
    
    inline def setSnoozeActionConfiguration(value: SnoozeActionConfiguration): Self = StObject.set(x, "snoozeActionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSnoozeActionConfigurationUndefined: Self = StObject.set(x, "snoozeActionConfiguration", js.undefined)
  }
}
