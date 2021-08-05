package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceQuotaResponse extends StObject {
  
  /**
    * Returns the ServiceQuota object which contains all values for a quota.
    */
  var Quota: js.UndefOr[ServiceQuota] = js.undefined
}
object GetServiceQuotaResponse {
  
  inline def apply(): GetServiceQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceQuotaResponse]
  }
  
  extension [Self <: GetServiceQuotaResponse](x: Self) {
    
    inline def setQuota(value: ServiceQuota): Self = StObject.set(x, "Quota", value.asInstanceOf[js.Any])
    
    inline def setQuotaUndefined: Self = StObject.set(x, "Quota", js.undefined)
  }
}
