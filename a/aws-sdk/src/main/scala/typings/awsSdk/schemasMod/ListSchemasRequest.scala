package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSchemasRequest extends js.Object {
  
  var Limit: js.UndefOr[integer] = js.native
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * The name of the registry.
    */
  var RegistryName: string = js.native
  
  /**
    * Specifying this limits the results to only those schema names that start with the specified prefix.
    */
  var SchemaNamePrefix: js.UndefOr[string] = js.native
}
object ListSchemasRequest {
  
  @scala.inline
  def apply(RegistryName: string): ListSchemasRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemasRequest]
  }
  
  @scala.inline
  implicit class ListSchemasRequestOps[Self <: ListSchemasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegistryName(value: string): Self = this.set("RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: integer): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSchemaNamePrefix(value: string): Self = this.set("SchemaNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaNamePrefix: Self = this.set("SchemaNamePrefix", js.undefined)
  }
}
