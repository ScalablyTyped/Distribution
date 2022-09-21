package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMitigationActionResponse extends StObject {
  
  /**
    * The ARN that identifies this migration action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.undefined
  
  /**
    * A unique identifier for this action.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.undefined
  
  /**
    * The friendly name that uniquely identifies the mitigation action.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.undefined
  
  /**
    * Parameters that control how the mitigation action is applied, specific to the type of mitigation action.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.undefined
  
  /**
    * The type of mitigation action.
    */
  var actionType: js.UndefOr[MitigationActionType] = js.undefined
  
  /**
    * The date and time when the mitigation action was added to your Amazon Web Services accounts.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the mitigation action was last changed.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the IAM role used to apply this action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object DescribeMitigationActionResponse {
  
  inline def apply(): DescribeMitigationActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMitigationActionResponse]
  }
  
  extension [Self <: DescribeMitigationActionResponse](x: Self) {
    
    inline def setActionArn(value: MitigationActionArn): Self = StObject.set(x, "actionArn", value.asInstanceOf[js.Any])
    
    inline def setActionArnUndefined: Self = StObject.set(x, "actionArn", js.undefined)
    
    inline def setActionId(value: MitigationActionId): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    inline def setActionName(value: MitigationActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    inline def setActionParams(value: MitigationActionParams): Self = StObject.set(x, "actionParams", value.asInstanceOf[js.Any])
    
    inline def setActionParamsUndefined: Self = StObject.set(x, "actionParams", js.undefined)
    
    inline def setActionType(value: MitigationActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
