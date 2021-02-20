package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorkflowTypesInput extends StObject {
  
  /**
    * The name of the domain in which the workflow types have been registered.
    */
  var domain: DomainName = js.native
  
  /**
    * The maximum number of results that are returned per call. Use nextPageToken to obtain further pages of results. 
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.native
  
  /**
    * If specified, lists the workflow type with this name.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * If NextPageToken is returned there are more results available. The value of NextPageToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 60 seconds. Using an expired pagination token will return a 400 error: "Specified token has exceeded its maximum lifetime".  The configured maximumPageSize determines how many results can be returned in a single call. 
    */
  var nextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * Specifies the registration status of the workflow types to list.
    */
  var registrationStatus: RegistrationStatus = js.native
  
  /**
    * When set to true, returns the results in reverse order. By default the results are returned in ascending alphabetical order of the name of the workflow types.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.native
}
object ListWorkflowTypesInput {
  
  @scala.inline
  def apply(domain: DomainName, registrationStatus: RegistrationStatus): ListWorkflowTypesInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkflowTypesInput]
  }
  
  @scala.inline
  implicit class ListWorkflowTypesInputMutableBuilder[Self <: ListWorkflowTypesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPageSize(value: PageSize): Self = StObject.set(x, "maximumPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPageSizeUndefined: Self = StObject.set(x, "maximumPageSize", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
