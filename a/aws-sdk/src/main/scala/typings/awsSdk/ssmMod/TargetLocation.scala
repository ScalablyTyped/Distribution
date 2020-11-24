package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetLocation extends js.Object {
  
  /**
    * The AWS accounts targeted by the current Automation execution.
    */
  var Accounts: js.UndefOr[typings.awsSdk.ssmMod.Accounts] = js.native
  
  /**
    * The Automation execution role used by the currently running Automation.
    */
  var ExecutionRoleName: js.UndefOr[typings.awsSdk.ssmMod.ExecutionRoleName] = js.native
  
  /**
    * The AWS Regions targeted by the current Automation execution.
    */
  var Regions: js.UndefOr[typings.awsSdk.ssmMod.Regions] = js.native
  
  /**
    * The maximum number of AWS accounts and AWS regions allowed to run the Automation concurrently 
    */
  var TargetLocationMaxConcurrency: js.UndefOr[MaxConcurrency] = js.native
  
  /**
    * The maximum number of errors allowed before the system stops queueing additional Automation executions for the currently running Automation. 
    */
  var TargetLocationMaxErrors: js.UndefOr[MaxErrors] = js.native
}
object TargetLocation {
  
  @scala.inline
  def apply(): TargetLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetLocation]
  }
  
  @scala.inline
  implicit class TargetLocationOps[Self <: TargetLocation] (val x: Self) extends AnyVal {
    
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
    def setAccountsVarargs(value: Account*): Self = this.set("Accounts", js.Array(value :_*))
    
    @scala.inline
    def setAccounts(value: Accounts): Self = this.set("Accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccounts: Self = this.set("Accounts", js.undefined)
    
    @scala.inline
    def setExecutionRoleName(value: ExecutionRoleName): Self = this.set("ExecutionRoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionRoleName: Self = this.set("ExecutionRoleName", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: Region*): Self = this.set("Regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: Regions): Self = this.set("Regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("Regions", js.undefined)
    
    @scala.inline
    def setTargetLocationMaxConcurrency(value: MaxConcurrency): Self = this.set("TargetLocationMaxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetLocationMaxConcurrency: Self = this.set("TargetLocationMaxConcurrency", js.undefined)
    
    @scala.inline
    def setTargetLocationMaxErrors(value: MaxErrors): Self = this.set("TargetLocationMaxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetLocationMaxErrors: Self = this.set("TargetLocationMaxErrors", js.undefined)
  }
}
