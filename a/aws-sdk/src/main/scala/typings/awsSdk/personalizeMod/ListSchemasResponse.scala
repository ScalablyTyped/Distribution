package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSchemasResponse extends StObject {
  
  /**
    * A token used to get the next set of schemas (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of schemas.
    */
  var schemas: js.UndefOr[Schemas] = js.native
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
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSchemas(value: Schemas): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: DatasetSchemaSummary*): Self = StObject.set(x, "schemas", js.Array(value :_*))
  }
}
