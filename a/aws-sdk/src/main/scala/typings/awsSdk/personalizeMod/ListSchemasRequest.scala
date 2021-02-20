package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSchemasRequest extends StObject {
  
  /**
    * The maximum number of schemas to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * A token returned from the previous call to ListSchemas for getting the next set of schemas (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListSchemasRequest {
  
  @scala.inline
  def apply(): ListSchemasRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemasRequest]
  }
  
  @scala.inline
  implicit class ListSchemasRequestMutableBuilder[Self <: ListSchemasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
