package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMaintenanceWindowExecutionTaskInvocationsResult extends StObject {
  
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
  implicit class DescribeMaintenanceWindowExecutionTaskInvocationsResultMutableBuilder[Self <: DescribeMaintenanceWindowExecutionTaskInvocationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setWindowExecutionTaskInvocationIdentities(value: MaintenanceWindowExecutionTaskInvocationIdentityList): Self = StObject.set(x, "WindowExecutionTaskInvocationIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowExecutionTaskInvocationIdentitiesUndefined: Self = StObject.set(x, "WindowExecutionTaskInvocationIdentities", js.undefined)
    
    @scala.inline
    def setWindowExecutionTaskInvocationIdentitiesVarargs(value: MaintenanceWindowExecutionTaskInvocationIdentity*): Self = StObject.set(x, "WindowExecutionTaskInvocationIdentities", js.Array(value :_*))
  }
}
