package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSchemasRequest extends StObject {
  
  /**
    * Specifying this limits the results to only schemas that include the provided keywords.
    */
  var Keywords: string = js.native
  
  var Limit: js.UndefOr[integer] = js.native
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * The name of the registry.
    */
  var RegistryName: string = js.native
}
object SearchSchemasRequest {
  
  @scala.inline
  def apply(Keywords: string, RegistryName: string): SearchSchemasRequest = {
    val __obj = js.Dynamic.literal(Keywords = Keywords.asInstanceOf[js.Any], RegistryName = RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSchemasRequest]
  }
  
  @scala.inline
  implicit class SearchSchemasRequestMutableBuilder[Self <: SearchSchemasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeywords(value: string): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: integer): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
  }
}
