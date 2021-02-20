package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDomainsInput extends StObject {
  
  /**
    * The maximum number of results that are returned per call. Use nextPageToken to obtain further pages of results. 
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.native
  
  /**
    * If NextPageToken is returned there are more results available. The value of NextPageToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 60 seconds. Using an expired pagination token will return a 400 error: "Specified token has exceeded its maximum lifetime".  The configured maximumPageSize determines how many results can be returned in a single call. 
    */
  var nextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * Specifies the registration status of the domains to list.
    */
  var registrationStatus: RegistrationStatus = js.native
  
  /**
    * When set to true, returns the results in reverse order. By default, the results are returned in ascending alphabetical order by name of the domains.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.native
}
object ListDomainsInput {
  
  @scala.inline
  def apply(registrationStatus: RegistrationStatus): ListDomainsInput = {
    val __obj = js.Dynamic.literal(registrationStatus = registrationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsInput]
  }
  
  @scala.inline
  implicit class ListDomainsInputMutableBuilder[Self <: ListDomainsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumPageSize(value: PageSize): Self = StObject.set(x, "maximumPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPageSizeUndefined: Self = StObject.set(x, "maximumPageSize", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRegistrationStatus(value: RegistrationStatus): Self = StObject.set(x, "registrationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseOrder(value: ReverseOrder): Self = StObject.set(x, "reverseOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseOrderUndefined: Self = StObject.set(x, "reverseOrder", js.undefined)
  }
}
