package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutPermissionRequest extends js.Object {
  
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
  implicit class PutPermissionRequestOps[Self <: PutPermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: Action): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setCondition(value: Condition): Self = this.set("Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("Condition", js.undefined)
    
    @scala.inline
    def setEventBusName(value: NonPartnerEventBusName): Self = this.set("EventBusName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventBusName: Self = this.set("EventBusName", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = this.set("Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
    
    @scala.inline
    def setPrincipal(value: Principal): Self = this.set("Principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipal: Self = this.set("Principal", js.undefined)
    
    @scala.inline
    def setStatementId(value: StatementId): Self = this.set("StatementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatementId: Self = this.set("StatementId", js.undefined)
  }
}
