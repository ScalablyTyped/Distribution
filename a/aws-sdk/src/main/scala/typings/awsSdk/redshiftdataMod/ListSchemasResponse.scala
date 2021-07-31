package typings.awsSdk.redshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchemasResponse extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response records have been retrieved for the request. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The schemas that match the request pattern. 
    */
  var Schemas: js.UndefOr[SchemaList] = js.undefined
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
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSchemas(value: SchemaList): Self = StObject.set(x, "Schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasUndefined: Self = StObject.set(x, "Schemas", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: String*): Self = StObject.set(x, "Schemas", js.Array(value :_*))
  }
}
