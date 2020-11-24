package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppsRequest extends js.Object {
  
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var PageSize: js.UndefOr[string] = js.native
  
  /**
    * The NextToken string that specifies which page of results to return in a paginated response.
    */
  var Token: js.UndefOr[string] = js.native
}
object GetAppsRequest {
  
  @scala.inline
  def apply(): GetAppsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppsRequest]
  }
  
  @scala.inline
  implicit class GetAppsRequestOps[Self <: GetAppsRequest] (val x: Self) extends AnyVal {
    
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
    def setPageSize(value: string): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
    
    @scala.inline
    def setToken(value: string): Self = this.set("Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("Token", js.undefined)
  }
}
