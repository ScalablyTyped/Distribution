package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMaintenanceWindowExecutionTaskInvocationsResult extends js.Object {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * Information about the task invocation results per invocation.
    */
  var WindowExecutionTaskInvocationIdentities: js.UndefOr[MaintenanceWindowExecutionTaskInvocationIdentityList] = js.native
}
object DescribeMaintenanceWindowExecutionTaskInvocationsResult {
  
  @scala.inline
  def apply(): DescribeMaintenanceWindowExecutionTaskInvocationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsResult]
  }
  
  @scala.inline
  implicit class DescribeMaintenanceWindowExecutionTaskInvocationsResultOps[Self <: DescribeMaintenanceWindowExecutionTaskInvocationsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setWindowExecutionTaskInvocationIdentitiesVarargs(value: MaintenanceWindowExecutionTaskInvocationIdentity*): Self = this.set("WindowExecutionTaskInvocationIdentities", js.Array(value :_*))
    
    @scala.inline
    def setWindowExecutionTaskInvocationIdentities(value: MaintenanceWindowExecutionTaskInvocationIdentityList): Self = this.set("WindowExecutionTaskInvocationIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowExecutionTaskInvocationIdentities: Self = this.set("WindowExecutionTaskInvocationIdentities", js.undefined)
  }
}
