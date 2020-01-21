package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrganizationPortfolioAccessOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Displays information about the organization nodes.
    */
  var OrganizationNodes: js.UndefOr[typings.awsSdk.servicecatalogMod.OrganizationNodes] = js.native
}

object ListOrganizationPortfolioAccessOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, OrganizationNodes: OrganizationNodes = null): ListOrganizationPortfolioAccessOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (OrganizationNodes != null) __obj.updateDynamic("OrganizationNodes")(OrganizationNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOrganizationPortfolioAccessOutput]
  }
}

