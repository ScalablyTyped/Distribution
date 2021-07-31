package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchemaVersionsRequest extends StObject {
  
  var Limit: js.UndefOr[integer] = js.undefined
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the registry.
    */
  var RegistryName: string
  
  /**
    * The name of the schema.
    */
  var SchemaName: string
}
object ListSchemaVersionsRequest {
  
  @scala.inline
  def apply(RegistryName: string, SchemaName: string): ListSchemaVersionsRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemaVersionsRequest]
  }
  
  @scala.inline
  implicit class ListSchemaVersionsRequestMutableBuilder[Self <: ListSchemaVersionsRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
  }
}
