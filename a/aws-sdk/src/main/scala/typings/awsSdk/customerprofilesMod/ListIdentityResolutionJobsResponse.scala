package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentityResolutionJobsResponse extends StObject {
  
  /**
    * A list of Identity Resolution Jobs.
    */
  var IdentityResolutionJobsList: js.UndefOr[typings.awsSdk.customerprofilesMod.IdentityResolutionJobsList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[token] = js.undefined
}
object ListIdentityResolutionJobsResponse {
  
  inline def apply(): ListIdentityResolutionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentityResolutionJobsResponse]
  }
  
  extension [Self <: ListIdentityResolutionJobsResponse](x: Self) {
    
    inline def setIdentityResolutionJobsList(value: IdentityResolutionJobsList): Self = StObject.set(x, "IdentityResolutionJobsList", value.asInstanceOf[js.Any])
    
    inline def setIdentityResolutionJobsListUndefined: Self = StObject.set(x, "IdentityResolutionJobsList", js.undefined)
    
    inline def setIdentityResolutionJobsListVarargs(value: IdentityResolutionJob*): Self = StObject.set(x, "IdentityResolutionJobsList", js.Array(value*))
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
