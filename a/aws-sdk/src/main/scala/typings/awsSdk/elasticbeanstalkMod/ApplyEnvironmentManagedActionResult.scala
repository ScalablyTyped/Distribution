package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyEnvironmentManagedActionResult extends StObject {
  
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The action ID of the managed action.
    */
  var ActionId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of managed action.
    */
  var ActionType: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ActionType] = js.undefined
  
  /**
    * The status of the managed action.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object ApplyEnvironmentManagedActionResult {
  
  @scala.inline
  def apply(): ApplyEnvironmentManagedActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyEnvironmentManagedActionResult]
  }
  
  @scala.inline
  implicit class ApplyEnvironmentManagedActionResultMutableBuilder[Self <: ApplyEnvironmentManagedActionResult] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
