package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMaintenanceWindowTargetsResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * Information about the targets in the maintenance window.
    */
  var Targets: js.UndefOr[MaintenanceWindowTargetList] = js.undefined
}
object DescribeMaintenanceWindowTargetsResult {
  
  inline def apply(): DescribeMaintenanceWindowTargetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowTargetsResult]
  }
  
  extension [Self <: DescribeMaintenanceWindowTargetsResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTargets(value: MaintenanceWindowTargetList): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: MaintenanceWindowTarget*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
