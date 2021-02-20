package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetLocation extends StObject {
  
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
  implicit class TargetLocationMutableBuilder[Self <: TargetLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: Accounts): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    @scala.inline
    def setAccountsVarargs(value: Account*): Self = StObject.set(x, "Accounts", js.Array(value :_*))
    
    @scala.inline
    def setExecutionRoleName(value: ExecutionRoleName): Self = StObject.set(x, "ExecutionRoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionRoleNameUndefined: Self = StObject.set(x, "ExecutionRoleName", js.undefined)
    
    @scala.inline
    def setRegions(value: Regions): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "Regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: Region*): Self = StObject.set(x, "Regions", js.Array(value :_*))
    
    @scala.inline
    def setTargetLocationMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "TargetLocationMaxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLocationMaxConcurrencyUndefined: Self = StObject.set(x, "TargetLocationMaxConcurrency", js.undefined)
    
    @scala.inline
    def setTargetLocationMaxErrors(value: MaxErrors): Self = StObject.set(x, "TargetLocationMaxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLocationMaxErrorsUndefined: Self = StObject.set(x, "TargetLocationMaxErrors", js.undefined)
  }
}
