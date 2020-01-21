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
  def apply(
    NextToken: NextToken = null,
    WebsiteAuthorizationProviders: WebsiteAuthorizationProvidersSummaryList = null
  ): ListWebsiteAuthorizationProvidersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (WebsiteAuthorizationProviders != null) __obj.updateDynamic("WebsiteAuthorizationProviders")(WebsiteAuthorizationProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWebsiteAuthorizationProvidersResponse]
  }
}

