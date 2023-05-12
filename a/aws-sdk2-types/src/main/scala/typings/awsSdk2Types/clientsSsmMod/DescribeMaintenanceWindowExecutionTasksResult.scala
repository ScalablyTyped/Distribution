package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMaintenanceWindowExecutionTasksResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * Information about the task executions.
    */
  var WindowExecutionTaskIdentities: js.UndefOr[MaintenanceWindowExecutionTaskIdentityList] = js.undefined
}
object DescribeMaintenanceWindowExecutionTasksResult {
  
  inline def apply(): DescribeMaintenanceWindowExecutionTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTasksResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMaintenanceWindowExecutionTasksResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWindowExecutionTaskIdentities(value: MaintenanceWindowExecutionTaskIdentityList): Self = StObject.set(x, "WindowExecutionTaskIdentities", value.asInstanceOf[js.Any])
    
    inline def setWindowExecutionTaskIdentitiesUndefined: Self = StObject.set(x, "WindowExecutionTaskIdentities", js.undefined)
    
    inline def setWindowExecutionTaskIdentitiesVarargs(value: MaintenanceWindowExecutionTaskIdentity*): Self = StObject.set(x, "WindowExecutionTaskIdentities", js.Array(value*))
  }
}
