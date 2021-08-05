package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserImportJobsRequest extends StObject {
  
  /**
    * The maximum number of import jobs you want the request to return.
    */
  var MaxResults: PoolQueryLimitType
  
  /**
    * An identifier that was returned from the previous call to ListUserImportJobs, which can be used to return the next set of import jobs in the list.
    */
  var PaginationToken: js.UndefOr[PaginationKeyType] = js.undefined
  
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: UserPoolIdType
}
object ListUserImportJobsRequest {
  
  inline def apply(MaxResults: PoolQueryLimitType, UserPoolId: UserPoolIdType): ListUserImportJobsRequest = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserImportJobsRequest]
  }
  
  extension [Self <: ListUserImportJobsRequest](x: Self) {
    
    inline def setMaxResults(value: PoolQueryLimitType): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setPaginationToken(value: PaginationKeyType): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
