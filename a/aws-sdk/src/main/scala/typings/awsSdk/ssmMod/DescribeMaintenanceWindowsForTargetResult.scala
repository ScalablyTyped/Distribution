package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMaintenanceWindowsForTargetResult extends StObject {
  
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * Information about the maintenance window targets and tasks an instance is associated with.
    */
  var WindowIdentities: js.UndefOr[MaintenanceWindowsForTargetList] = js.native
}
object DescribeMaintenanceWindowsForTargetResult {
  
  @scala.inline
  def apply(): DescribeMaintenanceWindowsForTargetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowsForTargetResult]
  }
  
  @scala.inline
  implicit class DescribeMaintenanceWindowsForTargetResultMutableBuilder[Self <: DescribeMaintenanceWindowsForTargetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setWindowIdentities(value: MaintenanceWindowsForTargetList): Self = StObject.set(x, "WindowIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdentitiesUndefined: Self = StObject.set(x, "WindowIdentities", js.undefined)
    
    @scala.inline
    def setWindowIdentitiesVarargs(value: MaintenanceWindowIdentityForTarget*): Self = StObject.set(x, "WindowIdentities", js.Array(value :_*))
  }
}
