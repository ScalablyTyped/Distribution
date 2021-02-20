package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceQuotaResponse extends StObject {
  
  /**
    * Returns the ServiceQuota object which contains all values for a quota.
    */
  var Quota: js.UndefOr[ServiceQuota] = js.native
}
object GetServiceQuotaResponse {
  
  @scala.inline
  def apply(): GetServiceQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceQuotaResponse]
  }
  
  @scala.inline
  implicit class GetServiceQuotaResponseMutableBuilder[Self <: GetServiceQuotaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuota(value: ServiceQuota): Self = StObject.set(x, "Quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUndefined: Self = StObject.set(x, "Quota", js.undefined)
  }
}
