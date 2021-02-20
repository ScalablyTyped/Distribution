package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutPermissionRequest extends StObject {
  
  /**
    * The action that you are enabling the other account to perform. Currently, this must be events:PutEvents.
    */
  var Action: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.Action] = js.native
  
  /**
    * This parameter enables you to limit the permission to accounts that fulfill a certain condition, such as being a member of a certain AWS organization. For more information about AWS Organizations, see What Is AWS Organizations in the AWS Organizations User Guide. If you specify Condition with an AWS organization ID, and specify "*" as the value for Principal, you grant permission to all the accounts in the named organization. The Condition is a JSON string which must contain Type, Key, and Value fields.
    */
  var Condition: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.Condition] = js.native
  
  /**
    * The name of the event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[NonPartnerEventBusName] = js.native
  
  /**
    * A JSON string that describes the permission policy statement. You can include a Policy parameter in the request instead of using the StatementId, Action, Principal, or Condition parameters.
    */
  var Policy: js.UndefOr[String] = js.native
  
  /**
    * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify "*" to permit any account to put events to your default event bus. If you specify "*" without specifying Condition, avoid creating rules that may match undesirable events. To create more secure rules, make sure that the event pattern for each rule contains an account field with a specific account ID from which to receive events. Rules with an account field do not match any events sent from other accounts.
    */
  var Principal: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.Principal] = js.native
  
  /**
    * An identifier string for the external account that you are granting permissions to. If you later want to revoke the permission for this external account, specify this StatementId when you run RemovePermission.
    */
  var StatementId: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.StatementId] = js.native
}
object PutPermissionRequest {
  
  @scala.inline
  def apply(): PutPermissionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPermissionRequest]
  }
  
  @scala.inline
  implicit class PutPermissionRequestMutableBuilder[Self <: PutPermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setCondition(value: Condition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    @scala.inline
    def setEventBusName(value: NonPartnerEventBusName): Self = StObject.set(x, "EventBusName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBusNameUndefined: Self = StObject.set(x, "EventBusName", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    @scala.inline
    def setPrincipal(value: Principal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
    
    @scala.inline
    def setStatementId(value: StatementId): Self = StObject.set(x, "StatementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementIdUndefined: Self = StObject.set(x, "StatementId", js.undefined)
  }
}
