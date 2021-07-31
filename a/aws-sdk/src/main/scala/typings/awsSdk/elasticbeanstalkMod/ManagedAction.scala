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
  var WindowStartTime: js.UndefOr[Timestamp] = js.undefined
}
object ManagedAction {
  
  @scala.inline
  def apply(): ManagedAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAction]
  }
  
  @scala.inline
  implicit class ManagedActionMutableBuilder[Self <: ManagedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionDescription(value: String): Self = StObject.set(x, "ActionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionDescriptionUndefined: Self = StObject.set(x, "ActionDescription", js.undefined)
    
    @scala.inline
    def setActionId(value: String): Self = StObject.set(x, "ActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "ActionId", js.undefined)
    
    @scala.inline
    def setActionType(value: ActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "ActionType", js.undefined)
    
    @scala.inline
    def setStatus(value: ActionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setWindowStartTime(value: Timestamp): Self = StObject.set(x, "WindowStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowStartTimeUndefined: Self = StObject.set(x, "WindowStartTime", js.undefined)
  }
}
