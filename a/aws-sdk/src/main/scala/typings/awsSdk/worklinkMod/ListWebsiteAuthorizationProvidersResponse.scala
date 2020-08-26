package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWebsiteAuthorizationProvidersResponse extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.worklinkMod.NextToken] = js.native
  /**
    * The website authorization providers.
    */
  var WebsiteAuthorizationProviders: js.UndefOr[WebsiteAuthorizationProvidersSummaryList] = js.native
}

object ListWebsiteAuthorizationProvidersResponse {
  @scala.inline
  def apply(): ListWebsiteAuthorizationProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebsiteAuthorizationProvidersResponse]
  }
  @scala.inline
  implicit class ListWebsiteAuthorizationProvidersResponseOps[Self <: ListWebsiteAuthorizationProvidersResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setWebsiteAuthorizationProvidersVarargs(value: WebsiteAuthorizationProviderSummary*): Self = this.set("WebsiteAuthorizationProviders", js.Array(value :_*))
    @scala.inline
    def setWebsiteAuthorizationProviders(value: WebsiteAuthorizationProvidersSummaryList): Self = this.set("WebsiteAuthorizationProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteAuthorizationProviders: Self = this.set("WebsiteAuthorizationProviders", js.undefined)
  }
  
}

