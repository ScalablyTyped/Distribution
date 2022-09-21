package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedAction extends StObject {
  
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for the managed action.
    */
  var ActionId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of managed action.
    */
  var ActionType: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ActionType] = js.undefined
  
  /**
    * The status of the managed action. If the action is Scheduled, you can apply it immediately with ApplyEnvironmentManagedAction.
    */
  var Status: js.UndefOr[ActionStatus] = js.undefined
  
  /**
    * The start time of the maintenance window in which the managed action will execute.
    */
  var WindowStartTime: js.UndefOr[js.Date] = js.undefined
}
object ManagedAction {
  
  inline def apply(): ManagedAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAction]
  }
  
  extension [Self <: ManagedAction](x: Self) {
    
    inline def setActionDescription(value: String): Self = StObject.set(x, "ActionDescription", value.asInstanceOf[js.Any])
    
    inline def setActionDescriptionUndefined: Self = StObject.set(x, "ActionDescription", js.undefined)
    
    inline def setActionId(value: String): Self = StObject.set(x, "ActionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdUndefined: Self = StObject.set(x, "ActionId", js.undefined)
    
    inline def setActionType(value: ActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "ActionType", js.undefined)
    
    inline def setStatus(value: ActionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setWindowStartTime(value: js.Date): Self = StObject.set(x, "WindowStartTime", value.asInstanceOf[js.Any])
    
    inline def setWindowStartTimeUndefined: Self = StObject.set(x, "WindowStartTime", js.undefined)
  }
}
