package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAWSDefaultServiceQuotaResponse extends StObject {
  
  /**
    * Returns the ServiceQuota object which contains all values for a quota.
    */
  var Quota: js.UndefOr[ServiceQuota] = js.undefined
}
object GetAWSDefaultServiceQuotaResponse {
  
  inline def apply(): GetAWSDefaultServiceQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAWSDefaultServiceQuotaResponse]
  }
  
  extension [Self <: GetAWSDefaultServiceQuotaResponse](x: Self) {
    
    inline def setQuota(value: ServiceQuota): Self = StObject.set(x, "Quota", value.asInstanceOf[js.Any])
    
    inline def setQuotaUndefined: Self = StObject.set(x, "Quota", js.undefined)
  }
}
