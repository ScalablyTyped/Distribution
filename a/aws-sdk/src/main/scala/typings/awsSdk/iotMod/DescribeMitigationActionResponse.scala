package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMitigationActionResponse extends StObject {
  
  /**
    * The ARN that identifies this migration action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.native
  
  /**
    * A unique identifier for this action.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.native
  
  /**
    * The friendly name that uniquely identifies the mitigation action.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.native
  
  /**
    * Parameters that control how the mitigation action is applied, specific to the type of mitigation action.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.native
  
  /**
    * The type of mitigation action.
    */
  var actionType: js.UndefOr[MitigationActionType] = js.native
  
  /**
    * The date and time when the mitigation action was added to your AWS account.
    */
  var creationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The date and time when the mitigation action was last changed.
    */
  var lastModifiedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ARN of the IAM role used to apply this action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}
object DescribeMitigationActionResponse {
  
  @scala.inline
  def apply(): DescribeMitigationActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMitigationActionResponse]
  }
  
  @scala.inline
  implicit class DescribeMitigationActionResponseMutableBuilder[Self <: DescribeMitigationActionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionArn(value: MitigationActionArn): Self = StObject.set(x, "actionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionArnUndefined: Self = StObject.set(x, "actionArn", js.undefined)
    
    @scala.inline
    def setActionId(value: MitigationActionId): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    @scala.inline
    def setActionName(value: MitigationActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    @scala.inline
    def setActionParams(value: MitigationActionParams): Self = StObject.set(x, "actionParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionParamsUndefined: Self = StObject.set(x, "actionParams", js.undefined)
    
    @scala.inline
    def setActionType(value: MitigationActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Timestamp): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
