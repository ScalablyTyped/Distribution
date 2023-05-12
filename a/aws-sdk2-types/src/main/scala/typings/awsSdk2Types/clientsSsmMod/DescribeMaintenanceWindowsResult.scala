package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMaintenanceWindowsResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * Information about the maintenance windows.
    */
  var WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList] = js.undefined
}
object DescribeMaintenanceWindowsResult {
  
  inline def apply(): DescribeMaintenanceWindowsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMaintenanceWindowsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWindowIdentities(value: MaintenanceWindowIdentityList): Self = StObject.set(x, "WindowIdentities", value.asInstanceOf[js.Any])
    
    inline def setWindowIdentitiesUndefined: Self = StObject.set(x, "WindowIdentities", js.undefined)
    
    inline def setWindowIdentitiesVarargs(value: MaintenanceWindowIdentity*): Self = StObject.set(x, "WindowIdentities", js.Array(value*))
  }
}
