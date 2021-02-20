package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSchemaVersionsResponse extends StObject {
  
  /**
    * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is not the last.
    */
  var NextToken: js.UndefOr[SchemaRegistryTokenString] = js.native
  
  /**
    * An array of SchemaVersionList objects containing details of each schema version.
    */
  var Schemas: js.UndefOr[SchemaVersionList] = js.native
}
object ListSchemaVersionsResponse {
  
  @scala.inline
  def apply(): ListSchemaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemaVersionsResponse]
  }
  
  @scala.inline
  implicit class ListSchemaVersionsResponseMutableBuilder[Self <: ListSchemaVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: SchemaRegistryTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSchemas(value: SchemaVersionList): Self = StObject.set(x, "Schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasUndefined: Self = StObject.set(x, "Schemas", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: SchemaVersionListItem*): Self = StObject.set(x, "Schemas", js.Array(value :_*))
  }
}
