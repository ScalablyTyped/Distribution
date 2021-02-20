package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAWSDefaultServiceQuotaResponse extends StObject {
  
  /**
    * Returns the ServiceQuota object which contains all values for a quota.
    */
  var Quota: js.UndefOr[ServiceQuota] = js.native
}
object GetAWSDefaultServiceQuotaResponse {
  
  @scala.inline
  def apply(): GetAWSDefaultServiceQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAWSDefaultServiceQuotaResponse]
  }
  
  @scala.inline
  implicit class GetAWSDefaultServiceQuotaResponseMutableBuilder[Self <: GetAWSDefaultServiceQuotaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuota(value: ServiceQuota): Self = StObject.set(x, "Quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUndefined: Self = StObject.set(x, "Quota", js.undefined)
  }
}
