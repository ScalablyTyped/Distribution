package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSchemasRequest extends js.Object {
  
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
  implicit class SearchSchemasRequestOps[Self <: SearchSchemasRequest] (val x: Self) extends AnyVal {
    
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
    def setKeywords(value: string): Self = this.set("Keywords", value.asInstanceOf[js.Any])
    
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
  }
}
