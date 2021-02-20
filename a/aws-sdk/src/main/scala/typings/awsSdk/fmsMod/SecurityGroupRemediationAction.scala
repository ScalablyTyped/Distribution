package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGroupRemediationAction extends StObject {
  
  /**
    * Brief description of the action that will be performed.
    */
  var Description: js.UndefOr[RemediationActionDescription] = js.native
  
  /**
    * Indicates if the current action is the default action.
    */
  var IsDefaultAction: js.UndefOr[Boolean] = js.native
  
  /**
    * The remediation action that will be performed.
    */
  var RemediationActionType: js.UndefOr[typings.awsSdk.fmsMod.RemediationActionType] = js.native
  
  /**
    * The final state of the rule specified in the ViolationTarget after it is remediated.
    */
  var RemediationResult: js.UndefOr[SecurityGroupRuleDescription] = js.native
}
object SecurityGroupRemediationAction {
  
  @scala.inline
  def apply(): SecurityGroupRemediationAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupRemediationAction]
  }
  
  @scala.inline
  implicit class SecurityGroupRemediationActionMutableBuilder[Self <: SecurityGroupRemediationAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: RemediationActionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIsDefaultAction(value: Boolean): Self = StObject.set(x, "IsDefaultAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultActionUndefined: Self = StObject.set(x, "IsDefaultAction", js.undefined)
    
    @scala.inline
    def setRemediationActionType(value: RemediationActionType): Self = StObject.set(x, "RemediationActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemediationActionTypeUndefined: Self = StObject.set(x, "RemediationActionType", js.undefined)
    
    @scala.inline
    def setRemediationResult(value: SecurityGroupRuleDescription): Self = StObject.set(x, "RemediationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemediationResultUndefined: Self = StObject.set(x, "RemediationResult", js.undefined)
  }
}
