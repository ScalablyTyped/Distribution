package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMitigationActionRequest extends StObject {
  
  /**
    * The friendly name for the mitigation action. You can't change the name by using UpdateMitigationAction. Instead, you must delete and re-create the mitigation action with the new name.
    */
  var actionName: MitigationActionName
  
  /**
    * Defines the type of action and the parameters for that action.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.undefined
  
  /**
    * The ARN of the IAM role that is used to apply the mitigation action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object UpdateMitigationActionRequest {
  
  @scala.inline
  def apply(actionName: MitigationActionName): UpdateMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMitigationActionRequest]
  }
  
  @scala.inline
  implicit class UpdateMitigationActionRequestMutableBuilder[Self <: UpdateMitigationActionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionName(value: MitigationActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionParams(value: MitigationActionParams): Self = StObject.set(x, "actionParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionParamsUndefined: Self = StObject.set(x, "actionParams", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
