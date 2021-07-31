package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRegistriesRequest extends StObject {
  
  var Limit: js.UndefOr[integer] = js.undefined
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * Specifying this limits the results to only those registry names that start with the specified prefix.
    */
  var RegistryNamePrefix: js.UndefOr[string] = js.undefined
  
  /**
    * Can be set to Local or AWS to limit responses to your custom registries, or the ones provided by AWS.
    */
  var Scope: js.UndefOr[string] = js.undefined
}
object ListRegistriesRequest {
  
  @scala.inline
  def apply(): ListRegistriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegistriesRequest]
  }
  
  @scala.inline
  implicit class ListRegistriesRequestMutableBuilder[Self <: ListRegistriesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: integer): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRegistryNamePrefix(value: string): Self = StObject.set(x, "RegistryNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryNamePrefixUndefined: Self = StObject.set(x, "RegistryNamePrefix", js.undefined)
    
    @scala.inline
    def setScope(value: string): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
  }
}
