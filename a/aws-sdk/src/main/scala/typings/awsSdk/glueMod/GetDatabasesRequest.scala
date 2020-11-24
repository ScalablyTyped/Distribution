package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDatabasesRequest extends js.Object {
  
  /**
    * The ID of the Data Catalog from which to retrieve Databases. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The maximum number of databases to return in one response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * Allows you to specify that you want to list the databases shared with your account. The allowable values are FOREIGN or ALL.    If set to FOREIGN, will list the databases shared with your account.    If set to ALL, will list the databases shared with your account, as well as the databases in yor local account.   
    */
  var ResourceShareType: js.UndefOr[typings.awsSdk.glueMod.ResourceShareType] = js.native
}
object GetDatabasesRequest {
  
  @scala.inline
  def apply(): GetDatabasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatabasesRequest]
  }
  
  @scala.inline
  implicit class GetDatabasesRequestOps[Self <: GetDatabasesRequest] (val x: Self) extends AnyVal {
    
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
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setResourceShareType(value: ResourceShareType): Self = this.set("ResourceShareType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceShareType: Self = this.set("ResourceShareType", js.undefined)
  }
}
