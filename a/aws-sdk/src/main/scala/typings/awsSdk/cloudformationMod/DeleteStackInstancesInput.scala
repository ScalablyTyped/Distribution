package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteStackInstancesInput extends js.Object {
  
  /**
    * [Self-managed permissions] The names of the AWS accounts that you want to delete stack instances for. You can specify Accounts or DeploymentTargets, but not both.
    */
  var Accounts: js.UndefOr[AccountList] = js.native
  
  /**
    * [Service-managed permissions] The AWS Organizations accounts from which to delete stack instances. You can specify Accounts or DeploymentTargets, but not both.
    */
  var DeploymentTargets: js.UndefOr[typings.awsSdk.cloudformationMod.DeploymentTargets] = js.native
  
  /**
    * The unique identifier for this stack set operation.  If you don't specify an operation ID, the SDK generates one automatically.  The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set operation only once, even if you retry the request multiple times. You can retry stack set operation requests to ensure that AWS CloudFormation successfully received them. Repeating this stack set operation with a new operation ID retries all stack instances whose status is OUTDATED. 
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * Preferences for how AWS CloudFormation performs this stack set operation.
    */
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.native
  
  /**
    * The Regions where you want to delete stack set instances. 
    */
  var Regions: RegionList = js.native
  
  /**
    * Removes the stack instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a retained stack or add an existing, saved stack to a new stack set. For more information, see Stack set operation options.
    */
  var RetainStacks: typings.awsSdk.cloudformationMod.RetainStacks = js.native
  
  /**
    * The name or unique ID of the stack set that you want to delete stack instances for.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName = js.native
}
object DeleteStackInstancesInput {
  
  @scala.inline
  def apply(Regions: RegionList, RetainStacks: RetainStacks, StackSetName: StackSetName): DeleteStackInstancesInput = {
    val __obj = js.Dynamic.literal(Regions = Regions.asInstanceOf[js.Any], RetainStacks = RetainStacks.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStackInstancesInput]
  }
  
  @scala.inline
  implicit class DeleteStackInstancesInputOps[Self <: DeleteStackInstancesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegionsVarargs(value: Region*): Self = this.set("Regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: RegionList): Self = this.set("Regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainStacks(value: RetainStacks): Self = this.set("RetainStacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetName(value: StackSetName): Self = this.set("StackSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsVarargs(value: Account*): Self = this.set("Accounts", js.Array(value :_*))
    
    @scala.inline
    def setAccounts(value: AccountList): Self = this.set("Accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccounts: Self = this.set("Accounts", js.undefined)
    
    @scala.inline
    def setDeploymentTargets(value: DeploymentTargets): Self = this.set("DeploymentTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentTargets: Self = this.set("DeploymentTargets", js.undefined)
    
    @scala.inline
    def setOperationId(value: ClientRequestToken): Self = this.set("OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("OperationId", js.undefined)
    
    @scala.inline
    def setOperationPreferences(value: StackSetOperationPreferences): Self = this.set("OperationPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationPreferences: Self = this.set("OperationPreferences", js.undefined)
  }
}
