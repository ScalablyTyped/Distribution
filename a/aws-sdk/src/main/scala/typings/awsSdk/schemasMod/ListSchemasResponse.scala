package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSchemasResponse extends StObject {
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * An array of schema summaries.
    */
  var Schemas: js.UndefOr[listOfSchemaSummary] = js.native
}
object ListSchemasResponse {
  
  @scala.inline
  def apply(): ListSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemasResponse]
  }
  
  @scala.inline
  implicit class ListSchemasResponseMutableBuilder[Self <: ListSchemasResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSchemas(value: listOfSchemaSummary): Self = StObject.set(x, "Schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasUndefined: Self = StObject.set(x, "Schemas", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: SchemaSummary*): Self = StObject.set(x, "Schemas", js.Array(value :_*))
  }
}
