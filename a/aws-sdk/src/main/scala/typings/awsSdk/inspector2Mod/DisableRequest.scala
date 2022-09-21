package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableRequest extends StObject {
  
  /**
    * An array of account IDs you want to disable Amazon Inspector scans for.
    */
  var accountIds: js.UndefOr[AccountIdSet] = js.undefined
  
  /**
    * The resource scan types you want to disable.
    */
  var resourceTypes: js.UndefOr[DisableResourceTypeList] = js.undefined
}
object DisableRequest {
  
  inline def apply(): DisableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableRequest]
  }
  
  extension [Self <: DisableRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdSet): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value*))
    
    inline def setResourceTypes(value: DisableResourceTypeList): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "resourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: ResourceScanType*): Self = StObject.set(x, "resourceTypes", js.Array(value*))
  }
}
