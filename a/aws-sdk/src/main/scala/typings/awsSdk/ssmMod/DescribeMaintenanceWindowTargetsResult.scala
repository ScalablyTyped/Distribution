package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMaintenanceWindowTargetsResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * Information about the targets in the maintenance window.
    */
  var Targets: js.UndefOr[MaintenanceWindowTargetList] = js.native
}
object DescribeMaintenanceWindowTargetsResult {
  
  @scala.inline
  def apply(): DescribeMaintenanceWindowTargetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowTargetsResult]
  }
  
  @scala.inline
  implicit class DescribeMaintenanceWindowTargetsResultMutableBuilder[Self <: DescribeMaintenanceWindowTargetsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTargets(value: MaintenanceWindowTargetList): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: MaintenanceWindowTarget*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
