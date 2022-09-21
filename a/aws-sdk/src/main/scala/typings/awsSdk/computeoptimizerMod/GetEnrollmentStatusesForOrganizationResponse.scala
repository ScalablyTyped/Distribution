package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnrollmentStatusesForOrganizationResponse extends StObject {
  
  /**
    * An array of objects that describe the enrollment statuses of organization member accounts.
    */
  var accountEnrollmentStatuses: js.UndefOr[AccountEnrollmentStatuses] = js.undefined
  
  /**
    * The token to use to advance to the next page of account enrollment statuses. This value is null when there are no more pages of account enrollment statuses to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetEnrollmentStatusesForOrganizationResponse {
  
  inline def apply(): GetEnrollmentStatusesForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEnrollmentStatusesForOrganizationResponse]
  }
  
  extension [Self <: GetEnrollmentStatusesForOrganizationResponse](x: Self) {
    
    inline def setAccountEnrollmentStatuses(value: AccountEnrollmentStatuses): Self = StObject.set(x, "accountEnrollmentStatuses", value.asInstanceOf[js.Any])
    
    inline def setAccountEnrollmentStatusesUndefined: Self = StObject.set(x, "accountEnrollmentStatuses", js.undefined)
    
    inline def setAccountEnrollmentStatusesVarargs(value: AccountEnrollmentStatus*): Self = StObject.set(x, "accountEnrollmentStatuses", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
