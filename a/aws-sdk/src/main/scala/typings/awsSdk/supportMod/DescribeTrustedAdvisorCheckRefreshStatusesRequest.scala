package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrustedAdvisorCheckRefreshStatusesRequest extends StObject {
  
  /**
    * The IDs of the Trusted Advisor checks to get the status.  If you specify the check ID of a check that is automatically refreshed, you might see an InvalidParameterValue error. 
    */
  var checkIds: StringList
}
object DescribeTrustedAdvisorCheckRefreshStatusesRequest {
  
  inline def apply(checkIds: StringList): DescribeTrustedAdvisorCheckRefreshStatusesRequest = {
    val __obj = js.Dynamic.literal(checkIds = checkIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckRefreshStatusesRequest]
  }
  
  extension [Self <: DescribeTrustedAdvisorCheckRefreshStatusesRequest](x: Self) {
    
    inline def setCheckIds(value: StringList): Self = StObject.set(x, "checkIds", value.asInstanceOf[js.Any])
    
    inline def setCheckIdsVarargs(value: String*): Self = StObject.set(x, "checkIds", js.Array(value*))
  }
}
