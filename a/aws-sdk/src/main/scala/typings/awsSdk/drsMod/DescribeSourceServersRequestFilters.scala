package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSourceServersRequestFilters extends StObject {
  
  /**
    * An ID that describes the hardware of the Source Server. This is either an EC2 instance id, a VMware uuid or a mac address.
    */
  var hardwareId: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * An array of Source Servers IDs that should be returned. An empty array means all Source Servers.
    */
  var sourceServerIDs: js.UndefOr[DescribeSourceServersRequestFiltersIDs] = js.undefined
  
  /**
    * An array of staging account IDs that extended source servers belong to. An empty array means all source servers will be shown.
    */
  var stagingAccountIDs: js.UndefOr[AccountIDs] = js.undefined
}
object DescribeSourceServersRequestFilters {
  
  inline def apply(): DescribeSourceServersRequestFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSourceServersRequestFilters]
  }
  
  extension [Self <: DescribeSourceServersRequestFilters](x: Self) {
    
    inline def setHardwareId(value: BoundedString): Self = StObject.set(x, "hardwareId", value.asInstanceOf[js.Any])
    
    inline def setHardwareIdUndefined: Self = StObject.set(x, "hardwareId", js.undefined)
    
    inline def setSourceServerIDs(value: DescribeSourceServersRequestFiltersIDs): Self = StObject.set(x, "sourceServerIDs", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDsUndefined: Self = StObject.set(x, "sourceServerIDs", js.undefined)
    
    inline def setSourceServerIDsVarargs(value: SourceServerID*): Self = StObject.set(x, "sourceServerIDs", js.Array(value*))
    
    inline def setStagingAccountIDs(value: AccountIDs): Self = StObject.set(x, "stagingAccountIDs", value.asInstanceOf[js.Any])
    
    inline def setStagingAccountIDsUndefined: Self = StObject.set(x, "stagingAccountIDs", js.undefined)
    
    inline def setStagingAccountIDsVarargs(value: AccountID*): Self = StObject.set(x, "stagingAccountIDs", js.Array(value*))
  }
}
