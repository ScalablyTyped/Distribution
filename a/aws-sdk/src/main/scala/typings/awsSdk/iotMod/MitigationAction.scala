package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MitigationAction extends StObject {
  
  /**
    * The set of parameters for this mitigation action. The parameters vary, depending on the kind of action you apply.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.undefined
  
  /**
    * A unique identifier for the mitigation action.
    */
  var id: js.UndefOr[MitigationActionId] = js.undefined
  
  /**
    * A user-friendly name for the mitigation action.
    */
  var name: js.UndefOr[MitigationActionName] = js.undefined
  
  /**
    * The IAM role ARN used to apply this mitigation action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object MitigationAction {
  
  @scala.inline
  def apply(): MitigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MitigationAction]
  }
  
  @scala.inline
  implicit class MitigationActionMutableBuilder[Self <: MitigationAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionParams(value: MitigationActionParams): Self = StObject.set(x, "actionParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionParamsUndefined: Self = StObject.set(x, "actionParams", js.undefined)
    
    @scala.inline
    def setId(value: MitigationActionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: MitigationActionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
