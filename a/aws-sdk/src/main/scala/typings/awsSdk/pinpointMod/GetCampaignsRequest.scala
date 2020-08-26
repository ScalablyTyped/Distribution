package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCampaignsRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var PageSize: js.UndefOr[string] = js.native
  /**
    * The NextToken string that specifies which page of results to return in a paginated response.
    */
  var Token: js.UndefOr[string] = js.native
}

object GetCampaignsRequest {
  @scala.inline
  def apply(ApplicationId: string): GetCampaignsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignsRequest]
  }
  @scala.inline
  implicit class GetCampaignsRequestOps[Self <: GetCampaignsRequest] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
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

