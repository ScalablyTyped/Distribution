package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSchemasResponse extends StObject {
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * An array of SearchSchemaSummary information.
    */
  var Schemas: js.UndefOr[listOfSearchSchemaSummary] = js.native
}
object SearchSchemasResponse {
  
  @scala.inline
  def apply(): SearchSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSchemasResponse]
  }
  
  @scala.inline
  implicit class SearchSchemasResponseMutableBuilder[Self <: SearchSchemasResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSchemas(value: listOfSearchSchemaSummary): Self = StObject.set(x, "Schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasUndefined: Self = StObject.set(x, "Schemas", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: SearchSchemaSummary*): Self = StObject.set(x, "Schemas", js.Array(value :_*))
  }
}
