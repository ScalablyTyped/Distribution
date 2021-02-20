package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMaintenanceWindowExecutionTasksResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * Information about the task executions.
    */
  var WindowExecutionTaskIdentities: js.UndefOr[MaintenanceWindowExecutionTaskIdentityList] = js.native
}
object DescribeMaintenanceWindowExecutionTasksResult {
  
  @scala.inline
  def apply(): DescribeMaintenanceWindowExecutionTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTasksResult]
  }
  
  @scala.inline
  implicit class DescribeMaintenanceWindowExecutionTasksResultMutableBuilder[Self <: DescribeMaintenanceWindowExecutionTasksResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setWindowExecutionTaskIdentities(value: MaintenanceWindowExecutionTaskIdentityList): Self = StObject.set(x, "WindowExecutionTaskIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowExecutionTaskIdentitiesUndefined: Self = StObject.set(x, "WindowExecutionTaskIdentities", js.undefined)
    
    @scala.inline
    def setWindowExecutionTaskIdentitiesVarargs(value: MaintenanceWindowExecutionTaskIdentity*): Self = StObject.set(x, "WindowExecutionTaskIdentities", js.Array(value :_*))
  }
}
