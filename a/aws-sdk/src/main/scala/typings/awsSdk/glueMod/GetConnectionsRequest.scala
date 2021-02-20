package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectionsRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * A filter that controls which connections are returned.
    */
  var Filter: js.UndefOr[GetConnectionsFilter] = js.native
  
  /**
    * Allows you to retrieve the connection metadata without returning the password. For instance, the AWS Glue console uses this flag to retrieve the connection, and does not display the password. Set this parameter when the caller might not have permission to use the AWS KMS key to decrypt the password, but it does have permission to access the rest of the connection properties.
    */
  var HidePassword: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of connections to return in one response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object GetConnectionsRequest {
  
  @scala.inline
  def apply(): GetConnectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionsRequest]
  }
  
  @scala.inline
  implicit class GetConnectionsRequestMutableBuilder[Self <: GetConnectionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setFilter(value: GetConnectionsFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setHidePassword(value: Boolean): Self = StObject.set(x, "HidePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidePasswordUndefined: Self = StObject.set(x, "HidePassword", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
